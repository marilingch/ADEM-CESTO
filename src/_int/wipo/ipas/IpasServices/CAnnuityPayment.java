/**
 * CAnnuityPayment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CAnnuityPayment  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasInteger annuityNbr;

    private _int.wipo.ipas.IpasServices.IpasDateTime completePaymentDate;

    private _int.wipo.ipas.IpasServices.CFileId fileId;

    public CAnnuityPayment() {
    }

    public CAnnuityPayment(
           _int.wipo.ipas.IpasServices.IpasInteger annuityNbr,
           _int.wipo.ipas.IpasServices.IpasDateTime completePaymentDate,
           _int.wipo.ipas.IpasServices.CFileId fileId) {
           this.annuityNbr = annuityNbr;
           this.completePaymentDate = completePaymentDate;
           this.fileId = fileId;
    }


    /**
     * Gets the annuityNbr value for this CAnnuityPayment.
     * 
     * @return annuityNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getAnnuityNbr() {
        return annuityNbr;
    }


    /**
     * Sets the annuityNbr value for this CAnnuityPayment.
     * 
     * @param annuityNbr
     */
    public void setAnnuityNbr(_int.wipo.ipas.IpasServices.IpasInteger annuityNbr) {
        this.annuityNbr = annuityNbr;
    }


    /**
     * Gets the completePaymentDate value for this CAnnuityPayment.
     * 
     * @return completePaymentDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getCompletePaymentDate() {
        return completePaymentDate;
    }


    /**
     * Sets the completePaymentDate value for this CAnnuityPayment.
     * 
     * @param completePaymentDate
     */
    public void setCompletePaymentDate(_int.wipo.ipas.IpasServices.IpasDateTime completePaymentDate) {
        this.completePaymentDate = completePaymentDate;
    }


    /**
     * Gets the fileId value for this CAnnuityPayment.
     * 
     * @return fileId
     */
    public _int.wipo.ipas.IpasServices.CFileId getFileId() {
        return fileId;
    }


    /**
     * Sets the fileId value for this CAnnuityPayment.
     * 
     * @param fileId
     */
    public void setFileId(_int.wipo.ipas.IpasServices.CFileId fileId) {
        this.fileId = fileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CAnnuityPayment)) return false;
        CAnnuityPayment other = (CAnnuityPayment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.annuityNbr==null && other.getAnnuityNbr()==null) || 
             (this.annuityNbr!=null &&
              this.annuityNbr.equals(other.getAnnuityNbr()))) &&
            ((this.completePaymentDate==null && other.getCompletePaymentDate()==null) || 
             (this.completePaymentDate!=null &&
              this.completePaymentDate.equals(other.getCompletePaymentDate()))) &&
            ((this.fileId==null && other.getFileId()==null) || 
             (this.fileId!=null &&
              this.fileId.equals(other.getFileId())));
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
        if (getAnnuityNbr() != null) {
            _hashCode += getAnnuityNbr().hashCode();
        }
        if (getCompletePaymentDate() != null) {
            _hashCode += getCompletePaymentDate().hashCode();
        }
        if (getFileId() != null) {
            _hashCode += getFileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CAnnuityPayment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAnnuityPayment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annuityNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annuityNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completePaymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "completePaymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"));
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
