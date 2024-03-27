/**
 * CDelivery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CDelivery  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime creation;

    private _int.wipo.ipas.IpasServices.IpasDateTime delivery;

    private _int.wipo.ipas.IpasServices.CDeliveryId deliveryId;

    private java.lang.String deliveryType;

    private _int.wipo.ipas.IpasServices.CDocumentId[] documentIdList;

    private _int.wipo.ipas.IpasServices.CFileSectionId[] fileSectionIdList;

    private java.lang.String notes;

    private _int.wipo.ipas.IpasServices.COfficedocId[] officedocIdList;

    private _int.wipo.ipas.IpasServices.IpasDateTime printing;

    private _int.wipo.ipas.IpasServices.COfficeSectionId receivingOfficeSectionId;

    private _int.wipo.ipas.IpasServices.CUser receivingUser;

    private _int.wipo.ipas.IpasServices.IpasDateTime reception;

    private _int.wipo.ipas.IpasServices.CUser sendingUser;

    public CDelivery() {
    }

    public CDelivery(
           _int.wipo.ipas.IpasServices.IpasDateTime creation,
           _int.wipo.ipas.IpasServices.IpasDateTime delivery,
           _int.wipo.ipas.IpasServices.CDeliveryId deliveryId,
           java.lang.String deliveryType,
           _int.wipo.ipas.IpasServices.CDocumentId[] documentIdList,
           _int.wipo.ipas.IpasServices.CFileSectionId[] fileSectionIdList,
           java.lang.String notes,
           _int.wipo.ipas.IpasServices.COfficedocId[] officedocIdList,
           _int.wipo.ipas.IpasServices.IpasDateTime printing,
           _int.wipo.ipas.IpasServices.COfficeSectionId receivingOfficeSectionId,
           _int.wipo.ipas.IpasServices.CUser receivingUser,
           _int.wipo.ipas.IpasServices.IpasDateTime reception,
           _int.wipo.ipas.IpasServices.CUser sendingUser) {
           this.creation = creation;
           this.delivery = delivery;
           this.deliveryId = deliveryId;
           this.deliveryType = deliveryType;
           this.documentIdList = documentIdList;
           this.fileSectionIdList = fileSectionIdList;
           this.notes = notes;
           this.officedocIdList = officedocIdList;
           this.printing = printing;
           this.receivingOfficeSectionId = receivingOfficeSectionId;
           this.receivingUser = receivingUser;
           this.reception = reception;
           this.sendingUser = sendingUser;
    }


    /**
     * Gets the creation value for this CDelivery.
     * 
     * @return creation
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getCreation() {
        return creation;
    }


    /**
     * Sets the creation value for this CDelivery.
     * 
     * @param creation
     */
    public void setCreation(_int.wipo.ipas.IpasServices.IpasDateTime creation) {
        this.creation = creation;
    }


    /**
     * Gets the delivery value for this CDelivery.
     * 
     * @return delivery
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getDelivery() {
        return delivery;
    }


    /**
     * Sets the delivery value for this CDelivery.
     * 
     * @param delivery
     */
    public void setDelivery(_int.wipo.ipas.IpasServices.IpasDateTime delivery) {
        this.delivery = delivery;
    }


    /**
     * Gets the deliveryId value for this CDelivery.
     * 
     * @return deliveryId
     */
    public _int.wipo.ipas.IpasServices.CDeliveryId getDeliveryId() {
        return deliveryId;
    }


    /**
     * Sets the deliveryId value for this CDelivery.
     * 
     * @param deliveryId
     */
    public void setDeliveryId(_int.wipo.ipas.IpasServices.CDeliveryId deliveryId) {
        this.deliveryId = deliveryId;
    }


    /**
     * Gets the deliveryType value for this CDelivery.
     * 
     * @return deliveryType
     */
    public java.lang.String getDeliveryType() {
        return deliveryType;
    }


    /**
     * Sets the deliveryType value for this CDelivery.
     * 
     * @param deliveryType
     */
    public void setDeliveryType(java.lang.String deliveryType) {
        this.deliveryType = deliveryType;
    }


    /**
     * Gets the documentIdList value for this CDelivery.
     * 
     * @return documentIdList
     */
    public _int.wipo.ipas.IpasServices.CDocumentId[] getDocumentIdList() {
        return documentIdList;
    }


    /**
     * Sets the documentIdList value for this CDelivery.
     * 
     * @param documentIdList
     */
    public void setDocumentIdList(_int.wipo.ipas.IpasServices.CDocumentId[] documentIdList) {
        this.documentIdList = documentIdList;
    }

    public _int.wipo.ipas.IpasServices.CDocumentId getDocumentIdList(int i) {
        return this.documentIdList[i];
    }

    public void setDocumentIdList(int i, _int.wipo.ipas.IpasServices.CDocumentId _value) {
        this.documentIdList[i] = _value;
    }


    /**
     * Gets the fileSectionIdList value for this CDelivery.
     * 
     * @return fileSectionIdList
     */
    public _int.wipo.ipas.IpasServices.CFileSectionId[] getFileSectionIdList() {
        return fileSectionIdList;
    }


    /**
     * Sets the fileSectionIdList value for this CDelivery.
     * 
     * @param fileSectionIdList
     */
    public void setFileSectionIdList(_int.wipo.ipas.IpasServices.CFileSectionId[] fileSectionIdList) {
        this.fileSectionIdList = fileSectionIdList;
    }

    public _int.wipo.ipas.IpasServices.CFileSectionId getFileSectionIdList(int i) {
        return this.fileSectionIdList[i];
    }

    public void setFileSectionIdList(int i, _int.wipo.ipas.IpasServices.CFileSectionId _value) {
        this.fileSectionIdList[i] = _value;
    }


    /**
     * Gets the notes value for this CDelivery.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CDelivery.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the officedocIdList value for this CDelivery.
     * 
     * @return officedocIdList
     */
    public _int.wipo.ipas.IpasServices.COfficedocId[] getOfficedocIdList() {
        return officedocIdList;
    }


    /**
     * Sets the officedocIdList value for this CDelivery.
     * 
     * @param officedocIdList
     */
    public void setOfficedocIdList(_int.wipo.ipas.IpasServices.COfficedocId[] officedocIdList) {
        this.officedocIdList = officedocIdList;
    }

    public _int.wipo.ipas.IpasServices.COfficedocId getOfficedocIdList(int i) {
        return this.officedocIdList[i];
    }

    public void setOfficedocIdList(int i, _int.wipo.ipas.IpasServices.COfficedocId _value) {
        this.officedocIdList[i] = _value;
    }


    /**
     * Gets the printing value for this CDelivery.
     * 
     * @return printing
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getPrinting() {
        return printing;
    }


    /**
     * Sets the printing value for this CDelivery.
     * 
     * @param printing
     */
    public void setPrinting(_int.wipo.ipas.IpasServices.IpasDateTime printing) {
        this.printing = printing;
    }


    /**
     * Gets the receivingOfficeSectionId value for this CDelivery.
     * 
     * @return receivingOfficeSectionId
     */
    public _int.wipo.ipas.IpasServices.COfficeSectionId getReceivingOfficeSectionId() {
        return receivingOfficeSectionId;
    }


    /**
     * Sets the receivingOfficeSectionId value for this CDelivery.
     * 
     * @param receivingOfficeSectionId
     */
    public void setReceivingOfficeSectionId(_int.wipo.ipas.IpasServices.COfficeSectionId receivingOfficeSectionId) {
        this.receivingOfficeSectionId = receivingOfficeSectionId;
    }


    /**
     * Gets the receivingUser value for this CDelivery.
     * 
     * @return receivingUser
     */
    public _int.wipo.ipas.IpasServices.CUser getReceivingUser() {
        return receivingUser;
    }


    /**
     * Sets the receivingUser value for this CDelivery.
     * 
     * @param receivingUser
     */
    public void setReceivingUser(_int.wipo.ipas.IpasServices.CUser receivingUser) {
        this.receivingUser = receivingUser;
    }


    /**
     * Gets the reception value for this CDelivery.
     * 
     * @return reception
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getReception() {
        return reception;
    }


    /**
     * Sets the reception value for this CDelivery.
     * 
     * @param reception
     */
    public void setReception(_int.wipo.ipas.IpasServices.IpasDateTime reception) {
        this.reception = reception;
    }


    /**
     * Gets the sendingUser value for this CDelivery.
     * 
     * @return sendingUser
     */
    public _int.wipo.ipas.IpasServices.CUser getSendingUser() {
        return sendingUser;
    }


    /**
     * Sets the sendingUser value for this CDelivery.
     * 
     * @param sendingUser
     */
    public void setSendingUser(_int.wipo.ipas.IpasServices.CUser sendingUser) {
        this.sendingUser = sendingUser;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDelivery)) return false;
        CDelivery other = (CDelivery) obj;
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
            ((this.documentIdList==null && other.getDocumentIdList()==null) || 
             (this.documentIdList!=null &&
              java.util.Arrays.equals(this.documentIdList, other.getDocumentIdList()))) &&
            ((this.fileSectionIdList==null && other.getFileSectionIdList()==null) || 
             (this.fileSectionIdList!=null &&
              java.util.Arrays.equals(this.fileSectionIdList, other.getFileSectionIdList()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.officedocIdList==null && other.getOfficedocIdList()==null) || 
             (this.officedocIdList!=null &&
              java.util.Arrays.equals(this.officedocIdList, other.getOfficedocIdList()))) &&
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
        if (getDocumentIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFileSectionIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileSectionIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileSectionIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getOfficedocIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfficedocIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfficedocIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(CDelivery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDelivery"));
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
        elemField.setFieldName("documentIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSectionIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSectionIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileSectionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officedocIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officedocIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
