/**
 * CFileId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CFileId  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasInteger fileNbr;

    private java.lang.String fileSeq;

    private _int.wipo.ipas.IpasServices.IpasInteger fileSeries;

    private java.lang.String fileType;

    public CFileId() {
    }

    public CFileId(
           _int.wipo.ipas.IpasServices.IpasInteger fileNbr,
           java.lang.String fileSeq,
           _int.wipo.ipas.IpasServices.IpasInteger fileSeries,
           java.lang.String fileType) {
           this.fileNbr = fileNbr;
           this.fileSeq = fileSeq;
           this.fileSeries = fileSeries;
           this.fileType = fileType;
    }


    /**
     * Gets the fileNbr value for this CFileId.
     * 
     * @return fileNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getFileNbr() {
        return fileNbr;
    }


    /**
     * Sets the fileNbr value for this CFileId.
     * 
     * @param fileNbr
     */
    public void setFileNbr(_int.wipo.ipas.IpasServices.IpasInteger fileNbr) {
        this.fileNbr = fileNbr;
    }


    /**
     * Gets the fileSeq value for this CFileId.
     * 
     * @return fileSeq
     */
    public java.lang.String getFileSeq() {
        return fileSeq;
    }


    /**
     * Sets the fileSeq value for this CFileId.
     * 
     * @param fileSeq
     */
    public void setFileSeq(java.lang.String fileSeq) {
        this.fileSeq = fileSeq;
    }


    /**
     * Gets the fileSeries value for this CFileId.
     * 
     * @return fileSeries
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getFileSeries() {
        return fileSeries;
    }


    /**
     * Sets the fileSeries value for this CFileId.
     * 
     * @param fileSeries
     */
    public void setFileSeries(_int.wipo.ipas.IpasServices.IpasInteger fileSeries) {
        this.fileSeries = fileSeries;
    }


    /**
     * Gets the fileType value for this CFileId.
     * 
     * @return fileType
     */
    public java.lang.String getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this CFileId.
     * 
     * @param fileType
     */
    public void setFileType(java.lang.String fileType) {
        this.fileType = fileType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CFileId)) return false;
        CFileId other = (CFileId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileNbr==null && other.getFileNbr()==null) || 
             (this.fileNbr!=null &&
              this.fileNbr.equals(other.getFileNbr()))) &&
            ((this.fileSeq==null && other.getFileSeq()==null) || 
             (this.fileSeq!=null &&
              this.fileSeq.equals(other.getFileSeq()))) &&
            ((this.fileSeries==null && other.getFileSeries()==null) || 
             (this.fileSeries!=null &&
              this.fileSeries.equals(other.getFileSeries()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType())));
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
        if (getFileNbr() != null) {
            _hashCode += getFileNbr().hashCode();
        }
        if (getFileSeq() != null) {
            _hashCode += getFileSeq().hashCode();
        }
        if (getFileSeries() != null) {
            _hashCode += getFileSeries().hashCode();
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CFileId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileType"));
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
