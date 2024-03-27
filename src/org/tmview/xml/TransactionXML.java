package org.tmview.xml;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.tmview.soip.*;

import jxml.AddressBookType;
import jxml.AddressType;
import jxml.AppealType;
import jxml.AppellantType;
import jxml.AddressType.FreeFormatAddress;
import jxml.AppealType.AppellantDetails;
import jxml.AppealType.RepresentativeDetails;
import jxml.ApplicantType;
import jxml.BasicRecordType;
import jxml.ClaimantType;
import jxml.BasicRecordType.ClaimantDetails;
import jxml.BasicRecordType.RecordPublicationDetails;
import jxml.ClassDescriptionType;
import jxml.ClassificationKindCodeType;
import jxml.CorrespondenceAddressType;
import jxml.ExhibitionPriorityType;
import jxml.FormattedNameAddressType;
import jxml.FreeFormatNameType;
import jxml.FreeFormatNameType.FreeFormatNameDetails;
import jxml.GoodsServicesType;
import jxml.IPRKindType;
import jxml.GoodsServicesType.ClassDescriptionDetails;
import jxml.KindMarkType;
import jxml.LegalEntityType;
import jxml.MarkCurrentStatusCodeType;
import jxml.MarkImageType;
import jxml.MarkRecordType;
import jxml.NameType;
import jxml.OperationCodeType;
import jxml.OppositionType;
import jxml.PriorityType;
import jxml.PublicationType;
import jxml.RecordCurrentStatusCodeType;
import jxml.RepresentativeKindCodeType;
import jxml.RepresentativeType;
import jxml.TextType;
import jxml.TradeMarkType;
import jxml.TradeMarkType.AppealDetails;
import jxml.TradeMarkType.ApplicantDetails;
import jxml.TradeMarkType.ExhibitionPriorityDetails;
import jxml.TradeMarkType.GoodsServicesDetails;
import jxml.TradeMarkType.MarkImageDetails;
import jxml.TradeMarkType.MarkRecordDetails;
import jxml.TradeMarkType.OppositionDetails;
import jxml.TradeMarkType.PriorityDetails;
import jxml.TradeMarkType.PublicationDetails;
import jxml.TransactionBodyType;
import jxml.TransactionBodyType.TransactionContentDetails;
import jxml.TransactionCodeType;
import jxml.TransactionDataType;
import jxml.TransactionDataType.TradeMarkDetails;
import jxml.TransactionErrorCodeType;
import jxml.TransactionErrorType;
import jxml.TransactionHeaderType;
import jxml.TransactionHeaderType.SenderDetails;
import jxml.TransactionType;
import jxml.WIPOST3CodeType;
import jxml.WordMarkSpecificationType;

public class TransactionXML {

	public TransactionType buildXmlStepByStep(Trademark tm) throws DatatypeConfigurationException {
		
		Date date = new Date();
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(date);
		XMLGregorianCalendar xmldate2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

		// ==============================================
		TransactionType transactionType = new TransactionType();
		TransactionErrorType tErrorType = new TransactionErrorType();

		try {

			SenderDetails senderDetails = new SenderDetails();
			senderDetails.setRequestProducerDateTime(xmldate2);

			TransactionHeaderType tHeaderType = new TransactionHeaderType();
			tHeaderType.setSenderDetails(senderDetails);

			
			// main part ////////////////////////////////
			// ------------------------- Trademark Type ----------------------------------
			TradeMarkType[] tradeMarkTypeArray = new TradeMarkType[1];
			TradeMarkType tmt = new TradeMarkType();
			// ------------------------- end ---------------------------------------------
			
			// ------------------------- RegistrationOfficeCode --------------------------
			//tmt.setRegistrationOfficeCode(WIPOST3CodeType.MK);
			tmt.setRegistrationOfficeCode(WIPOST3CodeType.fromValue(tm.getOfficeCode()));
			// ------------------------- end ---------------------------------------------
			
			// ------------------------- ReceivingOfficeDate -----------------------------
			//tmt.setReceivingOfficeDate(ClassHelper.toXMLGregorianCalendar(tm.getFilingDate()));
			// ------------------------- end ---------------------------------------------
			
			// ------------------------- InternationalMarkIndicator ----------------------
			tmt.setInternationalMarkIndicator(false);
			// ------------------------- end ---------------------------------------------

			
			// ------------------------- ApplicationDate ---------------------------------
			tmt.setApplicationDate(ClassHelper.toXMLGregorianCalendar(tm.getFilingDate()));
			// ------------------------- end ---------------------------------------------
			
			// ------------------------- ApplicationNumber -------------------------------
			tmt.setApplicationNumber(tm.getApplicationNumber());
			// ------------------------- end ---------------------------------------------
			
			// ------------------------- registration date and registration number -------
			if (tm.getRegistrationNumber() != null && tm.getRegistrationNumber().length() > 0) {
				tmt.setRegistrationNumber(tm.getRegistrationNumber());
				
			}
			if(tm.getRegistrationDate() != null) {
				tmt.setRegistrationDate(ClassHelper.toXMLGregorianCalendar(tm.getRegistrationDate()));
			}
			// ------------------------- end ---------------------------------------------
			

			// ------------------------- IPR Kind (Trademark, slogan etc.) ---------------
			tmt.setIPRKind(mapMarkIPRKind(tm.getIPRKindID()));
			// ------------------------- end ---------------------------------------------
			
			
			// ------------------------- language code -----------------------------------
			tmt.setApplicationLanguageCode(tm.getLanguageCode());
			// ------------------------- end ---------------------------------------------
			
			// ------------------------- status code -------------------------------------
			tmt.setMarkCurrentStatusCode(mapTrademarkStatusCode(tm.getStatusID()));
			// ------------------------- end ---------------------------------------------
			
			
			// ------------------------- mark feature (word, figurative, combined, etc) --
			tmt.setMarkFeature(tm.getMarkFeature());
			// ------------------------- end ---------------------------------------------

			// ------------------------- expiration date ---------------------------------
			if (tm.getExpirationDate() != null) {
				tmt.setExpiryDate(ClassHelper.toXMLGregorianCalendar(tm.getExpirationDate()));
			}
			// ------------------------- end ---------------------------------------------

			// ------------------------- kind mark (collective, individual) --------------
			tmt.setKindMark(mapKindMarkType(tm.getApplicationKindMarkID()));
			// ------------------------- end ---------------------------------------------

			// ------------------------- set opposition date -----------------------------
			if (tm.getStartDateOfOppoisition() != null) {
				tmt.setOppositionPeriodStartDate(ClassHelper.toXMLGregorianCalendar(tm.getStartDateOfOppoisition()));
				tmt.setOppositionPeriodEndDate(ClassHelper.toXMLGregorianCalendar(tm.getStartDateOfOppoisition()));
			}
			// set opposition date /////////////////////////
			/*
			 * To update this section according to the needs of 
			 * the National Office (data analysis) 
			 */
			if (tm.getStartDateOfOppoisition() != null) {
				tmt.setOppositionPeriodStartDate(ClassHelper.toXMLGregorianCalendar(tm.getStartDateOfOppoisition()));
										
				Calendar myCal = Calendar.getInstance();
				myCal.setTime(tm.getStartDateOfOppoisition());    
				myCal.add(Calendar.DAY_OF_MONTH, +60);    
				Date end_date_of_opposition = myCal.getTime();
									    
				tmt.setOppositionPeriodEndDate(ClassHelper.toXMLGregorianCalendar(end_date_of_opposition));
			}
			
			// ------------------------- end ---------------------------------------------
			

			// ------------------------- mark verbal element -----------------------------
			if (tm.getTitle() != null && tm.getTitle().length() > 0) {
				tmt.setWordMarkSpecification(getWordMarkSpecificationType(tm));
			}
			// ------------------------- end ---------------------------------------------
			
			// ------------------------- mark image details ------------------------------
			if (tm.getImageBytes() != null && tm.getImageBytes().length > 0) {
				tmt.setMarkImageDetails(getMarkImageDetails(tm));
			}
			// ------------------------- end ---------------------------------------------
			
			
			// ------------------------- nice classification -----------------------------
			if (tm.getNiceList() != null && tm.getNiceList().size() > 0) {
				tmt.setGoodsServicesDetails(getTradeMarkTypeGoodsServicesDetails(tm));
			}
			// ------------------------- end ---------------------------------------------

			// ------------------------- priority type -----------------------------------
			PriorityDetails priorityDetails = getPriorityDetails(tm);
			if (priorityDetails != null) {
				tmt.setPriorityDetails(priorityDetails);
			}
			// ------------------------- end ---------------------------------------------

			// ------------------------- exhibition priority type ------------------------
			ExhibitionPriorityDetails epd = getExhibitionPriorityDetails(tm);
			if (epd != null)
				tmt.setExhibitionPriorityDetails(epd);
			// ----------------------------------------------------------------------------

			// ------------------------- Applicant details ------------------------------
			ApplicantDetails ad = getApplicantDetails(tm);
			if (ad != null)
				tmt.setApplicantDetails(ad);
			// ------------------------- end ---------------------------------------------

			// ------------------------- Representative type -----------------------------

			jxml.TradeMarkType.RepresentativeDetails rd = getRepresentativeDetails(tm);
			if (rd != null)
				tmt.setRepresentativeDetails(rd);
			// ------------------------- end ---------------------------------------------
			
			
			// ------------------------- Record Details type -----------------------------
			jxml.TradeMarkType.MarkRecordDetails mrd = getMarkRecordDetails(tm);
			if (mrd != null)
				tmt.setMarkRecordDetails(mrd);
			// ------------------------- end ---------------------------------------------

			// ------------------------- Publication Details type ------------------------
			jxml.TradeMarkType.PublicationDetails pub = getMarkPublicationDetails(tm);
			if (pub != null)
				tmt.setPublicationDetails(pub);
			// ------------------------- end ---------------------------------------------
			
			// ------------------------- Correspondence address type ---------------------
			// set the correspondence address
			CorrespondenceAddressType cadt = null; //GetCorrespondenceAddressType(tm);
			if (cadt != null)
				tmt.setCorrespondenceAddress(cadt);
			// ------------------------- end ---------------------------------------------
			
			AppealDetails appealDetails = getAppealDetails(tm);
			if(appealDetails != null)
				tmt.setAppealDetails(appealDetails);
			
			OppositionDetails oppoDetail = getOppositionDetails(tm);
			if(oppoDetail != null)
				tmt.setOppositionDetails(oppoDetail);
			
			// ------------------------- Operation Code (insert, delete) -----------------
			tmt.setOperationCode(OperationCodeType.INSERT);
			// ------------------------- end ---------------------------------------------

			tradeMarkTypeArray[0] = tmt;
			// end main part

			TransactionDataType tDataType = new TransactionDataType();
			tDataType.setTradeMarkDetails(getTrademarkDetails(tmt));

			TransactionContentDetails tBodyContentDetails = new TransactionContentDetails();
			tBodyContentDetails.setTransactionIdentifier(tm.getTransactionIdentifier());
			tBodyContentDetails.setTransactionCode(TransactionCodeType.TRADE_MARK_LIST);
			tBodyContentDetails.setTransactionData(tDataType);

			tErrorType.setTransactionErrorCode(TransactionErrorCodeType.ERROR);
			tErrorType.setTransactionErrorText("Error mesazhi TransactionTypeError");

			// 3 definition
			TransactionBodyType tBodyType = new TransactionBodyType();
			tBodyType.setTransactionContentDetails(tBodyContentDetails);

			transactionType.setTransactionHeader(tHeaderType);
			transactionType.setTradeMarkTransactionBody(tBodyType);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return transactionType;
	}

	private WordMarkSpecificationType getWordMarkSpecificationType(Trademark tm) {
		WordMarkSpecificationType wmst = new WordMarkSpecificationType();
		wmst.setMarkVerbalElementText(getTextType(tm.getLanguageCode(), tm.getTitle()));
		return wmst;
	}


	private static KindMarkType mapKindMarkType(int kindMarkId) {
		
		if(kindMarkId == 1) {
			return KindMarkType.INDIVIDUAL;
		}
		else if(kindMarkId == 2) {
			return KindMarkType.COLLECTIVE;
		}
		else if(kindMarkId == 3) {
			return KindMarkType.CERTIFICATE;
		}
		else if(kindMarkId == 4) {
			return KindMarkType.GUARANTEE;
		}
		else {
			return null;
		}
		
	}
	
	private static MarkCurrentStatusCodeType mapTrademarkStatusCode(int statusId) {
		
		/*
		  
		 	# 1. Application filed
		 	# 2. Application published
			# 3. Application opposed
			# 4. Application refused
			# 5. Application withdrawn
			# 6. Registered
			# 7. Appeal pending
			# 8. Registration cancellation pending
			# 9. Registration cancelled
			# 10. Registration surrendered
			# 11. Expired
			# 12. null
			# 13. Ended
		 */
		if(statusId == 1) {
			return MarkCurrentStatusCodeType.APPLICATION_FILED;
		}
		else if(statusId == 2) {
			return MarkCurrentStatusCodeType.APPLICATION_PUBLISHED;
		}
		else if(statusId == 3) {
			return MarkCurrentStatusCodeType.APPLICATION_OPPOSED;
		}
		else if (statusId == 4) {
			return MarkCurrentStatusCodeType.APPLICATION_REFUSED;
		}
		else if (statusId == 5) {
			return MarkCurrentStatusCodeType.APPLICATION_WITHDRAWN;
		}
		else if (statusId == 6) {
			return MarkCurrentStatusCodeType.REGISTERED;
		}
		else if (statusId == 7) {
			return MarkCurrentStatusCodeType.APPEAL_PENDING;
		}
		else if (statusId == 8) {
			return MarkCurrentStatusCodeType.REGISTRATION_CANCELLATION_PENDING;
		}
		else if (statusId == 9) {
			return MarkCurrentStatusCodeType.REGISTRATION_CANCELLED;
		}
		else if (statusId == 10) {
			return MarkCurrentStatusCodeType.REGISTRATION_SURRENDERED;
		}
		else if (statusId == 11) {
			return MarkCurrentStatusCodeType.EXPIRED;
		}
//		else if (statusId == 12) {
//			return null;
//		}
		else if (statusId == 13) {
			return MarkCurrentStatusCodeType.ENDED;
		}
		else {
			return null;
		}
	}

	
	private static String mapMarkIPRKind(int iprKindId) {
		
		if(iprKindId == 1) {
			return IPRKindType.TRADEMARK.value(); // "Trade mark"
		}
		else if(iprKindId == 2) {
			return IPRKindType.LOGOTYPE.value(); // "Logotype"
		}
		else if(iprKindId == 3) {
			return IPRKindType.COMMERCIALNAME.value(); // "Commercial name"
		}
		else if(iprKindId == 4) {
			return IPRKindType.TITLEOFESTABLISHMENT.value(); // "Title of establishment"
		}
		else if(iprKindId == 5) {
			return IPRKindType.SLOGAN.value(); // "Slogan"
		}
		else if(iprKindId == 6) {
			return IPRKindType.DOMESTIC.value(); // "Domestic"
		}
		else if(iprKindId == 7) {
			return IPRKindType.FOREIGN.value(); // "Foreign"
		}
		else if(iprKindId == 8) {
			return IPRKindType.HALLMARK.value(); // "Hallmark"
		}
		else if(iprKindId == 9) {
			return IPRKindType.SIXTERMARK.value(); // "6ter mark"
		}
		else if(iprKindId == 10) {
			return IPRKindType.GEOGRAPHICALINDICATION.value(); // "Geographical indication"
		}
		else if(iprKindId == 11) {
			return IPRKindType.APPELLATIONOFORIGIN.value(); // "Appellation of origin"
		}
		else if(iprKindId == 12) {
			return IPRKindType.WELLKNOWNMARK.value(); // "Well-known mark"
		}
		else  
		{
			return null;
		}
		
	}

	public TransactionDataType.TradeMarkDetails getTrademarkDetails(TradeMarkType tmt) {
		TradeMarkDetails tmd = new TradeMarkDetails();
		tmd.getTradeMark().add(tmt);

		return tmd;
	}

	public WordMarkSpecificationType getWordMarkSpecificationType(boolean markStandardCharIndicator,
			boolean markStandardCharIndicatorSpecified, TextType textType) {
		WordMarkSpecificationType wMarkSpecType = new WordMarkSpecificationType();
		wMarkSpecType.setMarkVerbalElementText(textType);

		return wMarkSpecType;
	}

	public TextType getTextType(String isoLanguageCodeType, String tTypeValue) {
		TextType tType = new TextType();
		tType.setLanguageCode(isoLanguageCodeType);
		tType.setValue(tTypeValue);
		return tType;
	}

	public MarkImageDetails getMarkImageDetails(Trademark soipTM) {
		
		//jxml.TradeMarkType tmt = new jxml.TradeMarkType();
		jxml.TradeMarkType.MarkImageDetails markImageDetails = new jxml.TradeMarkType.MarkImageDetails();

		List<MarkImageType> markImageList = new jxml.TradeMarkType.MarkImageDetails().getMarkImage();
		
		
		
		MarkImageType markImageType = new jxml.MarkImageType();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //$NON-NLS-1$
		String today = sdf.format(new Date());

		soipTM.setMarkImageFileName(today + "-" + soipTM.getST13Code() + ".jpg");

		// set image filename in the xml
		markImageType.setMarkImageFilename(soipTM.getMarkImageFileName());

		// set image color
		markImageType.setMarkImageColourIndicator(soipTM.getLogoColours().length() == 0 ? false : true);
		
		if (soipTM.getLogoColours().length() == 0 ? false : true) {
			jxml.TextType tType = new jxml.TextType();
			tType.setLanguageCode(soipTM.getLanguageCode());
			tType.setValue(soipTM.getLogoColours());
			markImageType.getMarkImageColourClaimedText().add(tType);
		}

		// set Vienna classes
		if (soipTM.getViennaList() != null) {

			for (Vienna imagecategory : soipTM.getViennaList()) {
				if (markImageType.getMarkImageCategory() == null) {
					jxml.MarkImageCategoryType markImageCategory = new jxml.MarkImageCategoryType();
					markImageType.setMarkImageCategory(markImageCategory);

					jxml.MarkImageCategoryType.CategoryCodeDetails categoryCodeDetails = new jxml.MarkImageCategoryType.CategoryCodeDetails();
					markImageCategory.setCategoryCodeDetails(categoryCodeDetails);
				}
				
				List<String> categoryCodes = markImageType.getMarkImageCategory().getCategoryCodeDetails().getCategoryCode();

				categoryCodes.add(imagecategory.toString());
			}
		}
		
		markImageList.add(markImageType);
		markImageDetails.getMarkImage().add(markImageType);

		return markImageDetails;
		
	}

	public GoodsServicesDetails getTradeMarkTypeGoodsServicesDetails(Trademark soipTM) {

		GoodsServicesType goodsServicesTyp = new GoodsServicesType();

		goodsServicesTyp.setClassDescriptionDetails(getClassDescriptionDetails(soipTM));
		
		

//		goodsServicesTyp.setClassificationKindCode(ClassificationKindCodeType.NICE);
//		
//		if (soipTM.getNiceList().get(0).getNiceClassificationEdition() != 0)
//			goodsServicesTyp.setClassificationVersion("" + soipTM.getNiceList().get(0).getNiceClassificationEdition()); // "Nice
//																														// Classification,
//																														// 10-2014
		boolean domestic = false;
		for(Nice n : soipTM.getNiceList()) {
			if(n.getNiceClassNumber()>45) {
				domestic=true;
			}
		}
		if(domestic) {
			goodsServicesTyp.setClassificationKindCode(ClassificationKindCodeType.OTHER);
		}
		else {
			goodsServicesTyp.setClassificationKindCode(ClassificationKindCodeType.NICE);
			
			if (soipTM.getNiceList().get(0).getNiceClassificationEdition() != 0)
				goodsServicesTyp.setClassificationVersion("" + soipTM.getNiceList().get(0).getNiceClassificationEdition()); // "Nice
		}																										// Edition";

		GoodsServicesDetails tmTypeGoodsServiceDetails = new GoodsServicesDetails();
		tmTypeGoodsServiceDetails.setGoodsServices(goodsServicesTyp);

		return tmTypeGoodsServiceDetails;
	}

	public ClassDescriptionDetails getClassDescriptionDetails(Trademark soipTM) {

		ClassDescriptionDetails cDescriptionDetails = new ClassDescriptionDetails();

		ClassDescriptionType cDescType = null;
		
		if (soipTM.getNiceList() != null) {

			if (soipTM.getNiceList().size() > 0) {

				for (Nice n : soipTM.getNiceList()) {
					cDescType = new ClassDescriptionType();
					
					if(n.getNiceClassNumber()>45)
						cDescType.setClassNumber("-");
					else 
						cDescType.setClassNumber(n.getNiceClassNumber() + "");
					
//					cDescType.setClassNumber(n.getNiceClassNumber() + "");
					cDescType.getGoodsServicesDescription().add(getTextType(soipTM.getLanguageCode(), n.getNiceClassDesc()));

					// add to list
					cDescriptionDetails.getClassDescription().add(cDescType);
				}
			}
		}

		return cDescriptionDetails;
	}

	

	public ClassDescriptionType getClassDescriptionType(String code, String classNumber, String classDescription) {
		TextType t1 = new TextType();
		t1.setLanguageCode(code);
		t1.setValue(classDescription);

		TextType[] t3 = new TextType[1];
		t3[0] = t1;

		ClassDescriptionType clsDescTyp = new ClassDescriptionType();
		clsDescTyp.setClassNumber(classNumber);

		clsDescTyp.getGoodsServicesDescription().add(t3[0]);

		return clsDescTyp;
	}

	public PriorityDetails getPriorityDetails(Trademark tm) throws DatatypeConfigurationException {
		PriorityDetails pd = null;

		if (tm.getPriorityList() != null && tm.getPriorityList().size() != 0) {

			pd = new PriorityDetails();

			for (Priority p : tm.getPriorityList()) {
				
				PriorityType priorType = new PriorityType();

				if(p.getCountryCode()!= null)
					priorType.setPriorityCountryCode(p.getCountryCode());
				
				if (p.getPriorityDate() != null) {
					priorType.setPriorityDate(ClassHelper.toXMLGregorianCalendar(p.getPriorityDate()));
				}

				priorType.setPriorityNumber(p.getApplicationId());
				
				// priorityTypeArray[i] = priorType;
				pd.getPriority().add(priorType);
			}
		}
		return pd;
	}

	public ExhibitionPriorityDetails getExhibitionPriorityDetails(Trademark tm) throws DatatypeConfigurationException {
		ExhibitionPriorityDetails epd = null;

		// ExhibitionPriority[] exhibitionPriorityTypeArray = null;

		if (tm.getExhibitionPriorityList() != null && tm.getExhibitionPriorityList().size() > 0) {
			epd = new ExhibitionPriorityDetails();

			for (int i = 0; i < tm.getExhibitionPriorityList().size(); i++) {
				ExhibitionPriorityType exPriorType = new ExhibitionPriorityType();
				if (tm.getExhibitionPriorityList().get(i).getExhibitionDate() != null) {
					exPriorType.setExhibitionDate(ClassHelper.ConvertDateToXMLGregorianCalendar(tm.getExhibitionPriorityList().get(i).getExhibitionDate()));
				}

				if (tm.getExhibitionPriorityList().get(i).getEarliestAcceptedParisPriorityDate() != null) {
					exPriorType.setExhibitionDate(ClassHelper.ConvertDateToXMLGregorianCalendar(tm.getExhibitionPriorityList().get(i).getEarliestAcceptedParisPriorityDate()));
				}
				epd.getExhibitionPriority().add(exPriorType);
			}
		}
		return epd;
	}

	public ApplicantDetails getApplicantDetails(Trademark tm) {
		
		ApplicantDetails ad = null;

		if (tm.getApplicantList() != null && tm.getApplicantList().size() != 0) 
		{
			ad = new ApplicantDetails();

			for (Applicant ap : tm.getApplicantList()) 
			{
				ApplicantType applicantType = new ApplicantType();
				applicantType.setApplicantAddressBook(getAddressBookType(ap));
				
				if(ap.getResidenceCountryCode()!=null)
					applicantType.getApplicantNationalityCode().add(ap.getResidenceCountryCode());
				
				/*
				if(ap.isApplicantIsCompany())
					applicantType.setApplicantLegalEntity(LegalEntityType.LEGAL_ENTITY);
				else
					applicantType.setApplicantLegalEntity(LegalEntityType.PHYSICAL_PERSON);
				
				*/
				
				// applicantTypeArray[i] = applicantType;
				ad.getApplicant().add(applicantType);
			}
		}

		return ad;

	}

	public AddressBookType getAddressBookType(Person p) {
		

		// Address Street, AddressZone, City Name, ZIP, State Name
		String freeLineAddress = "";
		FreeFormatAddress ffa = new FreeFormatAddress();
		AddressType addressType = new AddressType();
		
		if(!p.getRole().equals("Agent"))
		{
			if (p.getAddress() != null && p.getAddress().trim().length() > 0)
				freeLineAddress +=  p.getAddress().trim();
			
			if (p.getCity() != null && p.getCity().trim().length() > 0) {
				if (p.getAddress() != null && p.getAddress().trim().length() > 0) {
					freeLineAddress += ", ";
				}
				
				freeLineAddress += p.getCity().trim();
			}
			
			
			if (p.getStateName() != null && p.getStateName().trim().length() > 0) {
							
				freeLineAddress += ", " + p.getStateName().trim();
			}
				
			
			if (p.getZip() != null && p.getZip().trim().length() > 0) {
				
				
				freeLineAddress += ", " + p.getZip().trim();
			}

			if (p.getResidenceCountryCode() != null && p.getResidenceCountryCode().length() > 0) {
				
				freeLineAddress += ", " +p.getResidenceCountryCode().trim();
			}
			
			
			ffa.getFreeFormatAddressLine().add(freeLineAddress);

			
			addressType.setAddressCountryCode(p.getResidenceCountryCode());
			addressType.setFreeFormatAddress(ffa);
		}
		


		

		FreeFormatNameDetails ffnd = new FreeFormatNameDetails();
		ffnd.getFreeFormatNameLine().add(p.getPersonName());

		FreeFormatNameType freeFormatNameType = new FreeFormatNameType();
		freeFormatNameType.setFreeFormatNameDetails(ffnd);

		NameType nameType = new NameType();
		nameType.setFreeFormatName(freeFormatNameType);

		FormattedNameAddressType fNameAddressType = new FormattedNameAddressType();

		if(!p.getRole().equals("Agent")) {
			fNameAddressType.setAddress(addressType);
		}
		
		fNameAddressType.setName(nameType);

		AddressBookType addressBookType = new AddressBookType();
		addressBookType.setFormattedNameAddress(fNameAddressType);

		return addressBookType;

	}

	public jxml.TradeMarkType.RepresentativeDetails getRepresentativeDetails(Trademark tm) {
		jxml.TradeMarkType.RepresentativeDetails rd = null;

		if (tm.getRepresentaiveList() != null && tm.getRepresentaiveList().size() != 0) {
			rd = new jxml.TradeMarkType.RepresentativeDetails();

			for (Representative r : tm.getRepresentaiveList()) {
				RepresentativeType agent = new RepresentativeType();
				agent.setRepresentativeAddressBook(getAddressBookType(r));

				/*
					AG	Agent
					RE	Representative
					AS	Address for Service
				*/
				/* RepresentativeKindCodeType
					Professional representative
					Lawyer
					Association
					Employee
					Employee with economic connections
					Other
					Undefined
				*/
				if(r.getRepresentativeType().equals("AG") || r.getRepresentativeType().equals("RE")) {
					agent.setRepresentativeKindCode(RepresentativeKindCodeType.PROFESSIONAL_REPRESENTATIVE);
					agent.setRepresentativeLegalEntity(LegalEntityType.LEGAL_ENTITY);
				}
				else {
					//nothing
				}
				
				if(r.getRepresentativeCodeIdentifier()>0)
					agent.setRepresentativeIdentifier("" + r.getRepresentativeCodeIdentifier());
				
				agent.getRepresentativeNationalityCode().add(r.getResidenceCountryCode());
				rd.getRepresentative().add(agent);

			}
		}

		return rd;
	}

	public CorrespondenceAddressType getCorrespondenceAddressType(Trademark tm) {
		CorrespondenceAddressType corespondenceAddresTyp = new CorrespondenceAddressType();
		if (tm.getRepresentaiveList() != null && tm.getRepresentaiveList().size() > 0) {
			corespondenceAddresTyp.setCorrespondenceAddressBook(getAddressBookType(tm.getRepresentaiveList().get(0)));
		} else if (tm.getApplicantList() != null && tm.getApplicantList().size() > 0) {
			corespondenceAddresTyp.setCorrespondenceAddressBook(getAddressBookType(tm.getApplicantList().get(0)));
		} else {
			//
		}
		return corespondenceAddresTyp;
	}

	public PublicationDetails getMarkPublicationDetails(Trademark tm) throws DatatypeConfigurationException {
		
		PublicationDetails pubDetails = null;
		
		if (tm.getTrademarkPublicationList() != null && tm.getTrademarkPublicationList().size() > 0) {
			
			pubDetails = new PublicationDetails();
			
			for (TrademarkPublication tmpub : tm.getTrademarkPublicationList()) {
				
				PublicationType pubType = new PublicationType();
				
				if (tmpub.getPublicationIdentifier() != null)
					pubType.setPublicationIdentifier(tmpub.getPublicationIdentifier());
				
				if (tmpub.getPublicationSection() != null)
					pubType.setPublicationSection(tmpub.getPublicationPage());
				
				if (tmpub.getPublicationDate() != null)
					pubType.setPublicationDate(ClassHelper.toXMLGregorianCalendar(tmpub.getPublicationDate()));
				
				if (tmpub.getPublicationSection() != null)
					pubType.setPublicationSection(tmpub.getPublicationSection());
				
				pubDetails.getPublication().add(pubType);
			}
			
		}
		
		return pubDetails;
	}
	
	public OppositionDetails getOppositionDetails(Trademark tm) throws DatatypeConfigurationException{
		
		OppositionDetails oppoDetails = null;
		
		if(tm.getOppositionList() != null && tm.getOppositionList().size()>0) {
			
			oppoDetails = new OppositionDetails();
			
			for(Opposition op : tm.getOppositionList()) {
				
				OppositionType otype = new OppositionType();
				
				otype.setOppositionDate(ClassHelper.toXMLGregorianCalendar(op.getOppositionDate()));
				otype.setOppositionIdentifier(op.getOppositionIdentifier());
				
				
				if(op.getRepresentativeList() != null && op.getRepresentativeList().size()>0) {
					
					OppositionType.RepresentativeDetails repDetails = new OppositionType.RepresentativeDetails();
					
					for(Representative r : op.getRepresentativeList()) {
						RepresentativeType rType = new RepresentativeType();
						rType.setRepresentativeAddressBook(getAddressBookType(r));
						if(r.getResidenceCountryCode() != null) {
							rType.setRepresentativeIncorporationCountryCode(r.getResidenceCountryCode());
							rType.setRepresentativeIncorporationCountryCode(r.getResidenceCountryCode());	
						}
						rType.setRepresentativeKindCode(RepresentativeKindCodeType.OTHER);
						rType.setRepresentativeLegalEntity(LegalEntityType.PHYSICAL_PERSON);
						
						repDetails.getRepresentative().add(rType);
						
						otype.setRepresentativeDetails(repDetails);
						
						//oppoDetails.getOpposition().add(otype);
					}
				}
				
				oppoDetails.getOpposition().add(otype);
			}
		}
		
		return oppoDetails;
	}
	
	public AppealDetails getAppealDetails(Trademark tm) throws DatatypeConfigurationException {
		AppealDetails appealDetails = null;
		
		if(tm.getAppealList() != null && tm.getAppealList().size()>0) {
			
			appealDetails = new AppealDetails();
			for(Appeal appeal : tm.getAppealList()) {
				
				AppealType atype = new AppealType();
				atype.setAppealIdentifier(appeal.getAppealIdentifier());
				atype.setAppealDecisionDate(ClassHelper.toXMLGregorianCalendar(appeal.getAppealDecisionDate()));
				atype.setAppealDate(ClassHelper.toXMLGregorianCalendar(appeal.getAppealDate()));
				atype.setAppealDecisionStatusCode(appeal.getAppealDecisionStatusCode());
				
				
				if(appeal.getAppellantList() != null && appeal.getAppellantList().size()>0) {
					AppellantDetails appellantDetails = new AppellantDetails();
					
					for(Appellant ap : appeal.getAppellantList()){
						
						AppellantType apellantType = new AppellantType();
						apellantType.setAppellantAddressBook(getAddressBookType(ap));
						
						if(ap.getResidenceCountryCode()!=null) {
							
							apellantType.setAppellantIncorporationCountryCode(ap.getResidenceCountryCode());
							apellantType.setAppellantIncorporationState(ap.getResidenceCountryCode());
						}
						
						appellantDetails.setAppellant(apellantType);
						
						atype.setAppellantDetails(appellantDetails);
					}
				}
				
				if(appeal.getRepresentativeList() != null && appeal.getRepresentativeList().size()>0) {
					RepresentativeDetails repDetails = new RepresentativeDetails();
					
					for(Representative r : appeal.getRepresentativeList()) {
						RepresentativeType rType = new RepresentativeType();
						rType.setRepresentativeAddressBook(getAddressBookType(r));
						if(r.getResidenceCountryCode() != null) {
							rType.setRepresentativeIncorporationCountryCode(r.getResidenceCountryCode());
							rType.setRepresentativeIncorporationCountryCode(r.getResidenceCountryCode());	
						}
						rType.setRepresentativeKindCode(RepresentativeKindCodeType.OTHER);
						rType.setRepresentativeLegalEntity(LegalEntityType.PHYSICAL_PERSON);
						
						repDetails.setRepresentative(rType);
						
						atype.setRepresentativeDetails(repDetails);
					}
				}
				
				appealDetails.getAppeal().add(atype);
			}
		}
		
		return  appealDetails;
	}
	
	public MarkRecordDetails getMarkRecordDetails(Trademark tm) throws DatatypeConfigurationException {
		
		MarkRecordDetails mrd = null;
		
		if (tm.getTrademarkRecordList() != null && tm.getTrademarkRecordList().size() > 0) {
			mrd = new MarkRecordDetails();
			
			for (TrademarkRecord rec : tm.getTrademarkRecordList()) {
				MarkRecordType mrtype = new MarkRecordType();
				BasicRecordType brtype = new BasicRecordType();
				
				brtype.setBasicRecordKind(rec.getRecordKind());
				
				if(rec.getRecordIdentifier() != null) {
					brtype.setRecordIdentifier(rec.getRecordIdentifier());
				}
				
				if(rec.getRecordFilingDate() != null)
					brtype.setRecordFilingDate(ClassHelper.toXMLGregorianCalendar(rec.getRecordFilingDate()));
				
				if(rec.getRecordPublicationDate()!=null)
					brtype.setRecordPublicationDate(ClassHelper.toXMLGregorianCalendar(rec.getRecordPublicationDate()));
				
				if(rec.getRecordEffectiveDate()!=null)
					brtype.setRecordEffectiveDate(ClassHelper.toXMLGregorianCalendar(rec.getRecordEffectiveDate()));
				
				if(rec.getRecordPublicationDate() != null)
					brtype.setRecordPublicationDate(ClassHelper.toXMLGregorianCalendar(rec.getRecordPublicationDate()));
				
				if(rec.getRecordCurrentStatusDate() != null) {
					brtype.setRecordCurrentStatusDate(ClassHelper.toXMLGregorianCalendar(rec.getRecordCurrentStatusDate()));
					brtype.setRecordCurrentStatusCode(RecordCurrentStatusCodeType.ACCEPTED);
				}
				
				// set record publications
				
				if (rec.getRecordPublicationList() != null && rec.getRecordPublicationList().size() > 0) {
					
					RecordPublicationDetails pubDetails = new RecordPublicationDetails();
					
						for (TrademarkPublication tmpub : rec.getRecordPublicationList()) {
							
							PublicationType pubType = new PublicationType();
							
							if (tmpub.getPublicationIdentifier() != null)
								pubType.setPublicationIdentifier(tmpub.getPublicationIdentifier());
							
							if (tmpub.getPublicationSection() != null)
								pubType.setPublicationSection(tmpub.getPublicationPage());
							
							if (tmpub.getPublicationDate() != null)
								pubType.setPublicationDate(ClassHelper.toXMLGregorianCalendar(tmpub.getPublicationDate()));
							
							if (tmpub.getPublicationSection() != null)
								pubType.setPublicationSection(tmpub.getPublicationSection());
							
							pubDetails.getRecordPublication().add(pubType);
						}
						
					brtype.setRecordPublicationDetails(pubDetails);
				}
				
				//set record applicant
				if(rec.getRecordApplicantList() != null && rec.getRecordApplicantList().size()>0) {
					ClaimantDetails claimantDetails = new ClaimantDetails();
					ClaimantType claimantType = new ClaimantType();
					
					claimantType.setClaimantIdentifier(rec.getRecordApplicantList().get(0).getPersonName());
					claimantType.setClaimantSequenceNumber(new BigInteger("1"));
					claimantType.setClaimantIncorporationCountryCode(rec.getRecordApplicantList().get(0).getResidenceCountryCode());
					claimantType.setClaimantAddressBook(getAddressBookType(rec.getRecordApplicantList().get(0)));
					
					claimantDetails.setClaimant(claimantType);
					brtype.setClaimantDetails(claimantDetails);
				}
				
				//set record representative 
				if(rec.getRecordRepresentativeList() != null && rec.getRecordRepresentativeList().size() > 0) {
					jxml.BasicRecordType.RepresentativeDetails repDetails = new jxml.BasicRecordType.RepresentativeDetails();
					RepresentativeType repType = new RepresentativeType();
					
					//repType.setRepresentativeIdentifier(rec.getRecordRepresentativeList().get(0).getPersonName());
					repType.setRepresentativeIncorporationCountryCode(rec.getRecordRepresentativeList().get(0).getResidenceCountryCode());
					repType.setRepresentativeKindCode(RepresentativeKindCodeType.PROFESSIONAL_REPRESENTATIVE);
					repType.setRepresentativeLegalEntity(LegalEntityType.LEGAL_ENTITY);
					repType.setRepresentativeAddressBook(getAddressBookType(rec.getRecordRepresentativeList().get(0)));
					
					repDetails.setRepresentative(repType);
					brtype.setRepresentativeDetails(repDetails);
				}
				
				//set record representative 
				if(rec.getRecordPrevRepresentativeList() != null && rec.getRecordPrevRepresentativeList().size() > 0) {
					jxml.BasicRecordType.RepresentativeDetails repDetails = new jxml.BasicRecordType.RepresentativeDetails();
					RepresentativeType repType = new RepresentativeType();
					
					//repType.setRepresentativeIdentifier(rec.getRecordRepresentativeList().get(0).getPersonName());
					repType.setRepresentativeIncorporationCountryCode(rec.getRecordRepresentativeList().get(0).getResidenceCountryCode());
					repType.setRepresentativeKindCode(RepresentativeKindCodeType.PROFESSIONAL_REPRESENTATIVE);
					repType.setRepresentativeLegalEntity(LegalEntityType.LEGAL_ENTITY);
					repType.setRepresentativeAddressBook(getAddressBookType(rec.getRecordRepresentativeList().get(0)));
					
					repDetails.setRepresentative(repType);
					brtype.setRepresentativeDetails(repDetails);
				}
				
				mrtype.setBasicRecord(brtype);
				mrd.getMarkRecord().add(mrtype);
			}
		}
		
		return mrd;
	}
	
	
}
