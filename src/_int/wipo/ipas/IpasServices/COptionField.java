/**
 * COptionField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class COptionField  implements java.io.Serializable {
    private java.lang.String optionFieldName;

    private java.lang.String optionFieldValue;

    public COptionField() {
    }

    public COptionField(
           java.lang.String optionFieldName,
           java.lang.String optionFieldValue) {
           this.optionFieldName = optionFieldName;
           this.optionFieldValue = optionFieldValue;
    }


    /**
     * Gets the optionFieldName value for this COptionField.
     * 
     * @return optionFieldName
     */
    public java.lang.String getOptionFieldName() {
        return optionFieldName;
    }


    /**
     * Sets the optionFieldName value for this COptionField.
     * 
     * @param optionFieldName
     */
    public void setOptionFieldName(java.lang.String optionFieldName) {
        this.optionFieldName = optionFieldName;
    }


    /**
     * Gets the optionFieldValue value for this COptionField.
     * 
     * @return optionFieldValue
     */
    public java.lang.String getOptionFieldValue() {
        return optionFieldValue;
    }


    /**
     * Sets the optionFieldValue value for this COptionField.
     * 
     * @param optionFieldValue
     */
    public void setOptionFieldValue(java.lang.String optionFieldValue) {
        this.optionFieldValue = optionFieldValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof COptionField)) return false;
        COptionField other = (COptionField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.optionFieldName==null && other.getOptionFieldName()==null) || 
             (this.optionFieldName!=null &&
              this.optionFieldName.equals(other.getOptionFieldName()))) &&
            ((this.optionFieldValue==null && other.getOptionFieldValue()==null) || 
             (this.optionFieldValue!=null &&
              this.optionFieldValue.equals(other.getOptionFieldValue())));
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
        if (getOptionFieldName() != null) {
            _hashCode += getOptionFieldName().hashCode();
        }
        if (getOptionFieldValue() != null) {
            _hashCode += getOptionFieldValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(COptionField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOptionField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionFieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "optionFieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionFieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "optionFieldValue"));
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
