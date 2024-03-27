/**
 * CNationalGoodsClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CNationalGoodsClass  implements java.io.Serializable {
    private java.lang.String nationalClassDescription;

    private _int.wipo.ipas.IpasServices.IpasInteger nationalClassNbr;

    public CNationalGoodsClass() {
    }

    public CNationalGoodsClass(
           java.lang.String nationalClassDescription,
           _int.wipo.ipas.IpasServices.IpasInteger nationalClassNbr) {
           this.nationalClassDescription = nationalClassDescription;
           this.nationalClassNbr = nationalClassNbr;
    }


    /**
     * Gets the nationalClassDescription value for this CNationalGoodsClass.
     * 
     * @return nationalClassDescription
     */
    public java.lang.String getNationalClassDescription() {
        return nationalClassDescription;
    }


    /**
     * Sets the nationalClassDescription value for this CNationalGoodsClass.
     * 
     * @param nationalClassDescription
     */
    public void setNationalClassDescription(java.lang.String nationalClassDescription) {
        this.nationalClassDescription = nationalClassDescription;
    }


    /**
     * Gets the nationalClassNbr value for this CNationalGoodsClass.
     * 
     * @return nationalClassNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getNationalClassNbr() {
        return nationalClassNbr;
    }


    /**
     * Sets the nationalClassNbr value for this CNationalGoodsClass.
     * 
     * @param nationalClassNbr
     */
    public void setNationalClassNbr(_int.wipo.ipas.IpasServices.IpasInteger nationalClassNbr) {
        this.nationalClassNbr = nationalClassNbr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CNationalGoodsClass)) return false;
        CNationalGoodsClass other = (CNationalGoodsClass) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nationalClassDescription==null && other.getNationalClassDescription()==null) || 
             (this.nationalClassDescription!=null &&
              this.nationalClassDescription.equals(other.getNationalClassDescription()))) &&
            ((this.nationalClassNbr==null && other.getNationalClassNbr()==null) || 
             (this.nationalClassNbr!=null &&
              this.nationalClassNbr.equals(other.getNationalClassNbr())));
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
        if (getNationalClassDescription() != null) {
            _hashCode += getNationalClassDescription().hashCode();
        }
        if (getNationalClassNbr() != null) {
            _hashCode += getNationalClassNbr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CNationalGoodsClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cNationalGoodsClass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalClassDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalClassDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalClassNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalClassNbr"));
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
