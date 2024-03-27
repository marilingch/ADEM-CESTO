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
 * <p>Java class for MarkImageCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkImageCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryKind" type="{http://www.oami.europa.eu/TM-Search}CategoryKindType" minOccurs="0"/>
 *         &lt;element name="CategoryVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryCodeDetails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CategoryCode" type="{http://www.oami.europa.eu/TM-Search}CategoryCodeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkImageCategoryType", propOrder = {
    "categoryKind",
    "categoryVersion",
    "categoryCodeDetails"
})
public class MarkImageCategoryType {

    @XmlElement(name = "CategoryKind")
    @XmlSchemaType(name = "token")
    protected CategoryKindType categoryKind;
    @XmlElement(name = "CategoryVersion")
    protected String categoryVersion;
    @XmlElement(name = "CategoryCodeDetails", required = true)
    protected MarkImageCategoryType.CategoryCodeDetails categoryCodeDetails;

    /**
     * Gets the value of the categoryKind property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryKindType }
     *     
     */
    public CategoryKindType getCategoryKind() {
        return categoryKind;
    }

    /**
     * Sets the value of the categoryKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryKindType }
     *     
     */
    public void setCategoryKind(CategoryKindType value) {
        this.categoryKind = value;
    }

    /**
     * Gets the value of the categoryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryVersion() {
        return categoryVersion;
    }

    /**
     * Sets the value of the categoryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryVersion(String value) {
        this.categoryVersion = value;
    }

    /**
     * Gets the value of the categoryCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MarkImageCategoryType.CategoryCodeDetails }
     *     
     */
    public MarkImageCategoryType.CategoryCodeDetails getCategoryCodeDetails() {
        return categoryCodeDetails;
    }

    /**
     * Sets the value of the categoryCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkImageCategoryType.CategoryCodeDetails }
     *     
     */
    public void setCategoryCodeDetails(MarkImageCategoryType.CategoryCodeDetails value) {
        this.categoryCodeDetails = value;
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
     *         &lt;element name="CategoryCode" type="{http://www.oami.europa.eu/TM-Search}CategoryCodeType" maxOccurs="unbounded"/>
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
        "categoryCode"
    })
    public static class CategoryCodeDetails {

        @XmlElement(name = "CategoryCode", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> categoryCode;

        /**
         * Gets the value of the categoryCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the categoryCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategoryCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCategoryCode() {
            if (categoryCode == null) {
                categoryCode = new ArrayList<String>();
            }
            return this.categoryCode;
        }

    }

}