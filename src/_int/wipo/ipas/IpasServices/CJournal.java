/**
 * CJournal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CJournal  implements java.io.Serializable {
    private java.lang.Boolean indClosed;

    private _int.wipo.ipas.IpasServices.CJournalId journalId;

    private java.lang.String journalName;

    private _int.wipo.ipas.IpasServices.IpasDateTime notificationDate;

    private _int.wipo.ipas.IpasServices.IpasDateTime publicationDate;

    public CJournal() {
    }

    public CJournal(
           java.lang.Boolean indClosed,
           _int.wipo.ipas.IpasServices.CJournalId journalId,
           java.lang.String journalName,
           _int.wipo.ipas.IpasServices.IpasDateTime notificationDate,
           _int.wipo.ipas.IpasServices.IpasDateTime publicationDate) {
           this.indClosed = indClosed;
           this.journalId = journalId;
           this.journalName = journalName;
           this.notificationDate = notificationDate;
           this.publicationDate = publicationDate;
    }


    /**
     * Gets the indClosed value for this CJournal.
     * 
     * @return indClosed
     */
    public java.lang.Boolean getIndClosed() {
        return indClosed;
    }


    /**
     * Sets the indClosed value for this CJournal.
     * 
     * @param indClosed
     */
    public void setIndClosed(java.lang.Boolean indClosed) {
        this.indClosed = indClosed;
    }


    /**
     * Gets the journalId value for this CJournal.
     * 
     * @return journalId
     */
    public _int.wipo.ipas.IpasServices.CJournalId getJournalId() {
        return journalId;
    }


    /**
     * Sets the journalId value for this CJournal.
     * 
     * @param journalId
     */
    public void setJournalId(_int.wipo.ipas.IpasServices.CJournalId journalId) {
        this.journalId = journalId;
    }


    /**
     * Gets the journalName value for this CJournal.
     * 
     * @return journalName
     */
    public java.lang.String getJournalName() {
        return journalName;
    }


    /**
     * Sets the journalName value for this CJournal.
     * 
     * @param journalName
     */
    public void setJournalName(java.lang.String journalName) {
        this.journalName = journalName;
    }


    /**
     * Gets the notificationDate value for this CJournal.
     * 
     * @return notificationDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getNotificationDate() {
        return notificationDate;
    }


    /**
     * Sets the notificationDate value for this CJournal.
     * 
     * @param notificationDate
     */
    public void setNotificationDate(_int.wipo.ipas.IpasServices.IpasDateTime notificationDate) {
        this.notificationDate = notificationDate;
    }


    /**
     * Gets the publicationDate value for this CJournal.
     * 
     * @return publicationDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getPublicationDate() {
        return publicationDate;
    }


    /**
     * Sets the publicationDate value for this CJournal.
     * 
     * @param publicationDate
     */
    public void setPublicationDate(_int.wipo.ipas.IpasServices.IpasDateTime publicationDate) {
        this.publicationDate = publicationDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CJournal)) return false;
        CJournal other = (CJournal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.indClosed==null && other.getIndClosed()==null) || 
             (this.indClosed!=null &&
              this.indClosed.equals(other.getIndClosed()))) &&
            ((this.journalId==null && other.getJournalId()==null) || 
             (this.journalId!=null &&
              this.journalId.equals(other.getJournalId()))) &&
            ((this.journalName==null && other.getJournalName()==null) || 
             (this.journalName!=null &&
              this.journalName.equals(other.getJournalName()))) &&
            ((this.notificationDate==null && other.getNotificationDate()==null) || 
             (this.notificationDate!=null &&
              this.notificationDate.equals(other.getNotificationDate()))) &&
            ((this.publicationDate==null && other.getPublicationDate()==null) || 
             (this.publicationDate!=null &&
              this.publicationDate.equals(other.getPublicationDate())));
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
        if (getIndClosed() != null) {
            _hashCode += getIndClosed().hashCode();
        }
        if (getJournalId() != null) {
            _hashCode += getJournalId().hashCode();
        }
        if (getJournalName() != null) {
            _hashCode += getJournalName().hashCode();
        }
        if (getNotificationDate() != null) {
            _hashCode += getNotificationDate().hashCode();
        }
        if (getPublicationDate() != null) {
            _hashCode += getPublicationDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CJournal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "journalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournalId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journalName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "journalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notificationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicationDate"));
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
