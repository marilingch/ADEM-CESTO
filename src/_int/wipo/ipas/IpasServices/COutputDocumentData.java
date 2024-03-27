/**
 * COutputDocumentData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class COutputDocumentData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.COfficedocId officedocId;

    public COutputDocumentData() {
    }

    public COutputDocumentData(
           _int.wipo.ipas.IpasServices.COfficedocId officedocId) {
           this.officedocId = officedocId;
    }


    /**
     * Gets the officedocId value for this COutputDocumentData.
     * 
     * @return officedocId
     */
    public _int.wipo.ipas.IpasServices.COfficedocId getOfficedocId() {
        return officedocId;
    }


    /**
     * Sets the officedocId value for this COutputDocumentData.
     * 
     * @param officedocId
     */
    public void setOfficedocId(_int.wipo.ipas.IpasServices.COfficedocId officedocId) {
        this.officedocId = officedocId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof COutputDocumentData)) return false;
        COutputDocumentData other = (COutputDocumentData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.officedocId==null && other.getOfficedocId()==null) || 
             (this.officedocId!=null &&
              this.officedocId.equals(other.getOfficedocId())));
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
        if (getOfficedocId() != null) {
            _hashCode += getOfficedocId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(COutputDocumentData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOutputDocumentData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officedocId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officedocId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"));
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
