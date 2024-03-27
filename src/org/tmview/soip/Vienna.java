package org.tmview.soip;

import java.text.DecimalFormat;

public class Vienna {
	private String FileSeq;
	private String FileType;
	private int FileSeries;
	private int FileNumber;
	private String ViennaCategory;
	private String ViennaDivision;
	private String ViennaSection;
	private String ViennaDescriptionText;
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
	public String getViennaCategory() {
		return ViennaCategory;
	}
	public void setViennaCategory(String viennaCategory) {
		ViennaCategory = viennaCategory;
	}
	public String getViennaDivision() {
		return ViennaDivision;
	}
	public void setViennaDivision(String viennaDivision) {
		ViennaDivision = viennaDivision;
	}
	public String getViennaSection() {
		return ViennaSection;
	}
	public void setViennaSection(String viennaSection) {
		ViennaSection = viennaSection;
	}
	public String getViennaDescriptionText() {
		return ViennaDescriptionText;
	}
	public void setViennaDescriptionText(String viennaDescriptionText) {
		ViennaDescriptionText = viennaDescriptionText;
	}
	
	public String toString() {
		return "" + new DecimalFormat("00").format(Double.parseDouble(this.getViennaCategory())) + "." + new DecimalFormat("00").format(Double.parseDouble(this.getViennaDivision())) + "." +
				new DecimalFormat("00").format(Double.parseDouble(this.getViennaSection()));
	}
	
	
}
