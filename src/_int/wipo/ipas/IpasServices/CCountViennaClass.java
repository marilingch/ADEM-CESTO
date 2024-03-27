/**
 * CCountViennaClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCountViennaClass  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CViennaClass viennaClass;

    private _int.wipo.ipas.IpasServices.IpasInteger viennaCount;

    public CCountViennaClass() {
    }

    public CCountViennaClass(
           _int.wipo.ipas.IpasServices.CViennaClass viennaClass,
           _int.wipo.ipas.IpasServices.IpasInteger viennaCount) {
           this.viennaClass = viennaClass;
           this.viennaCount = viennaCount;
    }


    /**
     * Gets the viennaClass value for this CCountViennaClass.
     * 
     * @return viennaClass
     */
    public _int.wipo.ipas.IpasServices.CViennaClass getViennaClass() {
        return viennaClass;
    }


    /**
     * Sets the viennaClass value for this CCountViennaClass.
     * 
     * @param viennaClass
     */
    public void setViennaClass(_int.wipo.ipas.IpasServices.CViennaClass viennaClass) {
        this.viennaClass = viennaClass;
    }


    /**
     * Gets the viennaCount value for this CCountViennaClass.
     * 
     * @return viennaCount
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getViennaCount() {
        return viennaCount;
    }


    /**
     * Sets the viennaCount value for this CCountViennaClass.
     * 
     * @param viennaCount
     */
    public void setViennaCount(_int.wipo.ipas.IpasServices.IpasInteger viennaCount) {
        this.viennaCount = viennaCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCountViennaClass)) return false;
        CCountViennaClass other = (CCountViennaClass) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.viennaClass==null && other.getViennaClass()==null) || 
             (this.viennaClass!=null &&
              this.viennaClass.equals(other.getViennaClass()))) &&
            ((this.viennaCount==null && other.getViennaCount()==null) || 
             (this.viennaCount!=null &&
              this.viennaCount.equals(other.getViennaCount())));
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
        if (getViennaClass() != null) {
            _hashCode += getViennaClass().hashCode();
        }
        if (getViennaCount() != null) {
            _hashCode += getViennaCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCountViennaClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCountViennaClass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viennaClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viennaClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cViennaClass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viennaCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viennaCount"));
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
