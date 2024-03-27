/**
 * CSqlRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CSqlRow  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasInteger rowNum;

    private _int.wipo.ipas.IpasServices.CSqlColumn[] sqlColumnList;

    public CSqlRow() {
    }

    public CSqlRow(
           _int.wipo.ipas.IpasServices.IpasInteger rowNum,
           _int.wipo.ipas.IpasServices.CSqlColumn[] sqlColumnList) {
           this.rowNum = rowNum;
           this.sqlColumnList = sqlColumnList;
    }


    /**
     * Gets the rowNum value for this CSqlRow.
     * 
     * @return rowNum
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getRowNum() {
        return rowNum;
    }


    /**
     * Sets the rowNum value for this CSqlRow.
     * 
     * @param rowNum
     */
    public void setRowNum(_int.wipo.ipas.IpasServices.IpasInteger rowNum) {
        this.rowNum = rowNum;
    }


    /**
     * Gets the sqlColumnList value for this CSqlRow.
     * 
     * @return sqlColumnList
     */
    public _int.wipo.ipas.IpasServices.CSqlColumn[] getSqlColumnList() {
        return sqlColumnList;
    }


    /**
     * Sets the sqlColumnList value for this CSqlRow.
     * 
     * @param sqlColumnList
     */
    public void setSqlColumnList(_int.wipo.ipas.IpasServices.CSqlColumn[] sqlColumnList) {
        this.sqlColumnList = sqlColumnList;
    }

    public _int.wipo.ipas.IpasServices.CSqlColumn getSqlColumnList(int i) {
        return this.sqlColumnList[i];
    }

    public void setSqlColumnList(int i, _int.wipo.ipas.IpasServices.CSqlColumn _value) {
        this.sqlColumnList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSqlRow)) return false;
        CSqlRow other = (CSqlRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rowNum==null && other.getRowNum()==null) || 
             (this.rowNum!=null &&
              this.rowNum.equals(other.getRowNum()))) &&
            ((this.sqlColumnList==null && other.getSqlColumnList()==null) || 
             (this.sqlColumnList!=null &&
              java.util.Arrays.equals(this.sqlColumnList, other.getSqlColumnList())));
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
        if (getRowNum() != null) {
            _hashCode += getRowNum().hashCode();
        }
        if (getSqlColumnList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSqlColumnList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSqlColumnList(), i);
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
        new org.apache.axis.description.TypeDesc(CSqlRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSqlRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlColumnList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqlColumnList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSqlColumn"));
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
