/**
 * CGuaranteeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CGuaranteeData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CPerson payee;

    private _int.wipo.ipas.IpasServices.CPerson payer;

    public CGuaranteeData() {
    }

    public CGuaranteeData(
           _int.wipo.ipas.IpasServices.CPerson payee,
           _int.wipo.ipas.IpasServices.CPerson payer) {
           this.payee = payee;
           this.payer = payer;
    }


    /**
     * Gets the payee value for this CGuaranteeData.
     * 
     * @return payee
     */
    public _int.wipo.ipas.IpasServices.CPerson getPayee() {
        return payee;
    }


    /**
     * Sets the payee value for this CGuaranteeData.
     * 
     * @param payee
     */
    public void setPayee(_int.wipo.ipas.IpasServices.CPerson payee) {
        this.payee = payee;
    }


    /**
     * Gets the payer value for this CGuaranteeData.
     * 
     * @return payer
     */
    public _int.wipo.ipas.IpasServices.CPerson getPayer() {
        return payer;
    }


    /**
     * Sets the payer value for this CGuaranteeData.
     * 
     * @param payer
     */
    public void setPayer(_int.wipo.ipas.IpasServices.CPerson payer) {
        this.payer = payer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CGuaranteeData)) return false;
        CGuaranteeData other = (CGuaranteeData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payee==null && other.getPayee()==null) || 
             (this.payee!=null &&
              this.payee.equals(other.getPayee()))) &&
            ((this.payer==null && other.getPayer()==null) || 
             (this.payer!=null &&
              this.payer.equals(other.getPayer())));
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
        if (getPayee() != null) {
            _hashCode += getPayee().hashCode();
        }
        if (getPayer() != null) {
            _hashCode += getPayer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CGuaranteeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cGuaranteeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPerson"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPerson"));
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
