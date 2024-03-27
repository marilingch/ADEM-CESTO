/**
 * CDocumentSeqId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CDocumentSeqId  implements java.io.Serializable {
    private java.lang.String docSeqName;

    private _int.wipo.ipas.IpasServices.IpasInteger docSeqNbr;

    private _int.wipo.ipas.IpasServices.IpasInteger docSeqSeries;

    private java.lang.String docSeqType;

    public CDocumentSeqId() {
    }

    public CDocumentSeqId(
           java.lang.String docSeqName,
           _int.wipo.ipas.IpasServices.IpasInteger docSeqNbr,
           _int.wipo.ipas.IpasServices.IpasInteger docSeqSeries,
           java.lang.String docSeqType) {
           this.docSeqName = docSeqName;
           this.docSeqNbr = docSeqNbr;
           this.docSeqSeries = docSeqSeries;
           this.docSeqType = docSeqType;
    }


    /**
     * Gets the docSeqName value for this CDocumentSeqId.
     * 
     * @return docSeqName
     */
    public java.lang.String getDocSeqName() {
        return docSeqName;
    }


    /**
     * Sets the docSeqName value for this CDocumentSeqId.
     * 
     * @param docSeqName
     */
    public void setDocSeqName(java.lang.String docSeqName) {
        this.docSeqName = docSeqName;
    }


    /**
     * Gets the docSeqNbr value for this CDocumentSeqId.
     * 
     * @return docSeqNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDocSeqNbr() {
        return docSeqNbr;
    }


    /**
     * Sets the docSeqNbr value for this CDocumentSeqId.
     * 
     * @param docSeqNbr
     */
    public void setDocSeqNbr(_int.wipo.ipas.IpasServices.IpasInteger docSeqNbr) {
        this.docSeqNbr = docSeqNbr;
    }


    /**
     * Gets the docSeqSeries value for this CDocumentSeqId.
     * 
     * @return docSeqSeries
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDocSeqSeries() {
        return docSeqSeries;
    }


    /**
     * Sets the docSeqSeries value for this CDocumentSeqId.
     * 
     * @param docSeqSeries
     */
    public void setDocSeqSeries(_int.wipo.ipas.IpasServices.IpasInteger docSeqSeries) {
        this.docSeqSeries = docSeqSeries;
    }


    /**
     * Gets the docSeqType value for this CDocumentSeqId.
     * 
     * @return docSeqType
     */
    public java.lang.String getDocSeqType() {
        return docSeqType;
    }


    /**
     * Sets the docSeqType value for this CDocumentSeqId.
     * 
     * @param docSeqType
     */
    public void setDocSeqType(java.lang.String docSeqType) {
        this.docSeqType = docSeqType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDocumentSeqId)) return false;
        CDocumentSeqId other = (CDocumentSeqId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docSeqName==null && other.getDocSeqName()==null) || 
             (this.docSeqName!=null &&
              this.docSeqName.equals(other.getDocSeqName()))) &&
            ((this.docSeqNbr==null && other.getDocSeqNbr()==null) || 
             (this.docSeqNbr!=null &&
              this.docSeqNbr.equals(other.getDocSeqNbr()))) &&
            ((this.docSeqSeries==null && other.getDocSeqSeries()==null) || 
             (this.docSeqSeries!=null &&
              this.docSeqSeries.equals(other.getDocSeqSeries()))) &&
            ((this.docSeqType==null && other.getDocSeqType()==null) || 
             (this.docSeqType!=null &&
              this.docSeqType.equals(other.getDocSeqType())));
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
        if (getDocSeqName() != null) {
            _hashCode += getDocSeqName().hashCode();
        }
        if (getDocSeqNbr() != null) {
            _hashCode += getDocSeqNbr().hashCode();
        }
        if (getDocSeqSeries() != null) {
            _hashCode += getDocSeqSeries().hashCode();
        }
        if (getDocSeqType() != null) {
            _hashCode += getDocSeqType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDocumentSeqId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentSeqId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docSeqName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docSeqName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docSeqNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docSeqNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docSeqSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docSeqSeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docSeqType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docSeqType"));
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
