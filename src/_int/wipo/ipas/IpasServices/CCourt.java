/**
 * CCourt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCourt  implements java.io.Serializable {
    private java.lang.String courtAddress;

    private java.lang.String courtName;

    public CCourt() {
    }

    public CCourt(
           java.lang.String courtAddress,
           java.lang.String courtName) {
           this.courtAddress = courtAddress;
           this.courtName = courtName;
    }


    /**
     * Gets the courtAddress value for this CCourt.
     * 
     * @return courtAddress
     */
    public java.lang.String getCourtAddress() {
        return courtAddress;
    }


    /**
     * Sets the courtAddress value for this CCourt.
     * 
     * @param courtAddress
     */
    public void setCourtAddress(java.lang.String courtAddress) {
        this.courtAddress = courtAddress;
    }


    /**
     * Gets the courtName value for this CCourt.
     * 
     * @return courtName
     */
    public java.lang.String getCourtName() {
        return courtName;
    }


    /**
     * Sets the courtName value for this CCourt.
     * 
     * @param courtName
     */
    public void setCourtName(java.lang.String courtName) {
        this.courtName = courtName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCourt)) return false;
        CCourt other = (CCourt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.courtAddress==null && other.getCourtAddress()==null) || 
             (this.courtAddress!=null &&
              this.courtAddress.equals(other.getCourtAddress()))) &&
            ((this.courtName==null && other.getCourtName()==null) || 
             (this.courtName!=null &&
              this.courtName.equals(other.getCourtName())));
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
        if (getCourtAddress() != null) {
            _hashCode += getCourtAddress().hashCode();
        }
        if (getCourtName() != null) {
            _hashCode += getCourtName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCourt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCourt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courtAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courtAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courtName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courtName"));
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
