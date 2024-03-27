/**
 * CPayment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CPayment  implements java.io.Serializable {
    private java.lang.String currencyName;

    private java.lang.String currencyType;

    private java.lang.Double receiptAmount;

    private _int.wipo.ipas.IpasServices.IpasDateTime receiptDate;

    private java.lang.Long receiptNbr;

    private java.lang.String receiptNotes;

    private java.lang.String receiptType;

    private java.lang.String receiptTypeName;

    public CPayment() {
    }

    public CPayment(
           java.lang.String currencyName,
           java.lang.String currencyType,
           java.lang.Double receiptAmount,
           _int.wipo.ipas.IpasServices.IpasDateTime receiptDate,
           java.lang.Long receiptNbr,
           java.lang.String receiptNotes,
           java.lang.String receiptType,
           java.lang.String receiptTypeName) {
           this.currencyName = currencyName;
           this.currencyType = currencyType;
           this.receiptAmount = receiptAmount;
           this.receiptDate = receiptDate;
           this.receiptNbr = receiptNbr;
           this.receiptNotes = receiptNotes;
           this.receiptType = receiptType;
           this.receiptTypeName = receiptTypeName;
    }


    /**
     * Gets the currencyName value for this CPayment.
     * 
     * @return currencyName
     */
    public java.lang.String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this CPayment.
     * 
     * @param currencyName
     */
    public void setCurrencyName(java.lang.String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the currencyType value for this CPayment.
     * 
     * @return currencyType
     */
    public java.lang.String getCurrencyType() {
        return currencyType;
    }


    /**
     * Sets the currencyType value for this CPayment.
     * 
     * @param currencyType
     */
    public void setCurrencyType(java.lang.String currencyType) {
        this.currencyType = currencyType;
    }


    /**
     * Gets the receiptAmount value for this CPayment.
     * 
     * @return receiptAmount
     */
    public java.lang.Double getReceiptAmount() {
        return receiptAmount;
    }


    /**
     * Sets the receiptAmount value for this CPayment.
     * 
     * @param receiptAmount
     */
    public void setReceiptAmount(java.lang.Double receiptAmount) {
        this.receiptAmount = receiptAmount;
    }


    /**
     * Gets the receiptDate value for this CPayment.
     * 
     * @return receiptDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getReceiptDate() {
        return receiptDate;
    }


    /**
     * Sets the receiptDate value for this CPayment.
     * 
     * @param receiptDate
     */
    public void setReceiptDate(_int.wipo.ipas.IpasServices.IpasDateTime receiptDate) {
        this.receiptDate = receiptDate;
    }


    /**
     * Gets the receiptNbr value for this CPayment.
     * 
     * @return receiptNbr
     */
    public java.lang.Long getReceiptNbr() {
        return receiptNbr;
    }


    /**
     * Sets the receiptNbr value for this CPayment.
     * 
     * @param receiptNbr
     */
    public void setReceiptNbr(java.lang.Long receiptNbr) {
        this.receiptNbr = receiptNbr;
    }


    /**
     * Gets the receiptNotes value for this CPayment.
     * 
     * @return receiptNotes
     */
    public java.lang.String getReceiptNotes() {
        return receiptNotes;
    }


    /**
     * Sets the receiptNotes value for this CPayment.
     * 
     * @param receiptNotes
     */
    public void setReceiptNotes(java.lang.String receiptNotes) {
        this.receiptNotes = receiptNotes;
    }


    /**
     * Gets the receiptType value for this CPayment.
     * 
     * @return receiptType
     */
    public java.lang.String getReceiptType() {
        return receiptType;
    }


    /**
     * Sets the receiptType value for this CPayment.
     * 
     * @param receiptType
     */
    public void setReceiptType(java.lang.String receiptType) {
        this.receiptType = receiptType;
    }


    /**
     * Gets the receiptTypeName value for this CPayment.
     * 
     * @return receiptTypeName
     */
    public java.lang.String getReceiptTypeName() {
        return receiptTypeName;
    }


    /**
     * Sets the receiptTypeName value for this CPayment.
     * 
     * @param receiptTypeName
     */
    public void setReceiptTypeName(java.lang.String receiptTypeName) {
        this.receiptTypeName = receiptTypeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CPayment)) return false;
        CPayment other = (CPayment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.currencyType==null && other.getCurrencyType()==null) || 
             (this.currencyType!=null &&
              this.currencyType.equals(other.getCurrencyType()))) &&
            ((this.receiptAmount==null && other.getReceiptAmount()==null) || 
             (this.receiptAmount!=null &&
              this.receiptAmount.equals(other.getReceiptAmount()))) &&
            ((this.receiptDate==null && other.getReceiptDate()==null) || 
             (this.receiptDate!=null &&
              this.receiptDate.equals(other.getReceiptDate()))) &&
            ((this.receiptNbr==null && other.getReceiptNbr()==null) || 
             (this.receiptNbr!=null &&
              this.receiptNbr.equals(other.getReceiptNbr()))) &&
            ((this.receiptNotes==null && other.getReceiptNotes()==null) || 
             (this.receiptNotes!=null &&
              this.receiptNotes.equals(other.getReceiptNotes()))) &&
            ((this.receiptType==null && other.getReceiptType()==null) || 
             (this.receiptType!=null &&
              this.receiptType.equals(other.getReceiptType()))) &&
            ((this.receiptTypeName==null && other.getReceiptTypeName()==null) || 
             (this.receiptTypeName!=null &&
              this.receiptTypeName.equals(other.getReceiptTypeName())));
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
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getCurrencyType() != null) {
            _hashCode += getCurrencyType().hashCode();
        }
        if (getReceiptAmount() != null) {
            _hashCode += getReceiptAmount().hashCode();
        }
        if (getReceiptDate() != null) {
            _hashCode += getReceiptDate().hashCode();
        }
        if (getReceiptNbr() != null) {
            _hashCode += getReceiptNbr().hashCode();
        }
        if (getReceiptNotes() != null) {
            _hashCode += getReceiptNotes().hashCode();
        }
        if (getReceiptType() != null) {
            _hashCode += getReceiptType().hashCode();
        }
        if (getReceiptTypeName() != null) {
            _hashCode += getReceiptTypeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CPayment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPayment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptTypeName"));
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
