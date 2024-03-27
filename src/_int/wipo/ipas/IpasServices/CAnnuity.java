/**
 * CAnnuity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CAnnuity  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasInteger annuityNbr;

    private _int.wipo.ipas.IpasServices.IpasDateTime completePaymentDate;

    private _int.wipo.ipas.IpasServices.IpasDateTime expirationDate;

    private _int.wipo.ipas.IpasServices.IpasDateTime graceDate;

    private java.lang.Boolean indIgnore;

    private java.lang.Boolean indPayed;

    public CAnnuity() {
    }

    public CAnnuity(
           _int.wipo.ipas.IpasServices.IpasInteger annuityNbr,
           _int.wipo.ipas.IpasServices.IpasDateTime completePaymentDate,
           _int.wipo.ipas.IpasServices.IpasDateTime expirationDate,
           _int.wipo.ipas.IpasServices.IpasDateTime graceDate,
           java.lang.Boolean indIgnore,
           java.lang.Boolean indPayed) {
           this.annuityNbr = annuityNbr;
           this.completePaymentDate = completePaymentDate;
           this.expirationDate = expirationDate;
           this.graceDate = graceDate;
           this.indIgnore = indIgnore;
           this.indPayed = indPayed;
    }


    /**
     * Gets the annuityNbr value for this CAnnuity.
     * 
     * @return annuityNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getAnnuityNbr() {
        return annuityNbr;
    }


    /**
     * Sets the annuityNbr value for this CAnnuity.
     * 
     * @param annuityNbr
     */
    public void setAnnuityNbr(_int.wipo.ipas.IpasServices.IpasInteger annuityNbr) {
        this.annuityNbr = annuityNbr;
    }


    /**
     * Gets the completePaymentDate value for this CAnnuity.
     * 
     * @return completePaymentDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getCompletePaymentDate() {
        return completePaymentDate;
    }


    /**
     * Sets the completePaymentDate value for this CAnnuity.
     * 
     * @param completePaymentDate
     */
    public void setCompletePaymentDate(_int.wipo.ipas.IpasServices.IpasDateTime completePaymentDate) {
        this.completePaymentDate = completePaymentDate;
    }


    /**
     * Gets the expirationDate value for this CAnnuity.
     * 
     * @return expirationDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this CAnnuity.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(_int.wipo.ipas.IpasServices.IpasDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the graceDate value for this CAnnuity.
     * 
     * @return graceDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getGraceDate() {
        return graceDate;
    }


    /**
     * Sets the graceDate value for this CAnnuity.
     * 
     * @param graceDate
     */
    public void setGraceDate(_int.wipo.ipas.IpasServices.IpasDateTime graceDate) {
        this.graceDate = graceDate;
    }


    /**
     * Gets the indIgnore value for this CAnnuity.
     * 
     * @return indIgnore
     */
    public java.lang.Boolean getIndIgnore() {
        return indIgnore;
    }


    /**
     * Sets the indIgnore value for this CAnnuity.
     * 
     * @param indIgnore
     */
    public void setIndIgnore(java.lang.Boolean indIgnore) {
        this.indIgnore = indIgnore;
    }


    /**
     * Gets the indPayed value for this CAnnuity.
     * 
     * @return indPayed
     */
    public java.lang.Boolean getIndPayed() {
        return indPayed;
    }


    /**
     * Sets the indPayed value for this CAnnuity.
     * 
     * @param indPayed
     */
    public void setIndPayed(java.lang.Boolean indPayed) {
        this.indPayed = indPayed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CAnnuity)) return false;
        CAnnuity other = (CAnnuity) obj;
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
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.graceDate==null && other.getGraceDate()==null) || 
             (this.graceDate!=null &&
              this.graceDate.equals(other.getGraceDate()))) &&
            ((this.indIgnore==null && other.getIndIgnore()==null) || 
             (this.indIgnore!=null &&
              this.indIgnore.equals(other.getIndIgnore()))) &&
            ((this.indPayed==null && other.getIndPayed()==null) || 
             (this.indPayed!=null &&
              this.indPayed.equals(other.getIndPayed())));
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
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getGraceDate() != null) {
            _hashCode += getGraceDate().hashCode();
        }
        if (getIndIgnore() != null) {
            _hashCode += getIndIgnore().hashCode();
        }
        if (getIndPayed() != null) {
            _hashCode += getIndPayed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CAnnuity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAnnuity"));
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
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "graceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indIgnore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indIgnore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indPayed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indPayed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
