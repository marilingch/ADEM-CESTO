/**
 * CAuthorshipData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CAuthorshipData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CAuthor[] authorList;

    private java.lang.Boolean indOwnerSameAuthor;

    public CAuthorshipData() {
    }

    public CAuthorshipData(
           _int.wipo.ipas.IpasServices.CAuthor[] authorList,
           java.lang.Boolean indOwnerSameAuthor) {
           this.authorList = authorList;
           this.indOwnerSameAuthor = indOwnerSameAuthor;
    }


    /**
     * Gets the authorList value for this CAuthorshipData.
     * 
     * @return authorList
     */
    public _int.wipo.ipas.IpasServices.CAuthor[] getAuthorList() {
        return authorList;
    }


    /**
     * Sets the authorList value for this CAuthorshipData.
     * 
     * @param authorList
     */
    public void setAuthorList(_int.wipo.ipas.IpasServices.CAuthor[] authorList) {
        this.authorList = authorList;
    }

    public _int.wipo.ipas.IpasServices.CAuthor getAuthorList(int i) {
        return this.authorList[i];
    }

    public void setAuthorList(int i, _int.wipo.ipas.IpasServices.CAuthor _value) {
        this.authorList[i] = _value;
    }


    /**
     * Gets the indOwnerSameAuthor value for this CAuthorshipData.
     * 
     * @return indOwnerSameAuthor
     */
    public java.lang.Boolean getIndOwnerSameAuthor() {
        return indOwnerSameAuthor;
    }


    /**
     * Sets the indOwnerSameAuthor value for this CAuthorshipData.
     * 
     * @param indOwnerSameAuthor
     */
    public void setIndOwnerSameAuthor(java.lang.Boolean indOwnerSameAuthor) {
        this.indOwnerSameAuthor = indOwnerSameAuthor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CAuthorshipData)) return false;
        CAuthorshipData other = (CAuthorshipData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authorList==null && other.getAuthorList()==null) || 
             (this.authorList!=null &&
              java.util.Arrays.equals(this.authorList, other.getAuthorList()))) &&
            ((this.indOwnerSameAuthor==null && other.getIndOwnerSameAuthor()==null) || 
             (this.indOwnerSameAuthor!=null &&
              this.indOwnerSameAuthor.equals(other.getIndOwnerSameAuthor())));
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
        if (getAuthorList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIndOwnerSameAuthor() != null) {
            _hashCode += getIndOwnerSameAuthor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CAuthorshipData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAuthorshipData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAuthor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indOwnerSameAuthor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indOwnerSameAuthor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
