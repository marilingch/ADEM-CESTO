package org.tmview.soip;

import java.util.Date;

public class TrademarkPublication {

//	<xs:element name="PublicationIdentifier" type="xs:string"/>
//	<xs:element name="PublicationSection" type="xs:string" minOccurs="0"/>
//	<xs:element name="PublicationDate" type="xs:date" minOccurs="0"/>
//	<xs:element name="PublicationPage" type="xs:string" minOccurs="0"/>		
	
	private String PublicationIdentifier;
	private String PublicationSection;
	private Date PublicationDate;
	private String PublicationPage;
	
	public String getPublicationIdentifier() {
		return PublicationIdentifier;
	}
	public void setPublicationIdentifier(String publicationIdentifier) {
		PublicationIdentifier = publicationIdentifier;
	}
	public String getPublicationSection() {
		return PublicationSection;
	}
	public void setPublicationSection(String publicationSection) {
		PublicationSection = publicationSection;
	}
	public Date getPublicationDate() {
		return PublicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		PublicationDate = publicationDate;
	}
	public String getPublicationPage() {
		return PublicationPage;
	}
	public void setPublicationPage(String publicationPage) {
		PublicationPage = publicationPage;
	}
	
	
	
}
