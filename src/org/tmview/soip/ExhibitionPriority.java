package org.tmview.soip;

import java.util.Date;

public class ExhibitionPriority {

	private Date EarliestAcceptedParisPriorityDate;
	private Date ExhibitionDate;
	private String Notes;
	public Date getEarliestAcceptedParisPriorityDate() {
		return EarliestAcceptedParisPriorityDate;
	}
	public void setEarliestAcceptedParisPriorityDate(Date earliestAcceptedParisPriorityDate) {
		EarliestAcceptedParisPriorityDate = earliestAcceptedParisPriorityDate;
	}
	public Date getExhibitionDate() {
		return ExhibitionDate;
	}
	public void setExhibitionDate(Date exhibitionDate) {
		ExhibitionDate = exhibitionDate;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	
}
