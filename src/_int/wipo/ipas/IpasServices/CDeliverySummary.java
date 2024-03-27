/**
 * CDeliverySummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CDeliverySummary  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime creation;

    private _int.wipo.ipas.IpasServices.IpasDateTime delivery;

    private _int.wipo.ipas.IpasServices.CDeliveryId deliveryId;

    private java.lang.String deliveryType;

    private _int.wipo.ipas.IpasServices.IpasDateTime printing;

    private _int.wipo.ipas.IpasServices.COfficeSectionId receivingOfficeSectionId;

    private _int.wipo.ipas.IpasServices.CUser receivingUser;

    private _int.wipo.ipas.IpasServices.IpasDateTime reception;

    private _int.wipo.ipas.IpasServices.CUser sendingUser;

    public CDeliverySummary() {
    }

    public CDeliverySummary(
           _int.wipo.ipas.IpasServices.IpasDateTime creation,
           _int.wipo.ipas.IpasServices.IpasDateTime delivery,
           _int.wipo.ipas.IpasServices.CDeliveryId deliveryId,
           java.lang.String deliveryType,
           _int.wipo.ipas.IpasServices.IpasDateTime printing,
           _int.wipo.ipas.IpasServices.COfficeSectionId receivingOfficeSectionId,
           _int.wipo.ipas.IpasServices.CUser receivingUser,
           _int.wipo.ipas.IpasServices.IpasDateTime reception,
           _int.wipo.ipas.IpasServices.CUser sendingUser) {
           this.creation = creation;
           this.delivery = delivery;
           this.deliveryId = deliveryId;
           this.deliveryType = deliveryType;
           this.printing = printing;
           this.receivingOfficeSectionId = receivingOfficeSectionId;
           this.receivingUser = receivingUser;
           this.reception = reception;
           this.sendingUser = sendingUser;
    }


    /**
     * Gets the creation value for this CDeliverySummary.
     * 
     * @return creation
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getCreation() {
        return creation;
    }


    /**
     * Sets the creation value for this CDeliverySummary.
     * 
     * @param creation
     */
    public void setCreation(_int.wipo.ipas.IpasServices.IpasDateTime creation) {
        this.creation = creation;
    }


    /**
     * Gets the delivery value for this CDeliverySummary.
     * 
     * @return delivery
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getDelivery() {
        return delivery;
    }


    /**
     * Sets the delivery value for this CDeliverySummary.
     * 
     * @param delivery
     */
    public void setDelivery(_int.wipo.ipas.IpasServices.IpasDateTime delivery) {
        this.delivery = delivery;
    }


    /**
     * Gets the deliveryId value for this CDeliverySummary.
     * 
     * @return deliveryId
     */
    public _int.wipo.ipas.IpasServices.CDeliveryId getDeliveryId() {
        return deliveryId;
    }


    /**
     * Sets the deliveryId value for this CDeliverySummary.
     * 
     * @param deliveryId
     */
    public void setDeliveryId(_int.wipo.ipas.IpasServices.CDeliveryId deliveryId) {
        this.deliveryId = deliveryId;
    }


    /**
     * Gets the deliveryType value for this CDeliverySummary.
     * 
     * @return deliveryType
     */
    public java.lang.String getDeliveryType() {
        return deliveryType;
    }


    /**
     * Sets the deliveryType value for this CDeliverySummary.
     * 
     * @param deliveryType
     */
    public void setDeliveryType(java.lang.String deliveryType) {
        this.deliveryType = deliveryType;
    }


    /**
     * Gets the printing value for this CDeliverySummary.
     * 
     * @return printing
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getPrinting() {
        return printing;
    }


    /**
     * Sets the printing value for this CDeliverySummary.
     * 
     * @param printing
     */
    public void setPrinting(_int.wipo.ipas.IpasServices.IpasDateTime printing) {
        this.printing = printing;
    }


    /**
     * Gets the receivingOfficeSectionId value for this CDeliverySummary.
     * 
     * @return receivingOfficeSectionId
     */
    public _int.wipo.ipas.IpasServices.COfficeSectionId getReceivingOfficeSectionId() {
        return receivingOfficeSectionId;
    }


    /**
     * Sets the receivingOfficeSectionId value for this CDeliverySummary.
     * 
     * @param receivingOfficeSectionId
     */
    public void setReceivingOfficeSectionId(_int.wipo.ipas.IpasServices.COfficeSectionId receivingOfficeSectionId) {
        this.receivingOfficeSectionId = receivingOfficeSectionId;
    }


    /**
     * Gets the receivingUser value for this CDeliverySummary.
     * 
     * @return receivingUser
     */
    public _int.wipo.ipas.IpasServices.CUser getReceivingUser() {
        return receivingUser;
    }


    /**
     * Sets the receivingUser value for this CDeliverySummary.
     * 
     * @param receivingUser
     */
    public void setReceivingUser(_int.wipo.ipas.IpasServices.CUser receivingUser) {
        this.receivingUser = receivingUser;
    }


    /**
     * Gets the reception value for this CDeliverySummary.
     * 
     * @return reception
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getReception() {
        return reception;
    }


    /**
     * Sets the reception value for this CDeliverySummary.
     * 
     * @param reception
     */
    public void setReception(_int.wipo.ipas.IpasServices.IpasDateTime reception) {
        this.reception = reception;
    }


    /**
     * Gets the sendingUser value for this CDeliverySummary.
     * 
     * @return sendingUser
     */
    public _int.wipo.ipas.IpasServices.CUser getSendingUser() {
        return sendingUser;
    }


    /**
     * Sets the sendingUser value for this CDeliverySummary.
     * 
     * @param sendingUser
     */
    public void setSendingUser(_int.wipo.ipas.IpasServices.CUser sendingUser) {
        this.sendingUser = sendingUser;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDeliverySummary)) return false;
        CDeliverySummary other = (CDeliverySummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creation==null && other.getCreation()==null) || 
             (this.creation!=null &&
              this.creation.equals(other.getCreation()))) &&
            ((this.delivery==null && other.getDelivery()==null) || 
             (this.delivery!=null &&
              this.delivery.equals(other.getDelivery()))) &&
            ((this.deliveryId==null && other.getDeliveryId()==null) || 
             (this.deliveryId!=null &&
              this.deliveryId.equals(other.getDeliveryId()))) &&
            ((this.deliveryType==null && other.getDeliveryType()==null) || 
             (this.deliveryType!=null &&
              this.deliveryType.equals(other.getDeliveryType()))) &&
            ((this.printing==null && other.getPrinting()==null) || 
             (this.printing!=null &&
              this.printing.equals(other.getPrinting()))) &&
            ((this.receivingOfficeSectionId==null && other.getReceivingOfficeSectionId()==null) || 
             (this.receivingOfficeSectionId!=null &&
              this.receivingOfficeSectionId.equals(other.getReceivingOfficeSectionId()))) &&
            ((this.receivingUser==null && other.getReceivingUser()==null) || 
             (this.receivingUser!=null &&
              this.receivingUser.equals(other.getReceivingUser()))) &&
            ((this.reception==null && other.getReception()==null) || 
             (this.reception!=null &&
              this.reception.equals(other.getReception()))) &&
            ((this.sendingUser==null && other.getSendingUser()==null) || 
             (this.sendingUser!=null &&
              this.sendingUser.equals(other.getSendingUser())));
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
        if (getCreation() != null) {
            _hashCode += getCreation().hashCode();
        }
        if (getDelivery() != null) {
            _hashCode += getDelivery().hashCode();
        }
        if (getDeliveryId() != null) {
            _hashCode += getDeliveryId().hashCode();
        }
        if (getDeliveryType() != null) {
            _hashCode += getDeliveryType().hashCode();
        }
        if (getPrinting() != null) {
            _hashCode += getPrinting().hashCode();
        }
        if (getReceivingOfficeSectionId() != null) {
            _hashCode += getReceivingOfficeSectionId().hashCode();
        }
        if (getReceivingUser() != null) {
            _hashCode += getReceivingUser().hashCode();
        }
        if (getReception() != null) {
            _hashCode += getReception().hashCode();
        }
        if (getSendingUser() != null) {
            _hashCode += getSendingUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDeliverySummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliverySummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivingOfficeSectionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receivingOfficeSectionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficeSectionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivingUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receivingUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUser"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reception");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reception"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendingUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendingUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUser"));
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
