package org.tmview.soip;
import java.util.Date;

public class Priority {
	private String FileSeq;
	private String FileType;
	private int FileSeries;
	private int FileNumber;
	private String CountryCode;
	private String Country;
	private String ApplicationId;
	private Date PriorityDate;
	private String Notes;
	private boolean IsAccepted;
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
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getApplicationId() {
		return ApplicationId;
	}
	public void setApplicationId(String applicationId) {
		ApplicationId = applicationId;
	}
	public Date getPriorityDate() {
		return PriorityDate;
	}
	public void setPriorityDate(Date priorityDate) {
		PriorityDate = priorityDate;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	public boolean isIsAccepted() {
		return IsAccepted;
	}
	public void setIsAccepted(boolean isAccepted) {
		IsAccepted = isAccepted;
	} 
	
	
}
