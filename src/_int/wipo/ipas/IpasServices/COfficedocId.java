/**
 * COfficedocId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class COfficedocId  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasInteger offidocNbr;

    private java.lang.String offidocOrigin;

    private _int.wipo.ipas.IpasServices.IpasInteger offidocSeries;

    private java.lang.String selected;

    public COfficedocId() {
    }

    public COfficedocId(
           _int.wipo.ipas.IpasServices.IpasInteger offidocNbr,
           java.lang.String offidocOrigin,
           _int.wipo.ipas.IpasServices.IpasInteger offidocSeries,
           java.lang.String selected) {
           this.offidocNbr = offidocNbr;
           this.offidocOrigin = offidocOrigin;
           this.offidocSeries = offidocSeries;
           this.selected = selected;
    }


    /**
     * Gets the offidocNbr value for this COfficedocId.
     * 
     * @return offidocNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getOffidocNbr() {
        return offidocNbr;
    }


    /**
     * Sets the offidocNbr value for this COfficedocId.
     * 
     * @param offidocNbr
     */
    public void setOffidocNbr(_int.wipo.ipas.IpasServices.IpasInteger offidocNbr) {
        this.offidocNbr = offidocNbr;
    }


    /**
     * Gets the offidocOrigin value for this COfficedocId.
     * 
     * @return offidocOrigin
     */
    public java.lang.String getOffidocOrigin() {
        return offidocOrigin;
    }


    /**
     * Sets the offidocOrigin value for this COfficedocId.
     * 
     * @param offidocOrigin
     */
    public void setOffidocOrigin(java.lang.String offidocOrigin) {
        this.offidocOrigin = offidocOrigin;
    }


    /**
     * Gets the offidocSeries value for this COfficedocId.
     * 
     * @return offidocSeries
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getOffidocSeries() {
        return offidocSeries;
    }


    /**
     * Sets the offidocSeries value for this COfficedocId.
     * 
     * @param offidocSeries
     */
    public void setOffidocSeries(_int.wipo.ipas.IpasServices.IpasInteger offidocSeries) {
        this.offidocSeries = offidocSeries;
    }


    /**
     * Gets the selected value for this COfficedocId.
     * 
     * @return selected
     */
    public java.lang.String getSelected() {
        return selected;
    }


    /**
     * Sets the selected value for this COfficedocId.
     * 
     * @param selected
     */
    public void setSelected(java.lang.String selected) {
        this.selected = selected;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof COfficedocId)) return false;
        COfficedocId other = (COfficedocId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offidocNbr==null && other.getOffidocNbr()==null) || 
             (this.offidocNbr!=null &&
              this.offidocNbr.equals(other.getOffidocNbr()))) &&
            ((this.offidocOrigin==null && other.getOffidocOrigin()==null) || 
             (this.offidocOrigin!=null &&
              this.offidocOrigin.equals(other.getOffidocOrigin()))) &&
            ((this.offidocSeries==null && other.getOffidocSeries()==null) || 
             (this.offidocSeries!=null &&
              this.offidocSeries.equals(other.getOffidocSeries()))) &&
            ((this.selected==null && other.getSelected()==null) || 
             (this.selected!=null &&
              this.selected.equals(other.getSelected())));
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
        if (getOffidocNbr() != null) {
            _hashCode += getOffidocNbr().hashCode();
        }
        if (getOffidocOrigin() != null) {
            _hashCode += getOffidocOrigin().hashCode();
        }
        if (getOffidocSeries() != null) {
            _hashCode += getOffidocSeries().hashCode();
        }
        if (getSelected() != null) {
            _hashCode += getSelected().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(COfficedocId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offidocNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offidocNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offidocOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offidocOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offidocSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offidocSeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selected"));
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
