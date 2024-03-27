/**
 * CMarkSimilarity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CMarkSimilarity  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CFileId fileId;

    private java.lang.Boolean indDiscarded;

    private java.lang.Boolean indSelected;

    private _int.wipo.ipas.IpasServices.IpasInteger similarityOriginCode;

    private _int.wipo.ipas.IpasServices.IpasInteger similarityPercent;

    public CMarkSimilarity() {
    }

    public CMarkSimilarity(
           _int.wipo.ipas.IpasServices.CFileId fileId,
           java.lang.Boolean indDiscarded,
           java.lang.Boolean indSelected,
           _int.wipo.ipas.IpasServices.IpasInteger similarityOriginCode,
           _int.wipo.ipas.IpasServices.IpasInteger similarityPercent) {
           this.fileId = fileId;
           this.indDiscarded = indDiscarded;
           this.indSelected = indSelected;
           this.similarityOriginCode = similarityOriginCode;
           this.similarityPercent = similarityPercent;
    }


    /**
     * Gets the fileId value for this CMarkSimilarity.
     * 
     * @return fileId
     */
    public _int.wipo.ipas.IpasServices.CFileId getFileId() {
        return fileId;
    }


    /**
     * Sets the fileId value for this CMarkSimilarity.
     * 
     * @param fileId
     */
    public void setFileId(_int.wipo.ipas.IpasServices.CFileId fileId) {
        this.fileId = fileId;
    }


    /**
     * Gets the indDiscarded value for this CMarkSimilarity.
     * 
     * @return indDiscarded
     */
    public java.lang.Boolean getIndDiscarded() {
        return indDiscarded;
    }


    /**
     * Sets the indDiscarded value for this CMarkSimilarity.
     * 
     * @param indDiscarded
     */
    public void setIndDiscarded(java.lang.Boolean indDiscarded) {
        this.indDiscarded = indDiscarded;
    }


    /**
     * Gets the indSelected value for this CMarkSimilarity.
     * 
     * @return indSelected
     */
    public java.lang.Boolean getIndSelected() {
        return indSelected;
    }


    /**
     * Sets the indSelected value for this CMarkSimilarity.
     * 
     * @param indSelected
     */
    public void setIndSelected(java.lang.Boolean indSelected) {
        this.indSelected = indSelected;
    }


    /**
     * Gets the similarityOriginCode value for this CMarkSimilarity.
     * 
     * @return similarityOriginCode
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getSimilarityOriginCode() {
        return similarityOriginCode;
    }


    /**
     * Sets the similarityOriginCode value for this CMarkSimilarity.
     * 
     * @param similarityOriginCode
     */
    public void setSimilarityOriginCode(_int.wipo.ipas.IpasServices.IpasInteger similarityOriginCode) {
        this.similarityOriginCode = similarityOriginCode;
    }


    /**
     * Gets the similarityPercent value for this CMarkSimilarity.
     * 
     * @return similarityPercent
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getSimilarityPercent() {
        return similarityPercent;
    }


    /**
     * Sets the similarityPercent value for this CMarkSimilarity.
     * 
     * @param similarityPercent
     */
    public void setSimilarityPercent(_int.wipo.ipas.IpasServices.IpasInteger similarityPercent) {
        this.similarityPercent = similarityPercent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CMarkSimilarity)) return false;
        CMarkSimilarity other = (CMarkSimilarity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileId==null && other.getFileId()==null) || 
             (this.fileId!=null &&
              this.fileId.equals(other.getFileId()))) &&
            ((this.indDiscarded==null && other.getIndDiscarded()==null) || 
             (this.indDiscarded!=null &&
              this.indDiscarded.equals(other.getIndDiscarded()))) &&
            ((this.indSelected==null && other.getIndSelected()==null) || 
             (this.indSelected!=null &&
              this.indSelected.equals(other.getIndSelected()))) &&
            ((this.similarityOriginCode==null && other.getSimilarityOriginCode()==null) || 
             (this.similarityOriginCode!=null &&
              this.similarityOriginCode.equals(other.getSimilarityOriginCode()))) &&
            ((this.similarityPercent==null && other.getSimilarityPercent()==null) || 
             (this.similarityPercent!=null &&
              this.similarityPercent.equals(other.getSimilarityPercent())));
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
        if (getFileId() != null) {
            _hashCode += getFileId().hashCode();
        }
        if (getIndDiscarded() != null) {
            _hashCode += getIndDiscarded().hashCode();
        }
        if (getIndSelected() != null) {
            _hashCode += getIndSelected().hashCode();
        }
        if (getSimilarityOriginCode() != null) {
            _hashCode += getSimilarityOriginCode().hashCode();
        }
        if (getSimilarityPercent() != null) {
            _hashCode += getSimilarityPercent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CMarkSimilarity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMarkSimilarity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indDiscarded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indDiscarded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indSelected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indSelected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("similarityOriginCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "similarityOriginCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("similarityPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "similarityPercent"));
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
