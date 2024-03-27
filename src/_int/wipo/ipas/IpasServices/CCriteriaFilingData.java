/**
 * CCriteriaFilingData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaFilingData  implements java.io.Serializable {
    private java.lang.String applicationSubtype;

    private java.lang.String applicationType;

    private java.lang.String externalOffice;

    private java.lang.String externalSystemId;

    private _int.wipo.ipas.IpasServices.IpasDateTime filingDateFrom;

    private _int.wipo.ipas.IpasServices.IpasDateTime filingDateTo;

    private java.lang.Boolean indManualInterpretationRequired;

    private java.lang.Boolean isValidationPending;

    private _int.wipo.ipas.IpasServices.IpasDateTime noveltyDateFrom;

    private _int.wipo.ipas.IpasServices.IpasDateTime noveltyDateTo;

    private _int.wipo.ipas.IpasServices.IpasDateTime receptionDateFrom;

    private _int.wipo.ipas.IpasServices.IpasDateTime receptionDateTo;

    public CCriteriaFilingData() {
    }

    public CCriteriaFilingData(
           java.lang.String applicationSubtype,
           java.lang.String applicationType,
           java.lang.String externalOffice,
           java.lang.String externalSystemId,
           _int.wipo.ipas.IpasServices.IpasDateTime filingDateFrom,
           _int.wipo.ipas.IpasServices.IpasDateTime filingDateTo,
           java.lang.Boolean indManualInterpretationRequired,
           java.lang.Boolean isValidationPending,
           _int.wipo.ipas.IpasServices.IpasDateTime noveltyDateFrom,
           _int.wipo.ipas.IpasServices.IpasDateTime noveltyDateTo,
           _int.wipo.ipas.IpasServices.IpasDateTime receptionDateFrom,
           _int.wipo.ipas.IpasServices.IpasDateTime receptionDateTo) {
           this.applicationSubtype = applicationSubtype;
           this.applicationType = applicationType;
           this.externalOffice = externalOffice;
           this.externalSystemId = externalSystemId;
           this.filingDateFrom = filingDateFrom;
           this.filingDateTo = filingDateTo;
           this.indManualInterpretationRequired = indManualInterpretationRequired;
           this.isValidationPending = isValidationPending;
           this.noveltyDateFrom = noveltyDateFrom;
           this.noveltyDateTo = noveltyDateTo;
           this.receptionDateFrom = receptionDateFrom;
           this.receptionDateTo = receptionDateTo;
    }


    /**
     * Gets the applicationSubtype value for this CCriteriaFilingData.
     * 
     * @return applicationSubtype
     */
    public java.lang.String getApplicationSubtype() {
        return applicationSubtype;
    }


    /**
     * Sets the applicationSubtype value for this CCriteriaFilingData.
     * 
     * @param applicationSubtype
     */
    public void setApplicationSubtype(java.lang.String applicationSubtype) {
        this.applicationSubtype = applicationSubtype;
    }


    /**
     * Gets the applicationType value for this CCriteriaFilingData.
     * 
     * @return applicationType
     */
    public java.lang.String getApplicationType() {
        return applicationType;
    }


    /**
     * Sets the applicationType value for this CCriteriaFilingData.
     * 
     * @param applicationType
     */
    public void setApplicationType(java.lang.String applicationType) {
        this.applicationType = applicationType;
    }


    /**
     * Gets the externalOffice value for this CCriteriaFilingData.
     * 
     * @return externalOffice
     */
    public java.lang.String getExternalOffice() {
        return externalOffice;
    }


    /**
     * Sets the externalOffice value for this CCriteriaFilingData.
     * 
     * @param externalOffice
     */
    public void setExternalOffice(java.lang.String externalOffice) {
        this.externalOffice = externalOffice;
    }


    /**
     * Gets the externalSystemId value for this CCriteriaFilingData.
     * 
     * @return externalSystemId
     */
    public java.lang.String getExternalSystemId() {
        return externalSystemId;
    }


    /**
     * Sets the externalSystemId value for this CCriteriaFilingData.
     * 
     * @param externalSystemId
     */
    public void setExternalSystemId(java.lang.String externalSystemId) {
        this.externalSystemId = externalSystemId;
    }


    /**
     * Gets the filingDateFrom value for this CCriteriaFilingData.
     * 
     * @return filingDateFrom
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getFilingDateFrom() {
        return filingDateFrom;
    }


    /**
     * Sets the filingDateFrom value for this CCriteriaFilingData.
     * 
     * @param filingDateFrom
     */
    public void setFilingDateFrom(_int.wipo.ipas.IpasServices.IpasDateTime filingDateFrom) {
        this.filingDateFrom = filingDateFrom;
    }


    /**
     * Gets the filingDateTo value for this CCriteriaFilingData.
     * 
     * @return filingDateTo
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getFilingDateTo() {
        return filingDateTo;
    }


    /**
     * Sets the filingDateTo value for this CCriteriaFilingData.
     * 
     * @param filingDateTo
     */
    public void setFilingDateTo(_int.wipo.ipas.IpasServices.IpasDateTime filingDateTo) {
        this.filingDateTo = filingDateTo;
    }


    /**
     * Gets the indManualInterpretationRequired value for this CCriteriaFilingData.
     * 
     * @return indManualInterpretationRequired
     */
    public java.lang.Boolean getIndManualInterpretationRequired() {
        return indManualInterpretationRequired;
    }


    /**
     * Sets the indManualInterpretationRequired value for this CCriteriaFilingData.
     * 
     * @param indManualInterpretationRequired
     */
    public void setIndManualInterpretationRequired(java.lang.Boolean indManualInterpretationRequired) {
        this.indManualInterpretationRequired = indManualInterpretationRequired;
    }


    /**
     * Gets the isValidationPending value for this CCriteriaFilingData.
     * 
     * @return isValidationPending
     */
    public java.lang.Boolean getIsValidationPending() {
        return isValidationPending;
    }


    /**
     * Sets the isValidationPending value for this CCriteriaFilingData.
     * 
     * @param isValidationPending
     */
    public void setIsValidationPending(java.lang.Boolean isValidationPending) {
        this.isValidationPending = isValidationPending;
    }


    /**
     * Gets the noveltyDateFrom value for this CCriteriaFilingData.
     * 
     * @return noveltyDateFrom
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getNoveltyDateFrom() {
        return noveltyDateFrom;
    }


    /**
     * Sets the noveltyDateFrom value for this CCriteriaFilingData.
     * 
     * @param noveltyDateFrom
     */
    public void setNoveltyDateFrom(_int.wipo.ipas.IpasServices.IpasDateTime noveltyDateFrom) {
        this.noveltyDateFrom = noveltyDateFrom;
    }


    /**
     * Gets the noveltyDateTo value for this CCriteriaFilingData.
     * 
     * @return noveltyDateTo
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getNoveltyDateTo() {
        return noveltyDateTo;
    }


    /**
     * Sets the noveltyDateTo value for this CCriteriaFilingData.
     * 
     * @param noveltyDateTo
     */
    public void setNoveltyDateTo(_int.wipo.ipas.IpasServices.IpasDateTime noveltyDateTo) {
        this.noveltyDateTo = noveltyDateTo;
    }


    /**
     * Gets the receptionDateFrom value for this CCriteriaFilingData.
     * 
     * @return receptionDateFrom
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getReceptionDateFrom() {
        return receptionDateFrom;
    }


    /**
     * Sets the receptionDateFrom value for this CCriteriaFilingData.
     * 
     * @param receptionDateFrom
     */
    public void setReceptionDateFrom(_int.wipo.ipas.IpasServices.IpasDateTime receptionDateFrom) {
        this.receptionDateFrom = receptionDateFrom;
    }


    /**
     * Gets the receptionDateTo value for this CCriteriaFilingData.
     * 
     * @return receptionDateTo
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getReceptionDateTo() {
        return receptionDateTo;
    }


    /**
     * Sets the receptionDateTo value for this CCriteriaFilingData.
     * 
     * @param receptionDateTo
     */
    public void setReceptionDateTo(_int.wipo.ipas.IpasServices.IpasDateTime receptionDateTo) {
        this.receptionDateTo = receptionDateTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaFilingData)) return false;
        CCriteriaFilingData other = (CCriteriaFilingData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationSubtype==null && other.getApplicationSubtype()==null) || 
             (this.applicationSubtype!=null &&
              this.applicationSubtype.equals(other.getApplicationSubtype()))) &&
            ((this.applicationType==null && other.getApplicationType()==null) || 
             (this.applicationType!=null &&
              this.applicationType.equals(other.getApplicationType()))) &&
            ((this.externalOffice==null && other.getExternalOffice()==null) || 
             (this.externalOffice!=null &&
              this.externalOffice.equals(other.getExternalOffice()))) &&
            ((this.externalSystemId==null && other.getExternalSystemId()==null) || 
             (this.externalSystemId!=null &&
              this.externalSystemId.equals(other.getExternalSystemId()))) &&
            ((this.filingDateFrom==null && other.getFilingDateFrom()==null) || 
             (this.filingDateFrom!=null &&
              this.filingDateFrom.equals(other.getFilingDateFrom()))) &&
            ((this.filingDateTo==null && other.getFilingDateTo()==null) || 
             (this.filingDateTo!=null &&
              this.filingDateTo.equals(other.getFilingDateTo()))) &&
            ((this.indManualInterpretationRequired==null && other.getIndManualInterpretationRequired()==null) || 
             (this.indManualInterpretationRequired!=null &&
              this.indManualInterpretationRequired.equals(other.getIndManualInterpretationRequired()))) &&
            ((this.isValidationPending==null && other.getIsValidationPending()==null) || 
             (this.isValidationPending!=null &&
              this.isValidationPending.equals(other.getIsValidationPending()))) &&
            ((this.noveltyDateFrom==null && other.getNoveltyDateFrom()==null) || 
             (this.noveltyDateFrom!=null &&
              this.noveltyDateFrom.equals(other.getNoveltyDateFrom()))) &&
            ((this.noveltyDateTo==null && other.getNoveltyDateTo()==null) || 
             (this.noveltyDateTo!=null &&
              this.noveltyDateTo.equals(other.getNoveltyDateTo()))) &&
            ((this.receptionDateFrom==null && other.getReceptionDateFrom()==null) || 
             (this.receptionDateFrom!=null &&
              this.receptionDateFrom.equals(other.getReceptionDateFrom()))) &&
            ((this.receptionDateTo==null && other.getReceptionDateTo()==null) || 
             (this.receptionDateTo!=null &&
              this.receptionDateTo.equals(other.getReceptionDateTo())));
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
        if (getApplicationSubtype() != null) {
            _hashCode += getApplicationSubtype().hashCode();
        }
        if (getApplicationType() != null) {
            _hashCode += getApplicationType().hashCode();
        }
        if (getExternalOffice() != null) {
            _hashCode += getExternalOffice().hashCode();
        }
        if (getExternalSystemId() != null) {
            _hashCode += getExternalSystemId().hashCode();
        }
        if (getFilingDateFrom() != null) {
            _hashCode += getFilingDateFrom().hashCode();
        }
        if (getFilingDateTo() != null) {
            _hashCode += getFilingDateTo().hashCode();
        }
        if (getIndManualInterpretationRequired() != null) {
            _hashCode += getIndManualInterpretationRequired().hashCode();
        }
        if (getIsValidationPending() != null) {
            _hashCode += getIsValidationPending().hashCode();
        }
        if (getNoveltyDateFrom() != null) {
            _hashCode += getNoveltyDateFrom().hashCode();
        }
        if (getNoveltyDateTo() != null) {
            _hashCode += getNoveltyDateTo().hashCode();
        }
        if (getReceptionDateFrom() != null) {
            _hashCode += getReceptionDateFrom().hashCode();
        }
        if (getReceptionDateTo() != null) {
            _hashCode += getReceptionDateTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaFilingData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaFilingData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("externalOffice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalOffice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalSystemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalSystemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("indManualInterpretationRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indManualInterpretationRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isValidationPending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isValidationPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noveltyDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noveltyDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noveltyDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noveltyDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
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
