/**
 * CSound.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CSound  implements java.io.Serializable {
    private byte[] soundData;

    private java.lang.String soundType;

    public CSound() {
    }

    public CSound(
           byte[] soundData,
           java.lang.String soundType) {
           this.soundData = soundData;
           this.soundType = soundType;
    }


    /**
     * Gets the soundData value for this CSound.
     * 
     * @return soundData
     */
    public byte[] getSoundData() {
        return soundData;
    }


    /**
     * Sets the soundData value for this CSound.
     * 
     * @param soundData
     */
    public void setSoundData(byte[] soundData) {
        this.soundData = soundData;
    }


    /**
     * Gets the soundType value for this CSound.
     * 
     * @return soundType
     */
    public java.lang.String getSoundType() {
        return soundType;
    }


    /**
     * Sets the soundType value for this CSound.
     * 
     * @param soundType
     */
    public void setSoundType(java.lang.String soundType) {
        this.soundType = soundType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSound)) return false;
        CSound other = (CSound) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.soundData==null && other.getSoundData()==null) || 
             (this.soundData!=null &&
              java.util.Arrays.equals(this.soundData, other.getSoundData()))) &&
            ((this.soundType==null && other.getSoundType()==null) || 
             (this.soundType!=null &&
              this.soundType.equals(other.getSoundType())));
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
        if (getSoundData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSoundData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSoundData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSoundType() != null) {
            _hashCode += getSoundType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSound.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSound"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soundData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soundData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soundType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soundType"));
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
