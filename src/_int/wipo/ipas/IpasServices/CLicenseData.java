/**
 * CLicenseData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CLicenseData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CPerson granteePerson;

    private _int.wipo.ipas.IpasServices.CPerson grantorPerson;

    private java.lang.Boolean indCompulsoryLicense;

    private java.lang.Boolean indExclusiveLicense;

    public CLicenseData() {
    }

    public CLicenseData(
           _int.wipo.ipas.IpasServices.CPerson granteePerson,
           _int.wipo.ipas.IpasServices.CPerson grantorPerson,
           java.lang.Boolean indCompulsoryLicense,
           java.lang.Boolean indExclusiveLicense) {
           this.granteePerson = granteePerson;
           this.grantorPerson = grantorPerson;
           this.indCompulsoryLicense = indCompulsoryLicense;
           this.indExclusiveLicense = indExclusiveLicense;
    }


    /**
     * Gets the granteePerson value for this CLicenseData.
     * 
     * @return granteePerson
     */
    public _int.wipo.ipas.IpasServices.CPerson getGranteePerson() {
        return granteePerson;
    }


    /**
     * Sets the granteePerson value for this CLicenseData.
     * 
     * @param granteePerson
     */
    public void setGranteePerson(_int.wipo.ipas.IpasServices.CPerson granteePerson) {
        this.granteePerson = granteePerson;
    }


    /**
     * Gets the grantorPerson value for this CLicenseData.
     * 
     * @return grantorPerson
     */
    public _int.wipo.ipas.IpasServices.CPerson getGrantorPerson() {
        return grantorPerson;
    }


    /**
     * Sets the grantorPerson value for this CLicenseData.
     * 
     * @param grantorPerson
     */
    public void setGrantorPerson(_int.wipo.ipas.IpasServices.CPerson grantorPerson) {
        this.grantorPerson = grantorPerson;
    }


    /**
     * Gets the indCompulsoryLicense value for this CLicenseData.
     * 
     * @return indCompulsoryLicense
     */
    public java.lang.Boolean getIndCompulsoryLicense() {
        return indCompulsoryLicense;
    }


    /**
     * Sets the indCompulsoryLicense value for this CLicenseData.
     * 
     * @param indCompulsoryLicense
     */
    public void setIndCompulsoryLicense(java.lang.Boolean indCompulsoryLicense) {
        this.indCompulsoryLicense = indCompulsoryLicense;
    }


    /**
     * Gets the indExclusiveLicense value for this CLicenseData.
     * 
     * @return indExclusiveLicense
     */
    public java.lang.Boolean getIndExclusiveLicense() {
        return indExclusiveLicense;
    }


    /**
     * Sets the indExclusiveLicense value for this CLicenseData.
     * 
     * @param indExclusiveLicense
     */
    public void setIndExclusiveLicense(java.lang.Boolean indExclusiveLicense) {
        this.indExclusiveLicense = indExclusiveLicense;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CLicenseData)) return false;
        CLicenseData other = (CLicenseData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.granteePerson==null && other.getGranteePerson()==null) || 
             (this.granteePerson!=null &&
              this.granteePerson.equals(other.getGranteePerson()))) &&
            ((this.grantorPerson==null && other.getGrantorPerson()==null) || 
             (this.grantorPerson!=null &&
              this.grantorPerson.equals(other.getGrantorPerson()))) &&
            ((this.indCompulsoryLicense==null && other.getIndCompulsoryLicense()==null) || 
             (this.indCompulsoryLicense!=null &&
              this.indCompulsoryLicense.equals(other.getIndCompulsoryLicense()))) &&
            ((this.indExclusiveLicense==null && other.getIndExclusiveLicense()==null) || 
             (this.indExclusiveLicense!=null &&
              this.indExclusiveLicense.equals(other.getIndExclusiveLicense())));
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
        if (getGranteePerson() != null) {
            _hashCode += getGranteePerson().hashCode();
        }
        if (getGrantorPerson() != null) {
            _hashCode += getGrantorPerson().hashCode();
        }
        if (getIndCompulsoryLicense() != null) {
            _hashCode += getIndCompulsoryLicense().hashCode();
        }
        if (getIndExclusiveLicense() != null) {
            _hashCode += getIndExclusiveLicense().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CLicenseData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cLicenseData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("granteePerson");
        elemField.setXmlName(new javax.xml.namespace.QName("", "granteePerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPerson"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantorPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grantorPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPerson"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indCompulsoryLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indCompulsoryLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indExclusiveLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indExclusiveLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
