/**
 * CRegistrationId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CRegistrationId  implements java.io.Serializable {
    private java.lang.String registrationDup;

    private _int.wipo.ipas.IpasServices.IpasInteger registrationNbr;

    private _int.wipo.ipas.IpasServices.IpasInteger registrationSeries;

    private java.lang.String registrationType;

    public CRegistrationId() {
    }

    public CRegistrationId(
           java.lang.String registrationDup,
           _int.wipo.ipas.IpasServices.IpasInteger registrationNbr,
           _int.wipo.ipas.IpasServices.IpasInteger registrationSeries,
           java.lang.String registrationType) {
           this.registrationDup = registrationDup;
           this.registrationNbr = registrationNbr;
           this.registrationSeries = registrationSeries;
           this.registrationType = registrationType;
    }


    /**
     * Gets the registrationDup value for this CRegistrationId.
     * 
     * @return registrationDup
     */
    public java.lang.String getRegistrationDup() {
        return registrationDup;
    }


    /**
     * Sets the registrationDup value for this CRegistrationId.
     * 
     * @param registrationDup
     */
    public void setRegistrationDup(java.lang.String registrationDup) {
        this.registrationDup = registrationDup;
    }


    /**
     * Gets the registrationNbr value for this CRegistrationId.
     * 
     * @return registrationNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getRegistrationNbr() {
        return registrationNbr;
    }


    /**
     * Sets the registrationNbr value for this CRegistrationId.
     * 
     * @param registrationNbr
     */
    public void setRegistrationNbr(_int.wipo.ipas.IpasServices.IpasInteger registrationNbr) {
        this.registrationNbr = registrationNbr;
    }


    /**
     * Gets the registrationSeries value for this CRegistrationId.
     * 
     * @return registrationSeries
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getRegistrationSeries() {
        return registrationSeries;
    }


    /**
     * Sets the registrationSeries value for this CRegistrationId.
     * 
     * @param registrationSeries
     */
    public void setRegistrationSeries(_int.wipo.ipas.IpasServices.IpasInteger registrationSeries) {
        this.registrationSeries = registrationSeries;
    }


    /**
     * Gets the registrationType value for this CRegistrationId.
     * 
     * @return registrationType
     */
    public java.lang.String getRegistrationType() {
        return registrationType;
    }


    /**
     * Sets the registrationType value for this CRegistrationId.
     * 
     * @param registrationType
     */
    public void setRegistrationType(java.lang.String registrationType) {
        this.registrationType = registrationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CRegistrationId)) return false;
        CRegistrationId other = (CRegistrationId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registrationDup==null && other.getRegistrationDup()==null) || 
             (this.registrationDup!=null &&
              this.registrationDup.equals(other.getRegistrationDup()))) &&
            ((this.registrationNbr==null && other.getRegistrationNbr()==null) || 
             (this.registrationNbr!=null &&
              this.registrationNbr.equals(other.getRegistrationNbr()))) &&
            ((this.registrationSeries==null && other.getRegistrationSeries()==null) || 
             (this.registrationSeries!=null &&
              this.registrationSeries.equals(other.getRegistrationSeries()))) &&
            ((this.registrationType==null && other.getRegistrationType()==null) || 
             (this.registrationType!=null &&
              this.registrationType.equals(other.getRegistrationType())));
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
        if (getRegistrationDup() != null) {
            _hashCode += getRegistrationDup().hashCode();
        }
        if (getRegistrationNbr() != null) {
            _hashCode += getRegistrationNbr().hashCode();
        }
        if (getRegistrationSeries() != null) {
            _hashCode += getRegistrationSeries().hashCode();
        }
        if (getRegistrationType() != null) {
            _hashCode += getRegistrationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CRegistrationId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRegistrationId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationDup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrationDup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrationNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrationSeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrationType"));
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
