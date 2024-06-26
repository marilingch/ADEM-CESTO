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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkImageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkImageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarkImageURI" type="{http://www.oami.europa.eu/TM-Search}URIType" minOccurs="0"/>
 *         &lt;element name="MarkImageFilename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MarkImageColourIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MarkImageColourClaimedText" type="{http://www.oami.europa.eu/TM-Search}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MarkImageCategory" type="{http://www.oami.europa.eu/TM-Search}MarkImageCategoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkImageType", propOrder = {
    "markImageURI",
    "markImageFilename",
    "markImageColourIndicator",
    "markImageColourClaimedText",
    "markImageCategory"
})
public class MarkImageType {

    @XmlElement(name = "MarkImageURI")
    protected URIType markImageURI;
    @XmlElement(name = "MarkImageFilename", required = true)
    protected String markImageFilename;
    @XmlElement(name = "MarkImageColourIndicator")
    protected boolean markImageColourIndicator;
    @XmlElement(name = "MarkImageColourClaimedText")
    protected List<TextType> markImageColourClaimedText;
    @XmlElement(name = "MarkImageCategory")
    protected MarkImageCategoryType markImageCategory;

    /**
     * Gets the value of the markImageURI property.
     * 
     * @return
     *     possible object is
     *     {@link URIType }
     *     
     */
    public URIType getMarkImageURI() {
        return markImageURI;
    }

    /**
     * Sets the value of the markImageURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link URIType }
     *     
     */
    public void setMarkImageURI(URIType value) {
        this.markImageURI = value;
    }

    /**
     * Gets the value of the markImageFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkImageFilename() {
        return markImageFilename;
    }

    /**
     * Sets the value of the markImageFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkImageFilename(String value) {
        this.markImageFilename = value;
    }

    /**
     * Gets the value of the markImageColourIndicator property.
     * 
     */
    public boolean isMarkImageColourIndicator() {
        return markImageColourIndicator;
    }

    /**
     * Sets the value of the markImageColourIndicator property.
     * 
     */
    public void setMarkImageColourIndicator(boolean value) {
        this.markImageColourIndicator = value;
    }

    /**
     * Gets the value of the markImageColourClaimedText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markImageColourClaimedText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkImageColourClaimedText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getMarkImageColourClaimedText() {
        if (markImageColourClaimedText == null) {
            markImageColourClaimedText = new ArrayList<TextType>();
        }
        return this.markImageColourClaimedText;
    }

    /**
     * Gets the value of the markImageCategory property.
     * 
     * @return
     *     possible object is
     *     {@link MarkImageCategoryType }
     *     
     */
    public MarkImageCategoryType getMarkImageCategory() {
        return markImageCategory;
    }

    /**
     * Sets the value of the markImageCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkImageCategoryType }
     *     
     */
    public void setMarkImageCategory(MarkImageCategoryType value) {
        this.markImageCategory = value;
    }

}
