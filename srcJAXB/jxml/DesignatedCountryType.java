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


/**
 * <p>Java class for DesignatedCountryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignatedCountryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DesignatedCountryCode" type="{http://www.oami.europa.eu/TM-Search}ExtendedWIPOST3CodeType"/>
 *         &lt;element name="DesignatedUnderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesignatedCountryType", propOrder = {
    "designatedCountryCode",
    "designatedUnderCode"
})
public class DesignatedCountryType {

    @XmlElement(name = "DesignatedCountryCode", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String designatedCountryCode;
    @XmlElement(name = "DesignatedUnderCode")
    protected String designatedUnderCode;

    /**
     * Gets the value of the designatedCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignatedCountryCode() {
        return designatedCountryCode;
    }

    /**
     * Sets the value of the designatedCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignatedCountryCode(String value) {
        this.designatedCountryCode = value;
    }

    /**
     * Gets the value of the designatedUnderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignatedUnderCode() {
        return designatedUnderCode;
    }

    /**
     * Sets the value of the designatedUnderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignatedUnderCode(String value) {
        this.designatedUnderCode = value;
    }

}
