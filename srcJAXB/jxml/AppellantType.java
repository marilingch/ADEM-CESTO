//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.11 at 12:27:12 AM CET 
//


package jxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AppellantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppellantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppellantIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="AppellantNationalityCode" type="{http://www.oami.europa.eu/TM-Search}NationalityCodeType" minOccurs="0"/>
 *         &lt;element name="AppellantLegalEntity" type="{http://www.oami.europa.eu/TM-Search}LegalEntityType" minOccurs="0"/>
 *         &lt;element name="AppellantIncorporationCountryCode" type="{http://www.oami.europa.eu/TM-Search}ExtendedISOCountryCodeType" minOccurs="0"/>
 *         &lt;element name="AppellantIncorporationState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppellantAddressBook" type="{http://www.oami.europa.eu/TM-Search}AddressBookType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppellantType", propOrder = {
    "appellantIdentifier",
    "appellantNationalityCode",
    "appellantLegalEntity",
    "appellantIncorporationCountryCode",
    "appellantIncorporationState",
    "appellantAddressBook"
})
public class AppellantType {

    @XmlElement(name = "AppellantIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String appellantIdentifier;
    @XmlList
    @XmlElement(name = "AppellantNationalityCode")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> appellantNationalityCode;
    @XmlElement(name = "AppellantLegalEntity")
    @XmlSchemaType(name = "token")
    protected LegalEntityType appellantLegalEntity;
    @XmlElement(name = "AppellantIncorporationCountryCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String appellantIncorporationCountryCode;
    @XmlElement(name = "AppellantIncorporationState")
    protected String appellantIncorporationState;
    @XmlElement(name = "AppellantAddressBook")
    protected AddressBookType appellantAddressBook;

    /**
     * Gets the value of the appellantIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppellantIdentifier() {
        return appellantIdentifier;
    }

    /**
     * Sets the value of the appellantIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppellantIdentifier(String value) {
        this.appellantIdentifier = value;
    }

    /**
     * Gets the value of the appellantNationalityCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appellantNationalityCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppellantNationalityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAppellantNationalityCode() {
        if (appellantNationalityCode == null) {
            appellantNationalityCode = new ArrayList<String>();
        }
        return this.appellantNationalityCode;
    }

    /**
     * Gets the value of the appellantLegalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityType }
     *     
     */
    public LegalEntityType getAppellantLegalEntity() {
        return appellantLegalEntity;
    }

    /**
     * Sets the value of the appellantLegalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityType }
     *     
     */
    public void setAppellantLegalEntity(LegalEntityType value) {
        this.appellantLegalEntity = value;
    }

    /**
     * Gets the value of the appellantIncorporationCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppellantIncorporationCountryCode() {
        return appellantIncorporationCountryCode;
    }

    /**
     * Sets the value of the appellantIncorporationCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppellantIncorporationCountryCode(String value) {
        this.appellantIncorporationCountryCode = value;
    }

    /**
     * Gets the value of the appellantIncorporationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppellantIncorporationState() {
        return appellantIncorporationState;
    }

    /**
     * Sets the value of the appellantIncorporationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppellantIncorporationState(String value) {
        this.appellantIncorporationState = value;
    }

    /**
     * Gets the value of the appellantAddressBook property.
     * 
     * @return
     *     possible object is
     *     {@link AddressBookType }
     *     
     */
    public AddressBookType getAppellantAddressBook() {
        return appellantAddressBook;
    }

    /**
     * Sets the value of the appellantAddressBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressBookType }
     *     
     */
    public void setAppellantAddressBook(AddressBookType value) {
        this.appellantAddressBook = value;
    }

}
