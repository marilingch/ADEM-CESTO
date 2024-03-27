/**
 * CSqlColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CSqlColumn  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasInteger columnNum;

    private java.lang.String sqlColumnType;

    private java.lang.String sqlColumnValue;

    public CSqlColumn() {
    }

    public CSqlColumn(
           _int.wipo.ipas.IpasServices.IpasInteger columnNum,
           java.lang.String sqlColumnType,
           java.lang.String sqlColumnValue) {
           this.columnNum = columnNum;
           this.sqlColumnType = sqlColumnType;
           this.sqlColumnValue = sqlColumnValue;
    }


    /**
     * Gets the columnNum value for this CSqlColumn.
     * 
     * @return columnNum
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getColumnNum() {
        return columnNum;
    }


    /**
     * Sets the columnNum value for this CSqlColumn.
     * 
     * @param columnNum
     */
    public void setColumnNum(_int.wipo.ipas.IpasServices.IpasInteger columnNum) {
        this.columnNum = columnNum;
    }


    /**
     * Gets the sqlColumnType value for this CSqlColumn.
     * 
     * @return sqlColumnType
     */
    public java.lang.String getSqlColumnType() {
        return sqlColumnType;
    }


    /**
     * Sets the sqlColumnType value for this CSqlColumn.
     * 
     * @param sqlColumnType
     */
    public void setSqlColumnType(java.lang.String sqlColumnType) {
        this.sqlColumnType = sqlColumnType;
    }


    /**
     * Gets the sqlColumnValue value for this CSqlColumn.
     * 
     * @return sqlColumnValue
     */
    public java.lang.String getSqlColumnValue() {
        return sqlColumnValue;
    }


    /**
     * Sets the sqlColumnValue value for this CSqlColumn.
     * 
     * @param sqlColumnValue
     */
    public void setSqlColumnValue(java.lang.String sqlColumnValue) {
        this.sqlColumnValue = sqlColumnValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSqlColumn)) return false;
        CSqlColumn other = (CSqlColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.columnNum==null && other.getColumnNum()==null) || 
             (this.columnNum!=null &&
              this.columnNum.equals(other.getColumnNum()))) &&
            ((this.sqlColumnType==null && other.getSqlColumnType()==null) || 
             (this.sqlColumnType!=null &&
              this.sqlColumnType.equals(other.getSqlColumnType()))) &&
            ((this.sqlColumnValue==null && other.getSqlColumnValue()==null) || 
             (this.sqlColumnValue!=null &&
              this.sqlColumnValue.equals(other.getSqlColumnValue())));
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
        if (getColumnNum() != null) {
            _hashCode += getColumnNum().hashCode();
        }
        if (getSqlColumnType() != null) {
            _hashCode += getSqlColumnType().hashCode();
        }
        if (getSqlColumnValue() != null) {
            _hashCode += getSqlColumnValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSqlColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSqlColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columnNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlColumnType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqlColumnType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlColumnValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqlColumnValue"));
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
