/**
 * CCriteriaDocumentId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaDocumentId  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasInteger docNbrFrom;

    private _int.wipo.ipas.IpasServices.IpasInteger docNbrTo;

    private java.lang.String docOrigin;

    private _int.wipo.ipas.IpasServices.IpasInteger docSeries;

    public CCriteriaDocumentId() {
    }

    public CCriteriaDocumentId(
           _int.wipo.ipas.IpasServices.IpasInteger docNbrFrom,
           _int.wipo.ipas.IpasServices.IpasInteger docNbrTo,
           java.lang.String docOrigin,
           _int.wipo.ipas.IpasServices.IpasInteger docSeries) {
           this.docNbrFrom = docNbrFrom;
           this.docNbrTo = docNbrTo;
           this.docOrigin = docOrigin;
           this.docSeries = docSeries;
    }


    /**
     * Gets the docNbrFrom value for this CCriteriaDocumentId.
     * 
     * @return docNbrFrom
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDocNbrFrom() {
        return docNbrFrom;
    }


    /**
     * Sets the docNbrFrom value for this CCriteriaDocumentId.
     * 
     * @param docNbrFrom
     */
    public void setDocNbrFrom(_int.wipo.ipas.IpasServices.IpasInteger docNbrFrom) {
        this.docNbrFrom = docNbrFrom;
    }


    /**
     * Gets the docNbrTo value for this CCriteriaDocumentId.
     * 
     * @return docNbrTo
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDocNbrTo() {
        return docNbrTo;
    }


    /**
     * Sets the docNbrTo value for this CCriteriaDocumentId.
     * 
     * @param docNbrTo
     */
    public void setDocNbrTo(_int.wipo.ipas.IpasServices.IpasInteger docNbrTo) {
        this.docNbrTo = docNbrTo;
    }


    /**
     * Gets the docOrigin value for this CCriteriaDocumentId.
     * 
     * @return docOrigin
     */
    public java.lang.String getDocOrigin() {
        return docOrigin;
    }


    /**
     * Sets the docOrigin value for this CCriteriaDocumentId.
     * 
     * @param docOrigin
     */
    public void setDocOrigin(java.lang.String docOrigin) {
        this.docOrigin = docOrigin;
    }


    /**
     * Gets the docSeries value for this CCriteriaDocumentId.
     * 
     * @return docSeries
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDocSeries() {
        return docSeries;
    }


    /**
     * Sets the docSeries value for this CCriteriaDocumentId.
     * 
     * @param docSeries
     */
    public void setDocSeries(_int.wipo.ipas.IpasServices.IpasInteger docSeries) {
        this.docSeries = docSeries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaDocumentId)) return false;
        CCriteriaDocumentId other = (CCriteriaDocumentId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docNbrFrom==null && other.getDocNbrFrom()==null) || 
             (this.docNbrFrom!=null &&
              this.docNbrFrom.equals(other.getDocNbrFrom()))) &&
            ((this.docNbrTo==null && other.getDocNbrTo()==null) || 
             (this.docNbrTo!=null &&
              this.docNbrTo.equals(other.getDocNbrTo()))) &&
            ((this.docOrigin==null && other.getDocOrigin()==null) || 
             (this.docOrigin!=null &&
              this.docOrigin.equals(other.getDocOrigin()))) &&
            ((this.docSeries==null && other.getDocSeries()==null) || 
             (this.docSeries!=null &&
              this.docSeries.equals(other.getDocSeries())));
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
        if (getDocNbrFrom() != null) {
            _hashCode += getDocNbrFrom().hashCode();
        }
        if (getDocNbrTo() != null) {
            _hashCode += getDocNbrTo().hashCode();
        }
        if (getDocOrigin() != null) {
            _hashCode += getDocOrigin().hashCode();
        }
        if (getDocSeries() != null) {
            _hashCode += getDocSeries().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaDocumentId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaDocumentId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docNbrFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docNbrFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docNbrTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docNbrTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docSeries"));
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
