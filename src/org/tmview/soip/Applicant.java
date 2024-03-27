package org.tmview.soip;

public class Applicant extends Person {

//	private String FileSeq;
//	private String FileType;
//	private int FileSeries;
//	private int FileNumber;
	private int ApplicantIdentifier;
	private String ApplicantType;
	private boolean ApplicantIsCompany;
	
	
//	public String getFileSeq() {
//		return FileSeq;
//	}
//	public void setFileSeq(String fileSeq) {
//		FileSeq = fileSeq;
//	}
//	public String getFileType() {
//		return FileType;
//	}
//	public void setFileType(String fileType) {
//		FileType = fileType;
//	}
//	public int getFileSeries() {
//		return FileSeries;
//	}
//	public void setFileSeries(int fileSeries) {
//		FileSeries = fileSeries;
//	}
//	public int getFileNumber() {
//		return FileNumber;
//	}
//	public void setFileNumber(int fileNumber) {
//		FileNumber = fileNumber;
//	}
	public int getApplicantIdentifier() {
		return ApplicantIdentifier;
	}
	public void setApplicantIdentifier(int applicantIdentifier) {
		ApplicantIdentifier = applicantIdentifier;
	}
	public String getApplicantType() {
		return ApplicantType;
	}
	public void setApplicantType(String applicantType) {
		ApplicantType = applicantType;
	}
	public boolean isApplicantIsCompany() {
		return ApplicantIsCompany;
	}
	public void setApplicantIsCompany(boolean applicantIsCompany) {
		ApplicantIsCompany = applicantIsCompany;
	}
}
