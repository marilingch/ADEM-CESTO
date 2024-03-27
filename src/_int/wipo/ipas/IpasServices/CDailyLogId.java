/**
 * CDailyLogId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CDailyLogId  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime dailyLogDate;

    private java.lang.String docLog;

    private java.lang.String docOrigin;

    public CDailyLogId() {
    }

    public CDailyLogId(
           _int.wipo.ipas.IpasServices.IpasDateTime dailyLogDate,
           java.lang.String docLog,
           java.lang.String docOrigin) {
           this.dailyLogDate = dailyLogDate;
           this.docLog = docLog;
           this.docOrigin = docOrigin;
    }


    /**
     * Gets the dailyLogDate value for this CDailyLogId.
     * 
     * @return dailyLogDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getDailyLogDate() {
        return dailyLogDate;
    }


    /**
     * Sets the dailyLogDate value for this CDailyLogId.
     * 
     * @param dailyLogDate
     */
    public void setDailyLogDate(_int.wipo.ipas.IpasServices.IpasDateTime dailyLogDate) {
        this.dailyLogDate = dailyLogDate;
    }


    /**
     * Gets the docLog value for this CDailyLogId.
     * 
     * @return docLog
     */
    public java.lang.String getDocLog() {
        return docLog;
    }


    /**
     * Sets the docLog value for this CDailyLogId.
     * 
     * @param docLog
     */
    public void setDocLog(java.lang.String docLog) {
        this.docLog = docLog;
    }


    /**
     * Gets the docOrigin value for this CDailyLogId.
     * 
     * @return docOrigin
     */
    public java.lang.String getDocOrigin() {
        return docOrigin;
    }


    /**
     * Sets the docOrigin value for this CDailyLogId.
     * 
     * @param docOrigin
     */
    public void setDocOrigin(java.lang.String docOrigin) {
        this.docOrigin = docOrigin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDailyLogId)) return false;
        CDailyLogId other = (CDailyLogId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dailyLogDate==null && other.getDailyLogDate()==null) || 
             (this.dailyLogDate!=null &&
              this.dailyLogDate.equals(other.getDailyLogDate()))) &&
            ((this.docLog==null && other.getDocLog()==null) || 
             (this.docLog!=null &&
              this.docLog.equals(other.getDocLog()))) &&
            ((this.docOrigin==null && other.getDocOrigin()==null) || 
             (this.docOrigin!=null &&
              this.docOrigin.equals(other.getDocOrigin())));
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
        if (getDailyLogDate() != null) {
            _hashCode += getDailyLogDate().hashCode();
        }
        if (getDocLog() != null) {
            _hashCode += getDocLog().hashCode();
        }
        if (getDocOrigin() != null) {
            _hashCode += getDocOrigin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDailyLogId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLogId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyLogDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dailyLogDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docLog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docOrigin"));
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
