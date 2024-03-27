/**
 * CMadridApplicationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CMadridApplicationData  implements java.io.Serializable {
    private java.lang.String basicFileRef;

    private java.lang.String internationalFileNumber;

    public CMadridApplicationData() {
    }

    public CMadridApplicationData(
           java.lang.String basicFileRef,
           java.lang.String internationalFileNumber) {
           this.basicFileRef = basicFileRef;
           this.internationalFileNumber = internationalFileNumber;
    }


    /**
     * Gets the basicFileRef value for this CMadridApplicationData.
     * 
     * @return basicFileRef
     */
    public java.lang.String getBasicFileRef() {
        return basicFileRef;
    }


    /**
     * Sets the basicFileRef value for this CMadridApplicationData.
     * 
     * @param basicFileRef
     */
    public void setBasicFileRef(java.lang.String basicFileRef) {
        this.basicFileRef = basicFileRef;
    }


    /**
     * Gets the internationalFileNumber value for this CMadridApplicationData.
     * 
     * @return internationalFileNumber
     */
    public java.lang.String getInternationalFileNumber() {
        return internationalFileNumber;
    }


    /**
     * Sets the internationalFileNumber value for this CMadridApplicationData.
     * 
     * @param internationalFileNumber
     */
    public void setInternationalFileNumber(java.lang.String internationalFileNumber) {
        this.internationalFileNumber = internationalFileNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CMadridApplicationData)) return false;
        CMadridApplicationData other = (CMadridApplicationData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.basicFileRef==null && other.getBasicFileRef()==null) || 
             (this.basicFileRef!=null &&
              this.basicFileRef.equals(other.getBasicFileRef()))) &&
            ((this.internationalFileNumber==null && other.getInternationalFileNumber()==null) || 
             (this.internationalFileNumber!=null &&
              this.internationalFileNumber.equals(other.getInternationalFileNumber())));
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
        if (getBasicFileRef() != null) {
            _hashCode += getBasicFileRef().hashCode();
        }
        if (getInternationalFileNumber() != null) {
            _hashCode += getInternationalFileNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CMadridApplicationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMadridApplicationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicFileRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "basicFileRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalFileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internationalFileNumber"));
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
