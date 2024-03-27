package org.tmview.soip;

import java.util.ArrayList;
import java.util.Date;

public class Trademark {
	
	private String FileSeq;
	private String FileType;
	private int FileSeries;
	private int FileNumber;
	private Date FilingDate;
	private String Title;
	private String MarkDescription;	
	private String StatusName;
	private String StatusCode;
	private String StatusDetails;
	private Date StatusDate;
	private String JournalCodeName;
	private Date ExpirationDate;
	private String LogoColours;
	private String LogoImageFileFormat;
	private String IPRKind;
	private int IPRKindID;
	private Date PublicationDate;
	private Date RegistrationDate;
	private String RegistrationNumber;
	private String ApplicationKindMark;
	private int ApplicationKindMarkID;
	private String SubType;
	private String Type;
	private String LanguageCode;
	private Date StartDateOfOppoisition;
	private Date EndDateOfOpposition;
	private String MarkImageFileName;
	private String MarkDisclaimer;
	private String ApplicationReference;
	private String ST13Code;
	private String ApplicationNumber;
	private String MarkFeature;
	private int StatusID;
	
	private String SpecialCircumstanceText;
	private int TotalMarkSeries;
	private String TradeDistinctivenessText;
	private String Comment;
	private String TransactionIdentifier;
	private String OfficeCode;

	

	

	private int ProcessNumber;
	private byte[] ImageBytes;
	private ArrayList<Nice> NiceList;
	private ArrayList<Vienna> ViennaList;
	private ArrayList<Applicant> ApplicantList;
	private ArrayList<Representative> RepresentaiveList;
	private ArrayList<Priority> PriorityList;
	private ArrayList<ExhibitionPriority> ExhibitionPriorityList;
	private ArrayList<TrademarkRecord> TrademarkRecordList;
	private ArrayList<TrademarkPublication> TrademarkPublicationList;
	private ArrayList<Appeal> AppealList;
	private ArrayList<Opposition> OppositionList;

	public Trademark(){
		
	}
	
	public String toString() {
		return this.getFileSeq() + "/" + this.getFileType() + "/" + this.getFileSeries() + "/" + this.getFileNumber();
	}



	public String getFileSeq() {
		return FileSeq;
	}



	public void setFileSeq(String fileSeq) {
		FileSeq = fileSeq;
	}



	public String getFileType() {
		return FileType;
	}



	public void setFileType(String fileType) {
		FileType = fileType;
	}



	public int getFileSeries() {
		return FileSeries;
	}



	public void setFileSeries(int fileSeries) {
		FileSeries = fileSeries;
	}



	public int getFileNumber() {
		return FileNumber;
	}



	public void setFileNumber(int fileNumber) {
		FileNumber = fileNumber;
	}



	public Date getFilingDate() {
		return FilingDate;
	}



	public void setFilingDate(Date filingDate) {
		FilingDate = filingDate;
	}



	public String getTitle() {
		return Title;
	}



	public void setTitle(String title) {
		Title = title;
	}



	public String getMarkDescription() {
		return MarkDescription;
	}



	public void setMarkDescription(String markDescription) {
		MarkDescription = markDescription;
	}



	public String getStatusName() {
		return StatusName;
	}



	public void setStatusName(String statusName) {
		StatusName = statusName;
	}



	public String getStatusCode() {
		return StatusCode;
	}



	public void setStatusCode(String statusCode) {
		StatusCode = statusCode;
	}



	public String getStatusDetails() {
		return StatusDetails;
	}



	public void setStatusDetails(String statusDetails) {
		StatusDetails = statusDetails;
	}



	public Date getStatusDate() {
		return StatusDate;
	}



	public void setStatusDate(Date statusDate) {
		StatusDate = statusDate;
	}



	public String getJournalCodeName() {
		return JournalCodeName;
	}



	public void setJournalCodeName(String journalCodeName) {
		JournalCodeName = journalCodeName;
	}



	public Date getExpirationDate() {
		return ExpirationDate;
	}



	public void setExpirationDate(Date expirationDate) {
		ExpirationDate = expirationDate;
	}



	public String getLogoColours() {
		return LogoColours;
	}



	public void setLogoColours(String logoColours) {
		LogoColours = logoColours;
	}



	public String getLogoImageFileFormat() {
		return LogoImageFileFormat;
	}



	public void setLogoImageFileFormat(String logoImageFileFormat) {
		LogoImageFileFormat = logoImageFileFormat;
	}



	public String getIPRKind() {
		return IPRKind;
	}



	public void setIPRKind(String iPRKind) {
		IPRKind = iPRKind;
	}



	public int getIPRKindID() {
		return IPRKindID;
	}



	public void setIPRKindID(int iPRKindID) {
		IPRKindID = iPRKindID;
	}



	public Date getPublicationDate() {
		return PublicationDate;
	}



	public void setPublicationDate(Date publicationDate) {
		PublicationDate = publicationDate;
	}



	public Date getRegistrationDate() {
		return RegistrationDate;
	}



	public void setRegistrationDate(Date registrationDate) {
		RegistrationDate = registrationDate;
	}



	public String getRegistrationNumber() {
		return RegistrationNumber;
	}



	public void setRegistrationNumber(String registrationNumber) {
		RegistrationNumber = registrationNumber;
	}



	public String getApplicationKindMark() {
		return ApplicationKindMark;
	}



	public void setApplicationKindMark(String applicationKindMark) {
		ApplicationKindMark = applicationKindMark;
	}



	public int getApplicationKindMarkID() {
		return ApplicationKindMarkID;
	}



	public void setApplicationKindMarkID(int applicationKindMarkID) {
		ApplicationKindMarkID = applicationKindMarkID;
	}



	public String getSubType() {
		return SubType;
	}



	public void setSubType(String subType) {
		SubType = subType;
	}



	public String getType() {
		return Type;
	}



	public void setType(String type) {
		Type = type;
	}



	public String getLanguageCode() {
		return LanguageCode;
	}



	public void setLanguageCode(String languageCode) {
		LanguageCode = languageCode;
	}



	public Date getStartDateOfOppoisition() {
		return StartDateOfOppoisition;
	}



	public void setStartDateOfOppoisition(Date startDateOfOppoisition) {
		StartDateOfOppoisition = startDateOfOppoisition;
	}



	public Date getEndDateOfOpposition() {
		return EndDateOfOpposition;
	}



	public void setEndDateOfOpposition(Date endDateOfOpposition) {
		EndDateOfOpposition = endDateOfOpposition;
	}



	public String getMarkImageFileName() {
		return MarkImageFileName;
	}



	public void setMarkImageFileName(String markImageFileName) {
		MarkImageFileName = markImageFileName;
	}



	public String getMarkDisclaimer() {
		return MarkDisclaimer;
	}



	public void setMarkDisclaimer(String markDisclaimer) {
		MarkDisclaimer = markDisclaimer;
	}



	public String getApplicationReference() {
		return ApplicationReference;
	}



	public void setApplicationReference(String applicationReference) {
		ApplicationReference = applicationReference;
	}



	public String getST13Code() {
		return ST13Code;
	}



	public void setST13Code(String sT13Code) {
		ST13Code = sT13Code;
	}



	public String getApplicationNumber() {
		return ApplicationNumber;
	}



	public void setApplicationNumber(String applicationNumber) {
		ApplicationNumber = applicationNumber;
	}



	public String getMarkFeature() {
		return MarkFeature;
	}



	public void setMarkFeature(String markFeature) {
		MarkFeature = markFeature;
	}



	public int getStatusID() {
		return StatusID;
	}



	public void setStatusID(int statusID) {
		StatusID = statusID;
	}



	public String getSpecialCircumstanceText() {
		return SpecialCircumstanceText;
	}



	public void setSpecialCircumstanceText(String specialCircumstanceText) {
		SpecialCircumstanceText = specialCircumstanceText;
	}



	public int getTotalMarkSeries() {
		return TotalMarkSeries;
	}



	public void setTotalMarkSeries(int totalMarkSeries) {
		TotalMarkSeries = totalMarkSeries;
	}



	public String getTradeDistinctivenessText() {
		return TradeDistinctivenessText;
	}



	public void setTradeDistinctivenessText(String tradeDistinctivenessText) {
		TradeDistinctivenessText = tradeDistinctivenessText;
	}



	public String getComment() {
		return Comment;
	}



	public void setComment(String comment) {
		Comment = comment;
	}



	public int getProcessNumber() {
		return ProcessNumber;
	}



	public void setProcessNumber(int processNumber) {
		ProcessNumber = processNumber;
	}



	public byte[] getImageBytes() {
		return ImageBytes;
	}



	public void setImageBytes(byte[] imageBytes) {
		ImageBytes = imageBytes;
	}

	
	
	public String getTransactionIdentifier() {
		return TransactionIdentifier;
	}

	public void setTransactionIdentifier(String transactionIdentifier) {
		TransactionIdentifier = transactionIdentifier;
	}

	
	public String getOfficeCode() {
		return OfficeCode;
	}

	public void setOfficeCode(String officeCode) {
		OfficeCode = officeCode;
	}
	
	public ArrayList<Nice> getNiceList() {
		if(NiceList == null) {
			NiceList = new ArrayList<Nice>();
		}
		return NiceList;
	}



	public void setNiceList(ArrayList<Nice> niceList) {
		
			
		NiceList = niceList;
	}



	public ArrayList<Vienna> getViennaList() {
		if(ViennaList == null) {
			ViennaList = new ArrayList<Vienna>();
		}
		return ViennaList;
	}



	public void setViennaList(ArrayList<Vienna> viennaList) {
		ViennaList = viennaList;
	}



	public ArrayList<Applicant> getApplicantList() {
		if(ApplicantList == null) {
			ApplicantList = new ArrayList<Applicant>();
		}
		return ApplicantList;
	}



	public void setApplicantList(ArrayList<Applicant> applicantList) {
		ApplicantList = applicantList;
	}



	public ArrayList<Representative> getRepresentaiveList() {
		if(RepresentaiveList == null) {
			RepresentaiveList = new ArrayList<Representative>();
		}
		return RepresentaiveList;
	}



	public void setRepresentaiveList(ArrayList<Representative> representaiveList) {
		RepresentaiveList = representaiveList;
	}



	public ArrayList<Priority> getPriorityList() {
		if(PriorityList == null)
			PriorityList = new ArrayList<Priority>();
		return PriorityList;
	}



	public void setPriorityList(ArrayList<Priority> priorityList) {
		PriorityList = priorityList;
	}



	public ArrayList<ExhibitionPriority> getExhibitionPriorityList() {
		if(ExhibitionPriorityList == null) {
			ExhibitionPriorityList = new ArrayList<ExhibitionPriority>();
		}
		return ExhibitionPriorityList;
	}



	public void setExhibitionPriorityList(ArrayList<ExhibitionPriority> exhibitionPriorityList) {
		ExhibitionPriorityList = exhibitionPriorityList;
	}



	public ArrayList<TrademarkRecord> getTrademarkRecordList() {
		if(TrademarkRecordList == null)
			TrademarkRecordList = new ArrayList<TrademarkRecord>();
		return TrademarkRecordList;
	}



	public void setTrademarkRecordList(ArrayList<TrademarkRecord> trademarkRecordList) {
		TrademarkRecordList = trademarkRecordList;
	}



	public ArrayList<TrademarkPublication> getTrademarkPublicationList() {
		if(TrademarkPublicationList == null)
			TrademarkPublicationList = new ArrayList<TrademarkPublication>();
		return TrademarkPublicationList;
	}



	public void setTrademarkPublicationList(ArrayList<TrademarkPublication> trademarkPublicationList) {
		TrademarkPublicationList = trademarkPublicationList;
	}



	public ArrayList<Appeal> getAppealList() {
		if(AppealList == null)
			AppealList= new ArrayList<Appeal>();
		return AppealList;
	}



	public void setAppealList(ArrayList<Appeal> appealList) {
		AppealList = appealList;
	}

	public ArrayList<Opposition> getOppositionList() {
		if(OppositionList == null) {
			OppositionList = new ArrayList<Opposition>();
		}
		return OppositionList;
	}

	public void setOppositionList(ArrayList<Opposition> oppositionList) {
		OppositionList = oppositionList;
	}
	
	
	
}
