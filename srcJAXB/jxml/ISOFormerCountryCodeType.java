//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.11 at 12:27:12 AM CET 
//


package jxml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ISOFormerCountryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ISOFormerCountryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="AN"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="DL"/>
 *     &lt;enumeration value="DD"/>
 *     &lt;enumeration value="DT"/>
 *     &lt;enumeration value="FX"/>
 *     &lt;enumeration value="SU"/>
 *     &lt;enumeration value="YD"/>
 *     &lt;enumeration value="YU"/>
 *     &lt;enumeration value="UK"/>
 *     &lt;enumeration value="ZZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ISOFormerCountryCodeType")
@XmlEnum
public enum ISOFormerCountryCodeType {

    AN,
    CS,
    DL,
    DD,
    DT,
    FX,
    SU,
    YD,
    YU,
    UK,
    ZZ;

    public String value() {
        return name();
    }

    public static ISOFormerCountryCodeType fromValue(String v) {
        return valueOf(v);
    }

}
