//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.11 at 12:27:12 AM CET 
//


package jxml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OppositionCurrentStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OppositionCurrentStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Opposition filed"/>
 *     &lt;enumeration value="Admissibility checked"/>
 *     &lt;enumeration value="Cooling-off period"/>
 *     &lt;enumeration value="Commencement of proceeding"/>
 *     &lt;enumeration value="Agreement between parties"/>
 *     &lt;enumeration value="Final decision - Trade Mark withdrawn"/>
 *     &lt;enumeration value="Final decision - Trade Mark limited"/>
 *     &lt;enumeration value="Final decision - Opposition withdrawn"/>
 *     &lt;enumeration value="Final decision - Trade Mark rejected in part"/>
 *     &lt;enumeration value="Final decision - Trade Mark rejected"/>
 *     &lt;enumeration value="Final decision - Opposition rejected"/>
 *     &lt;enumeration value="Final decision - Opposition not duly entered"/>
 *     &lt;enumeration value="No decision - Opposition not duly entered"/>
 *     &lt;enumeration value="Opposition closed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OppositionCurrentStatusCodeType")
@XmlEnum
public enum OppositionCurrentStatusCodeType {

    @XmlEnumValue("Opposition filed")
    OPPOSITION_FILED("Opposition filed"),
    @XmlEnumValue("Admissibility checked")
    ADMISSIBILITY_CHECKED("Admissibility checked"),
    @XmlEnumValue("Cooling-off period")
    COOLING_OFF_PERIOD("Cooling-off period"),
    @XmlEnumValue("Commencement of proceeding")
    COMMENCEMENT_OF_PROCEEDING("Commencement of proceeding"),
    @XmlEnumValue("Agreement between parties")
    AGREEMENT_BETWEEN_PARTIES("Agreement between parties"),
    @XmlEnumValue("Final decision - Trade Mark withdrawn")
    FINAL_DECISION_TRADE_MARK_WITHDRAWN("Final decision - Trade Mark withdrawn"),
    @XmlEnumValue("Final decision - Trade Mark limited")
    FINAL_DECISION_TRADE_MARK_LIMITED("Final decision - Trade Mark limited"),
    @XmlEnumValue("Final decision - Opposition withdrawn")
    FINAL_DECISION_OPPOSITION_WITHDRAWN("Final decision - Opposition withdrawn"),
    @XmlEnumValue("Final decision - Trade Mark rejected in part")
    FINAL_DECISION_TRADE_MARK_REJECTED_IN_PART("Final decision - Trade Mark rejected in part"),
    @XmlEnumValue("Final decision - Trade Mark rejected")
    FINAL_DECISION_TRADE_MARK_REJECTED("Final decision - Trade Mark rejected"),
    @XmlEnumValue("Final decision - Opposition rejected")
    FINAL_DECISION_OPPOSITION_REJECTED("Final decision - Opposition rejected"),
    @XmlEnumValue("Final decision - Opposition not duly entered")
    FINAL_DECISION_OPPOSITION_NOT_DULY_ENTERED("Final decision - Opposition not duly entered"),
    @XmlEnumValue("No decision - Opposition not duly entered")
    NO_DECISION_OPPOSITION_NOT_DULY_ENTERED("No decision - Opposition not duly entered"),
    @XmlEnumValue("Opposition closed")
    OPPOSITION_CLOSED("Opposition closed");
    private final String value;

    OppositionCurrentStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OppositionCurrentStatusCodeType fromValue(String v) {
        for (OppositionCurrentStatusCodeType c: OppositionCurrentStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
