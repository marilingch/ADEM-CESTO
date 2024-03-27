/**
 * COfficedoc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class COfficedoc  implements java.io.Serializable {
    private byte[] contentData;

    private java.lang.String contentType;

    private _int.wipo.ipas.IpasServices.CDocument internalDocument;

    private _int.wipo.ipas.IpasServices.COfficedocId officeDocId;

    private java.lang.String officedocName;

    private java.lang.String officedocType;

    private java.lang.String templateFilePath;

    public COfficedoc() {
    }

    public COfficedoc(
           byte[] contentData,
           java.lang.String contentType,
           _int.wipo.ipas.IpasServices.CDocument internalDocument,
           _int.wipo.ipas.IpasServices.COfficedocId officeDocId,
           java.lang.String officedocName,
           java.lang.String officedocType,
           java.lang.String templateFilePath) {
           this.contentData = contentData;
           this.contentType = contentType;
           this.internalDocument = internalDocument;
           this.officeDocId = officeDocId;
           this.officedocName = officedocName;
           this.officedocType = officedocType;
           this.templateFilePath = templateFilePath;
    }


    /**
     * Gets the contentData value for this COfficedoc.
     * 
     * @return contentData
     */
    public byte[] getContentData() {
        return contentData;
    }


    /**
     * Sets the contentData value for this COfficedoc.
     * 
     * @param contentData
     */
    public void setContentData(byte[] contentData) {
        this.contentData = contentData;
    }


    /**
     * Gets the contentType value for this COfficedoc.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this COfficedoc.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the internalDocument value for this COfficedoc.
     * 
     * @return internalDocument
     */
    public _int.wipo.ipas.IpasServices.CDocument getInternalDocument() {
        return internalDocument;
    }


    /**
     * Sets the internalDocument value for this COfficedoc.
     * 
     * @param internalDocument
     */
    public void setInternalDocument(_int.wipo.ipas.IpasServices.CDocument internalDocument) {
        this.internalDocument = internalDocument;
    }


    /**
     * Gets the officeDocId value for this COfficedoc.
     * 
     * @return officeDocId
     */
    public _int.wipo.ipas.IpasServices.COfficedocId getOfficeDocId() {
        return officeDocId;
    }


    /**
     * Sets the officeDocId value for this COfficedoc.
     * 
     * @param officeDocId
     */
    public void setOfficeDocId(_int.wipo.ipas.IpasServices.COfficedocId officeDocId) {
        this.officeDocId = officeDocId;
    }


    /**
     * Gets the officedocName value for this COfficedoc.
     * 
     * @return officedocName
     */
    public java.lang.String getOfficedocName() {
        return officedocName;
    }


    /**
     * Sets the officedocName value for this COfficedoc.
     * 
     * @param officedocName
     */
    public void setOfficedocName(java.lang.String officedocName) {
        this.officedocName = officedocName;
    }


    /**
     * Gets the officedocType value for this COfficedoc.
     * 
     * @return officedocType
     */
    public java.lang.String getOfficedocType() {
        return officedocType;
    }


    /**
     * Sets the officedocType value for this COfficedoc.
     * 
     * @param officedocType
     */
    public void setOfficedocType(java.lang.String officedocType) {
        this.officedocType = officedocType;
    }


    /**
     * Gets the templateFilePath value for this COfficedoc.
     * 
     * @return templateFilePath
     */
    public java.lang.String getTemplateFilePath() {
        return templateFilePath;
    }


    /**
     * Sets the templateFilePath value for this COfficedoc.
     * 
     * @param templateFilePath
     */
    public void setTemplateFilePath(java.lang.String templateFilePath) {
        this.templateFilePath = templateFilePath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof COfficedoc)) return false;
        COfficedoc other = (COfficedoc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contentData==null && other.getContentData()==null) || 
             (this.contentData!=null &&
              java.util.Arrays.equals(this.contentData, other.getContentData()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.internalDocument==null && other.getInternalDocument()==null) || 
             (this.internalDocument!=null &&
              this.internalDocument.equals(other.getInternalDocument()))) &&
            ((this.officeDocId==null && other.getOfficeDocId()==null) || 
             (this.officeDocId!=null &&
              this.officeDocId.equals(other.getOfficeDocId()))) &&
            ((this.officedocName==null && other.getOfficedocName()==null) || 
             (this.officedocName!=null &&
              this.officedocName.equals(other.getOfficedocName()))) &&
            ((this.officedocType==null && other.getOfficedocType()==null) || 
             (this.officedocType!=null &&
              this.officedocType.equals(other.getOfficedocType()))) &&
            ((this.templateFilePath==null && other.getTemplateFilePath()==null) || 
             (this.templateFilePath!=null &&
              this.templateFilePath.equals(other.getTemplateFilePath())));
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
        if (getContentData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContentData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContentData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getInternalDocument() != null) {
            _hashCode += getInternalDocument().hashCode();
        }
        if (getOfficeDocId() != null) {
            _hashCode += getOfficeDocId().hashCode();
        }
        if (getOfficedocName() != null) {
            _hashCode += getOfficedocName().hashCode();
        }
        if (getOfficedocType() != null) {
            _hashCode += getOfficedocType().hashCode();
        }
        if (getTemplateFilePath() != null) {
            _hashCode += getTemplateFilePath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(COfficedoc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedoc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internalDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeDocId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officeDocId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officedocName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officedocName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("templateFilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateFilePath"));
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
