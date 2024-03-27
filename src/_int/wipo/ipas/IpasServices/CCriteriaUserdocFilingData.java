/**
 * CCriteriaUserdocFilingData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaUserdocFilingData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime filingDateFrom;

    private _int.wipo.ipas.IpasServices.IpasDateTime filingDateTo;

    private _int.wipo.ipas.IpasServices.IpasInteger poaRegistrationNbr;

    private _int.wipo.ipas.IpasServices.IpasDateTime receptionDateFrom;

    private _int.wipo.ipas.IpasServices.IpasDateTime receptionDateTo;

    private java.lang.String userdocType;

    public CCriteriaUserdocFilingData() {
    }

    public CCriteriaUserdocFilingData(
           _int.wipo.ipas.IpasServices.IpasDateTime filingDateFrom,
           _int.wipo.ipas.IpasServices.IpasDateTime filingDateTo,
           _int.wipo.ipas.IpasServices.IpasInteger poaRegistrationNbr,
           _int.wipo.ipas.IpasServices.IpasDateTime receptionDateFrom,
           _int.wipo.ipas.IpasServices.IpasDateTime receptionDateTo,
           java.lang.String userdocType) {
           this.filingDateFrom = filingDateFrom;
           this.filingDateTo = filingDateTo;
           this.poaRegistrationNbr = poaRegistrationNbr;
           this.receptionDateFrom = receptionDateFrom;
           this.receptionDateTo = receptionDateTo;
           this.userdocType = userdocType;
    }


    /**
     * Gets the filingDateFrom value for this CCriteriaUserdocFilingData.
     * 
     * @return filingDateFrom
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getFilingDateFrom() {
        return filingDateFrom;
    }


    /**
     * Sets the filingDateFrom value for this CCriteriaUserdocFilingData.
     * 
     * @param filingDateFrom
     */
    public void setFilingDateFrom(_int.wipo.ipas.IpasServices.IpasDateTime filingDateFrom) {
        this.filingDateFrom = filingDateFrom;
    }


    /**
     * Gets the filingDateTo value for this CCriteriaUserdocFilingData.
     * 
     * @return filingDateTo
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getFilingDateTo() {
        return filingDateTo;
    }


    /**
     * Sets the filingDateTo value for this CCriteriaUserdocFilingData.
     * 
     * @param filingDateTo
     */
    public void setFilingDateTo(_int.wipo.ipas.IpasServices.IpasDateTime filingDateTo) {
        this.filingDateTo = filingDateTo;
    }


    /**
     * Gets the poaRegistrationNbr value for this CCriteriaUserdocFilingData.
     * 
     * @return poaRegistrationNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getPoaRegistrationNbr() {
        return poaRegistrationNbr;
    }


    /**
     * Sets the poaRegistrationNbr value for this CCriteriaUserdocFilingData.
     * 
     * @param poaRegistrationNbr
     */
    public void setPoaRegistrationNbr(_int.wipo.ipas.IpasServices.IpasInteger poaRegistrationNbr) {
        this.poaRegistrationNbr = poaRegistrationNbr;
    }


    /**
     * Gets the receptionDateFrom value for this CCriteriaUserdocFilingData.
     * 
     * @return receptionDateFrom
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getReceptionDateFrom() {
        return receptionDateFrom;
    }


    /**
     * Sets the receptionDateFrom value for this CCriteriaUserdocFilingData.
     * 
     * @param receptionDateFrom
     */
    public void setReceptionDateFrom(_int.wipo.ipas.IpasServices.IpasDateTime receptionDateFrom) {
        this.receptionDateFrom = receptionDateFrom;
    }


    /**
     * Gets the receptionDateTo value for this CCriteriaUserdocFilingData.
     * 
     * @return receptionDateTo
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getReceptionDateTo() {
        return receptionDateTo;
    }


    /**
     * Sets the receptionDateTo value for this CCriteriaUserdocFilingData.
     * 
     * @param receptionDateTo
     */
    public void setReceptionDateTo(_int.wipo.ipas.IpasServices.IpasDateTime receptionDateTo) {
        this.receptionDateTo = receptionDateTo;
    }


    /**
     * Gets the userdocType value for this CCriteriaUserdocFilingData.
     * 
     * @return userdocType
     */
    public java.lang.String getUserdocType() {
        return userdocType;
    }


    /**
     * Sets the userdocType value for this CCriteriaUserdocFilingData.
     * 
     * @param userdocType
     */
    public void setUserdocType(java.lang.String userdocType) {
        this.userdocType = userdocType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaUserdocFilingData)) return false;
        CCriteriaUserdocFilingData other = (CCriteriaUserdocFilingData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filingDateFrom==null && other.getFilingDateFrom()==null) || 
             (this.filingDateFrom!=null &&
              this.filingDateFrom.equals(other.getFilingDateFrom()))) &&
            ((this.filingDateTo==null && other.getFilingDateTo()==null) || 
             (this.filingDateTo!=null &&
              this.filingDateTo.equals(other.getFilingDateTo()))) &&
            ((this.poaRegistrationNbr==null && other.getPoaRegistrationNbr()==null) || 
             (this.poaRegistrationNbr!=null &&
              this.poaRegistrationNbr.equals(other.getPoaRegistrationNbr()))) &&
            ((this.receptionDateFrom==null && other.getReceptionDateFrom()==null) || 
             (this.receptionDateFrom!=null &&
              this.receptionDateFrom.equals(other.getReceptionDateFrom()))) &&
            ((this.receptionDateTo==null && other.getReceptionDateTo()==null) || 
             (this.receptionDateTo!=null &&
              this.receptionDateTo.equals(other.getReceptionDateTo()))) &&
            ((this.userdocType==null && other.getUserdocType()==null) || 
             (this.userdocType!=null &&
              this.userdocType.equals(other.getUserdocType())));
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
        if (getFilingDateFrom() != null) {
            _hashCode += getFilingDateFrom().hashCode();
        }
        if (getFilingDateTo() != null) {
            _hashCode += getFilingDateTo().hashCode();
        }
        if (getPoaRegistrationNbr() != null) {
            _hashCode += getPoaRegistrationNbr().hashCode();
        }
        if (getReceptionDateFrom() != null) {
            _hashCode += getReceptionDateFrom().hashCode();
        }
        if (getReceptionDateTo() != null) {
            _hashCode += getReceptionDateTo().hashCode();
        }
        if (getUserdocType() != null) {
            _hashCode += getUserdocType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaUserdocFilingData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaUserdocFilingData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filingDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filingDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filingDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filingDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poaRegistrationNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "poaRegistrationNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receptionDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receptionDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receptionDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receptionDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdocType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdocType"));
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
