/**
 * CCriteriaProcessByOfficedoc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaProcessByOfficedoc  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasInteger agentCode;

    private _int.wipo.ipas.IpasServices.CDocumentId documentId;

    private java.lang.Boolean indToBeNotified;

    private _int.wipo.ipas.IpasServices.IpasInteger officedocNbrFrom;

    private _int.wipo.ipas.IpasServices.IpasInteger officedocNbrTo;

    private java.lang.String officedocOrigin;

    private _int.wipo.ipas.IpasServices.IpasInteger officedocSeries;

    private java.lang.String officedocType;

    private java.lang.String serviceNameContainsWords;

    private _int.wipo.ipas.IpasServices.CFileId topFileId;

    public CCriteriaProcessByOfficedoc() {
    }

    public CCriteriaProcessByOfficedoc(
           _int.wipo.ipas.IpasServices.IpasInteger agentCode,
           _int.wipo.ipas.IpasServices.CDocumentId documentId,
           java.lang.Boolean indToBeNotified,
           _int.wipo.ipas.IpasServices.IpasInteger officedocNbrFrom,
           _int.wipo.ipas.IpasServices.IpasInteger officedocNbrTo,
           java.lang.String officedocOrigin,
           _int.wipo.ipas.IpasServices.IpasInteger officedocSeries,
           java.lang.String officedocType,
           java.lang.String serviceNameContainsWords,
           _int.wipo.ipas.IpasServices.CFileId topFileId) {
           this.agentCode = agentCode;
           this.documentId = documentId;
           this.indToBeNotified = indToBeNotified;
           this.officedocNbrFrom = officedocNbrFrom;
           this.officedocNbrTo = officedocNbrTo;
           this.officedocOrigin = officedocOrigin;
           this.officedocSeries = officedocSeries;
           this.officedocType = officedocType;
           this.serviceNameContainsWords = serviceNameContainsWords;
           this.topFileId = topFileId;
    }


    /**
     * Gets the agentCode value for this CCriteriaProcessByOfficedoc.
     * 
     * @return agentCode
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getAgentCode() {
        return agentCode;
    }


    /**
     * Sets the agentCode value for this CCriteriaProcessByOfficedoc.
     * 
     * @param agentCode
     */
    public void setAgentCode(_int.wipo.ipas.IpasServices.IpasInteger agentCode) {
        this.agentCode = agentCode;
    }


    /**
     * Gets the documentId value for this CCriteriaProcessByOfficedoc.
     * 
     * @return documentId
     */
    public _int.wipo.ipas.IpasServices.CDocumentId getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this CCriteriaProcessByOfficedoc.
     * 
     * @param documentId
     */
    public void setDocumentId(_int.wipo.ipas.IpasServices.CDocumentId documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the indToBeNotified value for this CCriteriaProcessByOfficedoc.
     * 
     * @return indToBeNotified
     */
    public java.lang.Boolean getIndToBeNotified() {
        return indToBeNotified;
    }


    /**
     * Sets the indToBeNotified value for this CCriteriaProcessByOfficedoc.
     * 
     * @param indToBeNotified
     */
    public void setIndToBeNotified(java.lang.Boolean indToBeNotified) {
        this.indToBeNotified = indToBeNotified;
    }


    /**
     * Gets the officedocNbrFrom value for this CCriteriaProcessByOfficedoc.
     * 
     * @return officedocNbrFrom
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getOfficedocNbrFrom() {
        return officedocNbrFrom;
    }


    /**
     * Sets the officedocNbrFrom value for this CCriteriaProcessByOfficedoc.
     * 
     * @param officedocNbrFrom
     */
    public void setOfficedocNbrFrom(_int.wipo.ipas.IpasServices.IpasInteger officedocNbrFrom) {
        this.officedocNbrFrom = officedocNbrFrom;
    }


    /**
     * Gets the officedocNbrTo value for this CCriteriaProcessByOfficedoc.
     * 
     * @return officedocNbrTo
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getOfficedocNbrTo() {
        return officedocNbrTo;
    }


    /**
     * Sets the officedocNbrTo value for this CCriteriaProcessByOfficedoc.
     * 
     * @param officedocNbrTo
     */
    public void setOfficedocNbrTo(_int.wipo.ipas.IpasServices.IpasInteger officedocNbrTo) {
        this.officedocNbrTo = officedocNbrTo;
    }


    /**
     * Gets the officedocOrigin value for this CCriteriaProcessByOfficedoc.
     * 
     * @return officedocOrigin
     */
    public java.lang.String getOfficedocOrigin() {
        return officedocOrigin;
    }


    /**
     * Sets the officedocOrigin value for this CCriteriaProcessByOfficedoc.
     * 
     * @param officedocOrigin
     */
    public void setOfficedocOrigin(java.lang.String officedocOrigin) {
        this.officedocOrigin = officedocOrigin;
    }


    /**
     * Gets the officedocSeries value for this CCriteriaProcessByOfficedoc.
     * 
     * @return officedocSeries
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getOfficedocSeries() {
        return officedocSeries;
    }


    /**
     * Sets the officedocSeries value for this CCriteriaProcessByOfficedoc.
     * 
     * @param officedocSeries
     */
    public void setOfficedocSeries(_int.wipo.ipas.IpasServices.IpasInteger officedocSeries) {
        this.officedocSeries = officedocSeries;
    }


    /**
     * Gets the officedocType value for this CCriteriaProcessByOfficedoc.
     * 
     * @return officedocType
     */
    public java.lang.String getOfficedocType() {
        return officedocType;
    }


    /**
     * Sets the officedocType value for this CCriteriaProcessByOfficedoc.
     * 
     * @param officedocType
     */
    public void setOfficedocType(java.lang.String officedocType) {
        this.officedocType = officedocType;
    }


    /**
     * Gets the serviceNameContainsWords value for this CCriteriaProcessByOfficedoc.
     * 
     * @return serviceNameContainsWords
     */
    public java.lang.String getServiceNameContainsWords() {
        return serviceNameContainsWords;
    }


    /**
     * Sets the serviceNameContainsWords value for this CCriteriaProcessByOfficedoc.
     * 
     * @param serviceNameContainsWords
     */
    public void setServiceNameContainsWords(java.lang.String serviceNameContainsWords) {
        this.serviceNameContainsWords = serviceNameContainsWords;
    }


    /**
     * Gets the topFileId value for this CCriteriaProcessByOfficedoc.
     * 
     * @return topFileId
     */
    public _int.wipo.ipas.IpasServices.CFileId getTopFileId() {
        return topFileId;
    }


    /**
     * Sets the topFileId value for this CCriteriaProcessByOfficedoc.
     * 
     * @param topFileId
     */
    public void setTopFileId(_int.wipo.ipas.IpasServices.CFileId topFileId) {
        this.topFileId = topFileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaProcessByOfficedoc)) return false;
        CCriteriaProcessByOfficedoc other = (CCriteriaProcessByOfficedoc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agentCode==null && other.getAgentCode()==null) || 
             (this.agentCode!=null &&
              this.agentCode.equals(other.getAgentCode()))) &&
            ((this.documentId==null && other.getDocumentId()==null) || 
             (this.documentId!=null &&
              this.documentId.equals(other.getDocumentId()))) &&
            ((this.indToBeNotified==null && other.getIndToBeNotified()==null) || 
             (this.indToBeNotified!=null &&
              this.indToBeNotified.equals(other.getIndToBeNotified()))) &&
            ((this.officedocNbrFrom==null && other.getOfficedocNbrFrom()==null) || 
             (this.officedocNbrFrom!=null &&
              this.officedocNbrFrom.equals(other.getOfficedocNbrFrom()))) &&
            ((this.officedocNbrTo==null && other.getOfficedocNbrTo()==null) || 
             (this.officedocNbrTo!=null &&
              this.officedocNbrTo.equals(other.getOfficedocNbrTo()))) &&
            ((this.officedocOrigin==null && other.getOfficedocOrigin()==null) || 
             (this.officedocOrigin!=null &&
              this.officedocOrigin.equals(other.getOfficedocOrigin()))) &&
            ((this.officedocSeries==null && other.getOfficedocSeries()==null) || 
             (this.officedocSeries!=null &&
              this.officedocSeries.equals(other.getOfficedocSeries()))) &&
            ((this.officedocType==null && other.getOfficedocType()==null) || 
             (this.officedocType!=null &&
              this.officedocType.equals(other.getOfficedocType()))) &&
            ((this.serviceNameContainsWords==null && other.getServiceNameContainsWords()==null) || 
             (this.serviceNameContainsWords!=null &&
              this.serviceNameContainsWords.equals(other.getServiceNameContainsWords()))) &&
            ((this.topFileId==null && other.getTopFileId()==null) || 
             (this.topFileId!=null &&
              this.topFileId.equals(other.getTopFileId())));
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
        if (getAgentCode() != null) {
            _hashCode += getAgentCode().hashCode();
        }
        if (getDocumentId() != null) {
            _hashCode += getDocumentId().hashCode();
        }
        if (getIndToBeNotified() != null) {
            _hashCode += getIndToBeNotified().hashCode();
        }
        if (getOfficedocNbrFrom() != null) {
            _hashCode += getOfficedocNbrFrom().hashCode();
        }
        if (getOfficedocNbrTo() != null) {
            _hashCode += getOfficedocNbrTo().hashCode();
        }
        if (getOfficedocOrigin() != null) {
            _hashCode += getOfficedocOrigin().hashCode();
        }
        if (getOfficedocSeries() != null) {
            _hashCode += getOfficedocSeries().hashCode();
        }
        if (getOfficedocType() != null) {
            _hashCode += getOfficedocType().hashCode();
        }
        if (getServiceNameContainsWords() != null) {
            _hashCode += getServiceNameContainsWords().hashCode();
        }
        if (getTopFileId() != null) {
            _hashCode += getTopFileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaProcessByOfficedoc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcessByOfficedoc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indToBeNotified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indToBeNotified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officedocNbrFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officedocNbrFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officedocNbrTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officedocNbrTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officedocOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officedocOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officedocSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officedocSeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officedocType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officedocType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceNameContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceNameContainsWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topFileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topFileId"));
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
