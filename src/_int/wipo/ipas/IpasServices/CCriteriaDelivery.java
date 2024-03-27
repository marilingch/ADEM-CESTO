/**
 * CCriteriaDelivery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaDelivery  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime creationFrom;

    private _int.wipo.ipas.IpasServices.IpasDateTime creationTo;

    private _int.wipo.ipas.IpasServices.CDeliveryId deliveryId;

    private _int.wipo.ipas.IpasServices.IpasInteger deliveryNbrFrom;

    private _int.wipo.ipas.IpasServices.IpasInteger deliveryNbrTo;

    private java.lang.Boolean deliveryPending;

    private java.lang.String deliveryType;

    private java.lang.Boolean printPending;

    private _int.wipo.ipas.IpasServices.CUserId receivingUserId;

    private java.lang.Boolean receptionPending;

    private _int.wipo.ipas.IpasServices.CUserId sendingUserId;

    private _int.wipo.ipas.IpasServices.COfficeSectionId targetOfficeSectionId;

    public CCriteriaDelivery() {
    }

    public CCriteriaDelivery(
           _int.wipo.ipas.IpasServices.IpasDateTime creationFrom,
           _int.wipo.ipas.IpasServices.IpasDateTime creationTo,
           _int.wipo.ipas.IpasServices.CDeliveryId deliveryId,
           _int.wipo.ipas.IpasServices.IpasInteger deliveryNbrFrom,
           _int.wipo.ipas.IpasServices.IpasInteger deliveryNbrTo,
           java.lang.Boolean deliveryPending,
           java.lang.String deliveryType,
           java.lang.Boolean printPending,
           _int.wipo.ipas.IpasServices.CUserId receivingUserId,
           java.lang.Boolean receptionPending,
           _int.wipo.ipas.IpasServices.CUserId sendingUserId,
           _int.wipo.ipas.IpasServices.COfficeSectionId targetOfficeSectionId) {
           this.creationFrom = creationFrom;
           this.creationTo = creationTo;
           this.deliveryId = deliveryId;
           this.deliveryNbrFrom = deliveryNbrFrom;
           this.deliveryNbrTo = deliveryNbrTo;
           this.deliveryPending = deliveryPending;
           this.deliveryType = deliveryType;
           this.printPending = printPending;
           this.receivingUserId = receivingUserId;
           this.receptionPending = receptionPending;
           this.sendingUserId = sendingUserId;
           this.targetOfficeSectionId = targetOfficeSectionId;
    }


    /**
     * Gets the creationFrom value for this CCriteriaDelivery.
     * 
     * @return creationFrom
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getCreationFrom() {
        return creationFrom;
    }


    /**
     * Sets the creationFrom value for this CCriteriaDelivery.
     * 
     * @param creationFrom
     */
    public void setCreationFrom(_int.wipo.ipas.IpasServices.IpasDateTime creationFrom) {
        this.creationFrom = creationFrom;
    }


    /**
     * Gets the creationTo value for this CCriteriaDelivery.
     * 
     * @return creationTo
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getCreationTo() {
        return creationTo;
    }


    /**
     * Sets the creationTo value for this CCriteriaDelivery.
     * 
     * @param creationTo
     */
    public void setCreationTo(_int.wipo.ipas.IpasServices.IpasDateTime creationTo) {
        this.creationTo = creationTo;
    }


    /**
     * Gets the deliveryId value for this CCriteriaDelivery.
     * 
     * @return deliveryId
     */
    public _int.wipo.ipas.IpasServices.CDeliveryId getDeliveryId() {
        return deliveryId;
    }


    /**
     * Sets the deliveryId value for this CCriteriaDelivery.
     * 
     * @param deliveryId
     */
    public void setDeliveryId(_int.wipo.ipas.IpasServices.CDeliveryId deliveryId) {
        this.deliveryId = deliveryId;
    }


    /**
     * Gets the deliveryNbrFrom value for this CCriteriaDelivery.
     * 
     * @return deliveryNbrFrom
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDeliveryNbrFrom() {
        return deliveryNbrFrom;
    }


    /**
     * Sets the deliveryNbrFrom value for this CCriteriaDelivery.
     * 
     * @param deliveryNbrFrom
     */
    public void setDeliveryNbrFrom(_int.wipo.ipas.IpasServices.IpasInteger deliveryNbrFrom) {
        this.deliveryNbrFrom = deliveryNbrFrom;
    }


    /**
     * Gets the deliveryNbrTo value for this CCriteriaDelivery.
     * 
     * @return deliveryNbrTo
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDeliveryNbrTo() {
        return deliveryNbrTo;
    }


    /**
     * Sets the deliveryNbrTo value for this CCriteriaDelivery.
     * 
     * @param deliveryNbrTo
     */
    public void setDeliveryNbrTo(_int.wipo.ipas.IpasServices.IpasInteger deliveryNbrTo) {
        this.deliveryNbrTo = deliveryNbrTo;
    }


    /**
     * Gets the deliveryPending value for this CCriteriaDelivery.
     * 
     * @return deliveryPending
     */
    public java.lang.Boolean getDeliveryPending() {
        return deliveryPending;
    }


    /**
     * Sets the deliveryPending value for this CCriteriaDelivery.
     * 
     * @param deliveryPending
     */
    public void setDeliveryPending(java.lang.Boolean deliveryPending) {
        this.deliveryPending = deliveryPending;
    }


    /**
     * Gets the deliveryType value for this CCriteriaDelivery.
     * 
     * @return deliveryType
     */
    public java.lang.String getDeliveryType() {
        return deliveryType;
    }


    /**
     * Sets the deliveryType value for this CCriteriaDelivery.
     * 
     * @param deliveryType
     */
    public void setDeliveryType(java.lang.String deliveryType) {
        this.deliveryType = deliveryType;
    }


    /**
     * Gets the printPending value for this CCriteriaDelivery.
     * 
     * @return printPending
     */
    public java.lang.Boolean getPrintPending() {
        return printPending;
    }


    /**
     * Sets the printPending value for this CCriteriaDelivery.
     * 
     * @param printPending
     */
    public void setPrintPending(java.lang.Boolean printPending) {
        this.printPending = printPending;
    }


    /**
     * Gets the receivingUserId value for this CCriteriaDelivery.
     * 
     * @return receivingUserId
     */
    public _int.wipo.ipas.IpasServices.CUserId getReceivingUserId() {
        return receivingUserId;
    }


    /**
     * Sets the receivingUserId value for this CCriteriaDelivery.
     * 
     * @param receivingUserId
     */
    public void setReceivingUserId(_int.wipo.ipas.IpasServices.CUserId receivingUserId) {
        this.receivingUserId = receivingUserId;
    }


    /**
     * Gets the receptionPending value for this CCriteriaDelivery.
     * 
     * @return receptionPending
     */
    public java.lang.Boolean getReceptionPending() {
        return receptionPending;
    }


    /**
     * Sets the receptionPending value for this CCriteriaDelivery.
     * 
     * @param receptionPending
     */
    public void setReceptionPending(java.lang.Boolean receptionPending) {
        this.receptionPending = receptionPending;
    }


    /**
     * Gets the sendingUserId value for this CCriteriaDelivery.
     * 
     * @return sendingUserId
     */
    public _int.wipo.ipas.IpasServices.CUserId getSendingUserId() {
        return sendingUserId;
    }


    /**
     * Sets the sendingUserId value for this CCriteriaDelivery.
     * 
     * @param sendingUserId
     */
    public void setSendingUserId(_int.wipo.ipas.IpasServices.CUserId sendingUserId) {
        this.sendingUserId = sendingUserId;
    }


    /**
     * Gets the targetOfficeSectionId value for this CCriteriaDelivery.
     * 
     * @return targetOfficeSectionId
     */
    public _int.wipo.ipas.IpasServices.COfficeSectionId getTargetOfficeSectionId() {
        return targetOfficeSectionId;
    }


    /**
     * Sets the targetOfficeSectionId value for this CCriteriaDelivery.
     * 
     * @param targetOfficeSectionId
     */
    public void setTargetOfficeSectionId(_int.wipo.ipas.IpasServices.COfficeSectionId targetOfficeSectionId) {
        this.targetOfficeSectionId = targetOfficeSectionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaDelivery)) return false;
        CCriteriaDelivery other = (CCriteriaDelivery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creationFrom==null && other.getCreationFrom()==null) || 
             (this.creationFrom!=null &&
              this.creationFrom.equals(other.getCreationFrom()))) &&
            ((this.creationTo==null && other.getCreationTo()==null) || 
             (this.creationTo!=null &&
              this.creationTo.equals(other.getCreationTo()))) &&
            ((this.deliveryId==null && other.getDeliveryId()==null) || 
             (this.deliveryId!=null &&
              this.deliveryId.equals(other.getDeliveryId()))) &&
            ((this.deliveryNbrFrom==null && other.getDeliveryNbrFrom()==null) || 
             (this.deliveryNbrFrom!=null &&
              this.deliveryNbrFrom.equals(other.getDeliveryNbrFrom()))) &&
            ((this.deliveryNbrTo==null && other.getDeliveryNbrTo()==null) || 
             (this.deliveryNbrTo!=null &&
              this.deliveryNbrTo.equals(other.getDeliveryNbrTo()))) &&
            ((this.deliveryPending==null && other.getDeliveryPending()==null) || 
             (this.deliveryPending!=null &&
              this.deliveryPending.equals(other.getDeliveryPending()))) &&
            ((this.deliveryType==null && other.getDeliveryType()==null) || 
             (this.deliveryType!=null &&
              this.deliveryType.equals(other.getDeliveryType()))) &&
            ((this.printPending==null && other.getPrintPending()==null) || 
             (this.printPending!=null &&
              this.printPending.equals(other.getPrintPending()))) &&
            ((this.receivingUserId==null && other.getReceivingUserId()==null) || 
             (this.receivingUserId!=null &&
              this.receivingUserId.equals(other.getReceivingUserId()))) &&
            ((this.receptionPending==null && other.getReceptionPending()==null) || 
             (this.receptionPending!=null &&
              this.receptionPending.equals(other.getReceptionPending()))) &&
            ((this.sendingUserId==null && other.getSendingUserId()==null) || 
             (this.sendingUserId!=null &&
              this.sendingUserId.equals(other.getSendingUserId()))) &&
            ((this.targetOfficeSectionId==null && other.getTargetOfficeSectionId()==null) || 
             (this.targetOfficeSectionId!=null &&
              this.targetOfficeSectionId.equals(other.getTargetOfficeSectionId())));
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
        if (getCreationFrom() != null) {
            _hashCode += getCreationFrom().hashCode();
        }
        if (getCreationTo() != null) {
            _hashCode += getCreationTo().hashCode();
        }
        if (getDeliveryId() != null) {
            _hashCode += getDeliveryId().hashCode();
        }
        if (getDeliveryNbrFrom() != null) {
            _hashCode += getDeliveryNbrFrom().hashCode();
        }
        if (getDeliveryNbrTo() != null) {
            _hashCode += getDeliveryNbrTo().hashCode();
        }
        if (getDeliveryPending() != null) {
            _hashCode += getDeliveryPending().hashCode();
        }
        if (getDeliveryType() != null) {
            _hashCode += getDeliveryType().hashCode();
        }
        if (getPrintPending() != null) {
            _hashCode += getPrintPending().hashCode();
        }
        if (getReceivingUserId() != null) {
            _hashCode += getReceivingUserId().hashCode();
        }
        if (getReceptionPending() != null) {
            _hashCode += getReceptionPending().hashCode();
        }
        if (getSendingUserId() != null) {
            _hashCode += getSendingUserId().hashCode();
        }
        if (getTargetOfficeSectionId() != null) {
            _hashCode += getTargetOfficeSectionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaDelivery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaDelivery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationTo"));
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
        elemField.setFieldName("deliveryNbrFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryNbrFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryNbrTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryNbrTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryPending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("printPending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivingUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receivingUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receptionPending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receptionPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendingUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendingUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetOfficeSectionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetOfficeSectionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficeSectionId"));
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
