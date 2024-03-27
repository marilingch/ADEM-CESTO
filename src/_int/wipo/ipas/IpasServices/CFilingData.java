/**
 * CFilingData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CFilingData  implements java.io.Serializable {
    private java.lang.String applicationSubtype;

    private java.lang.String applicationType;

    private _int.wipo.ipas.IpasServices.IpasDateTime captureDate;

    private _int.wipo.ipas.IpasServices.IpasInteger captureUserId;

    private _int.wipo.ipas.IpasServices.IpasInteger corrFileNbr;

    private java.lang.String corrFileSeq;

    private _int.wipo.ipas.IpasServices.IpasInteger corrFileSeries;

    private java.lang.String corrFileType;

    private java.lang.String externalOfficeCode;

    private _int.wipo.ipas.IpasServices.IpasDateTime externalOfficeFilingDate;

    private java.lang.String externalSystemId;

    private _int.wipo.ipas.IpasServices.IpasDateTime filingDate;

    private java.lang.String indIncorrRecpDeleted;

    private java.lang.Boolean indManualInterpretationRequired;

    private _int.wipo.ipas.IpasServices.IpasInteger lawCode;

    private _int.wipo.ipas.IpasServices.IpasDateTime novelty1Date;

    private _int.wipo.ipas.IpasServices.IpasDateTime novelty2Date;

    private _int.wipo.ipas.IpasServices.CPayment[] paymentList;

    private _int.wipo.ipas.IpasServices.IpasDateTime receptionDate;

    private _int.wipo.ipas.IpasServices.CDocument receptionDocument;

    private _int.wipo.ipas.IpasServices.IpasInteger receptionUserId;

    private _int.wipo.ipas.IpasServices.CUserdocType[] userdocTypeList;

    private _int.wipo.ipas.IpasServices.IpasDateTime validationDate;

    private _int.wipo.ipas.IpasServices.IpasInteger validationUserId;

    public CFilingData() {
    }

    public CFilingData(
           java.lang.String applicationSubtype,
           java.lang.String applicationType,
           _int.wipo.ipas.IpasServices.IpasDateTime captureDate,
           _int.wipo.ipas.IpasServices.IpasInteger captureUserId,
           _int.wipo.ipas.IpasServices.IpasInteger corrFileNbr,
           java.lang.String corrFileSeq,
           _int.wipo.ipas.IpasServices.IpasInteger corrFileSeries,
           java.lang.String corrFileType,
           java.lang.String externalOfficeCode,
           _int.wipo.ipas.IpasServices.IpasDateTime externalOfficeFilingDate,
           java.lang.String externalSystemId,
           _int.wipo.ipas.IpasServices.IpasDateTime filingDate,
           java.lang.String indIncorrRecpDeleted,
           java.lang.Boolean indManualInterpretationRequired,
           _int.wipo.ipas.IpasServices.IpasInteger lawCode,
           _int.wipo.ipas.IpasServices.IpasDateTime novelty1Date,
           _int.wipo.ipas.IpasServices.IpasDateTime novelty2Date,
           _int.wipo.ipas.IpasServices.CPayment[] paymentList,
           _int.wipo.ipas.IpasServices.IpasDateTime receptionDate,
           _int.wipo.ipas.IpasServices.CDocument receptionDocument,
           _int.wipo.ipas.IpasServices.IpasInteger receptionUserId,
           _int.wipo.ipas.IpasServices.CUserdocType[] userdocTypeList,
           _int.wipo.ipas.IpasServices.IpasDateTime validationDate,
           _int.wipo.ipas.IpasServices.IpasInteger validationUserId) {
           this.applicationSubtype = applicationSubtype;
           this.applicationType = applicationType;
           this.captureDate = captureDate;
           this.captureUserId = captureUserId;
           this.corrFileNbr = corrFileNbr;
           this.corrFileSeq = corrFileSeq;
           this.corrFileSeries = corrFileSeries;
           this.corrFileType = corrFileType;
           this.externalOfficeCode = externalOfficeCode;
           this.externalOfficeFilingDate = externalOfficeFilingDate;
           this.externalSystemId = externalSystemId;
           this.filingDate = filingDate;
           this.indIncorrRecpDeleted = indIncorrRecpDeleted;
           this.indManualInterpretationRequired = indManualInterpretationRequired;
           this.lawCode = lawCode;
           this.novelty1Date = novelty1Date;
           this.novelty2Date = novelty2Date;
           this.paymentList = paymentList;
           this.receptionDate = receptionDate;
           this.receptionDocument = receptionDocument;
           this.receptionUserId = receptionUserId;
           this.userdocTypeList = userdocTypeList;
           this.validationDate = validationDate;
           this.validationUserId = validationUserId;
    }


    /**
     * Gets the applicationSubtype value for this CFilingData.
     * 
     * @return applicationSubtype
     */
    public java.lang.String getApplicationSubtype() {
        return applicationSubtype;
    }


    /**
     * Sets the applicationSubtype value for this CFilingData.
     * 
     * @param applicationSubtype
     */
    public void setApplicationSubtype(java.lang.String applicationSubtype) {
        this.applicationSubtype = applicationSubtype;
    }


    /**
     * Gets the applicationType value for this CFilingData.
     * 
     * @return applicationType
     */
    public java.lang.String getApplicationType() {
        return applicationType;
    }


    /**
     * Sets the applicationType value for this CFilingData.
     * 
     * @param applicationType
     */
    public void setApplicationType(java.lang.String applicationType) {
        this.applicationType = applicationType;
    }


    /**
     * Gets the captureDate value for this CFilingData.
     * 
     * @return captureDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getCaptureDate() {
        return captureDate;
    }


    /**
     * Sets the captureDate value for this CFilingData.
     * 
     * @param captureDate
     */
    public void setCaptureDate(_int.wipo.ipas.IpasServices.IpasDateTime captureDate) {
        this.captureDate = captureDate;
    }


    /**
     * Gets the captureUserId value for this CFilingData.
     * 
     * @return captureUserId
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getCaptureUserId() {
        return captureUserId;
    }


    /**
     * Sets the captureUserId value for this CFilingData.
     * 
     * @param captureUserId
     */
    public void setCaptureUserId(_int.wipo.ipas.IpasServices.IpasInteger captureUserId) {
        this.captureUserId = captureUserId;
    }


    /**
     * Gets the corrFileNbr value for this CFilingData.
     * 
     * @return corrFileNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getCorrFileNbr() {
        return corrFileNbr;
    }


    /**
     * Sets the corrFileNbr value for this CFilingData.
     * 
     * @param corrFileNbr
     */
    public void setCorrFileNbr(_int.wipo.ipas.IpasServices.IpasInteger corrFileNbr) {
        this.corrFileNbr = corrFileNbr;
    }


    /**
     * Gets the corrFileSeq value for this CFilingData.
     * 
     * @return corrFileSeq
     */
    public java.lang.String getCorrFileSeq() {
        return corrFileSeq;
    }


    /**
     * Sets the corrFileSeq value for this CFilingData.
     * 
     * @param corrFileSeq
     */
    public void setCorrFileSeq(java.lang.String corrFileSeq) {
        this.corrFileSeq = corrFileSeq;
    }


    /**
     * Gets the corrFileSeries value for this CFilingData.
     * 
     * @return corrFileSeries
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getCorrFileSeries() {
        return corrFileSeries;
    }


    /**
     * Sets the corrFileSeries value for this CFilingData.
     * 
     * @param corrFileSeries
     */
    public void setCorrFileSeries(_int.wipo.ipas.IpasServices.IpasInteger corrFileSeries) {
        this.corrFileSeries = corrFileSeries;
    }


    /**
     * Gets the corrFileType value for this CFilingData.
     * 
     * @return corrFileType
     */
    public java.lang.String getCorrFileType() {
        return corrFileType;
    }


    /**
     * Sets the corrFileType value for this CFilingData.
     * 
     * @param corrFileType
     */
    public void setCorrFileType(java.lang.String corrFileType) {
        this.corrFileType = corrFileType;
    }


    /**
     * Gets the externalOfficeCode value for this CFilingData.
     * 
     * @return externalOfficeCode
     */
    public java.lang.String getExternalOfficeCode() {
        return externalOfficeCode;
    }


    /**
     * Sets the externalOfficeCode value for this CFilingData.
     * 
     * @param externalOfficeCode
     */
    public void setExternalOfficeCode(java.lang.String externalOfficeCode) {
        this.externalOfficeCode = externalOfficeCode;
    }


    /**
     * Gets the externalOfficeFilingDate value for this CFilingData.
     * 
     * @return externalOfficeFilingDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getExternalOfficeFilingDate() {
        return externalOfficeFilingDate;
    }


    /**
     * Sets the externalOfficeFilingDate value for this CFilingData.
     * 
     * @param externalOfficeFilingDate
     */
    public void setExternalOfficeFilingDate(_int.wipo.ipas.IpasServices.IpasDateTime externalOfficeFilingDate) {
        this.externalOfficeFilingDate = externalOfficeFilingDate;
    }


    /**
     * Gets the externalSystemId value for this CFilingData.
     * 
     * @return externalSystemId
     */
    public java.lang.String getExternalSystemId() {
        return externalSystemId;
    }


    /**
     * Sets the externalSystemId value for this CFilingData.
     * 
     * @param externalSystemId
     */
    public void setExternalSystemId(java.lang.String externalSystemId) {
        this.externalSystemId = externalSystemId;
    }


    /**
     * Gets the filingDate value for this CFilingData.
     * 
     * @return filingDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getFilingDate() {
        return filingDate;
    }


    /**
     * Sets the filingDate value for this CFilingData.
     * 
     * @param filingDate
     */
    public void setFilingDate(_int.wipo.ipas.IpasServices.IpasDateTime filingDate) {
        this.filingDate = filingDate;
    }


    /**
     * Gets the indIncorrRecpDeleted value for this CFilingData.
     * 
     * @return indIncorrRecpDeleted
     */
    public java.lang.String getIndIncorrRecpDeleted() {
        return indIncorrRecpDeleted;
    }


    /**
     * Sets the indIncorrRecpDeleted value for this CFilingData.
     * 
     * @param indIncorrRecpDeleted
     */
    public void setIndIncorrRecpDeleted(java.lang.String indIncorrRecpDeleted) {
        this.indIncorrRecpDeleted = indIncorrRecpDeleted;
    }


    /**
     * Gets the indManualInterpretationRequired value for this CFilingData.
     * 
     * @return indManualInterpretationRequired
     */
    public java.lang.Boolean getIndManualInterpretationRequired() {
        return indManualInterpretationRequired;
    }


    /**
     * Sets the indManualInterpretationRequired value for this CFilingData.
     * 
     * @param indManualInterpretationRequired
     */
    public void setIndManualInterpretationRequired(java.lang.Boolean indManualInterpretationRequired) {
        this.indManualInterpretationRequired = indManualInterpretationRequired;
    }


    /**
     * Gets the lawCode value for this CFilingData.
     * 
     * @return lawCode
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getLawCode() {
        return lawCode;
    }


    /**
     * Sets the lawCode value for this CFilingData.
     * 
     * @param lawCode
     */
    public void setLawCode(_int.wipo.ipas.IpasServices.IpasInteger lawCode) {
        this.lawCode = lawCode;
    }


    /**
     * Gets the novelty1Date value for this CFilingData.
     * 
     * @return novelty1Date
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getNovelty1Date() {
        return novelty1Date;
    }


    /**
     * Sets the novelty1Date value for this CFilingData.
     * 
     * @param novelty1Date
     */
    public void setNovelty1Date(_int.wipo.ipas.IpasServices.IpasDateTime novelty1Date) {
        this.novelty1Date = novelty1Date;
    }


    /**
     * Gets the novelty2Date value for this CFilingData.
     * 
     * @return novelty2Date
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getNovelty2Date() {
        return novelty2Date;
    }


    /**
     * Sets the novelty2Date value for this CFilingData.
     * 
     * @param novelty2Date
     */
    public void setNovelty2Date(_int.wipo.ipas.IpasServices.IpasDateTime novelty2Date) {
        this.novelty2Date = novelty2Date;
    }


    /**
     * Gets the paymentList value for this CFilingData.
     * 
     * @return paymentList
     */
    public _int.wipo.ipas.IpasServices.CPayment[] getPaymentList() {
        return paymentList;
    }


    /**
     * Sets the paymentList value for this CFilingData.
     * 
     * @param paymentList
     */
    public void setPaymentList(_int.wipo.ipas.IpasServices.CPayment[] paymentList) {
        this.paymentList = paymentList;
    }

    public _int.wipo.ipas.IpasServices.CPayment getPaymentList(int i) {
        return this.paymentList[i];
    }

    public void setPaymentList(int i, _int.wipo.ipas.IpasServices.CPayment _value) {
        this.paymentList[i] = _value;
    }


    /**
     * Gets the receptionDate value for this CFilingData.
     * 
     * @return receptionDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getReceptionDate() {
        return receptionDate;
    }


    /**
     * Sets the receptionDate value for this CFilingData.
     * 
     * @param receptionDate
     */
    public void setReceptionDate(_int.wipo.ipas.IpasServices.IpasDateTime receptionDate) {
        this.receptionDate = receptionDate;
    }


    /**
     * Gets the receptionDocument value for this CFilingData.
     * 
     * @return receptionDocument
     */
    public _int.wipo.ipas.IpasServices.CDocument getReceptionDocument() {
        return receptionDocument;
    }


    /**
     * Sets the receptionDocument value for this CFilingData.
     * 
     * @param receptionDocument
     */
    public void setReceptionDocument(_int.wipo.ipas.IpasServices.CDocument receptionDocument) {
        this.receptionDocument = receptionDocument;
    }


    /**
     * Gets the receptionUserId value for this CFilingData.
     * 
     * @return receptionUserId
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getReceptionUserId() {
        return receptionUserId;
    }


    /**
     * Sets the receptionUserId value for this CFilingData.
     * 
     * @param receptionUserId
     */
    public void setReceptionUserId(_int.wipo.ipas.IpasServices.IpasInteger receptionUserId) {
        this.receptionUserId = receptionUserId;
    }


    /**
     * Gets the userdocTypeList value for this CFilingData.
     * 
     * @return userdocTypeList
     */
    public _int.wipo.ipas.IpasServices.CUserdocType[] getUserdocTypeList() {
        return userdocTypeList;
    }


    /**
     * Sets the userdocTypeList value for this CFilingData.
     * 
     * @param userdocTypeList
     */
    public void setUserdocTypeList(_int.wipo.ipas.IpasServices.CUserdocType[] userdocTypeList) {
        this.userdocTypeList = userdocTypeList;
    }

    public _int.wipo.ipas.IpasServices.CUserdocType getUserdocTypeList(int i) {
        return this.userdocTypeList[i];
    }

    public void setUserdocTypeList(int i, _int.wipo.ipas.IpasServices.CUserdocType _value) {
        this.userdocTypeList[i] = _value;
    }


    /**
     * Gets the validationDate value for this CFilingData.
     * 
     * @return validationDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getValidationDate() {
        return validationDate;
    }


    /**
     * Sets the validationDate value for this CFilingData.
     * 
     * @param validationDate
     */
    public void setValidationDate(_int.wipo.ipas.IpasServices.IpasDateTime validationDate) {
        this.validationDate = validationDate;
    }


    /**
     * Gets the validationUserId value for this CFilingData.
     * 
     * @return validationUserId
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getValidationUserId() {
        return validationUserId;
    }


    /**
     * Sets the validationUserId value for this CFilingData.
     * 
     * @param validationUserId
     */
    public void setValidationUserId(_int.wipo.ipas.IpasServices.IpasInteger validationUserId) {
        this.validationUserId = validationUserId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CFilingData)) return false;
        CFilingData other = (CFilingData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationSubtype==null && other.getApplicationSubtype()==null) || 
             (this.applicationSubtype!=null &&
              this.applicationSubtype.equals(other.getApplicationSubtype()))) &&
            ((this.applicationType==null && other.getApplicationType()==null) || 
             (this.applicationType!=null &&
              this.applicationType.equals(other.getApplicationType()))) &&
            ((this.captureDate==null && other.getCaptureDate()==null) || 
             (this.captureDate!=null &&
              this.captureDate.equals(other.getCaptureDate()))) &&
            ((this.captureUserId==null && other.getCaptureUserId()==null) || 
             (this.captureUserId!=null &&
              this.captureUserId.equals(other.getCaptureUserId()))) &&
            ((this.corrFileNbr==null && other.getCorrFileNbr()==null) || 
             (this.corrFileNbr!=null &&
              this.corrFileNbr.equals(other.getCorrFileNbr()))) &&
            ((this.corrFileSeq==null && other.getCorrFileSeq()==null) || 
             (this.corrFileSeq!=null &&
              this.corrFileSeq.equals(other.getCorrFileSeq()))) &&
            ((this.corrFileSeries==null && other.getCorrFileSeries()==null) || 
             (this.corrFileSeries!=null &&
              this.corrFileSeries.equals(other.getCorrFileSeries()))) &&
            ((this.corrFileType==null && other.getCorrFileType()==null) || 
             (this.corrFileType!=null &&
              this.corrFileType.equals(other.getCorrFileType()))) &&
            ((this.externalOfficeCode==null && other.getExternalOfficeCode()==null) || 
             (this.externalOfficeCode!=null &&
              this.externalOfficeCode.equals(other.getExternalOfficeCode()))) &&
            ((this.externalOfficeFilingDate==null && other.getExternalOfficeFilingDate()==null) || 
             (this.externalOfficeFilingDate!=null &&
              this.externalOfficeFilingDate.equals(other.getExternalOfficeFilingDate()))) &&
            ((this.externalSystemId==null && other.getExternalSystemId()==null) || 
             (this.externalSystemId!=null &&
              this.externalSystemId.equals(other.getExternalSystemId()))) &&
            ((this.filingDate==null && other.getFilingDate()==null) || 
             (this.filingDate!=null &&
              this.filingDate.equals(other.getFilingDate()))) &&
            ((this.indIncorrRecpDeleted==null && other.getIndIncorrRecpDeleted()==null) || 
             (this.indIncorrRecpDeleted!=null &&
              this.indIncorrRecpDeleted.equals(other.getIndIncorrRecpDeleted()))) &&
            ((this.indManualInterpretationRequired==null && other.getIndManualInterpretationRequired()==null) || 
             (this.indManualInterpretationRequired!=null &&
              this.indManualInterpretationRequired.equals(other.getIndManualInterpretationRequired()))) &&
            ((this.lawCode==null && other.getLawCode()==null) || 
             (this.lawCode!=null &&
              this.lawCode.equals(other.getLawCode()))) &&
            ((this.novelty1Date==null && other.getNovelty1Date()==null) || 
             (this.novelty1Date!=null &&
              this.novelty1Date.equals(other.getNovelty1Date()))) &&
            ((this.novelty2Date==null && other.getNovelty2Date()==null) || 
             (this.novelty2Date!=null &&
              this.novelty2Date.equals(other.getNovelty2Date()))) &&
            ((this.paymentList==null && other.getPaymentList()==null) || 
             (this.paymentList!=null &&
              java.util.Arrays.equals(this.paymentList, other.getPaymentList()))) &&
            ((this.receptionDate==null && other.getReceptionDate()==null) || 
             (this.receptionDate!=null &&
              this.receptionDate.equals(other.getReceptionDate()))) &&
            ((this.receptionDocument==null && other.getReceptionDocument()==null) || 
             (this.receptionDocument!=null &&
              this.receptionDocument.equals(other.getReceptionDocument()))) &&
            ((this.receptionUserId==null && other.getReceptionUserId()==null) || 
             (this.receptionUserId!=null &&
              this.receptionUserId.equals(other.getReceptionUserId()))) &&
            ((this.userdocTypeList==null && other.getUserdocTypeList()==null) || 
             (this.userdocTypeList!=null &&
              java.util.Arrays.equals(this.userdocTypeList, other.getUserdocTypeList()))) &&
            ((this.validationDate==null && other.getValidationDate()==null) || 
             (this.validationDate!=null &&
              this.validationDate.equals(other.getValidationDate()))) &&
            ((this.validationUserId==null && other.getValidationUserId()==null) || 
             (this.validationUserId!=null &&
              this.validationUserId.equals(other.getValidationUserId())));
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
        if (getApplicationSubtype() != null) {
            _hashCode += getApplicationSubtype().hashCode();
        }
        if (getApplicationType() != null) {
            _hashCode += getApplicationType().hashCode();
        }
        if (getCaptureDate() != null) {
            _hashCode += getCaptureDate().hashCode();
        }
        if (getCaptureUserId() != null) {
            _hashCode += getCaptureUserId().hashCode();
        }
        if (getCorrFileNbr() != null) {
            _hashCode += getCorrFileNbr().hashCode();
        }
        if (getCorrFileSeq() != null) {
            _hashCode += getCorrFileSeq().hashCode();
        }
        if (getCorrFileSeries() != null) {
            _hashCode += getCorrFileSeries().hashCode();
        }
        if (getCorrFileType() != null) {
            _hashCode += getCorrFileType().hashCode();
        }
        if (getExternalOfficeCode() != null) {
            _hashCode += getExternalOfficeCode().hashCode();
        }
        if (getExternalOfficeFilingDate() != null) {
            _hashCode += getExternalOfficeFilingDate().hashCode();
        }
        if (getExternalSystemId() != null) {
            _hashCode += getExternalSystemId().hashCode();
        }
        if (getFilingDate() != null) {
            _hashCode += getFilingDate().hashCode();
        }
        if (getIndIncorrRecpDeleted() != null) {
            _hashCode += getIndIncorrRecpDeleted().hashCode();
        }
        if (getIndManualInterpretationRequired() != null) {
            _hashCode += getIndManualInterpretationRequired().hashCode();
        }
        if (getLawCode() != null) {
            _hashCode += getLawCode().hashCode();
        }
        if (getNovelty1Date() != null) {
            _hashCode += getNovelty1Date().hashCode();
        }
        if (getNovelty2Date() != null) {
            _hashCode += getNovelty2Date().hashCode();
        }
        if (getPaymentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceptionDate() != null) {
            _hashCode += getReceptionDate().hashCode();
        }
        if (getReceptionDocument() != null) {
            _hashCode += getReceptionDocument().hashCode();
        }
        if (getReceptionUserId() != null) {
            _hashCode += getReceptionUserId().hashCode();
        }
        if (getUserdocTypeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserdocTypeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserdocTypeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValidationDate() != null) {
            _hashCode += getValidationDate().hashCode();
        }
        if (getValidationUserId() != null) {
            _hashCode += getValidationUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CFilingData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFilingData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationSubtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationSubtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "captureDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "captureUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrFileNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corrFileNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrFileSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corrFileSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrFileSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corrFileSeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrFileType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corrFileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalOfficeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalOfficeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalOfficeFilingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalOfficeFilingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalSystemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalSystemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indIncorrRecpDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indIncorrRecpDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indManualInterpretationRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indManualInterpretationRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lawCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lawCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("novelty1Date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "novelty1Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("novelty2Date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "novelty2Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPayment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receptionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receptionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receptionDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receptionDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receptionUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receptionUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdocTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdocTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserdocType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validationUserId"));
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
