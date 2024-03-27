/**
 * CFileSectionId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CFileSectionId  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CFileId fileId;

    private _int.wipo.ipas.IpasServices.IpasInteger fileSectionNbr;

    public CFileSectionId() {
    }

    public CFileSectionId(
           _int.wipo.ipas.IpasServices.CFileId fileId,
           _int.wipo.ipas.IpasServices.IpasInteger fileSectionNbr) {
           this.fileId = fileId;
           this.fileSectionNbr = fileSectionNbr;
    }


    /**
     * Gets the fileId value for this CFileSectionId.
     * 
     * @return fileId
     */
    public _int.wipo.ipas.IpasServices.CFileId getFileId() {
        return fileId;
    }


    /**
     * Sets the fileId value for this CFileSectionId.
     * 
     * @param fileId
     */
    public void setFileId(_int.wipo.ipas.IpasServices.CFileId fileId) {
        this.fileId = fileId;
    }


    /**
     * Gets the fileSectionNbr value for this CFileSectionId.
     * 
     * @return fileSectionNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getFileSectionNbr() {
        return fileSectionNbr;
    }


    /**
     * Sets the fileSectionNbr value for this CFileSectionId.
     * 
     * @param fileSectionNbr
     */
    public void setFileSectionNbr(_int.wipo.ipas.IpasServices.IpasInteger fileSectionNbr) {
        this.fileSectionNbr = fileSectionNbr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CFileSectionId)) return false;
        CFileSectionId other = (CFileSectionId) obj;
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
            ((this.fileSectionNbr==null && other.getFileSectionNbr()==null) || 
             (this.fileSectionNbr!=null &&
              this.fileSectionNbr.equals(other.getFileSectionNbr())));
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
        if (getFileSectionNbr() != null) {
            _hashCode += getFileSectionNbr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CFileSectionId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileSectionId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSectionNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSectionNbr"));
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
