/**
 * CCriteriaApplicantData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaApplicantData  implements java.io.Serializable {
    private java.lang.String applicantNameContainsWords;

    private java.lang.String nationalityCountryCode;

    public CCriteriaApplicantData() {
    }

    public CCriteriaApplicantData(
           java.lang.String applicantNameContainsWords,
           java.lang.String nationalityCountryCode) {
           this.applicantNameContainsWords = applicantNameContainsWords;
           this.nationalityCountryCode = nationalityCountryCode;
    }


    /**
     * Gets the applicantNameContainsWords value for this CCriteriaApplicantData.
     * 
     * @return applicantNameContainsWords
     */
    public java.lang.String getApplicantNameContainsWords() {
        return applicantNameContainsWords;
    }


    /**
     * Sets the applicantNameContainsWords value for this CCriteriaApplicantData.
     * 
     * @param applicantNameContainsWords
     */
    public void setApplicantNameContainsWords(java.lang.String applicantNameContainsWords) {
        this.applicantNameContainsWords = applicantNameContainsWords;
    }


    /**
     * Gets the nationalityCountryCode value for this CCriteriaApplicantData.
     * 
     * @return nationalityCountryCode
     */
    public java.lang.String getNationalityCountryCode() {
        return nationalityCountryCode;
    }


    /**
     * Sets the nationalityCountryCode value for this CCriteriaApplicantData.
     * 
     * @param nationalityCountryCode
     */
    public void setNationalityCountryCode(java.lang.String nationalityCountryCode) {
        this.nationalityCountryCode = nationalityCountryCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaApplicantData)) return false;
        CCriteriaApplicantData other = (CCriteriaApplicantData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicantNameContainsWords==null && other.getApplicantNameContainsWords()==null) || 
             (this.applicantNameContainsWords!=null &&
              this.applicantNameContainsWords.equals(other.getApplicantNameContainsWords()))) &&
            ((this.nationalityCountryCode==null && other.getNationalityCountryCode()==null) || 
             (this.nationalityCountryCode!=null &&
              this.nationalityCountryCode.equals(other.getNationalityCountryCode())));
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
        if (getApplicantNameContainsWords() != null) {
            _hashCode += getApplicantNameContainsWords().hashCode();
        }
        if (getNationalityCountryCode() != null) {
            _hashCode += getNationalityCountryCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaApplicantData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaApplicantData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicantNameContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicantNameContainsWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalityCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalityCountryCode"));
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
