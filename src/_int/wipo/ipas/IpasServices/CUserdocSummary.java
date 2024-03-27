/**
 * CUserdocSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CUserdocSummary  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CFileId[] affectedFileIdList;

    private _int.wipo.ipas.IpasServices.CDocumentSeqId docSeqId;

    private _int.wipo.ipas.IpasServices.CDocumentId documentId;

    private _int.wipo.ipas.IpasServices.IpasDateTime filingDate;

    private java.lang.String userdocSummaryAffectedFileDescriptions;

    private java.lang.String userdocSummaryAffectedFileIds;

    private java.lang.String userdocSummaryAffectedFileRegistrationIds;

    private java.lang.String userdocSummaryTypes;

    public CUserdocSummary() {
    }

    public CUserdocSummary(
           _int.wipo.ipas.IpasServices.CFileId[] affectedFileIdList,
           _int.wipo.ipas.IpasServices.CDocumentSeqId docSeqId,
           _int.wipo.ipas.IpasServices.CDocumentId documentId,
           _int.wipo.ipas.IpasServices.IpasDateTime filingDate,
           java.lang.String userdocSummaryAffectedFileDescriptions,
           java.lang.String userdocSummaryAffectedFileIds,
           java.lang.String userdocSummaryAffectedFileRegistrationIds,
           java.lang.String userdocSummaryTypes) {
           this.affectedFileIdList = affectedFileIdList;
           this.docSeqId = docSeqId;
           this.documentId = documentId;
           this.filingDate = filingDate;
           this.userdocSummaryAffectedFileDescriptions = userdocSummaryAffectedFileDescriptions;
           this.userdocSummaryAffectedFileIds = userdocSummaryAffectedFileIds;
           this.userdocSummaryAffectedFileRegistrationIds = userdocSummaryAffectedFileRegistrationIds;
           this.userdocSummaryTypes = userdocSummaryTypes;
    }


    /**
     * Gets the affectedFileIdList value for this CUserdocSummary.
     * 
     * @return affectedFileIdList
     */
    public _int.wipo.ipas.IpasServices.CFileId[] getAffectedFileIdList() {
        return affectedFileIdList;
    }


    /**
     * Sets the affectedFileIdList value for this CUserdocSummary.
     * 
     * @param affectedFileIdList
     */
    public void setAffectedFileIdList(_int.wipo.ipas.IpasServices.CFileId[] affectedFileIdList) {
        this.affectedFileIdList = affectedFileIdList;
    }

    public _int.wipo.ipas.IpasServices.CFileId getAffectedFileIdList(int i) {
        return this.affectedFileIdList[i];
    }

    public void setAffectedFileIdList(int i, _int.wipo.ipas.IpasServices.CFileId _value) {
        this.affectedFileIdList[i] = _value;
    }


    /**
     * Gets the docSeqId value for this CUserdocSummary.
     * 
     * @return docSeqId
     */
    public _int.wipo.ipas.IpasServices.CDocumentSeqId getDocSeqId() {
        return docSeqId;
    }


    /**
     * Sets the docSeqId value for this CUserdocSummary.
     * 
     * @param docSeqId
     */
    public void setDocSeqId(_int.wipo.ipas.IpasServices.CDocumentSeqId docSeqId) {
        this.docSeqId = docSeqId;
    }


    /**
     * Gets the documentId value for this CUserdocSummary.
     * 
     * @return documentId
     */
    public _int.wipo.ipas.IpasServices.CDocumentId getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this CUserdocSummary.
     * 
     * @param documentId
     */
    public void setDocumentId(_int.wipo.ipas.IpasServices.CDocumentId documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the filingDate value for this CUserdocSummary.
     * 
     * @return filingDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getFilingDate() {
        return filingDate;
    }


    /**
     * Sets the filingDate value for this CUserdocSummary.
     * 
     * @param filingDate
     */
    public void setFilingDate(_int.wipo.ipas.IpasServices.IpasDateTime filingDate) {
        this.filingDate = filingDate;
    }


    /**
     * Gets the userdocSummaryAffectedFileDescriptions value for this CUserdocSummary.
     * 
     * @return userdocSummaryAffectedFileDescriptions
     */
    public java.lang.String getUserdocSummaryAffectedFileDescriptions() {
        return userdocSummaryAffectedFileDescriptions;
    }


    /**
     * Sets the userdocSummaryAffectedFileDescriptions value for this CUserdocSummary.
     * 
     * @param userdocSummaryAffectedFileDescriptions
     */
    public void setUserdocSummaryAffectedFileDescriptions(java.lang.String userdocSummaryAffectedFileDescriptions) {
        this.userdocSummaryAffectedFileDescriptions = userdocSummaryAffectedFileDescriptions;
    }


    /**
     * Gets the userdocSummaryAffectedFileIds value for this CUserdocSummary.
     * 
     * @return userdocSummaryAffectedFileIds
     */
    public java.lang.String getUserdocSummaryAffectedFileIds() {
        return userdocSummaryAffectedFileIds;
    }


    /**
     * Sets the userdocSummaryAffectedFileIds value for this CUserdocSummary.
     * 
     * @param userdocSummaryAffectedFileIds
     */
    public void setUserdocSummaryAffectedFileIds(java.lang.String userdocSummaryAffectedFileIds) {
        this.userdocSummaryAffectedFileIds = userdocSummaryAffectedFileIds;
    }


    /**
     * Gets the userdocSummaryAffectedFileRegistrationIds value for this CUserdocSummary.
     * 
     * @return userdocSummaryAffectedFileRegistrationIds
     */
    public java.lang.String getUserdocSummaryAffectedFileRegistrationIds() {
        return userdocSummaryAffectedFileRegistrationIds;
    }


    /**
     * Sets the userdocSummaryAffectedFileRegistrationIds value for this CUserdocSummary.
     * 
     * @param userdocSummaryAffectedFileRegistrationIds
     */
    public void setUserdocSummaryAffectedFileRegistrationIds(java.lang.String userdocSummaryAffectedFileRegistrationIds) {
        this.userdocSummaryAffectedFileRegistrationIds = userdocSummaryAffectedFileRegistrationIds;
    }


    /**
     * Gets the userdocSummaryTypes value for this CUserdocSummary.
     * 
     * @return userdocSummaryTypes
     */
    public java.lang.String getUserdocSummaryTypes() {
        return userdocSummaryTypes;
    }


    /**
     * Sets the userdocSummaryTypes value for this CUserdocSummary.
     * 
     * @param userdocSummaryTypes
     */
    public void setUserdocSummaryTypes(java.lang.String userdocSummaryTypes) {
        this.userdocSummaryTypes = userdocSummaryTypes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CUserdocSummary)) return false;
        CUserdocSummary other = (CUserdocSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.affectedFileIdList==null && other.getAffectedFileIdList()==null) || 
             (this.affectedFileIdList!=null &&
              java.util.Arrays.equals(this.affectedFileIdList, other.getAffectedFileIdList()))) &&
            ((this.docSeqId==null && other.getDocSeqId()==null) || 
             (this.docSeqId!=null &&
              this.docSeqId.equals(other.getDocSeqId()))) &&
            ((this.documentId==null && other.getDocumentId()==null) || 
             (this.documentId!=null &&
              this.documentId.equals(other.getDocumentId()))) &&
            ((this.filingDate==null && other.getFilingDate()==null) || 
             (this.filingDate!=null &&
              this.filingDate.equals(other.getFilingDate()))) &&
            ((this.userdocSummaryAffectedFileDescriptions==null && other.getUserdocSummaryAffectedFileDescriptions()==null) || 
             (this.userdocSummaryAffectedFileDescriptions!=null &&
              this.userdocSummaryAffectedFileDescriptions.equals(other.getUserdocSummaryAffectedFileDescriptions()))) &&
            ((this.userdocSummaryAffectedFileIds==null && other.getUserdocSummaryAffectedFileIds()==null) || 
             (this.userdocSummaryAffectedFileIds!=null &&
              this.userdocSummaryAffectedFileIds.equals(other.getUserdocSummaryAffectedFileIds()))) &&
            ((this.userdocSummaryAffectedFileRegistrationIds==null && other.getUserdocSummaryAffectedFileRegistrationIds()==null) || 
             (this.userdocSummaryAffectedFileRegistrationIds!=null &&
              this.userdocSummaryAffectedFileRegistrationIds.equals(other.getUserdocSummaryAffectedFileRegistrationIds()))) &&
            ((this.userdocSummaryTypes==null && other.getUserdocSummaryTypes()==null) || 
             (this.userdocSummaryTypes!=null &&
              this.userdocSummaryTypes.equals(other.getUserdocSummaryTypes())));
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
        if (getAffectedFileIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAffectedFileIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAffectedFileIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocSeqId() != null) {
            _hashCode += getDocSeqId().hashCode();
        }
        if (getDocumentId() != null) {
            _hashCode += getDocumentId().hashCode();
        }
        if (getFilingDate() != null) {
            _hashCode += getFilingDate().hashCode();
        }
        if (getUserdocSummaryAffectedFileDescriptions() != null) {
            _hashCode += getUserdocSummaryAffectedFileDescriptions().hashCode();
        }
        if (getUserdocSummaryAffectedFileIds() != null) {
            _hashCode += getUserdocSummaryAffectedFileIds().hashCode();
        }
        if (getUserdocSummaryAffectedFileRegistrationIds() != null) {
            _hashCode += getUserdocSummaryAffectedFileRegistrationIds().hashCode();
        }
        if (getUserdocSummaryTypes() != null) {
            _hashCode += getUserdocSummaryTypes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CUserdocSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserdocSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affectedFileIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "affectedFileIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docSeqId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docSeqId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentSeqId"));
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
        elemField.setFieldName("filingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdocSummaryAffectedFileDescriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdocSummaryAffectedFileDescriptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdocSummaryAffectedFileIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdocSummaryAffectedFileIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdocSummaryAffectedFileRegistrationIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdocSummaryAffectedFileRegistrationIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdocSummaryTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdocSummaryTypes"));
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
