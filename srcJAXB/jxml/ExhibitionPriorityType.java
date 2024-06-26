//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.11 at 12:27:12 AM CET 
//


package jxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExhibitionPriorityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExhibitionPriorityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExhibitionCountryCode" type="{http://www.oami.europa.eu/TM-Search}ExtendedISOCountryCodeType" minOccurs="0"/>
 *         &lt;element name="ExhibitionCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExhibitionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExhibitionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ExhibitionFirstDisplayDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExhibitionStatusCode" type="{http://www.oami.europa.eu/TM-Search}ExhibitionStatusCodeType" minOccurs="0"/>
 *         &lt;element name="ExhibitionStatusDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExhibitionPriorityType", propOrder = {
    "exhibitionCountryCode",
    "exhibitionCityName",
    "exhibitionName",
    "exhibitionDate",
    "exhibitionFirstDisplayDate",
    "exhibitionStatusCode",
    "exhibitionStatusDate"
})
public class ExhibitionPriorityType {

    @XmlElement(name = "ExhibitionCountryCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String exhibitionCountryCode;
    @XmlElement(name = "ExhibitionCityName")
    protected String exhibitionCityName;
    @XmlElement(name = "ExhibitionName")
    protected String exhibitionName;
    @XmlElement(name = "ExhibitionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exhibitionDate;
    @XmlElement(name = "ExhibitionFirstDisplayDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exhibitionFirstDisplayDate;
    @XmlElement(name = "ExhibitionStatusCode")
    @XmlSchemaType(name = "token")
    protected ExhibitionStatusCodeType exhibitionStatusCode;
    @XmlElement(name = "ExhibitionStatusDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exhibitionStatusDate;

    /**
     * Gets the value of the exhibitionCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExhibitionCountryCode() {
        return exhibitionCountryCode;
    }

    /**
     * Sets the value of the exhibitionCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExhibitionCountryCode(String value) {
        this.exhibitionCountryCode = value;
    }

    /**
     * Gets the value of the exhibitionCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExhibitionCityName() {
        return exhibitionCityName;
    }

    /**
     * Sets the value of the exhibitionCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExhibitionCityName(String value) {
        this.exhibitionCityName = value;
    }

    /**
     * Gets the value of the exhibitionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExhibitionName() {
        return exhibitionName;
    }

    /**
     * Sets the value of the exhibitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExhibitionName(String value) {
        this.exhibitionName = value;
    }

    /**
     * Gets the value of the exhibitionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExhibitionDate() {
        return exhibitionDate;
    }

    /**
     * Sets the value of the exhibitionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExhibitionDate(XMLGregorianCalendar value) {
        this.exhibitionDate = value;
    }

    /**
     * Gets the value of the exhibitionFirstDisplayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExhibitionFirstDisplayDate() {
        return exhibitionFirstDisplayDate;
    }

    /**
     * Sets the value of the exhibitionFirstDisplayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExhibitionFirstDisplayDate(XMLGregorianCalendar value) {
        this.exhibitionFirstDisplayDate = value;
    }

    /**
     * Gets the value of the exhibitionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExhibitionStatusCodeType }
     *     
     */
    public ExhibitionStatusCodeType getExhibitionStatusCode() {
        return exhibitionStatusCode;
    }

    /**
     * Sets the value of the exhibitionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhibitionStatusCodeType }
     *     
     */
    public void setExhibitionStatusCode(ExhibitionStatusCodeType value) {
        this.exhibitionStatusCode = value;
    }

    /**
     * Gets the value of the exhibitionStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExhibitionStatusDate() {
        return exhibitionStatusDate;
    }

    /**
     * Sets the value of the exhibitionStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExhibitionStatusDate(XMLGregorianCalendar value) {
        this.exhibitionStatusDate = value;
    }

}
