/**
 * CProcessOriginData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CProcessOriginData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CDocumentId documentId;

    private _int.wipo.ipas.IpasServices.CFileId fileId;

    private _int.wipo.ipas.IpasServices.COfficedocId officedocId;

    private _int.wipo.ipas.IpasServices.IpasInteger relatedToWorkCode;

    private _int.wipo.ipas.IpasServices.CFileSummary topFileSummary;

    private _int.wipo.ipas.IpasServices.CProcessId topProcessId;

    private _int.wipo.ipas.IpasServices.CProcessId upperProcessId;

    public CProcessOriginData() {
    }

    public CProcessOriginData(
           _int.wipo.ipas.IpasServices.CDocumentId documentId,
           _int.wipo.ipas.IpasServices.CFileId fileId,
           _int.wipo.ipas.IpasServices.COfficedocId officedocId,
           _int.wipo.ipas.IpasServices.IpasInteger relatedToWorkCode,
           _int.wipo.ipas.IpasServices.CFileSummary topFileSummary,
           _int.wipo.ipas.IpasServices.CProcessId topProcessId,
           _int.wipo.ipas.IpasServices.CProcessId upperProcessId) {
           this.documentId = documentId;
           this.fileId = fileId;
           this.officedocId = officedocId;
           this.relatedToWorkCode = relatedToWorkCode;
           this.topFileSummary = topFileSummary;
           this.topProcessId = topProcessId;
           this.upperProcessId = upperProcessId;
    }


    /**
     * Gets the documentId value for this CProcessOriginData.
     * 
     * @return documentId
     */
    public _int.wipo.ipas.IpasServices.CDocumentId getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this CProcessOriginData.
     * 
     * @param documentId
     */
    public void setDocumentId(_int.wipo.ipas.IpasServices.CDocumentId documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the fileId value for this CProcessOriginData.
     * 
     * @return fileId
     */
    public _int.wipo.ipas.IpasServices.CFileId getFileId() {
        return fileId;
    }


    /**
     * Sets the fileId value for this CProcessOriginData.
     * 
     * @param fileId
     */
    public void setFileId(_int.wipo.ipas.IpasServices.CFileId fileId) {
        this.fileId = fileId;
    }


    /**
     * Gets the officedocId value for this CProcessOriginData.
     * 
     * @return officedocId
     */
    public _int.wipo.ipas.IpasServices.COfficedocId getOfficedocId() {
        return officedocId;
    }


    /**
     * Sets the officedocId value for this CProcessOriginData.
     * 
     * @param officedocId
     */
    public void setOfficedocId(_int.wipo.ipas.IpasServices.COfficedocId officedocId) {
        this.officedocId = officedocId;
    }


    /**
     * Gets the relatedToWorkCode value for this CProcessOriginData.
     * 
     * @return relatedToWorkCode
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getRelatedToWorkCode() {
        return relatedToWorkCode;
    }


    /**
     * Sets the relatedToWorkCode value for this CProcessOriginData.
     * 
     * @param relatedToWorkCode
     */
    public void setRelatedToWorkCode(_int.wipo.ipas.IpasServices.IpasInteger relatedToWorkCode) {
        this.relatedToWorkCode = relatedToWorkCode;
    }


    /**
     * Gets the topFileSummary value for this CProcessOriginData.
     * 
     * @return topFileSummary
     */
    public _int.wipo.ipas.IpasServices.CFileSummary getTopFileSummary() {
        return topFileSummary;
    }


    /**
     * Sets the topFileSummary value for this CProcessOriginData.
     * 
     * @param topFileSummary
     */
    public void setTopFileSummary(_int.wipo.ipas.IpasServices.CFileSummary topFileSummary) {
        this.topFileSummary = topFileSummary;
    }


    /**
     * Gets the topProcessId value for this CProcessOriginData.
     * 
     * @return topProcessId
     */
    public _int.wipo.ipas.IpasServices.CProcessId getTopProcessId() {
        return topProcessId;
    }


    /**
     * Sets the topProcessId value for this CProcessOriginData.
     * 
     * @param topProcessId
     */
    public void setTopProcessId(_int.wipo.ipas.IpasServices.CProcessId topProcessId) {
        this.topProcessId = topProcessId;
    }


    /**
     * Gets the upperProcessId value for this CProcessOriginData.
     * 
     * @return upperProcessId
     */
    public _int.wipo.ipas.IpasServices.CProcessId getUpperProcessId() {
        return upperProcessId;
    }


    /**
     * Sets the upperProcessId value for this CProcessOriginData.
     * 
     * @param upperProcessId
     */
    public void setUpperProcessId(_int.wipo.ipas.IpasServices.CProcessId upperProcessId) {
        this.upperProcessId = upperProcessId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CProcessOriginData)) return false;
        CProcessOriginData other = (CProcessOriginData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentId==null && other.getDocumentId()==null) || 
             (this.documentId!=null &&
              this.documentId.equals(other.getDocumentId()))) &&
            ((this.fileId==null && other.getFileId()==null) || 
             (this.fileId!=null &&
              this.fileId.equals(other.getFileId()))) &&
            ((this.officedocId==null && other.getOfficedocId()==null) || 
             (this.officedocId!=null &&
              this.officedocId.equals(other.getOfficedocId()))) &&
            ((this.relatedToWorkCode==null && other.getRelatedToWorkCode()==null) || 
             (this.relatedToWorkCode!=null &&
              this.relatedToWorkCode.equals(other.getRelatedToWorkCode()))) &&
            ((this.topFileSummary==null && other.getTopFileSummary()==null) || 
             (this.topFileSummary!=null &&
              this.topFileSummary.equals(other.getTopFileSummary()))) &&
            ((this.topProcessId==null && other.getTopProcessId()==null) || 
             (this.topProcessId!=null &&
              this.topProcessId.equals(other.getTopProcessId()))) &&
            ((this.upperProcessId==null && other.getUpperProcessId()==null) || 
             (this.upperProcessId!=null &&
              this.upperProcessId.equals(other.getUpperProcessId())));
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
        if (getDocumentId() != null) {
            _hashCode += getDocumentId().hashCode();
        }
        if (getFileId() != null) {
            _hashCode += getFileId().hashCode();
        }
        if (getOfficedocId() != null) {
            _hashCode += getOfficedocId().hashCode();
        }
        if (getRelatedToWorkCode() != null) {
            _hashCode += getRelatedToWorkCode().hashCode();
        }
        if (getTopFileSummary() != null) {
            _hashCode += getTopFileSummary().hashCode();
        }
        if (getTopProcessId() != null) {
            _hashCode += getTopProcessId().hashCode();
        }
        if (getUpperProcessId() != null) {
            _hashCode += getUpperProcessId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CProcessOriginData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessOriginData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officedocId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officedocId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedToWorkCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatedToWorkCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topFileSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topFileSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topProcessId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topProcessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upperProcessId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upperProcessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"));
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
