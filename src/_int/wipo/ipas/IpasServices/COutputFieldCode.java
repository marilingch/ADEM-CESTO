/**
 * COutputFieldCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class COutputFieldCode  implements java.io.Serializable {
    private java.lang.String outputFieldCode;

    public COutputFieldCode() {
    }

    public COutputFieldCode(
           java.lang.String outputFieldCode) {
           this.outputFieldCode = outputFieldCode;
    }


    /**
     * Gets the outputFieldCode value for this COutputFieldCode.
     * 
     * @return outputFieldCode
     */
    public java.lang.String getOutputFieldCode() {
        return outputFieldCode;
    }


    /**
     * Sets the outputFieldCode value for this COutputFieldCode.
     * 
     * @param outputFieldCode
     */
    public void setOutputFieldCode(java.lang.String outputFieldCode) {
        this.outputFieldCode = outputFieldCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof COutputFieldCode)) return false;
        COutputFieldCode other = (COutputFieldCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outputFieldCode==null && other.getOutputFieldCode()==null) || 
             (this.outputFieldCode!=null &&
              this.outputFieldCode.equals(other.getOutputFieldCode())));
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
        if (getOutputFieldCode() != null) {
            _hashCode += getOutputFieldCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(COutputFieldCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputFieldCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputFieldCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outputFieldCode"));
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
