package org.tmview.soip;

import java.util.ArrayList;
import java.util.Date;

public class TrademarkRecord {

	private String FileSeq;
	private String FileType;
	private int FileSeries;
	private int FileNumber;
	private String RecordIdentifier;
	private String RecordKind;
	private String JournalCode;
	private Date RecordPublicationDate;
	private Date RecordEffectiveDate;
	private Date RecordFilingDate;
	private Date RecordNotificationDate;
	private Date RecordCurrentStatusDate;
	private String ActionTypeCode;
	private String ActionTypeName;
	private String UserDocTypeName;
	private String UserDocTypeCode;
	
	private ArrayList<Applicant> recordApplicantList;
	private ArrayList<Representative> recordRepresentativeList;
	private ArrayList<Representative> recordPrevRepresentativeList;
	private ArrayList<Claimant> recordClaimentList;
	private ArrayList<TrademarkPublication> recordPublicationList;
	
	public TrademarkRecord() {
		
	}
	
	
	
	public String getRecordIdentifier() {
		return RecordIdentifier;
	}



	public void setRecordIdentifier(String recordIdentifier) {
		RecordIdentifier = recordIdentifier;
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

	public String getRecordKind() {
		return RecordKind;
	}

	public void setRecordKind(String recordKind) {
		RecordKind = recordKind;
	}

	public String getJournalCode() {
		return JournalCode;
	}

	public void setJournalCode(String journalCode) {
		JournalCode = journalCode;
	}

	public Date getRecordPublicationDate() {
		return RecordPublicationDate;
	}

	public void setRecordPublicationDate(Date publicationDate) {
		RecordPublicationDate = publicationDate;
	}

	public Date getRecordEffectiveDate() {
		return RecordEffectiveDate;
	}

	public void setRecordEffectiveDate(Date recordEffectiveDate) {
		RecordEffectiveDate = recordEffectiveDate;
	}
	
	public Date getRecordFilingDate() {
		return RecordFilingDate;
	}

	public void setRecordFilingDate(Date recordFilingDate) {
		RecordFilingDate = recordFilingDate;
	}

	public Date getRecordNotificationDate() {
		return RecordNotificationDate;
	}

	public void setRecordNotificationDate(Date recordNotificationDate) {
		RecordNotificationDate = recordNotificationDate;
	}
	
	public Date getRecordCurrentStatusDate() {
		return RecordCurrentStatusDate;
	}

	public void setRecordCurrentStatusDate(Date recordCurrentStatusDate) {
		RecordCurrentStatusDate = recordCurrentStatusDate;
	}

	public String getActionTypeCode() {
		return ActionTypeCode;
	}

	public void setActionTypeCode(String actionTypeCode) {
		ActionTypeCode = actionTypeCode;
	}

	public String getActionTypeName() {
		return ActionTypeName;
	}

	public void setActionTypeName(String actionTypeName) {
		ActionTypeName = actionTypeName;
	}

	public String getUserDocTypeName() {
		return UserDocTypeName;
	}

	public void setUserDocTypeName(String userDocTypeName) {
		UserDocTypeName = userDocTypeName;
	}

	public String getUserDocTypeCode() {
		return UserDocTypeCode;
	}

	public void setUserDocTypeCode(String userDocTypeCode) {
		UserDocTypeCode = userDocTypeCode;
	}

	public ArrayList<Applicant> getRecordApplicantList() {
		if(recordApplicantList == null)
			recordApplicantList = new ArrayList<Applicant>();
		
		return recordApplicantList;
	}

	public void setRecordApplicantList(ArrayList<Applicant> recordApplicantList) {
		this.recordApplicantList = recordApplicantList;
	}

	public ArrayList<Representative> getRecordRepresentativeList() {
		if(recordRepresentativeList == null)
			recordRepresentativeList = new ArrayList<Representative>();
		
		return recordRepresentativeList;
	}

	public void setRecordRepresentativeList(ArrayList<Representative> recordRepresentativeList) {
		this.recordRepresentativeList = recordRepresentativeList;
	}

	public ArrayList<Representative> getRecordPrevRepresentativeList() {
		if(recordPrevRepresentativeList == null)
			recordPrevRepresentativeList = new ArrayList<>();
		return recordPrevRepresentativeList;
	}



	public void setRecordPrevRepresentativeList(ArrayList<Representative> recordPrevRepresentativeList) {
		this.recordPrevRepresentativeList = recordPrevRepresentativeList;
	}


	public ArrayList<Claimant> getRecordClaimentList() {
		if (recordClaimentList == null)
			recordClaimentList = new ArrayList<Claimant>();
		return recordClaimentList;
	}



	public void setRecordClaimentList(ArrayList<Claimant> recordClaimentList) {
		this.recordClaimentList = recordClaimentList;
	}



	public ArrayList<TrademarkPublication> getRecordPublicationList() {
		if(recordPublicationList == null)
			recordPublicationList = new ArrayList<TrademarkPublication>();
		
		return recordPublicationList;
	}



	public void setRecordPublicationList(ArrayList<TrademarkPublication> recordPublicationList) {
		this.recordPublicationList = recordPublicationList;
	}

	
	
	
	
	

}
