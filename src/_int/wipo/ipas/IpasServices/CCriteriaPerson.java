/**
 * CCriteriaPerson.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaPerson  implements java.io.Serializable {
    private java.lang.String addressStreetContains;

    private java.lang.String addressStreetInOtherLangContainsWords;

    private _int.wipo.ipas.IpasServices.IpasInteger agentCode;

    private java.lang.Boolean ignoreInactiveAgents;

    private _int.wipo.ipas.IpasServices.IpasInteger individualIdNbr;

    private java.lang.String individualIdNbrTxt;

    private java.lang.String individualIdType;

    private _int.wipo.ipas.IpasServices.IpasInteger legalIdNbr;

    private java.lang.String legalIdNbrTxt;

    private java.lang.String legalIdType;

    private java.lang.String nationalityCountryCode;

    private java.lang.String personNameContainsWords;

    private java.lang.String personNameInOtherLangContainsWords;

    private java.lang.String residenceCountryCode;

    public CCriteriaPerson() {
    }

    public CCriteriaPerson(
           java.lang.String addressStreetContains,
           java.lang.String addressStreetInOtherLangContainsWords,
           _int.wipo.ipas.IpasServices.IpasInteger agentCode,
           java.lang.Boolean ignoreInactiveAgents,
           _int.wipo.ipas.IpasServices.IpasInteger individualIdNbr,
           java.lang.String individualIdNbrTxt,
           java.lang.String individualIdType,
           _int.wipo.ipas.IpasServices.IpasInteger legalIdNbr,
           java.lang.String legalIdNbrTxt,
           java.lang.String legalIdType,
           java.lang.String nationalityCountryCode,
           java.lang.String personNameContainsWords,
           java.lang.String personNameInOtherLangContainsWords,
           java.lang.String residenceCountryCode) {
           this.addressStreetContains = addressStreetContains;
           this.addressStreetInOtherLangContainsWords = addressStreetInOtherLangContainsWords;
           this.agentCode = agentCode;
           this.ignoreInactiveAgents = ignoreInactiveAgents;
           this.individualIdNbr = individualIdNbr;
           this.individualIdNbrTxt = individualIdNbrTxt;
           this.individualIdType = individualIdType;
           this.legalIdNbr = legalIdNbr;
           this.legalIdNbrTxt = legalIdNbrTxt;
           this.legalIdType = legalIdType;
           this.nationalityCountryCode = nationalityCountryCode;
           this.personNameContainsWords = personNameContainsWords;
           this.personNameInOtherLangContainsWords = personNameInOtherLangContainsWords;
           this.residenceCountryCode = residenceCountryCode;
    }


    /**
     * Gets the addressStreetContains value for this CCriteriaPerson.
     * 
     * @return addressStreetContains
     */
    public java.lang.String getAddressStreetContains() {
        return addressStreetContains;
    }


    /**
     * Sets the addressStreetContains value for this CCriteriaPerson.
     * 
     * @param addressStreetContains
     */
    public void setAddressStreetContains(java.lang.String addressStreetContains) {
        this.addressStreetContains = addressStreetContains;
    }


    /**
     * Gets the addressStreetInOtherLangContainsWords value for this CCriteriaPerson.
     * 
     * @return addressStreetInOtherLangContainsWords
     */
    public java.lang.String getAddressStreetInOtherLangContainsWords() {
        return addressStreetInOtherLangContainsWords;
    }


    /**
     * Sets the addressStreetInOtherLangContainsWords value for this CCriteriaPerson.
     * 
     * @param addressStreetInOtherLangContainsWords
     */
    public void setAddressStreetInOtherLangContainsWords(java.lang.String addressStreetInOtherLangContainsWords) {
        this.addressStreetInOtherLangContainsWords = addressStreetInOtherLangContainsWords;
    }


    /**
     * Gets the agentCode value for this CCriteriaPerson.
     * 
     * @return agentCode
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getAgentCode() {
        return agentCode;
    }


    /**
     * Sets the agentCode value for this CCriteriaPerson.
     * 
     * @param agentCode
     */
    public void setAgentCode(_int.wipo.ipas.IpasServices.IpasInteger agentCode) {
        this.agentCode = agentCode;
    }


    /**
     * Gets the ignoreInactiveAgents value for this CCriteriaPerson.
     * 
     * @return ignoreInactiveAgents
     */
    public java.lang.Boolean getIgnoreInactiveAgents() {
        return ignoreInactiveAgents;
    }


    /**
     * Sets the ignoreInactiveAgents value for this CCriteriaPerson.
     * 
     * @param ignoreInactiveAgents
     */
    public void setIgnoreInactiveAgents(java.lang.Boolean ignoreInactiveAgents) {
        this.ignoreInactiveAgents = ignoreInactiveAgents;
    }


    /**
     * Gets the individualIdNbr value for this CCriteriaPerson.
     * 
     * @return individualIdNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getIndividualIdNbr() {
        return individualIdNbr;
    }


    /**
     * Sets the individualIdNbr value for this CCriteriaPerson.
     * 
     * @param individualIdNbr
     */
    public void setIndividualIdNbr(_int.wipo.ipas.IpasServices.IpasInteger individualIdNbr) {
        this.individualIdNbr = individualIdNbr;
    }


    /**
     * Gets the individualIdNbrTxt value for this CCriteriaPerson.
     * 
     * @return individualIdNbrTxt
     */
    public java.lang.String getIndividualIdNbrTxt() {
        return individualIdNbrTxt;
    }


    /**
     * Sets the individualIdNbrTxt value for this CCriteriaPerson.
     * 
     * @param individualIdNbrTxt
     */
    public void setIndividualIdNbrTxt(java.lang.String individualIdNbrTxt) {
        this.individualIdNbrTxt = individualIdNbrTxt;
    }


    /**
     * Gets the individualIdType value for this CCriteriaPerson.
     * 
     * @return individualIdType
     */
    public java.lang.String getIndividualIdType() {
        return individualIdType;
    }


    /**
     * Sets the individualIdType value for this CCriteriaPerson.
     * 
     * @param individualIdType
     */
    public void setIndividualIdType(java.lang.String individualIdType) {
        this.individualIdType = individualIdType;
    }


    /**
     * Gets the legalIdNbr value for this CCriteriaPerson.
     * 
     * @return legalIdNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getLegalIdNbr() {
        return legalIdNbr;
    }


    /**
     * Sets the legalIdNbr value for this CCriteriaPerson.
     * 
     * @param legalIdNbr
     */
    public void setLegalIdNbr(_int.wipo.ipas.IpasServices.IpasInteger legalIdNbr) {
        this.legalIdNbr = legalIdNbr;
    }


    /**
     * Gets the legalIdNbrTxt value for this CCriteriaPerson.
     * 
     * @return legalIdNbrTxt
     */
    public java.lang.String getLegalIdNbrTxt() {
        return legalIdNbrTxt;
    }


    /**
     * Sets the legalIdNbrTxt value for this CCriteriaPerson.
     * 
     * @param legalIdNbrTxt
     */
    public void setLegalIdNbrTxt(java.lang.String legalIdNbrTxt) {
        this.legalIdNbrTxt = legalIdNbrTxt;
    }


    /**
     * Gets the legalIdType value for this CCriteriaPerson.
     * 
     * @return legalIdType
     */
    public java.lang.String getLegalIdType() {
        return legalIdType;
    }


    /**
     * Sets the legalIdType value for this CCriteriaPerson.
     * 
     * @param legalIdType
     */
    public void setLegalIdType(java.lang.String legalIdType) {
        this.legalIdType = legalIdType;
    }


    /**
     * Gets the nationalityCountryCode value for this CCriteriaPerson.
     * 
     * @return nationalityCountryCode
     */
    public java.lang.String getNationalityCountryCode() {
        return nationalityCountryCode;
    }


    /**
     * Sets the nationalityCountryCode value for this CCriteriaPerson.
     * 
     * @param nationalityCountryCode
     */
    public void setNationalityCountryCode(java.lang.String nationalityCountryCode) {
        this.nationalityCountryCode = nationalityCountryCode;
    }


    /**
     * Gets the personNameContainsWords value for this CCriteriaPerson.
     * 
     * @return personNameContainsWords
     */
    public java.lang.String getPersonNameContainsWords() {
        return personNameContainsWords;
    }


    /**
     * Sets the personNameContainsWords value for this CCriteriaPerson.
     * 
     * @param personNameContainsWords
     */
    public void setPersonNameContainsWords(java.lang.String personNameContainsWords) {
        this.personNameContainsWords = personNameContainsWords;
    }


    /**
     * Gets the personNameInOtherLangContainsWords value for this CCriteriaPerson.
     * 
     * @return personNameInOtherLangContainsWords
     */
    public java.lang.String getPersonNameInOtherLangContainsWords() {
        return personNameInOtherLangContainsWords;
    }


    /**
     * Sets the personNameInOtherLangContainsWords value for this CCriteriaPerson.
     * 
     * @param personNameInOtherLangContainsWords
     */
    public void setPersonNameInOtherLangContainsWords(java.lang.String personNameInOtherLangContainsWords) {
        this.personNameInOtherLangContainsWords = personNameInOtherLangContainsWords;
    }


    /**
     * Gets the residenceCountryCode value for this CCriteriaPerson.
     * 
     * @return residenceCountryCode
     */
    public java.lang.String getResidenceCountryCode() {
        return residenceCountryCode;
    }


    /**
     * Sets the residenceCountryCode value for this CCriteriaPerson.
     * 
     * @param residenceCountryCode
     */
    public void setResidenceCountryCode(java.lang.String residenceCountryCode) {
        this.residenceCountryCode = residenceCountryCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaPerson)) return false;
        CCriteriaPerson other = (CCriteriaPerson) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressStreetContains==null && other.getAddressStreetContains()==null) || 
             (this.addressStreetContains!=null &&
              this.addressStreetContains.equals(other.getAddressStreetContains()))) &&
            ((this.addressStreetInOtherLangContainsWords==null && other.getAddressStreetInOtherLangContainsWords()==null) || 
             (this.addressStreetInOtherLangContainsWords!=null &&
              this.addressStreetInOtherLangContainsWords.equals(other.getAddressStreetInOtherLangContainsWords()))) &&
            ((this.agentCode==null && other.getAgentCode()==null) || 
             (this.agentCode!=null &&
              this.agentCode.equals(other.getAgentCode()))) &&
            ((this.ignoreInactiveAgents==null && other.getIgnoreInactiveAgents()==null) || 
             (this.ignoreInactiveAgents!=null &&
              this.ignoreInactiveAgents.equals(other.getIgnoreInactiveAgents()))) &&
            ((this.individualIdNbr==null && other.getIndividualIdNbr()==null) || 
             (this.individualIdNbr!=null &&
              this.individualIdNbr.equals(other.getIndividualIdNbr()))) &&
            ((this.individualIdNbrTxt==null && other.getIndividualIdNbrTxt()==null) || 
             (this.individualIdNbrTxt!=null &&
              this.individualIdNbrTxt.equals(other.getIndividualIdNbrTxt()))) &&
            ((this.individualIdType==null && other.getIndividualIdType()==null) || 
             (this.individualIdType!=null &&
              this.individualIdType.equals(other.getIndividualIdType()))) &&
            ((this.legalIdNbr==null && other.getLegalIdNbr()==null) || 
             (this.legalIdNbr!=null &&
              this.legalIdNbr.equals(other.getLegalIdNbr()))) &&
            ((this.legalIdNbrTxt==null && other.getLegalIdNbrTxt()==null) || 
             (this.legalIdNbrTxt!=null &&
              this.legalIdNbrTxt.equals(other.getLegalIdNbrTxt()))) &&
            ((this.legalIdType==null && other.getLegalIdType()==null) || 
             (this.legalIdType!=null &&
              this.legalIdType.equals(other.getLegalIdType()))) &&
            ((this.nationalityCountryCode==null && other.getNationalityCountryCode()==null) || 
             (this.nationalityCountryCode!=null &&
              this.nationalityCountryCode.equals(other.getNationalityCountryCode()))) &&
            ((this.personNameContainsWords==null && other.getPersonNameContainsWords()==null) || 
             (this.personNameContainsWords!=null &&
              this.personNameContainsWords.equals(other.getPersonNameContainsWords()))) &&
            ((this.personNameInOtherLangContainsWords==null && other.getPersonNameInOtherLangContainsWords()==null) || 
             (this.personNameInOtherLangContainsWords!=null &&
              this.personNameInOtherLangContainsWords.equals(other.getPersonNameInOtherLangContainsWords()))) &&
            ((this.residenceCountryCode==null && other.getResidenceCountryCode()==null) || 
             (this.residenceCountryCode!=null &&
              this.residenceCountryCode.equals(other.getResidenceCountryCode())));
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
        if (getAddressStreetContains() != null) {
            _hashCode += getAddressStreetContains().hashCode();
        }
        if (getAddressStreetInOtherLangContainsWords() != null) {
            _hashCode += getAddressStreetInOtherLangContainsWords().hashCode();
        }
        if (getAgentCode() != null) {
            _hashCode += getAgentCode().hashCode();
        }
        if (getIgnoreInactiveAgents() != null) {
            _hashCode += getIgnoreInactiveAgents().hashCode();
        }
        if (getIndividualIdNbr() != null) {
            _hashCode += getIndividualIdNbr().hashCode();
        }
        if (getIndividualIdNbrTxt() != null) {
            _hashCode += getIndividualIdNbrTxt().hashCode();
        }
        if (getIndividualIdType() != null) {
            _hashCode += getIndividualIdType().hashCode();
        }
        if (getLegalIdNbr() != null) {
            _hashCode += getLegalIdNbr().hashCode();
        }
        if (getLegalIdNbrTxt() != null) {
            _hashCode += getLegalIdNbrTxt().hashCode();
        }
        if (getLegalIdType() != null) {
            _hashCode += getLegalIdType().hashCode();
        }
        if (getNationalityCountryCode() != null) {
            _hashCode += getNationalityCountryCode().hashCode();
        }
        if (getPersonNameContainsWords() != null) {
            _hashCode += getPersonNameContainsWords().hashCode();
        }
        if (getPersonNameInOtherLangContainsWords() != null) {
            _hashCode += getPersonNameInOtherLangContainsWords().hashCode();
        }
        if (getResidenceCountryCode() != null) {
            _hashCode += getResidenceCountryCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaPerson.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaPerson"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressStreetContains");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressStreetContains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressStreetInOtherLangContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressStreetInOtherLangContainsWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoreInactiveAgents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ignoreInactiveAgents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualIdNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "individualIdNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualIdNbrTxt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "individualIdNbrTxt"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalIdNbrTxt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "legalIdNbrTxt"));
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
        elemField.setFieldName("nationalityCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalityCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personNameContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personNameContainsWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personNameInOtherLangContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personNameInOtherLangContainsWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residenceCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "residenceCountryCode"));
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
