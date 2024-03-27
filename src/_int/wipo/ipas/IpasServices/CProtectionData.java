/**
 * CProtectionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CProtectionData  implements java.io.Serializable {
    private java.lang.Boolean dummy;

    private _int.wipo.ipas.IpasServices.CNationalGoodsClass[] nationalGoodsClassList;

    private _int.wipo.ipas.IpasServices.CNiceClass[] niceClassList;

    private _int.wipo.ipas.IpasServices.CSearchClass[] searchClassList;

    public CProtectionData() {
    }

    public CProtectionData(
           java.lang.Boolean dummy,
           _int.wipo.ipas.IpasServices.CNationalGoodsClass[] nationalGoodsClassList,
           _int.wipo.ipas.IpasServices.CNiceClass[] niceClassList,
           _int.wipo.ipas.IpasServices.CSearchClass[] searchClassList) {
           this.dummy = dummy;
           this.nationalGoodsClassList = nationalGoodsClassList;
           this.niceClassList = niceClassList;
           this.searchClassList = searchClassList;
    }


    /**
     * Gets the dummy value for this CProtectionData.
     * 
     * @return dummy
     */
    public java.lang.Boolean getDummy() {
        return dummy;
    }


    /**
     * Sets the dummy value for this CProtectionData.
     * 
     * @param dummy
     */
    public void setDummy(java.lang.Boolean dummy) {
        this.dummy = dummy;
    }


    /**
     * Gets the nationalGoodsClassList value for this CProtectionData.
     * 
     * @return nationalGoodsClassList
     */
    public _int.wipo.ipas.IpasServices.CNationalGoodsClass[] getNationalGoodsClassList() {
        return nationalGoodsClassList;
    }


    /**
     * Sets the nationalGoodsClassList value for this CProtectionData.
     * 
     * @param nationalGoodsClassList
     */
    public void setNationalGoodsClassList(_int.wipo.ipas.IpasServices.CNationalGoodsClass[] nationalGoodsClassList) {
        this.nationalGoodsClassList = nationalGoodsClassList;
    }

    public _int.wipo.ipas.IpasServices.CNationalGoodsClass getNationalGoodsClassList(int i) {
        return this.nationalGoodsClassList[i];
    }

    public void setNationalGoodsClassList(int i, _int.wipo.ipas.IpasServices.CNationalGoodsClass _value) {
        this.nationalGoodsClassList[i] = _value;
    }


    /**
     * Gets the niceClassList value for this CProtectionData.
     * 
     * @return niceClassList
     */
    public _int.wipo.ipas.IpasServices.CNiceClass[] getNiceClassList() {
        return niceClassList;
    }


    /**
     * Sets the niceClassList value for this CProtectionData.
     * 
     * @param niceClassList
     */
    public void setNiceClassList(_int.wipo.ipas.IpasServices.CNiceClass[] niceClassList) {
        this.niceClassList = niceClassList;
    }

    public _int.wipo.ipas.IpasServices.CNiceClass getNiceClassList(int i) {
        return this.niceClassList[i];
    }

    public void setNiceClassList(int i, _int.wipo.ipas.IpasServices.CNiceClass _value) {
        this.niceClassList[i] = _value;
    }


    /**
     * Gets the searchClassList value for this CProtectionData.
     * 
     * @return searchClassList
     */
    public _int.wipo.ipas.IpasServices.CSearchClass[] getSearchClassList() {
        return searchClassList;
    }


    /**
     * Sets the searchClassList value for this CProtectionData.
     * 
     * @param searchClassList
     */
    public void setSearchClassList(_int.wipo.ipas.IpasServices.CSearchClass[] searchClassList) {
        this.searchClassList = searchClassList;
    }

    public _int.wipo.ipas.IpasServices.CSearchClass getSearchClassList(int i) {
        return this.searchClassList[i];
    }

    public void setSearchClassList(int i, _int.wipo.ipas.IpasServices.CSearchClass _value) {
        this.searchClassList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CProtectionData)) return false;
        CProtectionData other = (CProtectionData) obj;
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
            ((this.nationalGoodsClassList==null && other.getNationalGoodsClassList()==null) || 
             (this.nationalGoodsClassList!=null &&
              java.util.Arrays.equals(this.nationalGoodsClassList, other.getNationalGoodsClassList()))) &&
            ((this.niceClassList==null && other.getNiceClassList()==null) || 
             (this.niceClassList!=null &&
              java.util.Arrays.equals(this.niceClassList, other.getNiceClassList()))) &&
            ((this.searchClassList==null && other.getSearchClassList()==null) || 
             (this.searchClassList!=null &&
              java.util.Arrays.equals(this.searchClassList, other.getSearchClassList())));
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
        if (getNationalGoodsClassList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNationalGoodsClassList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNationalGoodsClassList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNiceClassList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNiceClassList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNiceClassList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSearchClassList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchClassList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchClassList(), i);
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
        new org.apache.axis.description.TypeDesc(CProtectionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProtectionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dummy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dummy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalGoodsClassList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalGoodsClassList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cNationalGoodsClass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("niceClassList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "niceClassList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cNiceClass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchClassList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searchClassList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSearchClass"));
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
