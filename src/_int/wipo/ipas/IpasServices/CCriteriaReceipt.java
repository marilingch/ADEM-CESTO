/**
 * CCriteriaReceipt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaReceipt  implements java.io.Serializable {
    private java.lang.Long receiptNbr;

    public CCriteriaReceipt() {
    }

    public CCriteriaReceipt(
           java.lang.Long receiptNbr) {
           this.receiptNbr = receiptNbr;
    }


    /**
     * Gets the receiptNbr value for this CCriteriaReceipt.
     * 
     * @return receiptNbr
     */
    public java.lang.Long getReceiptNbr() {
        return receiptNbr;
    }


    /**
     * Sets the receiptNbr value for this CCriteriaReceipt.
     * 
     * @param receiptNbr
     */
    public void setReceiptNbr(java.lang.Long receiptNbr) {
        this.receiptNbr = receiptNbr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaReceipt)) return false;
        CCriteriaReceipt other = (CCriteriaReceipt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receiptNbr==null && other.getReceiptNbr()==null) || 
             (this.receiptNbr!=null &&
              this.receiptNbr.equals(other.getReceiptNbr())));
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
        if (getReceiptNbr() != null) {
            _hashCode += getReceiptNbr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaReceipt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaReceipt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
