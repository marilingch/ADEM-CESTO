/**
 * CpoaGrantee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CpoaGrantee  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CPerson person;

    private java.lang.String representativeType;

    public CpoaGrantee() {
    }

    public CpoaGrantee(
           _int.wipo.ipas.IpasServices.CPerson person,
           java.lang.String representativeType) {
           this.person = person;
           this.representativeType = representativeType;
    }


    /**
     * Gets the person value for this CpoaGrantee.
     * 
     * @return person
     */
    public _int.wipo.ipas.IpasServices.CPerson getPerson() {
        return person;
    }


    /**
     * Sets the person value for this CpoaGrantee.
     * 
     * @param person
     */
    public void setPerson(_int.wipo.ipas.IpasServices.CPerson person) {
        this.person = person;
    }


    /**
     * Gets the representativeType value for this CpoaGrantee.
     * 
     * @return representativeType
     */
    public java.lang.String getRepresentativeType() {
        return representativeType;
    }


    /**
     * Sets the representativeType value for this CpoaGrantee.
     * 
     * @param representativeType
     */
    public void setRepresentativeType(java.lang.String representativeType) {
        this.representativeType = representativeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpoaGrantee)) return false;
        CpoaGrantee other = (CpoaGrantee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.person==null && other.getPerson()==null) || 
             (this.person!=null &&
              this.person.equals(other.getPerson()))) &&
            ((this.representativeType==null && other.getRepresentativeType()==null) || 
             (this.representativeType!=null &&
              this.representativeType.equals(other.getRepresentativeType())));
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
        if (getPerson() != null) {
            _hashCode += getPerson().hashCode();
        }
        if (getRepresentativeType() != null) {
            _hashCode += getRepresentativeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpoaGrantee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cpoaGrantee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person");
        elemField.setXmlName(new javax.xml.namespace.QName("", "person"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPerson"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representativeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "representativeType"));
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
