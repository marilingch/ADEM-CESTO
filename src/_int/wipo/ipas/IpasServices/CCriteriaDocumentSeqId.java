/**
 * CCriteriaDocumentSeqId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaDocumentSeqId  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasInteger docSeqNbrFrom;

    private _int.wipo.ipas.IpasServices.IpasInteger docSeqNbrTo;

    private _int.wipo.ipas.IpasServices.IpasInteger docSeqSeries;

    private java.lang.String docSeqType;

    public CCriteriaDocumentSeqId() {
    }

    public CCriteriaDocumentSeqId(
           _int.wipo.ipas.IpasServices.IpasInteger docSeqNbrFrom,
           _int.wipo.ipas.IpasServices.IpasInteger docSeqNbrTo,
           _int.wipo.ipas.IpasServices.IpasInteger docSeqSeries,
           java.lang.String docSeqType) {
           this.docSeqNbrFrom = docSeqNbrFrom;
           this.docSeqNbrTo = docSeqNbrTo;
           this.docSeqSeries = docSeqSeries;
           this.docSeqType = docSeqType;
    }


    /**
     * Gets the docSeqNbrFrom value for this CCriteriaDocumentSeqId.
     * 
     * @return docSeqNbrFrom
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDocSeqNbrFrom() {
        return docSeqNbrFrom;
    }


    /**
     * Sets the docSeqNbrFrom value for this CCriteriaDocumentSeqId.
     * 
     * @param docSeqNbrFrom
     */
    public void setDocSeqNbrFrom(_int.wipo.ipas.IpasServices.IpasInteger docSeqNbrFrom) {
        this.docSeqNbrFrom = docSeqNbrFrom;
    }


    /**
     * Gets the docSeqNbrTo value for this CCriteriaDocumentSeqId.
     * 
     * @return docSeqNbrTo
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDocSeqNbrTo() {
        return docSeqNbrTo;
    }


    /**
     * Sets the docSeqNbrTo value for this CCriteriaDocumentSeqId.
     * 
     * @param docSeqNbrTo
     */
    public void setDocSeqNbrTo(_int.wipo.ipas.IpasServices.IpasInteger docSeqNbrTo) {
        this.docSeqNbrTo = docSeqNbrTo;
    }


    /**
     * Gets the docSeqSeries value for this CCriteriaDocumentSeqId.
     * 
     * @return docSeqSeries
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDocSeqSeries() {
        return docSeqSeries;
    }


    /**
     * Sets the docSeqSeries value for this CCriteriaDocumentSeqId.
     * 
     * @param docSeqSeries
     */
    public void setDocSeqSeries(_int.wipo.ipas.IpasServices.IpasInteger docSeqSeries) {
        this.docSeqSeries = docSeqSeries;
    }


    /**
     * Gets the docSeqType value for this CCriteriaDocumentSeqId.
     * 
     * @return docSeqType
     */
    public java.lang.String getDocSeqType() {
        return docSeqType;
    }


    /**
     * Sets the docSeqType value for this CCriteriaDocumentSeqId.
     * 
     * @param docSeqType
     */
    public void setDocSeqType(java.lang.String docSeqType) {
        this.docSeqType = docSeqType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaDocumentSeqId)) return false;
        CCriteriaDocumentSeqId other = (CCriteriaDocumentSeqId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docSeqNbrFrom==null && other.getDocSeqNbrFrom()==null) || 
             (this.docSeqNbrFrom!=null &&
              this.docSeqNbrFrom.equals(other.getDocSeqNbrFrom()))) &&
            ((this.docSeqNbrTo==null && other.getDocSeqNbrTo()==null) || 
             (this.docSeqNbrTo!=null &&
              this.docSeqNbrTo.equals(other.getDocSeqNbrTo()))) &&
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
        if (getDocSeqNbrFrom() != null) {
            _hashCode += getDocSeqNbrFrom().hashCode();
        }
        if (getDocSeqNbrTo() != null) {
            _hashCode += getDocSeqNbrTo().hashCode();
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
        new org.apache.axis.description.TypeDesc(CCriteriaDocumentSeqId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaDocumentSeqId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docSeqNbrFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docSeqNbrFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docSeqNbrTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docSeqNbrTo"));
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
