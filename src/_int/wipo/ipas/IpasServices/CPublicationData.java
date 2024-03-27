/**
 * CPublicationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CPublicationData  implements java.io.Serializable {
    private java.lang.String journalCode;

    private _int.wipo.ipas.IpasServices.IpasDateTime publicationDate;

    private java.lang.String publicationNotes;

    private _int.wipo.ipas.IpasServices.IpasDateTime specialPublicationDate;

    private _int.wipo.ipas.IpasServices.IpasDateTime specialPublicationRequestDate;

    public CPublicationData() {
    }

    public CPublicationData(
           java.lang.String journalCode,
           _int.wipo.ipas.IpasServices.IpasDateTime publicationDate,
           java.lang.String publicationNotes,
           _int.wipo.ipas.IpasServices.IpasDateTime specialPublicationDate,
           _int.wipo.ipas.IpasServices.IpasDateTime specialPublicationRequestDate) {
           this.journalCode = journalCode;
           this.publicationDate = publicationDate;
           this.publicationNotes = publicationNotes;
           this.specialPublicationDate = specialPublicationDate;
           this.specialPublicationRequestDate = specialPublicationRequestDate;
    }


    /**
     * Gets the journalCode value for this CPublicationData.
     * 
     * @return journalCode
     */
    public java.lang.String getJournalCode() {
        return journalCode;
    }


    /**
     * Sets the journalCode value for this CPublicationData.
     * 
     * @param journalCode
     */
    public void setJournalCode(java.lang.String journalCode) {
        this.journalCode = journalCode;
    }


    /**
     * Gets the publicationDate value for this CPublicationData.
     * 
     * @return publicationDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getPublicationDate() {
        return publicationDate;
    }


    /**
     * Sets the publicationDate value for this CPublicationData.
     * 
     * @param publicationDate
     */
    public void setPublicationDate(_int.wipo.ipas.IpasServices.IpasDateTime publicationDate) {
        this.publicationDate = publicationDate;
    }


    /**
     * Gets the publicationNotes value for this CPublicationData.
     * 
     * @return publicationNotes
     */
    public java.lang.String getPublicationNotes() {
        return publicationNotes;
    }


    /**
     * Sets the publicationNotes value for this CPublicationData.
     * 
     * @param publicationNotes
     */
    public void setPublicationNotes(java.lang.String publicationNotes) {
        this.publicationNotes = publicationNotes;
    }


    /**
     * Gets the specialPublicationDate value for this CPublicationData.
     * 
     * @return specialPublicationDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getSpecialPublicationDate() {
        return specialPublicationDate;
    }


    /**
     * Sets the specialPublicationDate value for this CPublicationData.
     * 
     * @param specialPublicationDate
     */
    public void setSpecialPublicationDate(_int.wipo.ipas.IpasServices.IpasDateTime specialPublicationDate) {
        this.specialPublicationDate = specialPublicationDate;
    }


    /**
     * Gets the specialPublicationRequestDate value for this CPublicationData.
     * 
     * @return specialPublicationRequestDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getSpecialPublicationRequestDate() {
        return specialPublicationRequestDate;
    }


    /**
     * Sets the specialPublicationRequestDate value for this CPublicationData.
     * 
     * @param specialPublicationRequestDate
     */
    public void setSpecialPublicationRequestDate(_int.wipo.ipas.IpasServices.IpasDateTime specialPublicationRequestDate) {
        this.specialPublicationRequestDate = specialPublicationRequestDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CPublicationData)) return false;
        CPublicationData other = (CPublicationData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.journalCode==null && other.getJournalCode()==null) || 
             (this.journalCode!=null &&
              this.journalCode.equals(other.getJournalCode()))) &&
            ((this.publicationDate==null && other.getPublicationDate()==null) || 
             (this.publicationDate!=null &&
              this.publicationDate.equals(other.getPublicationDate()))) &&
            ((this.publicationNotes==null && other.getPublicationNotes()==null) || 
             (this.publicationNotes!=null &&
              this.publicationNotes.equals(other.getPublicationNotes()))) &&
            ((this.specialPublicationDate==null && other.getSpecialPublicationDate()==null) || 
             (this.specialPublicationDate!=null &&
              this.specialPublicationDate.equals(other.getSpecialPublicationDate()))) &&
            ((this.specialPublicationRequestDate==null && other.getSpecialPublicationRequestDate()==null) || 
             (this.specialPublicationRequestDate!=null &&
              this.specialPublicationRequestDate.equals(other.getSpecialPublicationRequestDate())));
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
        if (getJournalCode() != null) {
            _hashCode += getJournalCode().hashCode();
        }
        if (getPublicationDate() != null) {
            _hashCode += getPublicationDate().hashCode();
        }
        if (getPublicationNotes() != null) {
            _hashCode += getPublicationNotes().hashCode();
        }
        if (getSpecialPublicationDate() != null) {
            _hashCode += getSpecialPublicationDate().hashCode();
        }
        if (getSpecialPublicationRequestDate() != null) {
            _hashCode += getSpecialPublicationRequestDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CPublicationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPublicationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "journalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicationNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicationNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialPublicationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "specialPublicationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialPublicationRequestDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "specialPublicationRequestDate"));
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
