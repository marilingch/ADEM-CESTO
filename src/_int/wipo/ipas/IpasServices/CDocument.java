/**
 * CDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CDocument  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CDocumentEdmsData documentEdmsData;

    private _int.wipo.ipas.IpasServices.CDocumentId documentId;

    private _int.wipo.ipas.IpasServices.CDocumentSeqId documentSeqId;

    private java.lang.String externalSystemId;

    private _int.wipo.ipas.IpasServices.CExtraData extraData;

    private _int.wipo.ipas.IpasServices.CReceipt[] inputDocumentData;

    private _int.wipo.ipas.IpasServices.CInternalDocumentData internalDocumentData;

    private _int.wipo.ipas.IpasServices.COutputDocumentData outputDocumentData;

    private _int.wipo.ipas.IpasServices.IpasInteger qtyPages;

    public CDocument() {
    }

    public CDocument(
           _int.wipo.ipas.IpasServices.CDocumentEdmsData documentEdmsData,
           _int.wipo.ipas.IpasServices.CDocumentId documentId,
           _int.wipo.ipas.IpasServices.CDocumentSeqId documentSeqId,
           java.lang.String externalSystemId,
           _int.wipo.ipas.IpasServices.CExtraData extraData,
           _int.wipo.ipas.IpasServices.CReceipt[] inputDocumentData,
           _int.wipo.ipas.IpasServices.CInternalDocumentData internalDocumentData,
           _int.wipo.ipas.IpasServices.COutputDocumentData outputDocumentData,
           _int.wipo.ipas.IpasServices.IpasInteger qtyPages) {
           this.documentEdmsData = documentEdmsData;
           this.documentId = documentId;
           this.documentSeqId = documentSeqId;
           this.externalSystemId = externalSystemId;
           this.extraData = extraData;
           this.inputDocumentData = inputDocumentData;
           this.internalDocumentData = internalDocumentData;
           this.outputDocumentData = outputDocumentData;
           this.qtyPages = qtyPages;
    }


    /**
     * Gets the documentEdmsData value for this CDocument.
     * 
     * @return documentEdmsData
     */
    public _int.wipo.ipas.IpasServices.CDocumentEdmsData getDocumentEdmsData() {
        return documentEdmsData;
    }


    /**
     * Sets the documentEdmsData value for this CDocument.
     * 
     * @param documentEdmsData
     */
    public void setDocumentEdmsData(_int.wipo.ipas.IpasServices.CDocumentEdmsData documentEdmsData) {
        this.documentEdmsData = documentEdmsData;
    }


    /**
     * Gets the documentId value for this CDocument.
     * 
     * @return documentId
     */
    public _int.wipo.ipas.IpasServices.CDocumentId getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this CDocument.
     * 
     * @param documentId
     */
    public void setDocumentId(_int.wipo.ipas.IpasServices.CDocumentId documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the documentSeqId value for this CDocument.
     * 
     * @return documentSeqId
     */
    public _int.wipo.ipas.IpasServices.CDocumentSeqId getDocumentSeqId() {
        return documentSeqId;
    }


    /**
     * Sets the documentSeqId value for this CDocument.
     * 
     * @param documentSeqId
     */
    public void setDocumentSeqId(_int.wipo.ipas.IpasServices.CDocumentSeqId documentSeqId) {
        this.documentSeqId = documentSeqId;
    }


    /**
     * Gets the externalSystemId value for this CDocument.
     * 
     * @return externalSystemId
     */
    public java.lang.String getExternalSystemId() {
        return externalSystemId;
    }


    /**
     * Sets the externalSystemId value for this CDocument.
     * 
     * @param externalSystemId
     */
    public void setExternalSystemId(java.lang.String externalSystemId) {
        this.externalSystemId = externalSystemId;
    }


    /**
     * Gets the extraData value for this CDocument.
     * 
     * @return extraData
     */
    public _int.wipo.ipas.IpasServices.CExtraData getExtraData() {
        return extraData;
    }


    /**
     * Sets the extraData value for this CDocument.
     * 
     * @param extraData
     */
    public void setExtraData(_int.wipo.ipas.IpasServices.CExtraData extraData) {
        this.extraData = extraData;
    }


    /**
     * Gets the inputDocumentData value for this CDocument.
     * 
     * @return inputDocumentData
     */
    public _int.wipo.ipas.IpasServices.CReceipt[] getInputDocumentData() {
        return inputDocumentData;
    }


    /**
     * Sets the inputDocumentData value for this CDocument.
     * 
     * @param inputDocumentData
     */
    public void setInputDocumentData(_int.wipo.ipas.IpasServices.CReceipt[] inputDocumentData) {
        this.inputDocumentData = inputDocumentData;
    }


    /**
     * Gets the internalDocumentData value for this CDocument.
     * 
     * @return internalDocumentData
     */
    public _int.wipo.ipas.IpasServices.CInternalDocumentData getInternalDocumentData() {
        return internalDocumentData;
    }


    /**
     * Sets the internalDocumentData value for this CDocument.
     * 
     * @param internalDocumentData
     */
    public void setInternalDocumentData(_int.wipo.ipas.IpasServices.CInternalDocumentData internalDocumentData) {
        this.internalDocumentData = internalDocumentData;
    }


    /**
     * Gets the outputDocumentData value for this CDocument.
     * 
     * @return outputDocumentData
     */
    public _int.wipo.ipas.IpasServices.COutputDocumentData getOutputDocumentData() {
        return outputDocumentData;
    }


    /**
     * Sets the outputDocumentData value for this CDocument.
     * 
     * @param outputDocumentData
     */
    public void setOutputDocumentData(_int.wipo.ipas.IpasServices.COutputDocumentData outputDocumentData) {
        this.outputDocumentData = outputDocumentData;
    }


    /**
     * Gets the qtyPages value for this CDocument.
     * 
     * @return qtyPages
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getQtyPages() {
        return qtyPages;
    }


    /**
     * Sets the qtyPages value for this CDocument.
     * 
     * @param qtyPages
     */
    public void setQtyPages(_int.wipo.ipas.IpasServices.IpasInteger qtyPages) {
        this.qtyPages = qtyPages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDocument)) return false;
        CDocument other = (CDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentEdmsData==null && other.getDocumentEdmsData()==null) || 
             (this.documentEdmsData!=null &&
              this.documentEdmsData.equals(other.getDocumentEdmsData()))) &&
            ((this.documentId==null && other.getDocumentId()==null) || 
             (this.documentId!=null &&
              this.documentId.equals(other.getDocumentId()))) &&
            ((this.documentSeqId==null && other.getDocumentSeqId()==null) || 
             (this.documentSeqId!=null &&
              this.documentSeqId.equals(other.getDocumentSeqId()))) &&
            ((this.externalSystemId==null && other.getExternalSystemId()==null) || 
             (this.externalSystemId!=null &&
              this.externalSystemId.equals(other.getExternalSystemId()))) &&
            ((this.extraData==null && other.getExtraData()==null) || 
             (this.extraData!=null &&
              this.extraData.equals(other.getExtraData()))) &&
            ((this.inputDocumentData==null && other.getInputDocumentData()==null) || 
             (this.inputDocumentData!=null &&
              java.util.Arrays.equals(this.inputDocumentData, other.getInputDocumentData()))) &&
            ((this.internalDocumentData==null && other.getInternalDocumentData()==null) || 
             (this.internalDocumentData!=null &&
              this.internalDocumentData.equals(other.getInternalDocumentData()))) &&
            ((this.outputDocumentData==null && other.getOutputDocumentData()==null) || 
             (this.outputDocumentData!=null &&
              this.outputDocumentData.equals(other.getOutputDocumentData()))) &&
            ((this.qtyPages==null && other.getQtyPages()==null) || 
             (this.qtyPages!=null &&
              this.qtyPages.equals(other.getQtyPages())));
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
        if (getDocumentEdmsData() != null) {
            _hashCode += getDocumentEdmsData().hashCode();
        }
        if (getDocumentId() != null) {
            _hashCode += getDocumentId().hashCode();
        }
        if (getDocumentSeqId() != null) {
            _hashCode += getDocumentSeqId().hashCode();
        }
        if (getExternalSystemId() != null) {
            _hashCode += getExternalSystemId().hashCode();
        }
        if (getExtraData() != null) {
            _hashCode += getExtraData().hashCode();
        }
        if (getInputDocumentData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInputDocumentData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInputDocumentData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalDocumentData() != null) {
            _hashCode += getInternalDocumentData().hashCode();
        }
        if (getOutputDocumentData() != null) {
            _hashCode += getOutputDocumentData().hashCode();
        }
        if (getQtyPages() != null) {
            _hashCode += getQtyPages().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentEdmsData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentEdmsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentEdmsData"));
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
        elemField.setFieldName("documentSeqId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentSeqId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentSeqId"));
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
        elemField.setFieldName("extraData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extraData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cExtraData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputDocumentData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputDocumentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cReceipt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "receiptList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalDocumentData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internalDocumentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cInternalDocumentData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputDocumentData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outputDocumentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputDocumentData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtyPages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qtyPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
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
