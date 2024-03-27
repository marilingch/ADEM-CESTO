/**
 * CRegistrationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CRegistrationData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime entitlementDate;

    private _int.wipo.ipas.IpasServices.IpasDateTime expirationDate;

    private java.lang.Boolean indRegistered;

    private _int.wipo.ipas.IpasServices.IpasDateTime registrationDate;

    private _int.wipo.ipas.IpasServices.CRegistrationId registrationId;

    public CRegistrationData() {
    }

    public CRegistrationData(
           _int.wipo.ipas.IpasServices.IpasDateTime entitlementDate,
           _int.wipo.ipas.IpasServices.IpasDateTime expirationDate,
           java.lang.Boolean indRegistered,
           _int.wipo.ipas.IpasServices.IpasDateTime registrationDate,
           _int.wipo.ipas.IpasServices.CRegistrationId registrationId) {
           this.entitlementDate = entitlementDate;
           this.expirationDate = expirationDate;
           this.indRegistered = indRegistered;
           this.registrationDate = registrationDate;
           this.registrationId = registrationId;
    }


    /**
     * Gets the entitlementDate value for this CRegistrationData.
     * 
     * @return entitlementDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getEntitlementDate() {
        return entitlementDate;
    }


    /**
     * Sets the entitlementDate value for this CRegistrationData.
     * 
     * @param entitlementDate
     */
    public void setEntitlementDate(_int.wipo.ipas.IpasServices.IpasDateTime entitlementDate) {
        this.entitlementDate = entitlementDate;
    }


    /**
     * Gets the expirationDate value for this CRegistrationData.
     * 
     * @return expirationDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this CRegistrationData.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(_int.wipo.ipas.IpasServices.IpasDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the indRegistered value for this CRegistrationData.
     * 
     * @return indRegistered
     */
    public java.lang.Boolean getIndRegistered() {
        return indRegistered;
    }


    /**
     * Sets the indRegistered value for this CRegistrationData.
     * 
     * @param indRegistered
     */
    public void setIndRegistered(java.lang.Boolean indRegistered) {
        this.indRegistered = indRegistered;
    }


    /**
     * Gets the registrationDate value for this CRegistrationData.
     * 
     * @return registrationDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getRegistrationDate() {
        return registrationDate;
    }


    /**
     * Sets the registrationDate value for this CRegistrationData.
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(_int.wipo.ipas.IpasServices.IpasDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }


    /**
     * Gets the registrationId value for this CRegistrationData.
     * 
     * @return registrationId
     */
    public _int.wipo.ipas.IpasServices.CRegistrationId getRegistrationId() {
        return registrationId;
    }


    /**
     * Sets the registrationId value for this CRegistrationData.
     * 
     * @param registrationId
     */
    public void setRegistrationId(_int.wipo.ipas.IpasServices.CRegistrationId registrationId) {
        this.registrationId = registrationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CRegistrationData)) return false;
        CRegistrationData other = (CRegistrationData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entitlementDate==null && other.getEntitlementDate()==null) || 
             (this.entitlementDate!=null &&
              this.entitlementDate.equals(other.getEntitlementDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.indRegistered==null && other.getIndRegistered()==null) || 
             (this.indRegistered!=null &&
              this.indRegistered.equals(other.getIndRegistered()))) &&
            ((this.registrationDate==null && other.getRegistrationDate()==null) || 
             (this.registrationDate!=null &&
              this.registrationDate.equals(other.getRegistrationDate()))) &&
            ((this.registrationId==null && other.getRegistrationId()==null) || 
             (this.registrationId!=null &&
              this.registrationId.equals(other.getRegistrationId())));
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
        if (getEntitlementDate() != null) {
            _hashCode += getEntitlementDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getIndRegistered() != null) {
            _hashCode += getIndRegistered().hashCode();
        }
        if (getRegistrationDate() != null) {
            _hashCode += getRegistrationDate().hashCode();
        }
        if (getRegistrationId() != null) {
            _hashCode += getRegistrationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CRegistrationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRegistrationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entitlementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indRegistered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indRegistered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRegistrationId"));
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
