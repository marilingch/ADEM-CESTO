/**
 * CMadridProcessingResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CMadridProcessingResult  implements java.io.Serializable {
    private java.lang.String lastIntRegnProcessed;

    private _int.wipo.ipas.IpasServices.IpasInteger qtyRemainingPendingTransactions;

    public CMadridProcessingResult() {
    }

    public CMadridProcessingResult(
           java.lang.String lastIntRegnProcessed,
           _int.wipo.ipas.IpasServices.IpasInteger qtyRemainingPendingTransactions) {
           this.lastIntRegnProcessed = lastIntRegnProcessed;
           this.qtyRemainingPendingTransactions = qtyRemainingPendingTransactions;
    }


    /**
     * Gets the lastIntRegnProcessed value for this CMadridProcessingResult.
     * 
     * @return lastIntRegnProcessed
     */
    public java.lang.String getLastIntRegnProcessed() {
        return lastIntRegnProcessed;
    }


    /**
     * Sets the lastIntRegnProcessed value for this CMadridProcessingResult.
     * 
     * @param lastIntRegnProcessed
     */
    public void setLastIntRegnProcessed(java.lang.String lastIntRegnProcessed) {
        this.lastIntRegnProcessed = lastIntRegnProcessed;
    }


    /**
     * Gets the qtyRemainingPendingTransactions value for this CMadridProcessingResult.
     * 
     * @return qtyRemainingPendingTransactions
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getQtyRemainingPendingTransactions() {
        return qtyRemainingPendingTransactions;
    }


    /**
     * Sets the qtyRemainingPendingTransactions value for this CMadridProcessingResult.
     * 
     * @param qtyRemainingPendingTransactions
     */
    public void setQtyRemainingPendingTransactions(_int.wipo.ipas.IpasServices.IpasInteger qtyRemainingPendingTransactions) {
        this.qtyRemainingPendingTransactions = qtyRemainingPendingTransactions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CMadridProcessingResult)) return false;
        CMadridProcessingResult other = (CMadridProcessingResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lastIntRegnProcessed==null && other.getLastIntRegnProcessed()==null) || 
             (this.lastIntRegnProcessed!=null &&
              this.lastIntRegnProcessed.equals(other.getLastIntRegnProcessed()))) &&
            ((this.qtyRemainingPendingTransactions==null && other.getQtyRemainingPendingTransactions()==null) || 
             (this.qtyRemainingPendingTransactions!=null &&
              this.qtyRemainingPendingTransactions.equals(other.getQtyRemainingPendingTransactions())));
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
        if (getLastIntRegnProcessed() != null) {
            _hashCode += getLastIntRegnProcessed().hashCode();
        }
        if (getQtyRemainingPendingTransactions() != null) {
            _hashCode += getQtyRemainingPendingTransactions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CMadridProcessingResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMadridProcessingResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastIntRegnProcessed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastIntRegnProcessed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtyRemainingPendingTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qtyRemainingPendingTransactions"));
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
