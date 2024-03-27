package org.tmview.soip;

import java.util.ArrayList;

import org.tmview.soip.Representative;

public class Claimant extends Person {

	private int ClaimantIdentifier;
	private String ClaimantType;
	private ArrayList<Representative> representativeList;
	
	public int getClaimantIdentifier() {
		return ClaimantIdentifier;
	}
	public void setClaimantIdentifier(int claimantIdentifier) {
		ClaimantIdentifier = claimantIdentifier;
	}
	public String getClaimantType() {
		return ClaimantType;
	}
	public void setClaimantType(String claimantType) {
		ClaimantType = claimantType;
	}
	
	public ArrayList<Representative> getRepresentativeList() {
		if(representativeList == null) {
			representativeList = new ArrayList<Representative>();
		}
			
		return representativeList;
	}
	public void setRepresentativeList(ArrayList<Representative> representativeList) {
		this.representativeList = representativeList;
	}
	
}
