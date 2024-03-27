/**
 * CDocumentId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CDocumentId  implements java.io.Serializable {
    private java.lang.String docLog;

    private _int.wipo.ipas.IpasServices.IpasInteger docNbr;

    private java.lang.String docOrigin;

    private _int.wipo.ipas.IpasServices.IpasInteger docSeries;

    private java.lang.String selected;

    public CDocumentId() {
    }

    public CDocumentId(
           java.lang.String docLog,
           _int.wipo.ipas.IpasServices.IpasInteger docNbr,
           java.lang.String docOrigin,
           _int.wipo.ipas.IpasServices.IpasInteger docSeries,
           java.lang.String selected) {
           this.docLog = docLog;
           this.docNbr = docNbr;
           this.docOrigin = docOrigin;
           this.docSeries = docSeries;
           this.selected = selected;
    }


    /**
     * Gets the docLog value for this CDocumentId.
     * 
     * @return docLog
     */
    public java.lang.String getDocLog() {
        return docLog;
    }


    /**
     * Sets the docLog value for this CDocumentId.
     * 
     * @param docLog
     */
    public void setDocLog(java.lang.String docLog) {
        this.docLog = docLog;
    }


    /**
     * Gets the docNbr value for this CDocumentId.
     * 
     * @return docNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDocNbr() {
        return docNbr;
    }


    /**
     * Sets the docNbr value for this CDocumentId.
     * 
     * @param docNbr
     */
    public void setDocNbr(_int.wipo.ipas.IpasServices.IpasInteger docNbr) {
        this.docNbr = docNbr;
    }


    /**
     * Gets the docOrigin value for this CDocumentId.
     * 
     * @return docOrigin
     */
    public java.lang.String getDocOrigin() {
        return docOrigin;
    }


    /**
     * Sets the docOrigin value for this CDocumentId.
     * 
     * @param docOrigin
     */
    public void setDocOrigin(java.lang.String docOrigin) {
        this.docOrigin = docOrigin;
    }


    /**
     * Gets the docSeries value for this CDocumentId.
     * 
     * @return docSeries
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDocSeries() {
        return docSeries;
    }


    /**
     * Sets the docSeries value for this CDocumentId.
     * 
     * @param docSeries
     */
    public void setDocSeries(_int.wipo.ipas.IpasServices.IpasInteger docSeries) {
        this.docSeries = docSeries;
    }


    /**
     * Gets the selected value for this CDocumentId.
     * 
     * @return selected
     */
    public java.lang.String getSelected() {
        return selected;
    }


    /**
     * Sets the selected value for this CDocumentId.
     * 
     * @param selected
     */
    public void setSelected(java.lang.String selected) {
        this.selected = selected;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDocumentId)) return false;
        CDocumentId other = (CDocumentId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docLog==null && other.getDocLog()==null) || 
             (this.docLog!=null &&
              this.docLog.equals(other.getDocLog()))) &&
            ((this.docNbr==null && other.getDocNbr()==null) || 
             (this.docNbr!=null &&
              this.docNbr.equals(other.getDocNbr()))) &&
            ((this.docOrigin==null && other.getDocOrigin()==null) || 
             (this.docOrigin!=null &&
              this.docOrigin.equals(other.getDocOrigin()))) &&
            ((this.docSeries==null && other.getDocSeries()==null) || 
             (this.docSeries!=null &&
              this.docSeries.equals(other.getDocSeries()))) &&
            ((this.selected==null && other.getSelected()==null) || 
             (this.selected!=null &&
              this.selected.equals(other.getSelected())));
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
        if (getDocLog() != null) {
            _hashCode += getDocLog().hashCode();
        }
        if (getDocNbr() != null) {
            _hashCode += getDocNbr().hashCode();
        }
        if (getDocOrigin() != null) {
            _hashCode += getDocOrigin().hashCode();
        }
        if (getDocSeries() != null) {
            _hashCode += getDocSeries().hashCode();
        }
        if (getSelected() != null) {
            _hashCode += getSelected().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDocumentId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docLog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docNbr"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selected"));
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
