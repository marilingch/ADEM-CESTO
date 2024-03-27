/**
 * CAuxiliaryRegisterData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CAuxiliaryRegisterData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime cancellation;

    private java.lang.String contractSummary;

    private _int.wipo.ipas.IpasServices.CGuaranteeData guaranteeData;

    private _int.wipo.ipas.IpasServices.CLicenseData licenseData;

    private _int.wipo.ipas.IpasServices.CDocumentId registrationDocumentId;

    public CAuxiliaryRegisterData() {
    }

    public CAuxiliaryRegisterData(
           _int.wipo.ipas.IpasServices.IpasDateTime cancellation,
           java.lang.String contractSummary,
           _int.wipo.ipas.IpasServices.CGuaranteeData guaranteeData,
           _int.wipo.ipas.IpasServices.CLicenseData licenseData,
           _int.wipo.ipas.IpasServices.CDocumentId registrationDocumentId) {
           this.cancellation = cancellation;
           this.contractSummary = contractSummary;
           this.guaranteeData = guaranteeData;
           this.licenseData = licenseData;
           this.registrationDocumentId = registrationDocumentId;
    }


    /**
     * Gets the cancellation value for this CAuxiliaryRegisterData.
     * 
     * @return cancellation
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getCancellation() {
        return cancellation;
    }


    /**
     * Sets the cancellation value for this CAuxiliaryRegisterData.
     * 
     * @param cancellation
     */
    public void setCancellation(_int.wipo.ipas.IpasServices.IpasDateTime cancellation) {
        this.cancellation = cancellation;
    }


    /**
     * Gets the contractSummary value for this CAuxiliaryRegisterData.
     * 
     * @return contractSummary
     */
    public java.lang.String getContractSummary() {
        return contractSummary;
    }


    /**
     * Sets the contractSummary value for this CAuxiliaryRegisterData.
     * 
     * @param contractSummary
     */
    public void setContractSummary(java.lang.String contractSummary) {
        this.contractSummary = contractSummary;
    }


    /**
     * Gets the guaranteeData value for this CAuxiliaryRegisterData.
     * 
     * @return guaranteeData
     */
    public _int.wipo.ipas.IpasServices.CGuaranteeData getGuaranteeData() {
        return guaranteeData;
    }


    /**
     * Sets the guaranteeData value for this CAuxiliaryRegisterData.
     * 
     * @param guaranteeData
     */
    public void setGuaranteeData(_int.wipo.ipas.IpasServices.CGuaranteeData guaranteeData) {
        this.guaranteeData = guaranteeData;
    }


    /**
     * Gets the licenseData value for this CAuxiliaryRegisterData.
     * 
     * @return licenseData
     */
    public _int.wipo.ipas.IpasServices.CLicenseData getLicenseData() {
        return licenseData;
    }


    /**
     * Sets the licenseData value for this CAuxiliaryRegisterData.
     * 
     * @param licenseData
     */
    public void setLicenseData(_int.wipo.ipas.IpasServices.CLicenseData licenseData) {
        this.licenseData = licenseData;
    }


    /**
     * Gets the registrationDocumentId value for this CAuxiliaryRegisterData.
     * 
     * @return registrationDocumentId
     */
    public _int.wipo.ipas.IpasServices.CDocumentId getRegistrationDocumentId() {
        return registrationDocumentId;
    }


    /**
     * Sets the registrationDocumentId value for this CAuxiliaryRegisterData.
     * 
     * @param registrationDocumentId
     */
    public void setRegistrationDocumentId(_int.wipo.ipas.IpasServices.CDocumentId registrationDocumentId) {
        this.registrationDocumentId = registrationDocumentId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CAuxiliaryRegisterData)) return false;
        CAuxiliaryRegisterData other = (CAuxiliaryRegisterData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cancellation==null && other.getCancellation()==null) || 
             (this.cancellation!=null &&
              this.cancellation.equals(other.getCancellation()))) &&
            ((this.contractSummary==null && other.getContractSummary()==null) || 
             (this.contractSummary!=null &&
              this.contractSummary.equals(other.getContractSummary()))) &&
            ((this.guaranteeData==null && other.getGuaranteeData()==null) || 
             (this.guaranteeData!=null &&
              this.guaranteeData.equals(other.getGuaranteeData()))) &&
            ((this.licenseData==null && other.getLicenseData()==null) || 
             (this.licenseData!=null &&
              this.licenseData.equals(other.getLicenseData()))) &&
            ((this.registrationDocumentId==null && other.getRegistrationDocumentId()==null) || 
             (this.registrationDocumentId!=null &&
              this.registrationDocumentId.equals(other.getRegistrationDocumentId())));
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
        if (getCancellation() != null) {
            _hashCode += getCancellation().hashCode();
        }
        if (getContractSummary() != null) {
            _hashCode += getContractSummary().hashCode();
        }
        if (getGuaranteeData() != null) {
            _hashCode += getGuaranteeData().hashCode();
        }
        if (getLicenseData() != null) {
            _hashCode += getLicenseData().hashCode();
        }
        if (getRegistrationDocumentId() != null) {
            _hashCode += getRegistrationDocumentId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CAuxiliaryRegisterData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAuxiliaryRegisterData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancellation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancellation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guaranteeData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guaranteeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cGuaranteeData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "licenseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cLicenseData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationDocumentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrationDocumentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"));
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
