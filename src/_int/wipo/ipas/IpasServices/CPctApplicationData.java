/**
 * CPctApplicationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CPctApplicationData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime pctApplicationDate;

    private java.lang.String pctApplicationId;

    private _int.wipo.ipas.IpasServices.IpasInteger pctPhase;

    private java.lang.String pctPublicationCountryCode;

    private _int.wipo.ipas.IpasServices.IpasDateTime pctPublicationDate;

    private java.lang.String pctPublicationId;

    private java.lang.String pctPublicationType;

    public CPctApplicationData() {
    }

    public CPctApplicationData(
           _int.wipo.ipas.IpasServices.IpasDateTime pctApplicationDate,
           java.lang.String pctApplicationId,
           _int.wipo.ipas.IpasServices.IpasInteger pctPhase,
           java.lang.String pctPublicationCountryCode,
           _int.wipo.ipas.IpasServices.IpasDateTime pctPublicationDate,
           java.lang.String pctPublicationId,
           java.lang.String pctPublicationType) {
           this.pctApplicationDate = pctApplicationDate;
           this.pctApplicationId = pctApplicationId;
           this.pctPhase = pctPhase;
           this.pctPublicationCountryCode = pctPublicationCountryCode;
           this.pctPublicationDate = pctPublicationDate;
           this.pctPublicationId = pctPublicationId;
           this.pctPublicationType = pctPublicationType;
    }


    /**
     * Gets the pctApplicationDate value for this CPctApplicationData.
     * 
     * @return pctApplicationDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getPctApplicationDate() {
        return pctApplicationDate;
    }


    /**
     * Sets the pctApplicationDate value for this CPctApplicationData.
     * 
     * @param pctApplicationDate
     */
    public void setPctApplicationDate(_int.wipo.ipas.IpasServices.IpasDateTime pctApplicationDate) {
        this.pctApplicationDate = pctApplicationDate;
    }


    /**
     * Gets the pctApplicationId value for this CPctApplicationData.
     * 
     * @return pctApplicationId
     */
    public java.lang.String getPctApplicationId() {
        return pctApplicationId;
    }


    /**
     * Sets the pctApplicationId value for this CPctApplicationData.
     * 
     * @param pctApplicationId
     */
    public void setPctApplicationId(java.lang.String pctApplicationId) {
        this.pctApplicationId = pctApplicationId;
    }


    /**
     * Gets the pctPhase value for this CPctApplicationData.
     * 
     * @return pctPhase
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getPctPhase() {
        return pctPhase;
    }


    /**
     * Sets the pctPhase value for this CPctApplicationData.
     * 
     * @param pctPhase
     */
    public void setPctPhase(_int.wipo.ipas.IpasServices.IpasInteger pctPhase) {
        this.pctPhase = pctPhase;
    }


    /**
     * Gets the pctPublicationCountryCode value for this CPctApplicationData.
     * 
     * @return pctPublicationCountryCode
     */
    public java.lang.String getPctPublicationCountryCode() {
        return pctPublicationCountryCode;
    }


    /**
     * Sets the pctPublicationCountryCode value for this CPctApplicationData.
     * 
     * @param pctPublicationCountryCode
     */
    public void setPctPublicationCountryCode(java.lang.String pctPublicationCountryCode) {
        this.pctPublicationCountryCode = pctPublicationCountryCode;
    }


    /**
     * Gets the pctPublicationDate value for this CPctApplicationData.
     * 
     * @return pctPublicationDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getPctPublicationDate() {
        return pctPublicationDate;
    }


    /**
     * Sets the pctPublicationDate value for this CPctApplicationData.
     * 
     * @param pctPublicationDate
     */
    public void setPctPublicationDate(_int.wipo.ipas.IpasServices.IpasDateTime pctPublicationDate) {
        this.pctPublicationDate = pctPublicationDate;
    }


    /**
     * Gets the pctPublicationId value for this CPctApplicationData.
     * 
     * @return pctPublicationId
     */
    public java.lang.String getPctPublicationId() {
        return pctPublicationId;
    }


    /**
     * Sets the pctPublicationId value for this CPctApplicationData.
     * 
     * @param pctPublicationId
     */
    public void setPctPublicationId(java.lang.String pctPublicationId) {
        this.pctPublicationId = pctPublicationId;
    }


    /**
     * Gets the pctPublicationType value for this CPctApplicationData.
     * 
     * @return pctPublicationType
     */
    public java.lang.String getPctPublicationType() {
        return pctPublicationType;
    }


    /**
     * Sets the pctPublicationType value for this CPctApplicationData.
     * 
     * @param pctPublicationType
     */
    public void setPctPublicationType(java.lang.String pctPublicationType) {
        this.pctPublicationType = pctPublicationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CPctApplicationData)) return false;
        CPctApplicationData other = (CPctApplicationData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pctApplicationDate==null && other.getPctApplicationDate()==null) || 
             (this.pctApplicationDate!=null &&
              this.pctApplicationDate.equals(other.getPctApplicationDate()))) &&
            ((this.pctApplicationId==null && other.getPctApplicationId()==null) || 
             (this.pctApplicationId!=null &&
              this.pctApplicationId.equals(other.getPctApplicationId()))) &&
            ((this.pctPhase==null && other.getPctPhase()==null) || 
             (this.pctPhase!=null &&
              this.pctPhase.equals(other.getPctPhase()))) &&
            ((this.pctPublicationCountryCode==null && other.getPctPublicationCountryCode()==null) || 
             (this.pctPublicationCountryCode!=null &&
              this.pctPublicationCountryCode.equals(other.getPctPublicationCountryCode()))) &&
            ((this.pctPublicationDate==null && other.getPctPublicationDate()==null) || 
             (this.pctPublicationDate!=null &&
              this.pctPublicationDate.equals(other.getPctPublicationDate()))) &&
            ((this.pctPublicationId==null && other.getPctPublicationId()==null) || 
             (this.pctPublicationId!=null &&
              this.pctPublicationId.equals(other.getPctPublicationId()))) &&
            ((this.pctPublicationType==null && other.getPctPublicationType()==null) || 
             (this.pctPublicationType!=null &&
              this.pctPublicationType.equals(other.getPctPublicationType())));
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
        if (getPctApplicationDate() != null) {
            _hashCode += getPctApplicationDate().hashCode();
        }
        if (getPctApplicationId() != null) {
            _hashCode += getPctApplicationId().hashCode();
        }
        if (getPctPhase() != null) {
            _hashCode += getPctPhase().hashCode();
        }
        if (getPctPublicationCountryCode() != null) {
            _hashCode += getPctPublicationCountryCode().hashCode();
        }
        if (getPctPublicationDate() != null) {
            _hashCode += getPctPublicationDate().hashCode();
        }
        if (getPctPublicationId() != null) {
            _hashCode += getPctPublicationId().hashCode();
        }
        if (getPctPublicationType() != null) {
            _hashCode += getPctPublicationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CPctApplicationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPctApplicationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pctApplicationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pctApplicationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pctApplicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pctApplicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pctPhase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pctPhase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pctPublicationCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pctPublicationCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pctPublicationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pctPublicationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pctPublicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pctPublicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pctPublicationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pctPublicationType"));
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
