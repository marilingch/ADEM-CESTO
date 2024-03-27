package org.tmview.soip;

import java.util.ArrayList;
import java.util.Date;

public class Opposition {

	private String OppositionIdentifier;
	private Date OppositionDate;
	private String OppositionReference;
	//private ISOLanguageCodeType ProceedingLanguageCode;
	private String OppositionBasisCode;
	private String OppositionGroundText;
	private String OppositionCurrentStatusCode;
	private Date OppositionCurrentStatusDate;
	private String OppositionDecisionStatusCode;
	private String EarlierMark;
	
	private ArrayList<Opponent> opponentList;
	private ArrayList<Representative> representativeList;
	public String getOppositionIdentifier() {
		return OppositionIdentifier;
	}
	public void setOppositionIdentifier(String oppositionIdentifier) {
		OppositionIdentifier = oppositionIdentifier;
	}
	public Date getOppositionDate() {
		return OppositionDate;
	}
	public void setOppositionDate(Date oppositionDate) {
		OppositionDate = oppositionDate;
	}
	public String getOppositionReference() {
		return OppositionReference;
	}
	public void setOppositionReference(String oppositionReference) {
		OppositionReference = oppositionReference;
	}
	public String getOppositionBasisCode() {
		return OppositionBasisCode;
	}
	public void setOppositionBasisCode(String oppositionBasisCode) {
		OppositionBasisCode = oppositionBasisCode;
	}
	public String getOppositionGroundText() {
		return OppositionGroundText;
	}
	public void setOppositionGroundText(String oppositionGroundText) {
		OppositionGroundText = oppositionGroundText;
	}
	public String getOppositionCurrentStatusCode() {
		return OppositionCurrentStatusCode;
	}
	public void setOppositionCurrentStatusCode(String oppositionCurrentStatusCode) {
		OppositionCurrentStatusCode = oppositionCurrentStatusCode;
	}
	public Date getOppositionCurrentStatusDate() {
		return OppositionCurrentStatusDate;
	}
	public void setOppositionCurrentStatusDate(Date oppositionCurrentStatusDate) {
		OppositionCurrentStatusDate = oppositionCurrentStatusDate;
	}
	public String getOppositionDecisionStatusCode() {
		return OppositionDecisionStatusCode;
	}
	public void setOppositionDecisionStatusCode(String oppositionDecisionStatusCode) {
		OppositionDecisionStatusCode = oppositionDecisionStatusCode;
	}
	public String getEarlierMark() {
		return EarlierMark;
	}
	public void setEarlierMark(String earlierMark) {
		EarlierMark = earlierMark;
	}
	public ArrayList<Opponent> getOpponentList() {
		if(opponentList == null) {
			opponentList = new ArrayList<Opponent>();
		}
		return opponentList;
	}
	public void setOpponentList(ArrayList<Opponent> opponentList) {
		this.opponentList = opponentList;
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
