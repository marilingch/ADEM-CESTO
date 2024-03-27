/**
 * CReceipt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CReceipt  implements java.io.Serializable {
    private java.lang.String currencyType;

    private java.lang.Double DReceiptAmount;

    private _int.wipo.ipas.IpasServices.IpasDateTime receiptDate;

    private java.lang.Long receiptNbr;

    private java.lang.String receiptType;

    public CReceipt() {
    }

    public CReceipt(
           java.lang.String currencyType,
           java.lang.Double DReceiptAmount,
           _int.wipo.ipas.IpasServices.IpasDateTime receiptDate,
           java.lang.Long receiptNbr,
           java.lang.String receiptType) {
           this.currencyType = currencyType;
           this.DReceiptAmount = DReceiptAmount;
           this.receiptDate = receiptDate;
           this.receiptNbr = receiptNbr;
           this.receiptType = receiptType;
    }


    /**
     * Gets the currencyType value for this CReceipt.
     * 
     * @return currencyType
     */
    public java.lang.String getCurrencyType() {
        return currencyType;
    }


    /**
     * Sets the currencyType value for this CReceipt.
     * 
     * @param currencyType
     */
    public void setCurrencyType(java.lang.String currencyType) {
        this.currencyType = currencyType;
    }


    /**
     * Gets the DReceiptAmount value for this CReceipt.
     * 
     * @return DReceiptAmount
     */
    public java.lang.Double getDReceiptAmount() {
        return DReceiptAmount;
    }


    /**
     * Sets the DReceiptAmount value for this CReceipt.
     * 
     * @param DReceiptAmount
     */
    public void setDReceiptAmount(java.lang.Double DReceiptAmount) {
        this.DReceiptAmount = DReceiptAmount;
    }


    /**
     * Gets the receiptDate value for this CReceipt.
     * 
     * @return receiptDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getReceiptDate() {
        return receiptDate;
    }


    /**
     * Sets the receiptDate value for this CReceipt.
     * 
     * @param receiptDate
     */
    public void setReceiptDate(_int.wipo.ipas.IpasServices.IpasDateTime receiptDate) {
        this.receiptDate = receiptDate;
    }


    /**
     * Gets the receiptNbr value for this CReceipt.
     * 
     * @return receiptNbr
     */
    public java.lang.Long getReceiptNbr() {
        return receiptNbr;
    }


    /**
     * Sets the receiptNbr value for this CReceipt.
     * 
     * @param receiptNbr
     */
    public void setReceiptNbr(java.lang.Long receiptNbr) {
        this.receiptNbr = receiptNbr;
    }


    /**
     * Gets the receiptType value for this CReceipt.
     * 
     * @return receiptType
     */
    public java.lang.String getReceiptType() {
        return receiptType;
    }


    /**
     * Sets the receiptType value for this CReceipt.
     * 
     * @param receiptType
     */
    public void setReceiptType(java.lang.String receiptType) {
        this.receiptType = receiptType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CReceipt)) return false;
        CReceipt other = (CReceipt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currencyType==null && other.getCurrencyType()==null) || 
             (this.currencyType!=null &&
              this.currencyType.equals(other.getCurrencyType()))) &&
            ((this.DReceiptAmount==null && other.getDReceiptAmount()==null) || 
             (this.DReceiptAmount!=null &&
              this.DReceiptAmount.equals(other.getDReceiptAmount()))) &&
            ((this.receiptDate==null && other.getReceiptDate()==null) || 
             (this.receiptDate!=null &&
              this.receiptDate.equals(other.getReceiptDate()))) &&
            ((this.receiptNbr==null && other.getReceiptNbr()==null) || 
             (this.receiptNbr!=null &&
              this.receiptNbr.equals(other.getReceiptNbr()))) &&
            ((this.receiptType==null && other.getReceiptType()==null) || 
             (this.receiptType!=null &&
              this.receiptType.equals(other.getReceiptType())));
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
        if (getCurrencyType() != null) {
            _hashCode += getCurrencyType().hashCode();
        }
        if (getDReceiptAmount() != null) {
            _hashCode += getDReceiptAmount().hashCode();
        }
        if (getReceiptDate() != null) {
            _hashCode += getReceiptDate().hashCode();
        }
        if (getReceiptNbr() != null) {
            _hashCode += getReceiptNbr().hashCode();
        }
        if (getReceiptType() != null) {
            _hashCode += getReceiptType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CReceipt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cReceipt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DReceiptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DReceiptAmount"));
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
        elemField.setFieldName("receiptType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptType"));
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
