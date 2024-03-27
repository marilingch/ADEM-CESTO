/**
 * CPerson.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CPerson  implements java.io.Serializable {
    private java.lang.String addressStreet;

    private java.lang.String addressStreetInOtherLang;

    private java.lang.String addressZone;

    private _int.wipo.ipas.IpasServices.IpasInteger agentCode;

    private java.lang.String cityCode;

    private java.lang.String cityName;

    private _int.wipo.ipas.IpasServices.IpasDateTime companyRegisterRegistrationDate;

    private _int.wipo.ipas.IpasServices.IpasInteger companyRegisterRegistrationNbr;

    private java.lang.String email;

    private java.lang.Boolean indCompany;

    private java.lang.String individualIdNbr;

    private java.lang.String individualIdType;

    private java.lang.String legalIdNbr;

    private java.lang.String legalIdType;

    private java.lang.String legalNature;

    private java.lang.String legalNatureInOtherLang;

    private java.lang.String nationalityCountryCode;

    private java.lang.String personGroupCode;

    private java.lang.String personGroupName;

    private java.lang.String personName;

    private java.lang.String personNameInOtherLang;

    private java.lang.String residenceCountryCode;

    private java.lang.String stateCode;

    private java.lang.String stateName;

    private java.lang.String telephone;

    private java.lang.String zipCode;

    public CPerson() {
    }

    public CPerson(
           java.lang.String addressStreet,
           java.lang.String addressStreetInOtherLang,
           java.lang.String addressZone,
           _int.wipo.ipas.IpasServices.IpasInteger agentCode,
           java.lang.String cityCode,
           java.lang.String cityName,
           _int.wipo.ipas.IpasServices.IpasDateTime companyRegisterRegistrationDate,
           _int.wipo.ipas.IpasServices.IpasInteger companyRegisterRegistrationNbr,
           java.lang.String email,
           java.lang.Boolean indCompany,
           java.lang.String individualIdNbr,
           java.lang.String individualIdType,
           java.lang.String legalIdNbr,
           java.lang.String legalIdType,
           java.lang.String legalNature,
           java.lang.String legalNatureInOtherLang,
           java.lang.String nationalityCountryCode,
           java.lang.String personGroupCode,
           java.lang.String personGroupName,
           java.lang.String personName,
           java.lang.String personNameInOtherLang,
           java.lang.String residenceCountryCode,
           java.lang.String stateCode,
           java.lang.String stateName,
           java.lang.String telephone,
           java.lang.String zipCode) {
           this.addressStreet = addressStreet;
           this.addressStreetInOtherLang = addressStreetInOtherLang;
           this.addressZone = addressZone;
           this.agentCode = agentCode;
           this.cityCode = cityCode;
           this.cityName = cityName;
           this.companyRegisterRegistrationDate = companyRegisterRegistrationDate;
           this.companyRegisterRegistrationNbr = companyRegisterRegistrationNbr;
           this.email = email;
           this.indCompany = indCompany;
           this.individualIdNbr = individualIdNbr;
           this.individualIdType = individualIdType;
           this.legalIdNbr = legalIdNbr;
           this.legalIdType = legalIdType;
           this.legalNature = legalNature;
           this.legalNatureInOtherLang = legalNatureInOtherLang;
           this.nationalityCountryCode = nationalityCountryCode;
           this.personGroupCode = personGroupCode;
           this.personGroupName = personGroupName;
           this.personName = personName;
           this.personNameInOtherLang = personNameInOtherLang;
           this.residenceCountryCode = residenceCountryCode;
           this.stateCode = stateCode;
           this.stateName = stateName;
           this.telephone = telephone;
           this.zipCode = zipCode;
    }


    /**
     * Gets the addressStreet value for this CPerson.
     * 
     * @return addressStreet
     */
    public java.lang.String getAddressStreet() {
        return addressStreet;
    }


    /**
     * Sets the addressStreet value for this CPerson.
     * 
     * @param addressStreet
     */
    public void setAddressStreet(java.lang.String addressStreet) {
        this.addressStreet = addressStreet;
    }


    /**
     * Gets the addressStreetInOtherLang value for this CPerson.
     * 
     * @return addressStreetInOtherLang
     */
    public java.lang.String getAddressStreetInOtherLang() {
        return addressStreetInOtherLang;
    }


    /**
     * Sets the addressStreetInOtherLang value for this CPerson.
     * 
     * @param addressStreetInOtherLang
     */
    public void setAddressStreetInOtherLang(java.lang.String addressStreetInOtherLang) {
        this.addressStreetInOtherLang = addressStreetInOtherLang;
    }


    /**
     * Gets the addressZone value for this CPerson.
     * 
     * @return addressZone
     */
    public java.lang.String getAddressZone() {
        return addressZone;
    }


    /**
     * Sets the addressZone value for this CPerson.
     * 
     * @param addressZone
     */
    public void setAddressZone(java.lang.String addressZone) {
        this.addressZone = addressZone;
    }


    /**
     * Gets the agentCode value for this CPerson.
     * 
     * @return agentCode
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getAgentCode() {
        return agentCode;
    }


    /**
     * Sets the agentCode value for this CPerson.
     * 
     * @param agentCode
     */
    public void setAgentCode(_int.wipo.ipas.IpasServices.IpasInteger agentCode) {
        this.agentCode = agentCode;
    }


    /**
     * Gets the cityCode value for this CPerson.
     * 
     * @return cityCode
     */
    public java.lang.String getCityCode() {
        return cityCode;
    }


    /**
     * Sets the cityCode value for this CPerson.
     * 
     * @param cityCode
     */
    public void setCityCode(java.lang.String cityCode) {
        this.cityCode = cityCode;
    }


    /**
     * Gets the cityName value for this CPerson.
     * 
     * @return cityName
     */
    public java.lang.String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this CPerson.
     * 
     * @param cityName
     */
    public void setCityName(java.lang.String cityName) {
        this.cityName = cityName;
    }


    /**
     * Gets the companyRegisterRegistrationDate value for this CPerson.
     * 
     * @return companyRegisterRegistrationDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getCompanyRegisterRegistrationDate() {
        return companyRegisterRegistrationDate;
    }


    /**
     * Sets the companyRegisterRegistrationDate value for this CPerson.
     * 
     * @param companyRegisterRegistrationDate
     */
    public void setCompanyRegisterRegistrationDate(_int.wipo.ipas.IpasServices.IpasDateTime companyRegisterRegistrationDate) {
        this.companyRegisterRegistrationDate = companyRegisterRegistrationDate;
    }


    /**
     * Gets the companyRegisterRegistrationNbr value for this CPerson.
     * 
     * @return companyRegisterRegistrationNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getCompanyRegisterRegistrationNbr() {
        return companyRegisterRegistrationNbr;
    }


    /**
     * Sets the companyRegisterRegistrationNbr value for this CPerson.
     * 
     * @param companyRegisterRegistrationNbr
     */
    public void setCompanyRegisterRegistrationNbr(_int.wipo.ipas.IpasServices.IpasInteger companyRegisterRegistrationNbr) {
        this.companyRegisterRegistrationNbr = companyRegisterRegistrationNbr;
    }


    /**
     * Gets the email value for this CPerson.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this CPerson.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the indCompany value for this CPerson.
     * 
     * @return indCompany
     */
    public java.lang.Boolean getIndCompany() {
        return indCompany;
    }


    /**
     * Sets the indCompany value for this CPerson.
     * 
     * @param indCompany
     */
    public void setIndCompany(java.lang.Boolean indCompany) {
        this.indCompany = indCompany;
    }


    /**
     * Gets the individualIdNbr value for this CPerson.
     * 
     * @return individualIdNbr
     */
    public java.lang.String getIndividualIdNbr() {
        return individualIdNbr;
    }


    /**
     * Sets the individualIdNbr value for this CPerson.
     * 
     * @param individualIdNbr
     */
    public void setIndividualIdNbr(java.lang.String individualIdNbr) {
        this.individualIdNbr = individualIdNbr;
    }


    /**
     * Gets the individualIdType value for this CPerson.
     * 
     * @return individualIdType
     */
    public java.lang.String getIndividualIdType() {
        return individualIdType;
    }


    /**
     * Sets the individualIdType value for this CPerson.
     * 
     * @param individualIdType
     */
    public void setIndividualIdType(java.lang.String individualIdType) {
        this.individualIdType = individualIdType;
    }


    /**
     * Gets the legalIdNbr value for this CPerson.
     * 
     * @return legalIdNbr
     */
    public java.lang.String getLegalIdNbr() {
        return legalIdNbr;
    }


    /**
     * Sets the legalIdNbr value for this CPerson.
     * 
     * @param legalIdNbr
     */
    public void setLegalIdNbr(java.lang.String legalIdNbr) {
        this.legalIdNbr = legalIdNbr;
    }


    /**
     * Gets the legalIdType value for this CPerson.
     * 
     * @return legalIdType
     */
    public java.lang.String getLegalIdType() {
        return legalIdType;
    }


    /**
     * Sets the legalIdType value for this CPerson.
     * 
     * @param legalIdType
     */
    public void setLegalIdType(java.lang.String legalIdType) {
        this.legalIdType = legalIdType;
    }


    /**
     * Gets the legalNature value for this CPerson.
     * 
     * @return legalNature
     */
    public java.lang.String getLegalNature() {
        return legalNature;
    }


    /**
     * Sets the legalNature value for this CPerson.
     * 
     * @param legalNature
     */
    public void setLegalNature(java.lang.String legalNature) {
        this.legalNature = legalNature;
    }


    /**
     * Gets the legalNatureInOtherLang value for this CPerson.
     * 
     * @return legalNatureInOtherLang
     */
    public java.lang.String getLegalNatureInOtherLang() {
        return legalNatureInOtherLang;
    }


    /**
     * Sets the legalNatureInOtherLang value for this CPerson.
     * 
     * @param legalNatureInOtherLang
     */
    public void setLegalNatureInOtherLang(java.lang.String legalNatureInOtherLang) {
        this.legalNatureInOtherLang = legalNatureInOtherLang;
    }


    /**
     * Gets the nationalityCountryCode value for this CPerson.
     * 
     * @return nationalityCountryCode
     */
    public java.lang.String getNationalityCountryCode() {
        return nationalityCountryCode;
    }


    /**
     * Sets the nationalityCountryCode value for this CPerson.
     * 
     * @param nationalityCountryCode
     */
    public void setNationalityCountryCode(java.lang.String nationalityCountryCode) {
        this.nationalityCountryCode = nationalityCountryCode;
    }


    /**
     * Gets the personGroupCode value for this CPerson.
     * 
     * @return personGroupCode
     */
    public java.lang.String getPersonGroupCode() {
        return personGroupCode;
    }


    /**
     * Sets the personGroupCode value for this CPerson.
     * 
     * @param personGroupCode
     */
    public void setPersonGroupCode(java.lang.String personGroupCode) {
        this.personGroupCode = personGroupCode;
    }


    /**
     * Gets the personGroupName value for this CPerson.
     * 
     * @return personGroupName
     */
    public java.lang.String getPersonGroupName() {
        return personGroupName;
    }


    /**
     * Sets the personGroupName value for this CPerson.
     * 
     * @param personGroupName
     */
    public void setPersonGroupName(java.lang.String personGroupName) {
        this.personGroupName = personGroupName;
    }


    /**
     * Gets the personName value for this CPerson.
     * 
     * @return personName
     */
    public java.lang.String getPersonName() {
        return personName;
    }


    /**
     * Sets the personName value for this CPerson.
     * 
     * @param personName
     */
    public void setPersonName(java.lang.String personName) {
        this.personName = personName;
    }


    /**
     * Gets the personNameInOtherLang value for this CPerson.
     * 
     * @return personNameInOtherLang
     */
    public java.lang.String getPersonNameInOtherLang() {
        return personNameInOtherLang;
    }


    /**
     * Sets the personNameInOtherLang value for this CPerson.
     * 
     * @param personNameInOtherLang
     */
    public void setPersonNameInOtherLang(java.lang.String personNameInOtherLang) {
        this.personNameInOtherLang = personNameInOtherLang;
    }


    /**
     * Gets the residenceCountryCode value for this CPerson.
     * 
     * @return residenceCountryCode
     */
    public java.lang.String getResidenceCountryCode() {
        return residenceCountryCode;
    }


    /**
     * Sets the residenceCountryCode value for this CPerson.
     * 
     * @param residenceCountryCode
     */
    public void setResidenceCountryCode(java.lang.String residenceCountryCode) {
        this.residenceCountryCode = residenceCountryCode;
    }


    /**
     * Gets the stateCode value for this CPerson.
     * 
     * @return stateCode
     */
    public java.lang.String getStateCode() {
        return stateCode;
    }


    /**
     * Sets the stateCode value for this CPerson.
     * 
     * @param stateCode
     */
    public void setStateCode(java.lang.String stateCode) {
        this.stateCode = stateCode;
    }


    /**
     * Gets the stateName value for this CPerson.
     * 
     * @return stateName
     */
    public java.lang.String getStateName() {
        return stateName;
    }


    /**
     * Sets the stateName value for this CPerson.
     * 
     * @param stateName
     */
    public void setStateName(java.lang.String stateName) {
        this.stateName = stateName;
    }


    /**
     * Gets the telephone value for this CPerson.
     * 
     * @return telephone
     */
    public java.lang.String getTelephone() {
        return telephone;
    }


    /**
     * Sets the telephone value for this CPerson.
     * 
     * @param telephone
     */
    public void setTelephone(java.lang.String telephone) {
        this.telephone = telephone;
    }


    /**
     * Gets the zipCode value for this CPerson.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this CPerson.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CPerson)) return false;
        CPerson other = (CPerson) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressStreet==null && other.getAddressStreet()==null) || 
             (this.addressStreet!=null &&
              this.addressStreet.equals(other.getAddressStreet()))) &&
            ((this.addressStreetInOtherLang==null && other.getAddressStreetInOtherLang()==null) || 
             (this.addressStreetInOtherLang!=null &&
              this.addressStreetInOtherLang.equals(other.getAddressStreetInOtherLang()))) &&
            ((this.addressZone==null && other.getAddressZone()==null) || 
             (this.addressZone!=null &&
              this.addressZone.equals(other.getAddressZone()))) &&
            ((this.agentCode==null && other.getAgentCode()==null) || 
             (this.agentCode!=null &&
              this.agentCode.equals(other.getAgentCode()))) &&
            ((this.cityCode==null && other.getCityCode()==null) || 
             (this.cityCode!=null &&
              this.cityCode.equals(other.getCityCode()))) &&
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName()))) &&
            ((this.companyRegisterRegistrationDate==null && other.getCompanyRegisterRegistrationDate()==null) || 
             (this.companyRegisterRegistrationDate!=null &&
              this.companyRegisterRegistrationDate.equals(other.getCompanyRegisterRegistrationDate()))) &&
            ((this.companyRegisterRegistrationNbr==null && other.getCompanyRegisterRegistrationNbr()==null) || 
             (this.companyRegisterRegistrationNbr!=null &&
              this.companyRegisterRegistrationNbr.equals(other.getCompanyRegisterRegistrationNbr()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.indCompany==null && other.getIndCompany()==null) || 
             (this.indCompany!=null &&
              this.indCompany.equals(other.getIndCompany()))) &&
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
            ((this.legalNature==null && other.getLegalNature()==null) || 
             (this.legalNature!=null &&
              this.legalNature.equals(other.getLegalNature()))) &&
            ((this.legalNatureInOtherLang==null && other.getLegalNatureInOtherLang()==null) || 
             (this.legalNatureInOtherLang!=null &&
              this.legalNatureInOtherLang.equals(other.getLegalNatureInOtherLang()))) &&
            ((this.nationalityCountryCode==null && other.getNationalityCountryCode()==null) || 
             (this.nationalityCountryCode!=null &&
              this.nationalityCountryCode.equals(other.getNationalityCountryCode()))) &&
            ((this.personGroupCode==null && other.getPersonGroupCode()==null) || 
             (this.personGroupCode!=null &&
              this.personGroupCode.equals(other.getPersonGroupCode()))) &&
            ((this.personGroupName==null && other.getPersonGroupName()==null) || 
             (this.personGroupName!=null &&
              this.personGroupName.equals(other.getPersonGroupName()))) &&
            ((this.personName==null && other.getPersonName()==null) || 
             (this.personName!=null &&
              this.personName.equals(other.getPersonName()))) &&
            ((this.personNameInOtherLang==null && other.getPersonNameInOtherLang()==null) || 
             (this.personNameInOtherLang!=null &&
              this.personNameInOtherLang.equals(other.getPersonNameInOtherLang()))) &&
            ((this.residenceCountryCode==null && other.getResidenceCountryCode()==null) || 
             (this.residenceCountryCode!=null &&
              this.residenceCountryCode.equals(other.getResidenceCountryCode()))) &&
            ((this.stateCode==null && other.getStateCode()==null) || 
             (this.stateCode!=null &&
              this.stateCode.equals(other.getStateCode()))) &&
            ((this.stateName==null && other.getStateName()==null) || 
             (this.stateName!=null &&
              this.stateName.equals(other.getStateName()))) &&
            ((this.telephone==null && other.getTelephone()==null) || 
             (this.telephone!=null &&
              this.telephone.equals(other.getTelephone()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode())));
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
        if (getAddressStreet() != null) {
            _hashCode += getAddressStreet().hashCode();
        }
        if (getAddressStreetInOtherLang() != null) {
            _hashCode += getAddressStreetInOtherLang().hashCode();
        }
        if (getAddressZone() != null) {
            _hashCode += getAddressZone().hashCode();
        }
        if (getAgentCode() != null) {
            _hashCode += getAgentCode().hashCode();
        }
        if (getCityCode() != null) {
            _hashCode += getCityCode().hashCode();
        }
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        if (getCompanyRegisterRegistrationDate() != null) {
            _hashCode += getCompanyRegisterRegistrationDate().hashCode();
        }
        if (getCompanyRegisterRegistrationNbr() != null) {
            _hashCode += getCompanyRegisterRegistrationNbr().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getIndCompany() != null) {
            _hashCode += getIndCompany().hashCode();
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
        if (getLegalNature() != null) {
            _hashCode += getLegalNature().hashCode();
        }
        if (getLegalNatureInOtherLang() != null) {
            _hashCode += getLegalNatureInOtherLang().hashCode();
        }
        if (getNationalityCountryCode() != null) {
            _hashCode += getNationalityCountryCode().hashCode();
        }
        if (getPersonGroupCode() != null) {
            _hashCode += getPersonGroupCode().hashCode();
        }
        if (getPersonGroupName() != null) {
            _hashCode += getPersonGroupName().hashCode();
        }
        if (getPersonName() != null) {
            _hashCode += getPersonName().hashCode();
        }
        if (getPersonNameInOtherLang() != null) {
            _hashCode += getPersonNameInOtherLang().hashCode();
        }
        if (getResidenceCountryCode() != null) {
            _hashCode += getResidenceCountryCode().hashCode();
        }
        if (getStateCode() != null) {
            _hashCode += getStateCode().hashCode();
        }
        if (getStateName() != null) {
            _hashCode += getStateName().hashCode();
        }
        if (getTelephone() != null) {
            _hashCode += getTelephone().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CPerson.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPerson"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressStreetInOtherLang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressStreetInOtherLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressZone"));
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
        elemField.setFieldName("cityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyRegisterRegistrationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyRegisterRegistrationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyRegisterRegistrationNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyRegisterRegistrationNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indCompany"));
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
        elemField.setFieldName("legalNature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "legalNature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalNatureInOtherLang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "legalNatureInOtherLang"));
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
        elemField.setFieldName("personGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personGroupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personNameInOtherLang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personNameInOtherLang"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zipCode"));
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
