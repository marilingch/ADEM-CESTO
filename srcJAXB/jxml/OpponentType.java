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
 * <p>Java class for OpponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OpponentIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="OpponentNationalityCode" type="{http://www.oami.europa.eu/TM-Search}NationalityCodeType" minOccurs="0"/>
 *         &lt;element name="OpponentLegalEntity" type="{http://www.oami.europa.eu/TM-Search}LegalEntityType" minOccurs="0"/>
 *         &lt;element name="OpponentIncorporationCountryCode" type="{http://www.oami.europa.eu/TM-Search}ExtendedISOCountryCodeType" minOccurs="0"/>
 *         &lt;element name="OpponentIncorporationState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpponentAddressBook" type="{http://www.oami.europa.eu/TM-Search}AddressBookType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpponentType", propOrder = {
    "opponentIdentifier",
    "opponentNationalityCode",
    "opponentLegalEntity",
    "opponentIncorporationCountryCode",
    "opponentIncorporationState",
    "opponentAddressBook"
})
public class OpponentType {

    @XmlElement(name = "OpponentIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String opponentIdentifier;
    @XmlList
    @XmlElement(name = "OpponentNationalityCode")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> opponentNationalityCode;
    @XmlElement(name = "OpponentLegalEntity")
    @XmlSchemaType(name = "token")
    protected LegalEntityType opponentLegalEntity;
    @XmlElement(name = "OpponentIncorporationCountryCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String opponentIncorporationCountryCode;
    @XmlElement(name = "OpponentIncorporationState")
    protected String opponentIncorporationState;
    @XmlElement(name = "OpponentAddressBook")
    protected AddressBookType opponentAddressBook;

    /**
     * Gets the value of the opponentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpponentIdentifier() {
        return opponentIdentifier;
    }

    /**
     * Sets the value of the opponentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpponentIdentifier(String value) {
        this.opponentIdentifier = value;
    }

    /**
     * Gets the value of the opponentNationalityCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opponentNationalityCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpponentNationalityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOpponentNationalityCode() {
        if (opponentNationalityCode == null) {
            opponentNationalityCode = new ArrayList<String>();
        }
        return this.opponentNationalityCode;
    }

    /**
     * Gets the value of the opponentLegalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityType }
     *     
     */
    public LegalEntityType getOpponentLegalEntity() {
        return opponentLegalEntity;
    }

    /**
     * Sets the value of the opponentLegalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityType }
     *     
     */
    public void setOpponentLegalEntity(LegalEntityType value) {
        this.opponentLegalEntity = value;
    }

    /**
     * Gets the value of the opponentIncorporationCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpponentIncorporationCountryCode() {
        return opponentIncorporationCountryCode;
    }

    /**
     * Sets the value of the opponentIncorporationCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpponentIncorporationCountryCode(String value) {
        this.opponentIncorporationCountryCode = value;
    }

    /**
     * Gets the value of the opponentIncorporationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpponentIncorporationState() {
        return opponentIncorporationState;
    }

    /**
     * Sets the value of the opponentIncorporationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpponentIncorporationState(String value) {
        this.opponentIncorporationState = value;
    }

    /**
     * Gets the value of the opponentAddressBook property.
     * 
     * @return
     *     possible object is
     *     {@link AddressBookType }
     *     
     */
    public AddressBookType getOpponentAddressBook() {
        return opponentAddressBook;
    }

    /**
     * Sets the value of the opponentAddressBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressBookType }
     *     
     */
    public void setOpponentAddressBook(AddressBookType value) {
        this.opponentAddressBook = value;
    }

}