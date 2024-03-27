/**
 * CAuthor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CAuthor  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasInteger authorSeq;

    private _int.wipo.ipas.IpasServices.CPerson person;

    public CAuthor() {
    }

    public CAuthor(
           _int.wipo.ipas.IpasServices.IpasInteger authorSeq,
           _int.wipo.ipas.IpasServices.CPerson person) {
           this.authorSeq = authorSeq;
           this.person = person;
    }


    /**
     * Gets the authorSeq value for this CAuthor.
     * 
     * @return authorSeq
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getAuthorSeq() {
        return authorSeq;
    }


    /**
     * Sets the authorSeq value for this CAuthor.
     * 
     * @param authorSeq
     */
    public void setAuthorSeq(_int.wipo.ipas.IpasServices.IpasInteger authorSeq) {
        this.authorSeq = authorSeq;
    }


    /**
     * Gets the person value for this CAuthor.
     * 
     * @return person
     */
    public _int.wipo.ipas.IpasServices.CPerson getPerson() {
        return person;
    }


    /**
     * Sets the person value for this CAuthor.
     * 
     * @param person
     */
    public void setPerson(_int.wipo.ipas.IpasServices.CPerson person) {
        this.person = person;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CAuthor)) return false;
        CAuthor other = (CAuthor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authorSeq==null && other.getAuthorSeq()==null) || 
             (this.authorSeq!=null &&
              this.authorSeq.equals(other.getAuthorSeq()))) &&
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
        if (getAuthorSeq() != null) {
            _hashCode += getAuthorSeq().hashCode();
        }
        if (getPerson() != null) {
            _hashCode += getPerson().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CAuthor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAuthor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
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
