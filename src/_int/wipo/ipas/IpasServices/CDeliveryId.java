/**
 * CDeliveryId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CDeliveryId  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasInteger deliveryNbr;

    private _int.wipo.ipas.IpasServices.IpasInteger deliverySeries;

    public CDeliveryId() {
    }

    public CDeliveryId(
           _int.wipo.ipas.IpasServices.IpasInteger deliveryNbr,
           _int.wipo.ipas.IpasServices.IpasInteger deliverySeries) {
           this.deliveryNbr = deliveryNbr;
           this.deliverySeries = deliverySeries;
    }


    /**
     * Gets the deliveryNbr value for this CDeliveryId.
     * 
     * @return deliveryNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDeliveryNbr() {
        return deliveryNbr;
    }


    /**
     * Sets the deliveryNbr value for this CDeliveryId.
     * 
     * @param deliveryNbr
     */
    public void setDeliveryNbr(_int.wipo.ipas.IpasServices.IpasInteger deliveryNbr) {
        this.deliveryNbr = deliveryNbr;
    }


    /**
     * Gets the deliverySeries value for this CDeliveryId.
     * 
     * @return deliverySeries
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDeliverySeries() {
        return deliverySeries;
    }


    /**
     * Sets the deliverySeries value for this CDeliveryId.
     * 
     * @param deliverySeries
     */
    public void setDeliverySeries(_int.wipo.ipas.IpasServices.IpasInteger deliverySeries) {
        this.deliverySeries = deliverySeries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDeliveryId)) return false;
        CDeliveryId other = (CDeliveryId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deliveryNbr==null && other.getDeliveryNbr()==null) || 
             (this.deliveryNbr!=null &&
              this.deliveryNbr.equals(other.getDeliveryNbr()))) &&
            ((this.deliverySeries==null && other.getDeliverySeries()==null) || 
             (this.deliverySeries!=null &&
              this.deliverySeries.equals(other.getDeliverySeries())));
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
        if (getDeliveryNbr() != null) {
            _hashCode += getDeliveryNbr().hashCode();
        }
        if (getDeliverySeries() != null) {
            _hashCode += getDeliverySeries().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDeliveryId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliverySeries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliverySeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
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
