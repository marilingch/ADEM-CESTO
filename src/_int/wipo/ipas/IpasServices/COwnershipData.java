/**
 * COwnershipData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class COwnershipData  implements java.io.Serializable {
    private java.lang.String dummy;

    private _int.wipo.ipas.IpasServices.COwner[] ownerList;

    public COwnershipData() {
    }

    public COwnershipData(
           java.lang.String dummy,
           _int.wipo.ipas.IpasServices.COwner[] ownerList) {
           this.dummy = dummy;
           this.ownerList = ownerList;
    }


    /**
     * Gets the dummy value for this COwnershipData.
     * 
     * @return dummy
     */
    public java.lang.String getDummy() {
        return dummy;
    }


    /**
     * Sets the dummy value for this COwnershipData.
     * 
     * @param dummy
     */
    public void setDummy(java.lang.String dummy) {
        this.dummy = dummy;
    }


    /**
     * Gets the ownerList value for this COwnershipData.
     * 
     * @return ownerList
     */
    public _int.wipo.ipas.IpasServices.COwner[] getOwnerList() {
        return ownerList;
    }


    /**
     * Sets the ownerList value for this COwnershipData.
     * 
     * @param ownerList
     */
    public void setOwnerList(_int.wipo.ipas.IpasServices.COwner[] ownerList) {
        this.ownerList = ownerList;
    }

    public _int.wipo.ipas.IpasServices.COwner getOwnerList(int i) {
        return this.ownerList[i];
    }

    public void setOwnerList(int i, _int.wipo.ipas.IpasServices.COwner _value) {
        this.ownerList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof COwnershipData)) return false;
        COwnershipData other = (COwnershipData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dummy==null && other.getDummy()==null) || 
             (this.dummy!=null &&
              this.dummy.equals(other.getDummy()))) &&
            ((this.ownerList==null && other.getOwnerList()==null) || 
             (this.ownerList!=null &&
              java.util.Arrays.equals(this.ownerList, other.getOwnerList())));
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
        if (getDummy() != null) {
            _hashCode += getDummy().hashCode();
        }
        if (getOwnerList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwnerList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwnerList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(COwnershipData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOwnershipData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dummy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dummy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOwner"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
