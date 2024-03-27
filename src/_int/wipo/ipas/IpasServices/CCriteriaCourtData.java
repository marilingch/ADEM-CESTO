/**
 * CCriteriaCourtData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaCourtData  implements java.io.Serializable {
    private java.lang.String courtFileDescriptionContainsWords;

    private java.lang.String courtNameContainsWords;

    public CCriteriaCourtData() {
    }

    public CCriteriaCourtData(
           java.lang.String courtFileDescriptionContainsWords,
           java.lang.String courtNameContainsWords) {
           this.courtFileDescriptionContainsWords = courtFileDescriptionContainsWords;
           this.courtNameContainsWords = courtNameContainsWords;
    }


    /**
     * Gets the courtFileDescriptionContainsWords value for this CCriteriaCourtData.
     * 
     * @return courtFileDescriptionContainsWords
     */
    public java.lang.String getCourtFileDescriptionContainsWords() {
        return courtFileDescriptionContainsWords;
    }


    /**
     * Sets the courtFileDescriptionContainsWords value for this CCriteriaCourtData.
     * 
     * @param courtFileDescriptionContainsWords
     */
    public void setCourtFileDescriptionContainsWords(java.lang.String courtFileDescriptionContainsWords) {
        this.courtFileDescriptionContainsWords = courtFileDescriptionContainsWords;
    }


    /**
     * Gets the courtNameContainsWords value for this CCriteriaCourtData.
     * 
     * @return courtNameContainsWords
     */
    public java.lang.String getCourtNameContainsWords() {
        return courtNameContainsWords;
    }


    /**
     * Sets the courtNameContainsWords value for this CCriteriaCourtData.
     * 
     * @param courtNameContainsWords
     */
    public void setCourtNameContainsWords(java.lang.String courtNameContainsWords) {
        this.courtNameContainsWords = courtNameContainsWords;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaCourtData)) return false;
        CCriteriaCourtData other = (CCriteriaCourtData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.courtFileDescriptionContainsWords==null && other.getCourtFileDescriptionContainsWords()==null) || 
             (this.courtFileDescriptionContainsWords!=null &&
              this.courtFileDescriptionContainsWords.equals(other.getCourtFileDescriptionContainsWords()))) &&
            ((this.courtNameContainsWords==null && other.getCourtNameContainsWords()==null) || 
             (this.courtNameContainsWords!=null &&
              this.courtNameContainsWords.equals(other.getCourtNameContainsWords())));
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
        if (getCourtFileDescriptionContainsWords() != null) {
            _hashCode += getCourtFileDescriptionContainsWords().hashCode();
        }
        if (getCourtNameContainsWords() != null) {
            _hashCode += getCourtNameContainsWords().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaCourtData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaCourtData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courtFileDescriptionContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courtFileDescriptionContainsWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courtNameContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courtNameContainsWords"));
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
