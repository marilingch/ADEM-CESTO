/**
 * CRegionalApplData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CRegionalApplData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime regionalApplDate;

    private java.lang.String regionalApplId;

    private java.lang.String regionalPublCountry;

    private _int.wipo.ipas.IpasServices.IpasDateTime regionalPublDate;

    private java.lang.String regionalPublId;

    private java.lang.String regionalPublType;

    public CRegionalApplData() {
    }

    public CRegionalApplData(
           _int.wipo.ipas.IpasServices.IpasDateTime regionalApplDate,
           java.lang.String regionalApplId,
           java.lang.String regionalPublCountry,
           _int.wipo.ipas.IpasServices.IpasDateTime regionalPublDate,
           java.lang.String regionalPublId,
           java.lang.String regionalPublType) {
           this.regionalApplDate = regionalApplDate;
           this.regionalApplId = regionalApplId;
           this.regionalPublCountry = regionalPublCountry;
           this.regionalPublDate = regionalPublDate;
           this.regionalPublId = regionalPublId;
           this.regionalPublType = regionalPublType;
    }


    /**
     * Gets the regionalApplDate value for this CRegionalApplData.
     * 
     * @return regionalApplDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getRegionalApplDate() {
        return regionalApplDate;
    }


    /**
     * Sets the regionalApplDate value for this CRegionalApplData.
     * 
     * @param regionalApplDate
     */
    public void setRegionalApplDate(_int.wipo.ipas.IpasServices.IpasDateTime regionalApplDate) {
        this.regionalApplDate = regionalApplDate;
    }


    /**
     * Gets the regionalApplId value for this CRegionalApplData.
     * 
     * @return regionalApplId
     */
    public java.lang.String getRegionalApplId() {
        return regionalApplId;
    }


    /**
     * Sets the regionalApplId value for this CRegionalApplData.
     * 
     * @param regionalApplId
     */
    public void setRegionalApplId(java.lang.String regionalApplId) {
        this.regionalApplId = regionalApplId;
    }


    /**
     * Gets the regionalPublCountry value for this CRegionalApplData.
     * 
     * @return regionalPublCountry
     */
    public java.lang.String getRegionalPublCountry() {
        return regionalPublCountry;
    }


    /**
     * Sets the regionalPublCountry value for this CRegionalApplData.
     * 
     * @param regionalPublCountry
     */
    public void setRegionalPublCountry(java.lang.String regionalPublCountry) {
        this.regionalPublCountry = regionalPublCountry;
    }


    /**
     * Gets the regionalPublDate value for this CRegionalApplData.
     * 
     * @return regionalPublDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getRegionalPublDate() {
        return regionalPublDate;
    }


    /**
     * Sets the regionalPublDate value for this CRegionalApplData.
     * 
     * @param regionalPublDate
     */
    public void setRegionalPublDate(_int.wipo.ipas.IpasServices.IpasDateTime regionalPublDate) {
        this.regionalPublDate = regionalPublDate;
    }


    /**
     * Gets the regionalPublId value for this CRegionalApplData.
     * 
     * @return regionalPublId
     */
    public java.lang.String getRegionalPublId() {
        return regionalPublId;
    }


    /**
     * Sets the regionalPublId value for this CRegionalApplData.
     * 
     * @param regionalPublId
     */
    public void setRegionalPublId(java.lang.String regionalPublId) {
        this.regionalPublId = regionalPublId;
    }


    /**
     * Gets the regionalPublType value for this CRegionalApplData.
     * 
     * @return regionalPublType
     */
    public java.lang.String getRegionalPublType() {
        return regionalPublType;
    }


    /**
     * Sets the regionalPublType value for this CRegionalApplData.
     * 
     * @param regionalPublType
     */
    public void setRegionalPublType(java.lang.String regionalPublType) {
        this.regionalPublType = regionalPublType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CRegionalApplData)) return false;
        CRegionalApplData other = (CRegionalApplData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regionalApplDate==null && other.getRegionalApplDate()==null) || 
             (this.regionalApplDate!=null &&
              this.regionalApplDate.equals(other.getRegionalApplDate()))) &&
            ((this.regionalApplId==null && other.getRegionalApplId()==null) || 
             (this.regionalApplId!=null &&
              this.regionalApplId.equals(other.getRegionalApplId()))) &&
            ((this.regionalPublCountry==null && other.getRegionalPublCountry()==null) || 
             (this.regionalPublCountry!=null &&
              this.regionalPublCountry.equals(other.getRegionalPublCountry()))) &&
            ((this.regionalPublDate==null && other.getRegionalPublDate()==null) || 
             (this.regionalPublDate!=null &&
              this.regionalPublDate.equals(other.getRegionalPublDate()))) &&
            ((this.regionalPublId==null && other.getRegionalPublId()==null) || 
             (this.regionalPublId!=null &&
              this.regionalPublId.equals(other.getRegionalPublId()))) &&
            ((this.regionalPublType==null && other.getRegionalPublType()==null) || 
             (this.regionalPublType!=null &&
              this.regionalPublType.equals(other.getRegionalPublType())));
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
        if (getRegionalApplDate() != null) {
            _hashCode += getRegionalApplDate().hashCode();
        }
        if (getRegionalApplId() != null) {
            _hashCode += getRegionalApplId().hashCode();
        }
        if (getRegionalPublCountry() != null) {
            _hashCode += getRegionalPublCountry().hashCode();
        }
        if (getRegionalPublDate() != null) {
            _hashCode += getRegionalPublDate().hashCode();
        }
        if (getRegionalPublId() != null) {
            _hashCode += getRegionalPublId().hashCode();
        }
        if (getRegionalPublType() != null) {
            _hashCode += getRegionalPublType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CRegionalApplData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRegionalApplData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionalApplDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionalApplDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionalApplId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionalApplId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionalPublCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionalPublCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionalPublDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionalPublDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionalPublId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionalPublId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionalPublType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionalPublType"));
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
