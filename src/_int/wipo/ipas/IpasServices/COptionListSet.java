/**
 * COptionListSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class COptionListSet  extends _int.wipo.ipas.IpasServices.COptionList  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.COption[] COptionList;

    private _int.wipo.ipas.IpasServices.CAction selectedOptionLists;

    public COptionListSet() {
    }

    public COptionListSet(
           _int.wipo.ipas.IpasServices.COption[] COptionList,
           _int.wipo.ipas.IpasServices.CAction selectedOptionLists) {
        this.COptionList = COptionList;
        this.selectedOptionLists = selectedOptionLists;
    }


    /**
     * Gets the COptionList value for this COptionListSet.
     * 
     * @return COptionList
     */
    public _int.wipo.ipas.IpasServices.COption[] getCOptionList() {
        return COptionList;
    }


    /**
     * Sets the COptionList value for this COptionListSet.
     * 
     * @param COptionList
     */
    public void setCOptionList(_int.wipo.ipas.IpasServices.COption[] COptionList) {
        this.COptionList = COptionList;
    }

    public _int.wipo.ipas.IpasServices.COption getCOptionList(int i) {
        return this.COptionList[i];
    }

    public void setCOptionList(int i, _int.wipo.ipas.IpasServices.COption _value) {
        this.COptionList[i] = _value;
    }


    /**
     * Gets the selectedOptionLists value for this COptionListSet.
     * 
     * @return selectedOptionLists
     */
    public _int.wipo.ipas.IpasServices.CAction getSelectedOptionLists() {
        return selectedOptionLists;
    }


    /**
     * Sets the selectedOptionLists value for this COptionListSet.
     * 
     * @param selectedOptionLists
     */
    public void setSelectedOptionLists(_int.wipo.ipas.IpasServices.CAction selectedOptionLists) {
        this.selectedOptionLists = selectedOptionLists;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof COptionListSet)) return false;
        COptionListSet other = (COptionListSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.COptionList==null && other.getCOptionList()==null) || 
             (this.COptionList!=null &&
              java.util.Arrays.equals(this.COptionList, other.getCOptionList()))) &&
            ((this.selectedOptionLists==null && other.getSelectedOptionLists()==null) || 
             (this.selectedOptionLists!=null &&
              this.selectedOptionLists.equals(other.getSelectedOptionLists())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCOptionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCOptionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCOptionList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSelectedOptionLists() != null) {
            _hashCode += getSelectedOptionLists().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(COptionListSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOptionListSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COptionList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COptionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedOptionLists");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectedOptionLists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAction"));
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
