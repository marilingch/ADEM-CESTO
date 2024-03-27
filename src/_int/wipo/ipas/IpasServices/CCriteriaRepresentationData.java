/**
 * CCriteriaRepresentationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaRepresentationData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasInteger agentCode;

    private java.lang.Boolean indNoRepresentative;

    private java.lang.String individualIdNbr;

    private java.lang.String individualIdType;

    private java.lang.String legalIdNbr;

    private java.lang.String legalIdType;

    private java.lang.String representativeNameContainsWords;

    private java.lang.String representativeNameInOtherLangContainsWords;

    private java.lang.String representativeType;

    public CCriteriaRepresentationData() {
    }

    public CCriteriaRepresentationData(
           _int.wipo.ipas.IpasServices.IpasInteger agentCode,
           java.lang.Boolean indNoRepresentative,
           java.lang.String individualIdNbr,
           java.lang.String individualIdType,
           java.lang.String legalIdNbr,
           java.lang.String legalIdType,
           java.lang.String representativeNameContainsWords,
           java.lang.String representativeNameInOtherLangContainsWords,
           java.lang.String representativeType) {
           this.agentCode = agentCode;
           this.indNoRepresentative = indNoRepresentative;
           this.individualIdNbr = individualIdNbr;
           this.individualIdType = individualIdType;
           this.legalIdNbr = legalIdNbr;
           this.legalIdType = legalIdType;
           this.representativeNameContainsWords = representativeNameContainsWords;
           this.representativeNameInOtherLangContainsWords = representativeNameInOtherLangContainsWords;
           this.representativeType = representativeType;
    }


    /**
     * Gets the agentCode value for this CCriteriaRepresentationData.
     * 
     * @return agentCode
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getAgentCode() {
        return agentCode;
    }


    /**
     * Sets the agentCode value for this CCriteriaRepresentationData.
     * 
     * @param agentCode
     */
    public void setAgentCode(_int.wipo.ipas.IpasServices.IpasInteger agentCode) {
        this.agentCode = agentCode;
    }


    /**
     * Gets the indNoRepresentative value for this CCriteriaRepresentationData.
     * 
     * @return indNoRepresentative
     */
    public java.lang.Boolean getIndNoRepresentative() {
        return indNoRepresentative;
    }


    /**
     * Sets the indNoRepresentative value for this CCriteriaRepresentationData.
     * 
     * @param indNoRepresentative
     */
    public void setIndNoRepresentative(java.lang.Boolean indNoRepresentative) {
        this.indNoRepresentative = indNoRepresentative;
    }


    /**
     * Gets the individualIdNbr value for this CCriteriaRepresentationData.
     * 
     * @return individualIdNbr
     */
    public java.lang.String getIndividualIdNbr() {
        return individualIdNbr;
    }


    /**
     * Sets the individualIdNbr value for this CCriteriaRepresentationData.
     * 
     * @param individualIdNbr
     */
    public void setIndividualIdNbr(java.lang.String individualIdNbr) {
        this.individualIdNbr = individualIdNbr;
    }


    /**
     * Gets the individualIdType value for this CCriteriaRepresentationData.
     * 
     * @return individualIdType
     */
    public java.lang.String getIndividualIdType() {
        return individualIdType;
    }


    /**
     * Sets the individualIdType value for this CCriteriaRepresentationData.
     * 
     * @param individualIdType
     */
    public void setIndividualIdType(java.lang.String individualIdType) {
        this.individualIdType = individualIdType;
    }


    /**
     * Gets the legalIdNbr value for this CCriteriaRepresentationData.
     * 
     * @return legalIdNbr
     */
    public java.lang.String getLegalIdNbr() {
        return legalIdNbr;
    }


    /**
     * Sets the legalIdNbr value for this CCriteriaRepresentationData.
     * 
     * @param legalIdNbr
     */
    public void setLegalIdNbr(java.lang.String legalIdNbr) {
        this.legalIdNbr = legalIdNbr;
    }


    /**
     * Gets the legalIdType value for this CCriteriaRepresentationData.
     * 
     * @return legalIdType
     */
    public java.lang.String getLegalIdType() {
        return legalIdType;
    }


    /**
     * Sets the legalIdType value for this CCriteriaRepresentationData.
     * 
     * @param legalIdType
     */
    public void setLegalIdType(java.lang.String legalIdType) {
        this.legalIdType = legalIdType;
    }


    /**
     * Gets the representativeNameContainsWords value for this CCriteriaRepresentationData.
     * 
     * @return representativeNameContainsWords
     */
    public java.lang.String getRepresentativeNameContainsWords() {
        return representativeNameContainsWords;
    }


    /**
     * Sets the representativeNameContainsWords value for this CCriteriaRepresentationData.
     * 
     * @param representativeNameContainsWords
     */
    public void setRepresentativeNameContainsWords(java.lang.String representativeNameContainsWords) {
        this.representativeNameContainsWords = representativeNameContainsWords;
    }


    /**
     * Gets the representativeNameInOtherLangContainsWords value for this CCriteriaRepresentationData.
     * 
     * @return representativeNameInOtherLangContainsWords
     */
    public java.lang.String getRepresentativeNameInOtherLangContainsWords() {
        return representativeNameInOtherLangContainsWords;
    }


    /**
     * Sets the representativeNameInOtherLangContainsWords value for this CCriteriaRepresentationData.
     * 
     * @param representativeNameInOtherLangContainsWords
     */
    public void setRepresentativeNameInOtherLangContainsWords(java.lang.String representativeNameInOtherLangContainsWords) {
        this.representativeNameInOtherLangContainsWords = representativeNameInOtherLangContainsWords;
    }


    /**
     * Gets the representativeType value for this CCriteriaRepresentationData.
     * 
     * @return representativeType
     */
    public java.lang.String getRepresentativeType() {
        return representativeType;
    }


    /**
     * Sets the representativeType value for this CCriteriaRepresentationData.
     * 
     * @param representativeType
     */
    public void setRepresentativeType(java.lang.String representativeType) {
        this.representativeType = representativeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaRepresentationData)) return false;
        CCriteriaRepresentationData other = (CCriteriaRepresentationData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agentCode==null && other.getAgentCode()==null) || 
             (this.agentCode!=null &&
              this.agentCode.equals(other.getAgentCode()))) &&
            ((this.indNoRepresentative==null && other.getIndNoRepresentative()==null) || 
             (this.indNoRepresentative!=null &&
              this.indNoRepresentative.equals(other.getIndNoRepresentative()))) &&
            ((this.individualIdNbr==null && other.getIndividualIdNbr()==null) || 
             (this.individualIdNbr!=null &&
              this.individualIdNbr.equals(other.getIndividualIdNbr()))) &&
            ((this.individualIdType==null && other.getIndividualIdType()==null) || 
             (this.individualIdType!=null &&
              this.individualIdType.equals(other.getIndividualIdType()))) &&
            ((this.legalIdNbr==null && other.getLegalIdNbr()==null) || 
             (this.legalIdNbr!=null &&
              this.legalIdNbr.equals(other.getLegalIdNbr()))) &&
            ((this.legalIdType==null && other.getLegalIdType()==null) || 
             (this.legalIdType!=null &&
              this.legalIdType.equals(other.getLegalIdType()))) &&
            ((this.representativeNameContainsWords==null && other.getRepresentativeNameContainsWords()==null) || 
             (this.representativeNameContainsWords!=null &&
              this.representativeNameContainsWords.equals(other.getRepresentativeNameContainsWords()))) &&
            ((this.representativeNameInOtherLangContainsWords==null && other.getRepresentativeNameInOtherLangContainsWords()==null) || 
             (this.representativeNameInOtherLangContainsWords!=null &&
              this.representativeNameInOtherLangContainsWords.equals(other.getRepresentativeNameInOtherLangContainsWords()))) &&
            ((this.representativeType==null && other.getRepresentativeType()==null) || 
             (this.representativeType!=null &&
              this.representativeType.equals(other.getRepresentativeType())));
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
        if (getAgentCode() != null) {
            _hashCode += getAgentCode().hashCode();
        }
        if (getIndNoRepresentative() != null) {
            _hashCode += getIndNoRepresentative().hashCode();
        }
        if (getIndividualIdNbr() != null) {
            _hashCode += getIndividualIdNbr().hashCode();
        }
        if (getIndividualIdType() != null) {
            _hashCode += getIndividualIdType().hashCode();
        }
        if (getLegalIdNbr() != null) {
            _hashCode += getLegalIdNbr().hashCode();
        }
        if (getLegalIdType() != null) {
            _hashCode += getLegalIdType().hashCode();
        }
        if (getRepresentativeNameContainsWords() != null) {
            _hashCode += getRepresentativeNameContainsWords().hashCode();
        }
        if (getRepresentativeNameInOtherLangContainsWords() != null) {
            _hashCode += getRepresentativeNameInOtherLangContainsWords().hashCode();
        }
        if (getRepresentativeType() != null) {
            _hashCode += getRepresentativeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaRepresentationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaRepresentationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indNoRepresentative");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indNoRepresentative"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualIdNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "individualIdNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "individualIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalIdNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "legalIdNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "legalIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representativeNameContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "representativeNameContainsWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representativeNameInOtherLangContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "representativeNameInOtherLangContainsWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representativeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "representativeType"));
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
