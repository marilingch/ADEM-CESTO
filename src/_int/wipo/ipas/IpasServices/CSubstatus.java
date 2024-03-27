/**
 * CSubstatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CSubstatus  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CSubStatusId subStatus;

    private java.lang.String substatusName;

    public CSubstatus() {
    }

    public CSubstatus(
           _int.wipo.ipas.IpasServices.CSubStatusId subStatus,
           java.lang.String substatusName) {
           this.subStatus = subStatus;
           this.substatusName = substatusName;
    }


    /**
     * Gets the subStatus value for this CSubstatus.
     * 
     * @return subStatus
     */
    public _int.wipo.ipas.IpasServices.CSubStatusId getSubStatus() {
        return subStatus;
    }


    /**
     * Sets the subStatus value for this CSubstatus.
     * 
     * @param subStatus
     */
    public void setSubStatus(_int.wipo.ipas.IpasServices.CSubStatusId subStatus) {
        this.subStatus = subStatus;
    }


    /**
     * Gets the substatusName value for this CSubstatus.
     * 
     * @return substatusName
     */
    public java.lang.String getSubstatusName() {
        return substatusName;
    }


    /**
     * Sets the substatusName value for this CSubstatus.
     * 
     * @param substatusName
     */
    public void setSubstatusName(java.lang.String substatusName) {
        this.substatusName = substatusName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSubstatus)) return false;
        CSubstatus other = (CSubstatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subStatus==null && other.getSubStatus()==null) || 
             (this.subStatus!=null &&
              this.subStatus.equals(other.getSubStatus()))) &&
            ((this.substatusName==null && other.getSubstatusName()==null) || 
             (this.substatusName!=null &&
              this.substatusName.equals(other.getSubstatusName())));
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
        if (getSubStatus() != null) {
            _hashCode += getSubStatus().hashCode();
        }
        if (getSubstatusName() != null) {
            _hashCode += getSubstatusName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSubstatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSubstatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSubStatusId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("substatusName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "substatusName"));
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
