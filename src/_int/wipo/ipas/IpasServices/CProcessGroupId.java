/**
 * CProcessGroupId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CProcessGroupId  implements java.io.Serializable {
    private java.lang.String processGroupCode;

    private _int.wipo.ipas.IpasServices.CUserId userId;

    public CProcessGroupId() {
    }

    public CProcessGroupId(
           java.lang.String processGroupCode,
           _int.wipo.ipas.IpasServices.CUserId userId) {
           this.processGroupCode = processGroupCode;
           this.userId = userId;
    }


    /**
     * Gets the processGroupCode value for this CProcessGroupId.
     * 
     * @return processGroupCode
     */
    public java.lang.String getProcessGroupCode() {
        return processGroupCode;
    }


    /**
     * Sets the processGroupCode value for this CProcessGroupId.
     * 
     * @param processGroupCode
     */
    public void setProcessGroupCode(java.lang.String processGroupCode) {
        this.processGroupCode = processGroupCode;
    }


    /**
     * Gets the userId value for this CProcessGroupId.
     * 
     * @return userId
     */
    public _int.wipo.ipas.IpasServices.CUserId getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this CProcessGroupId.
     * 
     * @param userId
     */
    public void setUserId(_int.wipo.ipas.IpasServices.CUserId userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CProcessGroupId)) return false;
        CProcessGroupId other = (CProcessGroupId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processGroupCode==null && other.getProcessGroupCode()==null) || 
             (this.processGroupCode!=null &&
              this.processGroupCode.equals(other.getProcessGroupCode()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getProcessGroupCode() != null) {
            _hashCode += getProcessGroupCode().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CProcessGroupId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroupId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processGroupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserId"));
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
