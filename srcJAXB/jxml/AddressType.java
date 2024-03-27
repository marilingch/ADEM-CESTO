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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressCountryCode" type="{http://www.oami.europa.eu/TM-Search}ExtendedISOCountryCodeType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="FreeFormatAddress">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="FreeFormatAddressLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="FormattedAddress">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="AddressStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="AddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="AddressCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="AddressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="AddressPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "addressCountryCode",
    "freeFormatAddress",
    "formattedAddress"
})
public class AddressType {

    @XmlElement(name = "AddressCountryCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String addressCountryCode;
    @XmlElement(name = "FreeFormatAddress")
    protected AddressType.FreeFormatAddress freeFormatAddress;
    @XmlElement(name = "FormattedAddress")
    protected AddressType.FormattedAddress formattedAddress;

    /**
     * Gets the value of the addressCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCountryCode() {
        return addressCountryCode;
    }

    /**
     * Sets the value of the addressCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCountryCode(String value) {
        this.addressCountryCode = value;
    }

    /**
     * Gets the value of the freeFormatAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType.FreeFormatAddress }
     *     
     */
    public AddressType.FreeFormatAddress getFreeFormatAddress() {
        return freeFormatAddress;
    }

    /**
     * Sets the value of the freeFormatAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType.FreeFormatAddress }
     *     
     */
    public void setFreeFormatAddress(AddressType.FreeFormatAddress value) {
        this.freeFormatAddress = value;
    }

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType.FormattedAddress }
     *     
     */
    public AddressType.FormattedAddress getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType.FormattedAddress }
     *     
     */
    public void setFormattedAddress(AddressType.FormattedAddress value) {
        this.formattedAddress = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AddressStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AddressCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AddressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AddressPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "addressStreet",
        "addressCity",
        "addressCounty",
        "addressState",
        "addressPostcode"
    })
    public static class FormattedAddress {

        @XmlElement(name = "AddressStreet")
        protected String addressStreet;
        @XmlElement(name = "AddressCity")
        protected String addressCity;
        @XmlElement(name = "AddressCounty")
        protected String addressCounty;
        @XmlElement(name = "AddressState")
        protected String addressState;
        @XmlElement(name = "AddressPostcode")
        protected String addressPostcode;

        /**
         * Gets the value of the addressStreet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressStreet() {
            return addressStreet;
        }

        /**
         * Sets the value of the addressStreet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressStreet(String value) {
            this.addressStreet = value;
        }

        /**
         * Gets the value of the addressCity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressCity() {
            return addressCity;
        }

        /**
         * Sets the value of the addressCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressCity(String value) {
            this.addressCity = value;
        }

        /**
         * Gets the value of the addressCounty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressCounty() {
            return addressCounty;
        }

        /**
         * Sets the value of the addressCounty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressCounty(String value) {
            this.addressCounty = value;
        }

        /**
         * Gets the value of the addressState property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressState() {
            return addressState;
        }

        /**
         * Sets the value of the addressState property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressState(String value) {
            this.addressState = value;
        }

        /**
         * Gets the value of the addressPostcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressPostcode() {
            return addressPostcode;
        }

        /**
         * Sets the value of the addressPostcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressPostcode(String value) {
            this.addressPostcode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FreeFormatAddressLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "freeFormatAddressLine"
    })
    public static class FreeFormatAddress {

        @XmlElement(name = "FreeFormatAddressLine", required = true)
        protected List<String> freeFormatAddressLine;

        /**
         * Gets the value of the freeFormatAddressLine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the freeFormatAddressLine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFreeFormatAddressLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFreeFormatAddressLine() {
            if (freeFormatAddressLine == null) {
                freeFormatAddressLine = new ArrayList<String>();
            }
            return this.freeFormatAddressLine;
        }

    }

}
