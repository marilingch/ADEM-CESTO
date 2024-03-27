/**
 * COfficeSectionId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class COfficeSectionId  implements java.io.Serializable {
    private java.lang.String officeDepartmentCode;

    private java.lang.String officeDivisionCode;

    private java.lang.String officeSectionCode;

    public COfficeSectionId() {
    }

    public COfficeSectionId(
           java.lang.String officeDepartmentCode,
           java.lang.String officeDivisionCode,
           java.lang.String officeSectionCode) {
           this.officeDepartmentCode = officeDepartmentCode;
           this.officeDivisionCode = officeDivisionCode;
           this.officeSectionCode = officeSectionCode;
    }


    /**
     * Gets the officeDepartmentCode value for this COfficeSectionId.
     * 
     * @return officeDepartmentCode
     */
    public java.lang.String getOfficeDepartmentCode() {
        return officeDepartmentCode;
    }


    /**
     * Sets the officeDepartmentCode value for this COfficeSectionId.
     * 
     * @param officeDepartmentCode
     */
    public void setOfficeDepartmentCode(java.lang.String officeDepartmentCode) {
        this.officeDepartmentCode = officeDepartmentCode;
    }


    /**
     * Gets the officeDivisionCode value for this COfficeSectionId.
     * 
     * @return officeDivisionCode
     */
    public java.lang.String getOfficeDivisionCode() {
        return officeDivisionCode;
    }


    /**
     * Sets the officeDivisionCode value for this COfficeSectionId.
     * 
     * @param officeDivisionCode
     */
    public void setOfficeDivisionCode(java.lang.String officeDivisionCode) {
        this.officeDivisionCode = officeDivisionCode;
    }


    /**
     * Gets the officeSectionCode value for this COfficeSectionId.
     * 
     * @return officeSectionCode
     */
    public java.lang.String getOfficeSectionCode() {
        return officeSectionCode;
    }


    /**
     * Sets the officeSectionCode value for this COfficeSectionId.
     * 
     * @param officeSectionCode
     */
    public void setOfficeSectionCode(java.lang.String officeSectionCode) {
        this.officeSectionCode = officeSectionCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof COfficeSectionId)) return false;
        COfficeSectionId other = (COfficeSectionId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.officeDepartmentCode==null && other.getOfficeDepartmentCode()==null) || 
             (this.officeDepartmentCode!=null &&
              this.officeDepartmentCode.equals(other.getOfficeDepartmentCode()))) &&
            ((this.officeDivisionCode==null && other.getOfficeDivisionCode()==null) || 
             (this.officeDivisionCode!=null &&
              this.officeDivisionCode.equals(other.getOfficeDivisionCode()))) &&
            ((this.officeSectionCode==null && other.getOfficeSectionCode()==null) || 
             (this.officeSectionCode!=null &&
              this.officeSectionCode.equals(other.getOfficeSectionCode())));
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
        if (getOfficeDepartmentCode() != null) {
            _hashCode += getOfficeDepartmentCode().hashCode();
        }
        if (getOfficeDivisionCode() != null) {
            _hashCode += getOfficeDivisionCode().hashCode();
        }
        if (getOfficeSectionCode() != null) {
            _hashCode += getOfficeSectionCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(COfficeSectionId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficeSectionId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeDepartmentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officeDepartmentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeDivisionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officeDivisionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeSectionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officeSectionCode"));
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
