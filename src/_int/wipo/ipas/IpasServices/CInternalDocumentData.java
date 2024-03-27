/**
 * CInternalDocumentData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CInternalDocumentData  implements java.io.Serializable {
    private java.lang.String description;

    private _int.wipo.ipas.IpasServices.COfficedocId offidocId;

    private _int.wipo.ipas.IpasServices.IpasInteger refNo;

    public CInternalDocumentData() {
    }

    public CInternalDocumentData(
           java.lang.String description,
           _int.wipo.ipas.IpasServices.COfficedocId offidocId,
           _int.wipo.ipas.IpasServices.IpasInteger refNo) {
           this.description = description;
           this.offidocId = offidocId;
           this.refNo = refNo;
    }


    /**
     * Gets the description value for this CInternalDocumentData.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CInternalDocumentData.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the offidocId value for this CInternalDocumentData.
     * 
     * @return offidocId
     */
    public _int.wipo.ipas.IpasServices.COfficedocId getOffidocId() {
        return offidocId;
    }


    /**
     * Sets the offidocId value for this CInternalDocumentData.
     * 
     * @param offidocId
     */
    public void setOffidocId(_int.wipo.ipas.IpasServices.COfficedocId offidocId) {
        this.offidocId = offidocId;
    }


    /**
     * Gets the refNo value for this CInternalDocumentData.
     * 
     * @return refNo
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getRefNo() {
        return refNo;
    }


    /**
     * Sets the refNo value for this CInternalDocumentData.
     * 
     * @param refNo
     */
    public void setRefNo(_int.wipo.ipas.IpasServices.IpasInteger refNo) {
        this.refNo = refNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CInternalDocumentData)) return false;
        CInternalDocumentData other = (CInternalDocumentData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.offidocId==null && other.getOffidocId()==null) || 
             (this.offidocId!=null &&
              this.offidocId.equals(other.getOffidocId()))) &&
            ((this.refNo==null && other.getRefNo()==null) || 
             (this.refNo!=null &&
              this.refNo.equals(other.getRefNo())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getOffidocId() != null) {
            _hashCode += getOffidocId().hashCode();
        }
        if (getRefNo() != null) {
            _hashCode += getRefNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CInternalDocumentData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cInternalDocumentData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offidocId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offidocId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refNo"));
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
