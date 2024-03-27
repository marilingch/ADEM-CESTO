/**
 * COutputField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class COutputField  implements java.io.Serializable {
    private java.lang.String outputFieldCode;

    private byte[] outputFieldFile;

    private java.lang.String outputFieldName;

    private java.lang.String outputFieldValue;

    public COutputField() {
    }

    public COutputField(
           java.lang.String outputFieldCode,
           byte[] outputFieldFile,
           java.lang.String outputFieldName,
           java.lang.String outputFieldValue) {
           this.outputFieldCode = outputFieldCode;
           this.outputFieldFile = outputFieldFile;
           this.outputFieldName = outputFieldName;
           this.outputFieldValue = outputFieldValue;
    }


    /**
     * Gets the outputFieldCode value for this COutputField.
     * 
     * @return outputFieldCode
     */
    public java.lang.String getOutputFieldCode() {
        return outputFieldCode;
    }


    /**
     * Sets the outputFieldCode value for this COutputField.
     * 
     * @param outputFieldCode
     */
    public void setOutputFieldCode(java.lang.String outputFieldCode) {
        this.outputFieldCode = outputFieldCode;
    }


    /**
     * Gets the outputFieldFile value for this COutputField.
     * 
     * @return outputFieldFile
     */
    public byte[] getOutputFieldFile() {
        return outputFieldFile;
    }


    /**
     * Sets the outputFieldFile value for this COutputField.
     * 
     * @param outputFieldFile
     */
    public void setOutputFieldFile(byte[] outputFieldFile) {
        this.outputFieldFile = outputFieldFile;
    }


    /**
     * Gets the outputFieldName value for this COutputField.
     * 
     * @return outputFieldName
     */
    public java.lang.String getOutputFieldName() {
        return outputFieldName;
    }


    /**
     * Sets the outputFieldName value for this COutputField.
     * 
     * @param outputFieldName
     */
    public void setOutputFieldName(java.lang.String outputFieldName) {
        this.outputFieldName = outputFieldName;
    }


    /**
     * Gets the outputFieldValue value for this COutputField.
     * 
     * @return outputFieldValue
     */
    public java.lang.String getOutputFieldValue() {
        return outputFieldValue;
    }


    /**
     * Sets the outputFieldValue value for this COutputField.
     * 
     * @param outputFieldValue
     */
    public void setOutputFieldValue(java.lang.String outputFieldValue) {
        this.outputFieldValue = outputFieldValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof COutputField)) return false;
        COutputField other = (COutputField) obj;
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
              this.outputFieldCode.equals(other.getOutputFieldCode()))) &&
            ((this.outputFieldFile==null && other.getOutputFieldFile()==null) || 
             (this.outputFieldFile!=null &&
              java.util.Arrays.equals(this.outputFieldFile, other.getOutputFieldFile()))) &&
            ((this.outputFieldName==null && other.getOutputFieldName()==null) || 
             (this.outputFieldName!=null &&
              this.outputFieldName.equals(other.getOutputFieldName()))) &&
            ((this.outputFieldValue==null && other.getOutputFieldValue()==null) || 
             (this.outputFieldValue!=null &&
              this.outputFieldValue.equals(other.getOutputFieldValue())));
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
        if (getOutputFieldFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutputFieldFile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutputFieldFile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutputFieldName() != null) {
            _hashCode += getOutputFieldName().hashCode();
        }
        if (getOutputFieldValue() != null) {
            _hashCode += getOutputFieldValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(COutputField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputFieldCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outputFieldCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputFieldFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outputFieldFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputFieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outputFieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputFieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outputFieldValue"));
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
