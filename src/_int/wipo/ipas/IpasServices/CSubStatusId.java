/**
 * CSubStatusId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CSubStatusId  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CStatusId statusId;

    private java.lang.String substatusCode;

    public CSubStatusId() {
    }

    public CSubStatusId(
           _int.wipo.ipas.IpasServices.CStatusId statusId,
           java.lang.String substatusCode) {
           this.statusId = statusId;
           this.substatusCode = substatusCode;
    }


    /**
     * Gets the statusId value for this CSubStatusId.
     * 
     * @return statusId
     */
    public _int.wipo.ipas.IpasServices.CStatusId getStatusId() {
        return statusId;
    }


    /**
     * Sets the statusId value for this CSubStatusId.
     * 
     * @param statusId
     */
    public void setStatusId(_int.wipo.ipas.IpasServices.CStatusId statusId) {
        this.statusId = statusId;
    }


    /**
     * Gets the substatusCode value for this CSubStatusId.
     * 
     * @return substatusCode
     */
    public java.lang.String getSubstatusCode() {
        return substatusCode;
    }


    /**
     * Sets the substatusCode value for this CSubStatusId.
     * 
     * @param substatusCode
     */
    public void setSubstatusCode(java.lang.String substatusCode) {
        this.substatusCode = substatusCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSubStatusId)) return false;
        CSubStatusId other = (CSubStatusId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusId==null && other.getStatusId()==null) || 
             (this.statusId!=null &&
              this.statusId.equals(other.getStatusId()))) &&
            ((this.substatusCode==null && other.getSubstatusCode()==null) || 
             (this.substatusCode!=null &&
              this.substatusCode.equals(other.getSubstatusCode())));
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
        if (getStatusId() != null) {
            _hashCode += getStatusId().hashCode();
        }
        if (getSubstatusCode() != null) {
            _hashCode += getSubstatusCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSubStatusId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSubStatusId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStatusId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("substatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "substatusCode"));
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
