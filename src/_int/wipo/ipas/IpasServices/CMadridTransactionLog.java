/**
 * CMadridTransactionLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CMadridTransactionLog  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasInteger internationalRegistrationNbr;

    private _int.wipo.ipas.IpasServices.CMadridTransaction[] madridTransactionList;

    private _int.wipo.ipas.IpasServices.IpasDateTime maxRegistrationEffectiveDate;

    public CMadridTransactionLog() {
    }

    public CMadridTransactionLog(
           _int.wipo.ipas.IpasServices.IpasInteger internationalRegistrationNbr,
           _int.wipo.ipas.IpasServices.CMadridTransaction[] madridTransactionList,
           _int.wipo.ipas.IpasServices.IpasDateTime maxRegistrationEffectiveDate) {
           this.internationalRegistrationNbr = internationalRegistrationNbr;
           this.madridTransactionList = madridTransactionList;
           this.maxRegistrationEffectiveDate = maxRegistrationEffectiveDate;
    }


    /**
     * Gets the internationalRegistrationNbr value for this CMadridTransactionLog.
     * 
     * @return internationalRegistrationNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getInternationalRegistrationNbr() {
        return internationalRegistrationNbr;
    }


    /**
     * Sets the internationalRegistrationNbr value for this CMadridTransactionLog.
     * 
     * @param internationalRegistrationNbr
     */
    public void setInternationalRegistrationNbr(_int.wipo.ipas.IpasServices.IpasInteger internationalRegistrationNbr) {
        this.internationalRegistrationNbr = internationalRegistrationNbr;
    }


    /**
     * Gets the madridTransactionList value for this CMadridTransactionLog.
     * 
     * @return madridTransactionList
     */
    public _int.wipo.ipas.IpasServices.CMadridTransaction[] getMadridTransactionList() {
        return madridTransactionList;
    }


    /**
     * Sets the madridTransactionList value for this CMadridTransactionLog.
     * 
     * @param madridTransactionList
     */
    public void setMadridTransactionList(_int.wipo.ipas.IpasServices.CMadridTransaction[] madridTransactionList) {
        this.madridTransactionList = madridTransactionList;
    }

    public _int.wipo.ipas.IpasServices.CMadridTransaction getMadridTransactionList(int i) {
        return this.madridTransactionList[i];
    }

    public void setMadridTransactionList(int i, _int.wipo.ipas.IpasServices.CMadridTransaction _value) {
        this.madridTransactionList[i] = _value;
    }


    /**
     * Gets the maxRegistrationEffectiveDate value for this CMadridTransactionLog.
     * 
     * @return maxRegistrationEffectiveDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getMaxRegistrationEffectiveDate() {
        return maxRegistrationEffectiveDate;
    }


    /**
     * Sets the maxRegistrationEffectiveDate value for this CMadridTransactionLog.
     * 
     * @param maxRegistrationEffectiveDate
     */
    public void setMaxRegistrationEffectiveDate(_int.wipo.ipas.IpasServices.IpasDateTime maxRegistrationEffectiveDate) {
        this.maxRegistrationEffectiveDate = maxRegistrationEffectiveDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CMadridTransactionLog)) return false;
        CMadridTransactionLog other = (CMadridTransactionLog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.internationalRegistrationNbr==null && other.getInternationalRegistrationNbr()==null) || 
             (this.internationalRegistrationNbr!=null &&
              this.internationalRegistrationNbr.equals(other.getInternationalRegistrationNbr()))) &&
            ((this.madridTransactionList==null && other.getMadridTransactionList()==null) || 
             (this.madridTransactionList!=null &&
              java.util.Arrays.equals(this.madridTransactionList, other.getMadridTransactionList()))) &&
            ((this.maxRegistrationEffectiveDate==null && other.getMaxRegistrationEffectiveDate()==null) || 
             (this.maxRegistrationEffectiveDate!=null &&
              this.maxRegistrationEffectiveDate.equals(other.getMaxRegistrationEffectiveDate())));
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
        if (getInternationalRegistrationNbr() != null) {
            _hashCode += getInternationalRegistrationNbr().hashCode();
        }
        if (getMadridTransactionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMadridTransactionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMadridTransactionList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxRegistrationEffectiveDate() != null) {
            _hashCode += getMaxRegistrationEffectiveDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CMadridTransactionLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMadridTransactionLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalRegistrationNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internationalRegistrationNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("madridTransactionList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "madridTransactionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMadridTransaction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRegistrationEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxRegistrationEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
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
