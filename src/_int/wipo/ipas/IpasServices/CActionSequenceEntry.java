/**
 * CActionSequenceEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CActionSequenceEntry  implements java.io.Serializable {
    private java.lang.String actionSequenceName;

    private _int.wipo.ipas.IpasServices.IpasInteger actionSequenceNbr;

    private _int.wipo.ipas.IpasServices.IpasInteger actionSequenceSeries;

    private java.lang.String actionSequenceType;

    public CActionSequenceEntry() {
    }

    public CActionSequenceEntry(
           java.lang.String actionSequenceName,
           _int.wipo.ipas.IpasServices.IpasInteger actionSequenceNbr,
           _int.wipo.ipas.IpasServices.IpasInteger actionSequenceSeries,
           java.lang.String actionSequenceType) {
           this.actionSequenceName = actionSequenceName;
           this.actionSequenceNbr = actionSequenceNbr;
           this.actionSequenceSeries = actionSequenceSeries;
           this.actionSequenceType = actionSequenceType;
    }


    /**
     * Gets the actionSequenceName value for this CActionSequenceEntry.
     * 
     * @return actionSequenceName
     */
    public java.lang.String getActionSequenceName() {
        return actionSequenceName;
    }


    /**
     * Sets the actionSequenceName value for this CActionSequenceEntry.
     * 
     * @param actionSequenceName
     */
    public void setActionSequenceName(java.lang.String actionSequenceName) {
        this.actionSequenceName = actionSequenceName;
    }


    /**
     * Gets the actionSequenceNbr value for this CActionSequenceEntry.
     * 
     * @return actionSequenceNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getActionSequenceNbr() {
        return actionSequenceNbr;
    }


    /**
     * Sets the actionSequenceNbr value for this CActionSequenceEntry.
     * 
     * @param actionSequenceNbr
     */
    public void setActionSequenceNbr(_int.wipo.ipas.IpasServices.IpasInteger actionSequenceNbr) {
        this.actionSequenceNbr = actionSequenceNbr;
    }


    /**
     * Gets the actionSequenceSeries value for this CActionSequenceEntry.
     * 
     * @return actionSequenceSeries
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getActionSequenceSeries() {
        return actionSequenceSeries;
    }


    /**
     * Sets the actionSequenceSeries value for this CActionSequenceEntry.
     * 
     * @param actionSequenceSeries
     */
    public void setActionSequenceSeries(_int.wipo.ipas.IpasServices.IpasInteger actionSequenceSeries) {
        this.actionSequenceSeries = actionSequenceSeries;
    }


    /**
     * Gets the actionSequenceType value for this CActionSequenceEntry.
     * 
     * @return actionSequenceType
     */
    public java.lang.String getActionSequenceType() {
        return actionSequenceType;
    }


    /**
     * Sets the actionSequenceType value for this CActionSequenceEntry.
     * 
     * @param actionSequenceType
     */
    public void setActionSequenceType(java.lang.String actionSequenceType) {
        this.actionSequenceType = actionSequenceType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CActionSequenceEntry)) return false;
        CActionSequenceEntry other = (CActionSequenceEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionSequenceName==null && other.getActionSequenceName()==null) || 
             (this.actionSequenceName!=null &&
              this.actionSequenceName.equals(other.getActionSequenceName()))) &&
            ((this.actionSequenceNbr==null && other.getActionSequenceNbr()==null) || 
             (this.actionSequenceNbr!=null &&
              this.actionSequenceNbr.equals(other.getActionSequenceNbr()))) &&
            ((this.actionSequenceSeries==null && other.getActionSequenceSeries()==null) || 
             (this.actionSequenceSeries!=null &&
              this.actionSequenceSeries.equals(other.getActionSequenceSeries()))) &&
            ((this.actionSequenceType==null && other.getActionSequenceType()==null) || 
             (this.actionSequenceType!=null &&
              this.actionSequenceType.equals(other.getActionSequenceType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getActionSequenceName() != null) {
            _hashCode += getActionSequenceName().hashCode();
        }
        if (getActionSequenceNbr() != null) {
            _hashCode += getActionSequenceNbr().hashCode();
        }
        if (getActionSequenceSeries() != null) {
            _hashCode += getActionSequenceSeries().hashCode();
        }
        if (getActionSequenceType() != null) {
            _hashCode += getActionSequenceType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CActionSequenceEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionSequenceEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionSequenceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionSequenceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionSequenceNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionSequenceNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionSequenceSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionSequenceSeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionSequenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionSequenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
