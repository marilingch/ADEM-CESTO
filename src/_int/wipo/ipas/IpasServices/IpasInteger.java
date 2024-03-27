/**
 * IpasInteger.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class IpasInteger  implements java.io.Serializable {
    private java.lang.Double doubleValue;

    public IpasInteger() {
    }

    public IpasInteger(
           java.lang.Double doubleValue) {
           this.doubleValue = doubleValue;
    }


    /**
     * Gets the doubleValue value for this IpasInteger.
     * 
     * @return doubleValue
     */
    public java.lang.Double getDoubleValue() {
        return doubleValue;
    }


    /**
     * Sets the doubleValue value for this IpasInteger.
     * 
     * @param doubleValue
     */
    public void setDoubleValue(java.lang.Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IpasInteger)) return false;
        IpasInteger other = (IpasInteger) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.doubleValue==null && other.getDoubleValue()==null) || 
             (this.doubleValue!=null &&
              this.doubleValue.equals(other.getDoubleValue())));
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
        if (getDoubleValue() != null) {
            _hashCode += getDoubleValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IpasInteger.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doubleValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doubleValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
