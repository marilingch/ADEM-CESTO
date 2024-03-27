/**
 * CUserdocType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CUserdocType  implements java.io.Serializable {
    private java.lang.String userdocName;

    private java.lang.String userdocType;

    public CUserdocType() {
    }

    public CUserdocType(
           java.lang.String userdocName,
           java.lang.String userdocType) {
           this.userdocName = userdocName;
           this.userdocType = userdocType;
    }


    /**
     * Gets the userdocName value for this CUserdocType.
     * 
     * @return userdocName
     */
    public java.lang.String getUserdocName() {
        return userdocName;
    }


    /**
     * Sets the userdocName value for this CUserdocType.
     * 
     * @param userdocName
     */
    public void setUserdocName(java.lang.String userdocName) {
        this.userdocName = userdocName;
    }


    /**
     * Gets the userdocType value for this CUserdocType.
     * 
     * @return userdocType
     */
    public java.lang.String getUserdocType() {
        return userdocType;
    }


    /**
     * Sets the userdocType value for this CUserdocType.
     * 
     * @param userdocType
     */
    public void setUserdocType(java.lang.String userdocType) {
        this.userdocType = userdocType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CUserdocType)) return false;
        CUserdocType other = (CUserdocType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userdocName==null && other.getUserdocName()==null) || 
             (this.userdocName!=null &&
              this.userdocName.equals(other.getUserdocName()))) &&
            ((this.userdocType==null && other.getUserdocType()==null) || 
             (this.userdocType!=null &&
              this.userdocType.equals(other.getUserdocType())));
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
        if (getUserdocName() != null) {
            _hashCode += getUserdocName().hashCode();
        }
        if (getUserdocType() != null) {
            _hashCode += getUserdocType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CUserdocType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserdocType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdocName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdocName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdocType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdocType"));
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
