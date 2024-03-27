/**
 * CCriteriaProcessByFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaProcessByFile  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime annuityExpirationDateFrom;

    private _int.wipo.ipas.IpasServices.IpasDateTime annuityExpirationDateTo;

    private java.lang.String applicationSubtype;

    private java.lang.String applicationType;

    private _int.wipo.ipas.IpasServices.IpasDateTime expirationDateFrom;

    private _int.wipo.ipas.IpasServices.IpasDateTime expirationDateTo;

    private _int.wipo.ipas.IpasServices.CFileId fileId;

    public CCriteriaProcessByFile() {
    }

    public CCriteriaProcessByFile(
           _int.wipo.ipas.IpasServices.IpasDateTime annuityExpirationDateFrom,
           _int.wipo.ipas.IpasServices.IpasDateTime annuityExpirationDateTo,
           java.lang.String applicationSubtype,
           java.lang.String applicationType,
           _int.wipo.ipas.IpasServices.IpasDateTime expirationDateFrom,
           _int.wipo.ipas.IpasServices.IpasDateTime expirationDateTo,
           _int.wipo.ipas.IpasServices.CFileId fileId) {
           this.annuityExpirationDateFrom = annuityExpirationDateFrom;
           this.annuityExpirationDateTo = annuityExpirationDateTo;
           this.applicationSubtype = applicationSubtype;
           this.applicationType = applicationType;
           this.expirationDateFrom = expirationDateFrom;
           this.expirationDateTo = expirationDateTo;
           this.fileId = fileId;
    }


    /**
     * Gets the annuityExpirationDateFrom value for this CCriteriaProcessByFile.
     * 
     * @return annuityExpirationDateFrom
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getAnnuityExpirationDateFrom() {
        return annuityExpirationDateFrom;
    }


    /**
     * Sets the annuityExpirationDateFrom value for this CCriteriaProcessByFile.
     * 
     * @param annuityExpirationDateFrom
     */
    public void setAnnuityExpirationDateFrom(_int.wipo.ipas.IpasServices.IpasDateTime annuityExpirationDateFrom) {
        this.annuityExpirationDateFrom = annuityExpirationDateFrom;
    }


    /**
     * Gets the annuityExpirationDateTo value for this CCriteriaProcessByFile.
     * 
     * @return annuityExpirationDateTo
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getAnnuityExpirationDateTo() {
        return annuityExpirationDateTo;
    }


    /**
     * Sets the annuityExpirationDateTo value for this CCriteriaProcessByFile.
     * 
     * @param annuityExpirationDateTo
     */
    public void setAnnuityExpirationDateTo(_int.wipo.ipas.IpasServices.IpasDateTime annuityExpirationDateTo) {
        this.annuityExpirationDateTo = annuityExpirationDateTo;
    }


    /**
     * Gets the applicationSubtype value for this CCriteriaProcessByFile.
     * 
     * @return applicationSubtype
     */
    public java.lang.String getApplicationSubtype() {
        return applicationSubtype;
    }


    /**
     * Sets the applicationSubtype value for this CCriteriaProcessByFile.
     * 
     * @param applicationSubtype
     */
    public void setApplicationSubtype(java.lang.String applicationSubtype) {
        this.applicationSubtype = applicationSubtype;
    }


    /**
     * Gets the applicationType value for this CCriteriaProcessByFile.
     * 
     * @return applicationType
     */
    public java.lang.String getApplicationType() {
        return applicationType;
    }


    /**
     * Sets the applicationType value for this CCriteriaProcessByFile.
     * 
     * @param applicationType
     */
    public void setApplicationType(java.lang.String applicationType) {
        this.applicationType = applicationType;
    }


    /**
     * Gets the expirationDateFrom value for this CCriteriaProcessByFile.
     * 
     * @return expirationDateFrom
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getExpirationDateFrom() {
        return expirationDateFrom;
    }


    /**
     * Sets the expirationDateFrom value for this CCriteriaProcessByFile.
     * 
     * @param expirationDateFrom
     */
    public void setExpirationDateFrom(_int.wipo.ipas.IpasServices.IpasDateTime expirationDateFrom) {
        this.expirationDateFrom = expirationDateFrom;
    }


    /**
     * Gets the expirationDateTo value for this CCriteriaProcessByFile.
     * 
     * @return expirationDateTo
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getExpirationDateTo() {
        return expirationDateTo;
    }


    /**
     * Sets the expirationDateTo value for this CCriteriaProcessByFile.
     * 
     * @param expirationDateTo
     */
    public void setExpirationDateTo(_int.wipo.ipas.IpasServices.IpasDateTime expirationDateTo) {
        this.expirationDateTo = expirationDateTo;
    }


    /**
     * Gets the fileId value for this CCriteriaProcessByFile.
     * 
     * @return fileId
     */
    public _int.wipo.ipas.IpasServices.CFileId getFileId() {
        return fileId;
    }


    /**
     * Sets the fileId value for this CCriteriaProcessByFile.
     * 
     * @param fileId
     */
    public void setFileId(_int.wipo.ipas.IpasServices.CFileId fileId) {
        this.fileId = fileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaProcessByFile)) return false;
        CCriteriaProcessByFile other = (CCriteriaProcessByFile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.annuityExpirationDateFrom==null && other.getAnnuityExpirationDateFrom()==null) || 
             (this.annuityExpirationDateFrom!=null &&
              this.annuityExpirationDateFrom.equals(other.getAnnuityExpirationDateFrom()))) &&
            ((this.annuityExpirationDateTo==null && other.getAnnuityExpirationDateTo()==null) || 
             (this.annuityExpirationDateTo!=null &&
              this.annuityExpirationDateTo.equals(other.getAnnuityExpirationDateTo()))) &&
            ((this.applicationSubtype==null && other.getApplicationSubtype()==null) || 
             (this.applicationSubtype!=null &&
              this.applicationSubtype.equals(other.getApplicationSubtype()))) &&
            ((this.applicationType==null && other.getApplicationType()==null) || 
             (this.applicationType!=null &&
              this.applicationType.equals(other.getApplicationType()))) &&
            ((this.expirationDateFrom==null && other.getExpirationDateFrom()==null) || 
             (this.expirationDateFrom!=null &&
              this.expirationDateFrom.equals(other.getExpirationDateFrom()))) &&
            ((this.expirationDateTo==null && other.getExpirationDateTo()==null) || 
             (this.expirationDateTo!=null &&
              this.expirationDateTo.equals(other.getExpirationDateTo()))) &&
            ((this.fileId==null && other.getFileId()==null) || 
             (this.fileId!=null &&
              this.fileId.equals(other.getFileId())));
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
        if (getAnnuityExpirationDateFrom() != null) {
            _hashCode += getAnnuityExpirationDateFrom().hashCode();
        }
        if (getAnnuityExpirationDateTo() != null) {
            _hashCode += getAnnuityExpirationDateTo().hashCode();
        }
        if (getApplicationSubtype() != null) {
            _hashCode += getApplicationSubtype().hashCode();
        }
        if (getApplicationType() != null) {
            _hashCode += getApplicationType().hashCode();
        }
        if (getExpirationDateFrom() != null) {
            _hashCode += getExpirationDateFrom().hashCode();
        }
        if (getExpirationDateTo() != null) {
            _hashCode += getExpirationDateTo().hashCode();
        }
        if (getFileId() != null) {
            _hashCode += getFileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaProcessByFile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcessByFile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annuityExpirationDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annuityExpirationDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annuityExpirationDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annuityExpirationDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationSubtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationSubtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"));
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
