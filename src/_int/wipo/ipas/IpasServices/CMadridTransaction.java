/**
 * CMadridTransaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CMadridTransaction  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasInteger docId;

    private java.lang.String docType;

    private byte[] docXml;

    private _int.wipo.ipas.IpasServices.IpasDateTime notificationDate;

    private _int.wipo.ipas.IpasServices.IpasDateTime registrationEffectiveDate;

    public CMadridTransaction() {
    }

    public CMadridTransaction(
           _int.wipo.ipas.IpasServices.IpasInteger docId,
           java.lang.String docType,
           byte[] docXml,
           _int.wipo.ipas.IpasServices.IpasDateTime notificationDate,
           _int.wipo.ipas.IpasServices.IpasDateTime registrationEffectiveDate) {
           this.docId = docId;
           this.docType = docType;
           this.docXml = docXml;
           this.notificationDate = notificationDate;
           this.registrationEffectiveDate = registrationEffectiveDate;
    }


    /**
     * Gets the docId value for this CMadridTransaction.
     * 
     * @return docId
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDocId() {
        return docId;
    }


    /**
     * Sets the docId value for this CMadridTransaction.
     * 
     * @param docId
     */
    public void setDocId(_int.wipo.ipas.IpasServices.IpasInteger docId) {
        this.docId = docId;
    }


    /**
     * Gets the docType value for this CMadridTransaction.
     * 
     * @return docType
     */
    public java.lang.String getDocType() {
        return docType;
    }


    /**
     * Sets the docType value for this CMadridTransaction.
     * 
     * @param docType
     */
    public void setDocType(java.lang.String docType) {
        this.docType = docType;
    }


    /**
     * Gets the docXml value for this CMadridTransaction.
     * 
     * @return docXml
     */
    public byte[] getDocXml() {
        return docXml;
    }


    /**
     * Sets the docXml value for this CMadridTransaction.
     * 
     * @param docXml
     */
    public void setDocXml(byte[] docXml) {
        this.docXml = docXml;
    }


    /**
     * Gets the notificationDate value for this CMadridTransaction.
     * 
     * @return notificationDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getNotificationDate() {
        return notificationDate;
    }


    /**
     * Sets the notificationDate value for this CMadridTransaction.
     * 
     * @param notificationDate
     */
    public void setNotificationDate(_int.wipo.ipas.IpasServices.IpasDateTime notificationDate) {
        this.notificationDate = notificationDate;
    }


    /**
     * Gets the registrationEffectiveDate value for this CMadridTransaction.
     * 
     * @return registrationEffectiveDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getRegistrationEffectiveDate() {
        return registrationEffectiveDate;
    }


    /**
     * Sets the registrationEffectiveDate value for this CMadridTransaction.
     * 
     * @param registrationEffectiveDate
     */
    public void setRegistrationEffectiveDate(_int.wipo.ipas.IpasServices.IpasDateTime registrationEffectiveDate) {
        this.registrationEffectiveDate = registrationEffectiveDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CMadridTransaction)) return false;
        CMadridTransaction other = (CMadridTransaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docId==null && other.getDocId()==null) || 
             (this.docId!=null &&
              this.docId.equals(other.getDocId()))) &&
            ((this.docType==null && other.getDocType()==null) || 
             (this.docType!=null &&
              this.docType.equals(other.getDocType()))) &&
            ((this.docXml==null && other.getDocXml()==null) || 
             (this.docXml!=null &&
              java.util.Arrays.equals(this.docXml, other.getDocXml()))) &&
            ((this.notificationDate==null && other.getNotificationDate()==null) || 
             (this.notificationDate!=null &&
              this.notificationDate.equals(other.getNotificationDate()))) &&
            ((this.registrationEffectiveDate==null && other.getRegistrationEffectiveDate()==null) || 
             (this.registrationEffectiveDate!=null &&
              this.registrationEffectiveDate.equals(other.getRegistrationEffectiveDate())));
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
        if (getDocId() != null) {
            _hashCode += getDocId().hashCode();
        }
        if (getDocType() != null) {
            _hashCode += getDocType().hashCode();
        }
        if (getDocXml() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocXml());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocXml(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNotificationDate() != null) {
            _hashCode += getNotificationDate().hashCode();
        }
        if (getRegistrationEffectiveDate() != null) {
            _hashCode += getRegistrationEffectiveDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CMadridTransaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMadridTransaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docXml");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notificationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrationEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
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
