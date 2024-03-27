/**
 * CCriteriaJournal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaJournal  implements java.io.Serializable {
    private java.lang.Boolean indToBeClosed;

    private java.lang.Boolean indToBePublished;

    private _int.wipo.ipas.IpasServices.CJournalId journalId;

    private _int.wipo.ipas.IpasServices.IpasDateTime publicationDateMax;

    private _int.wipo.ipas.IpasServices.IpasDateTime publicationDateMin;

    public CCriteriaJournal() {
    }

    public CCriteriaJournal(
           java.lang.Boolean indToBeClosed,
           java.lang.Boolean indToBePublished,
           _int.wipo.ipas.IpasServices.CJournalId journalId,
           _int.wipo.ipas.IpasServices.IpasDateTime publicationDateMax,
           _int.wipo.ipas.IpasServices.IpasDateTime publicationDateMin) {
           this.indToBeClosed = indToBeClosed;
           this.indToBePublished = indToBePublished;
           this.journalId = journalId;
           this.publicationDateMax = publicationDateMax;
           this.publicationDateMin = publicationDateMin;
    }


    /**
     * Gets the indToBeClosed value for this CCriteriaJournal.
     * 
     * @return indToBeClosed
     */
    public java.lang.Boolean getIndToBeClosed() {
        return indToBeClosed;
    }


    /**
     * Sets the indToBeClosed value for this CCriteriaJournal.
     * 
     * @param indToBeClosed
     */
    public void setIndToBeClosed(java.lang.Boolean indToBeClosed) {
        this.indToBeClosed = indToBeClosed;
    }


    /**
     * Gets the indToBePublished value for this CCriteriaJournal.
     * 
     * @return indToBePublished
     */
    public java.lang.Boolean getIndToBePublished() {
        return indToBePublished;
    }


    /**
     * Sets the indToBePublished value for this CCriteriaJournal.
     * 
     * @param indToBePublished
     */
    public void setIndToBePublished(java.lang.Boolean indToBePublished) {
        this.indToBePublished = indToBePublished;
    }


    /**
     * Gets the journalId value for this CCriteriaJournal.
     * 
     * @return journalId
     */
    public _int.wipo.ipas.IpasServices.CJournalId getJournalId() {
        return journalId;
    }


    /**
     * Sets the journalId value for this CCriteriaJournal.
     * 
     * @param journalId
     */
    public void setJournalId(_int.wipo.ipas.IpasServices.CJournalId journalId) {
        this.journalId = journalId;
    }


    /**
     * Gets the publicationDateMax value for this CCriteriaJournal.
     * 
     * @return publicationDateMax
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getPublicationDateMax() {
        return publicationDateMax;
    }


    /**
     * Sets the publicationDateMax value for this CCriteriaJournal.
     * 
     * @param publicationDateMax
     */
    public void setPublicationDateMax(_int.wipo.ipas.IpasServices.IpasDateTime publicationDateMax) {
        this.publicationDateMax = publicationDateMax;
    }


    /**
     * Gets the publicationDateMin value for this CCriteriaJournal.
     * 
     * @return publicationDateMin
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getPublicationDateMin() {
        return publicationDateMin;
    }


    /**
     * Sets the publicationDateMin value for this CCriteriaJournal.
     * 
     * @param publicationDateMin
     */
    public void setPublicationDateMin(_int.wipo.ipas.IpasServices.IpasDateTime publicationDateMin) {
        this.publicationDateMin = publicationDateMin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaJournal)) return false;
        CCriteriaJournal other = (CCriteriaJournal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.indToBeClosed==null && other.getIndToBeClosed()==null) || 
             (this.indToBeClosed!=null &&
              this.indToBeClosed.equals(other.getIndToBeClosed()))) &&
            ((this.indToBePublished==null && other.getIndToBePublished()==null) || 
             (this.indToBePublished!=null &&
              this.indToBePublished.equals(other.getIndToBePublished()))) &&
            ((this.journalId==null && other.getJournalId()==null) || 
             (this.journalId!=null &&
              this.journalId.equals(other.getJournalId()))) &&
            ((this.publicationDateMax==null && other.getPublicationDateMax()==null) || 
             (this.publicationDateMax!=null &&
              this.publicationDateMax.equals(other.getPublicationDateMax()))) &&
            ((this.publicationDateMin==null && other.getPublicationDateMin()==null) || 
             (this.publicationDateMin!=null &&
              this.publicationDateMin.equals(other.getPublicationDateMin())));
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
        if (getIndToBeClosed() != null) {
            _hashCode += getIndToBeClosed().hashCode();
        }
        if (getIndToBePublished() != null) {
            _hashCode += getIndToBePublished().hashCode();
        }
        if (getJournalId() != null) {
            _hashCode += getJournalId().hashCode();
        }
        if (getPublicationDateMax() != null) {
            _hashCode += getPublicationDateMax().hashCode();
        }
        if (getPublicationDateMin() != null) {
            _hashCode += getPublicationDateMin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaJournal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaJournal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indToBeClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indToBeClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indToBePublished");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indToBePublished"));
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
        elemField.setFieldName("publicationDateMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicationDateMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicationDateMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicationDateMin"));
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
