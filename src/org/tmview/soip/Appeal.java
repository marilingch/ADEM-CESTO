package org.tmview.soip;

import java.util.*;

public class Appeal {

	private String AppealIdentifier;
	private Date AppealDate;
	private Date AppealDecisionDate;
	
	private String AppealDecisionStatusCode;
	private ArrayList<Appellant> appellantList;
	private ArrayList<Representative> representativeList;
	
	
	public String getAppealIdentifier() {
		return AppealIdentifier;
	}
	public void setAppealIdentifier(String appealIdentifier) {
		AppealIdentifier = appealIdentifier;
	}
	public Date getAppealDate() {
		return AppealDate;
	}
	public void setAppealDate(Date appealDate) {
		AppealDate = appealDate;
	}
	public Date getAppealDecisionDate() {
		return AppealDecisionDate;
	}
	public void setAppealDecisionDate(Date appealDecisionDate) {
		AppealDecisionDate = appealDecisionDate;
	}
	public String getAppealDecisionStatusCode() {
		return AppealDecisionStatusCode;
	}
	public void setAppealDecisionStatusCode(String appealDecisionStatusCode) {
		AppealDecisionStatusCode = appealDecisionStatusCode;
	}
	public ArrayList<Appellant> getAppellantList() {
		if(appellantList == null)
			appellantList= new ArrayList<Appellant>();
		return appellantList;
	}
	public void setAppellantList(ArrayList<Appellant> appellantList) {
		this.appellantList = appellantList;
	}
	public ArrayList<Representative> getRepresentativeList() {
		if(representativeList == null)
			representativeList= new ArrayList<Representative>();
		return representativeList;
	}
	public void setRepresentativeList(ArrayList<Representative> representativeList) {
		this.representativeList = representativeList;
	}
	
	
	
}
