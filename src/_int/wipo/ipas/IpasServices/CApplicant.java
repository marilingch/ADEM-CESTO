/**
 * CApplicant.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CApplicant  implements java.io.Serializable {
    private java.lang.String applicantNotes;

    private _int.wipo.ipas.IpasServices.CPerson person;

    public CApplicant() {
    }

    public CApplicant(
           java.lang.String applicantNotes,
           _int.wipo.ipas.IpasServices.CPerson person) {
           this.applicantNotes = applicantNotes;
           this.person = person;
    }


    /**
     * Gets the applicantNotes value for this CApplicant.
     * 
     * @return applicantNotes
     */
    public java.lang.String getApplicantNotes() {
        return applicantNotes;
    }


    /**
     * Sets the applicantNotes value for this CApplicant.
     * 
     * @param applicantNotes
     */
    public void setApplicantNotes(java.lang.String applicantNotes) {
        this.applicantNotes = applicantNotes;
    }


    /**
     * Gets the person value for this CApplicant.
     * 
     * @return person
     */
    public _int.wipo.ipas.IpasServices.CPerson getPerson() {
        return person;
    }


    /**
     * Sets the person value for this CApplicant.
     * 
     * @param person
     */
    public void setPerson(_int.wipo.ipas.IpasServices.CPerson person) {
        this.person = person;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CApplicant)) return false;
        CApplicant other = (CApplicant) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicantNotes==null && other.getApplicantNotes()==null) || 
             (this.applicantNotes!=null &&
              this.applicantNotes.equals(other.getApplicantNotes()))) &&
            ((this.person==null && other.getPerson()==null) || 
             (this.person!=null &&
              this.person.equals(other.getPerson())));
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
        if (getApplicantNotes() != null) {
            _hashCode += getApplicantNotes().hashCode();
        }
        if (getPerson() != null) {
            _hashCode += getPerson().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CApplicant.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cApplicant"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicantNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicantNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person");
        elemField.setXmlName(new javax.xml.namespace.QName("", "person"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPerson"));
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
