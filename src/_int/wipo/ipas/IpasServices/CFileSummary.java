/**
 * CFileSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CFileSummary  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CUserdoc[] CUserdocs;

    private java.lang.String disclaimer;

    private java.lang.String disclaimerInOtherLang;

    private _int.wipo.ipas.IpasServices.CFileId fileId;

    private java.lang.String fileIdAsString;

    private java.lang.String fileSummaryClasses;

    private java.lang.String fileSummaryCountry;

    private java.lang.String fileSummaryDescription;

    private java.lang.String fileSummaryDescriptionInOtherLang;

    private java.lang.String fileSummaryOwner;

    private java.lang.String fileSummaryOwnerInOtherLang;

    private java.lang.String fileSummaryRepresentative;

    private java.lang.String fileSummaryRepresentativeInOtherLang;

    private java.lang.String fileSummaryResponsibleName;

    private java.lang.String fileSummaryStatus;

    private _int.wipo.ipas.IpasServices.CFilingData filingData;

    private java.lang.Boolean indMark;

    private java.lang.Boolean indPatent;

    private java.lang.String pctApplicationId;

    private _int.wipo.ipas.IpasServices.IpasInteger publicationNbr;

    private java.lang.String publicationSer;

    private java.lang.String publicationTyp;

    private _int.wipo.ipas.IpasServices.CRegistrationData registrationData;

    private java.lang.String selected;

    private _int.wipo.ipas.IpasServices.IpasInteger similarityPercent;

    private _int.wipo.ipas.IpasServices.CStatusId statusId;

    private java.lang.String workflowWarningText;

    public CFileSummary() {
    }

    public CFileSummary(
           _int.wipo.ipas.IpasServices.CUserdoc[] CUserdocs,
           java.lang.String disclaimer,
           java.lang.String disclaimerInOtherLang,
           _int.wipo.ipas.IpasServices.CFileId fileId,
           java.lang.String fileIdAsString,
           java.lang.String fileSummaryClasses,
           java.lang.String fileSummaryCountry,
           java.lang.String fileSummaryDescription,
           java.lang.String fileSummaryDescriptionInOtherLang,
           java.lang.String fileSummaryOwner,
           java.lang.String fileSummaryOwnerInOtherLang,
           java.lang.String fileSummaryRepresentative,
           java.lang.String fileSummaryRepresentativeInOtherLang,
           java.lang.String fileSummaryResponsibleName,
           java.lang.String fileSummaryStatus,
           _int.wipo.ipas.IpasServices.CFilingData filingData,
           java.lang.Boolean indMark,
           java.lang.Boolean indPatent,
           java.lang.String pctApplicationId,
           _int.wipo.ipas.IpasServices.IpasInteger publicationNbr,
           java.lang.String publicationSer,
           java.lang.String publicationTyp,
           _int.wipo.ipas.IpasServices.CRegistrationData registrationData,
           java.lang.String selected,
           _int.wipo.ipas.IpasServices.IpasInteger similarityPercent,
           _int.wipo.ipas.IpasServices.CStatusId statusId,
           java.lang.String workflowWarningText) {
           this.CUserdocs = CUserdocs;
           this.disclaimer = disclaimer;
           this.disclaimerInOtherLang = disclaimerInOtherLang;
           this.fileId = fileId;
           this.fileIdAsString = fileIdAsString;
           this.fileSummaryClasses = fileSummaryClasses;
           this.fileSummaryCountry = fileSummaryCountry;
           this.fileSummaryDescription = fileSummaryDescription;
           this.fileSummaryDescriptionInOtherLang = fileSummaryDescriptionInOtherLang;
           this.fileSummaryOwner = fileSummaryOwner;
           this.fileSummaryOwnerInOtherLang = fileSummaryOwnerInOtherLang;
           this.fileSummaryRepresentative = fileSummaryRepresentative;
           this.fileSummaryRepresentativeInOtherLang = fileSummaryRepresentativeInOtherLang;
           this.fileSummaryResponsibleName = fileSummaryResponsibleName;
           this.fileSummaryStatus = fileSummaryStatus;
           this.filingData = filingData;
           this.indMark = indMark;
           this.indPatent = indPatent;
           this.pctApplicationId = pctApplicationId;
           this.publicationNbr = publicationNbr;
           this.publicationSer = publicationSer;
           this.publicationTyp = publicationTyp;
           this.registrationData = registrationData;
           this.selected = selected;
           this.similarityPercent = similarityPercent;
           this.statusId = statusId;
           this.workflowWarningText = workflowWarningText;
    }


    /**
     * Gets the CUserdocs value for this CFileSummary.
     * 
     * @return CUserdocs
     */
    public _int.wipo.ipas.IpasServices.CUserdoc[] getCUserdocs() {
        return CUserdocs;
    }


    /**
     * Sets the CUserdocs value for this CFileSummary.
     * 
     * @param CUserdocs
     */
    public void setCUserdocs(_int.wipo.ipas.IpasServices.CUserdoc[] CUserdocs) {
        this.CUserdocs = CUserdocs;
    }

    public _int.wipo.ipas.IpasServices.CUserdoc getCUserdocs(int i) {
        return this.CUserdocs[i];
    }

    public void setCUserdocs(int i, _int.wipo.ipas.IpasServices.CUserdoc _value) {
        this.CUserdocs[i] = _value;
    }


    /**
     * Gets the disclaimer value for this CFileSummary.
     * 
     * @return disclaimer
     */
    public java.lang.String getDisclaimer() {
        return disclaimer;
    }


    /**
     * Sets the disclaimer value for this CFileSummary.
     * 
     * @param disclaimer
     */
    public void setDisclaimer(java.lang.String disclaimer) {
        this.disclaimer = disclaimer;
    }


    /**
     * Gets the disclaimerInOtherLang value for this CFileSummary.
     * 
     * @return disclaimerInOtherLang
     */
    public java.lang.String getDisclaimerInOtherLang() {
        return disclaimerInOtherLang;
    }


    /**
     * Sets the disclaimerInOtherLang value for this CFileSummary.
     * 
     * @param disclaimerInOtherLang
     */
    public void setDisclaimerInOtherLang(java.lang.String disclaimerInOtherLang) {
        this.disclaimerInOtherLang = disclaimerInOtherLang;
    }


    /**
     * Gets the fileId value for this CFileSummary.
     * 
     * @return fileId
     */
    public _int.wipo.ipas.IpasServices.CFileId getFileId() {
        return fileId;
    }


    /**
     * Sets the fileId value for this CFileSummary.
     * 
     * @param fileId
     */
    public void setFileId(_int.wipo.ipas.IpasServices.CFileId fileId) {
        this.fileId = fileId;
    }


    /**
     * Gets the fileIdAsString value for this CFileSummary.
     * 
     * @return fileIdAsString
     */
    public java.lang.String getFileIdAsString() {
        return fileIdAsString;
    }


    /**
     * Sets the fileIdAsString value for this CFileSummary.
     * 
     * @param fileIdAsString
     */
    public void setFileIdAsString(java.lang.String fileIdAsString) {
        this.fileIdAsString = fileIdAsString;
    }


    /**
     * Gets the fileSummaryClasses value for this CFileSummary.
     * 
     * @return fileSummaryClasses
     */
    public java.lang.String getFileSummaryClasses() {
        return fileSummaryClasses;
    }


    /**
     * Sets the fileSummaryClasses value for this CFileSummary.
     * 
     * @param fileSummaryClasses
     */
    public void setFileSummaryClasses(java.lang.String fileSummaryClasses) {
        this.fileSummaryClasses = fileSummaryClasses;
    }


    /**
     * Gets the fileSummaryCountry value for this CFileSummary.
     * 
     * @return fileSummaryCountry
     */
    public java.lang.String getFileSummaryCountry() {
        return fileSummaryCountry;
    }


    /**
     * Sets the fileSummaryCountry value for this CFileSummary.
     * 
     * @param fileSummaryCountry
     */
    public void setFileSummaryCountry(java.lang.String fileSummaryCountry) {
        this.fileSummaryCountry = fileSummaryCountry;
    }


    /**
     * Gets the fileSummaryDescription value for this CFileSummary.
     * 
     * @return fileSummaryDescription
     */
    public java.lang.String getFileSummaryDescription() {
        return fileSummaryDescription;
    }


    /**
     * Sets the fileSummaryDescription value for this CFileSummary.
     * 
     * @param fileSummaryDescription
     */
    public void setFileSummaryDescription(java.lang.String fileSummaryDescription) {
        this.fileSummaryDescription = fileSummaryDescription;
    }


    /**
     * Gets the fileSummaryDescriptionInOtherLang value for this CFileSummary.
     * 
     * @return fileSummaryDescriptionInOtherLang
     */
    public java.lang.String getFileSummaryDescriptionInOtherLang() {
        return fileSummaryDescriptionInOtherLang;
    }


    /**
     * Sets the fileSummaryDescriptionInOtherLang value for this CFileSummary.
     * 
     * @param fileSummaryDescriptionInOtherLang
     */
    public void setFileSummaryDescriptionInOtherLang(java.lang.String fileSummaryDescriptionInOtherLang) {
        this.fileSummaryDescriptionInOtherLang = fileSummaryDescriptionInOtherLang;
    }


    /**
     * Gets the fileSummaryOwner value for this CFileSummary.
     * 
     * @return fileSummaryOwner
     */
    public java.lang.String getFileSummaryOwner() {
        return fileSummaryOwner;
    }


    /**
     * Sets the fileSummaryOwner value for this CFileSummary.
     * 
     * @param fileSummaryOwner
     */
    public void setFileSummaryOwner(java.lang.String fileSummaryOwner) {
        this.fileSummaryOwner = fileSummaryOwner;
    }


    /**
     * Gets the fileSummaryOwnerInOtherLang value for this CFileSummary.
     * 
     * @return fileSummaryOwnerInOtherLang
     */
    public java.lang.String getFileSummaryOwnerInOtherLang() {
        return fileSummaryOwnerInOtherLang;
    }


    /**
     * Sets the fileSummaryOwnerInOtherLang value for this CFileSummary.
     * 
     * @param fileSummaryOwnerInOtherLang
     */
    public void setFileSummaryOwnerInOtherLang(java.lang.String fileSummaryOwnerInOtherLang) {
        this.fileSummaryOwnerInOtherLang = fileSummaryOwnerInOtherLang;
    }


    /**
     * Gets the fileSummaryRepresentative value for this CFileSummary.
     * 
     * @return fileSummaryRepresentative
     */
    public java.lang.String getFileSummaryRepresentative() {
        return fileSummaryRepresentative;
    }


    /**
     * Sets the fileSummaryRepresentative value for this CFileSummary.
     * 
     * @param fileSummaryRepresentative
     */
    public void setFileSummaryRepresentative(java.lang.String fileSummaryRepresentative) {
        this.fileSummaryRepresentative = fileSummaryRepresentative;
    }


    /**
     * Gets the fileSummaryRepresentativeInOtherLang value for this CFileSummary.
     * 
     * @return fileSummaryRepresentativeInOtherLang
     */
    public java.lang.String getFileSummaryRepresentativeInOtherLang() {
        return fileSummaryRepresentativeInOtherLang;
    }


    /**
     * Sets the fileSummaryRepresentativeInOtherLang value for this CFileSummary.
     * 
     * @param fileSummaryRepresentativeInOtherLang
     */
    public void setFileSummaryRepresentativeInOtherLang(java.lang.String fileSummaryRepresentativeInOtherLang) {
        this.fileSummaryRepresentativeInOtherLang = fileSummaryRepresentativeInOtherLang;
    }


    /**
     * Gets the fileSummaryResponsibleName value for this CFileSummary.
     * 
     * @return fileSummaryResponsibleName
     */
    public java.lang.String getFileSummaryResponsibleName() {
        return fileSummaryResponsibleName;
    }


    /**
     * Sets the fileSummaryResponsibleName value for this CFileSummary.
     * 
     * @param fileSummaryResponsibleName
     */
    public void setFileSummaryResponsibleName(java.lang.String fileSummaryResponsibleName) {
        this.fileSummaryResponsibleName = fileSummaryResponsibleName;
    }


    /**
     * Gets the fileSummaryStatus value for this CFileSummary.
     * 
     * @return fileSummaryStatus
     */
    public java.lang.String getFileSummaryStatus() {
        return fileSummaryStatus;
    }


    /**
     * Sets the fileSummaryStatus value for this CFileSummary.
     * 
     * @param fileSummaryStatus
     */
    public void setFileSummaryStatus(java.lang.String fileSummaryStatus) {
        this.fileSummaryStatus = fileSummaryStatus;
    }


    /**
     * Gets the filingData value for this CFileSummary.
     * 
     * @return filingData
     */
    public _int.wipo.ipas.IpasServices.CFilingData getFilingData() {
        return filingData;
    }


    /**
     * Sets the filingData value for this CFileSummary.
     * 
     * @param filingData
     */
    public void setFilingData(_int.wipo.ipas.IpasServices.CFilingData filingData) {
        this.filingData = filingData;
    }


    /**
     * Gets the indMark value for this CFileSummary.
     * 
     * @return indMark
     */
    public java.lang.Boolean getIndMark() {
        return indMark;
    }


    /**
     * Sets the indMark value for this CFileSummary.
     * 
     * @param indMark
     */
    public void setIndMark(java.lang.Boolean indMark) {
        this.indMark = indMark;
    }


    /**
     * Gets the indPatent value for this CFileSummary.
     * 
     * @return indPatent
     */
    public java.lang.Boolean getIndPatent() {
        return indPatent;
    }


    /**
     * Sets the indPatent value for this CFileSummary.
     * 
     * @param indPatent
     */
    public void setIndPatent(java.lang.Boolean indPatent) {
        this.indPatent = indPatent;
    }


    /**
     * Gets the pctApplicationId value for this CFileSummary.
     * 
     * @return pctApplicationId
     */
    public java.lang.String getPctApplicationId() {
        return pctApplicationId;
    }


    /**
     * Sets the pctApplicationId value for this CFileSummary.
     * 
     * @param pctApplicationId
     */
    public void setPctApplicationId(java.lang.String pctApplicationId) {
        this.pctApplicationId = pctApplicationId;
    }


    /**
     * Gets the publicationNbr value for this CFileSummary.
     * 
     * @return publicationNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getPublicationNbr() {
        return publicationNbr;
    }


    /**
     * Sets the publicationNbr value for this CFileSummary.
     * 
     * @param publicationNbr
     */
    public void setPublicationNbr(_int.wipo.ipas.IpasServices.IpasInteger publicationNbr) {
        this.publicationNbr = publicationNbr;
    }


    /**
     * Gets the publicationSer value for this CFileSummary.
     * 
     * @return publicationSer
     */
    public java.lang.String getPublicationSer() {
        return publicationSer;
    }


    /**
     * Sets the publicationSer value for this CFileSummary.
     * 
     * @param publicationSer
     */
    public void setPublicationSer(java.lang.String publicationSer) {
        this.publicationSer = publicationSer;
    }


    /**
     * Gets the publicationTyp value for this CFileSummary.
     * 
     * @return publicationTyp
     */
    public java.lang.String getPublicationTyp() {
        return publicationTyp;
    }


    /**
     * Sets the publicationTyp value for this CFileSummary.
     * 
     * @param publicationTyp
     */
    public void setPublicationTyp(java.lang.String publicationTyp) {
        this.publicationTyp = publicationTyp;
    }


    /**
     * Gets the registrationData value for this CFileSummary.
     * 
     * @return registrationData
     */
    public _int.wipo.ipas.IpasServices.CRegistrationData getRegistrationData() {
        return registrationData;
    }


    /**
     * Sets the registrationData value for this CFileSummary.
     * 
     * @param registrationData
     */
    public void setRegistrationData(_int.wipo.ipas.IpasServices.CRegistrationData registrationData) {
        this.registrationData = registrationData;
    }


    /**
     * Gets the selected value for this CFileSummary.
     * 
     * @return selected
     */
    public java.lang.String getSelected() {
        return selected;
    }


    /**
     * Sets the selected value for this CFileSummary.
     * 
     * @param selected
     */
    public void setSelected(java.lang.String selected) {
        this.selected = selected;
    }


    /**
     * Gets the similarityPercent value for this CFileSummary.
     * 
     * @return similarityPercent
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getSimilarityPercent() {
        return similarityPercent;
    }


    /**
     * Sets the similarityPercent value for this CFileSummary.
     * 
     * @param similarityPercent
     */
    public void setSimilarityPercent(_int.wipo.ipas.IpasServices.IpasInteger similarityPercent) {
        this.similarityPercent = similarityPercent;
    }


    /**
     * Gets the statusId value for this CFileSummary.
     * 
     * @return statusId
     */
    public _int.wipo.ipas.IpasServices.CStatusId getStatusId() {
        return statusId;
    }


    /**
     * Sets the statusId value for this CFileSummary.
     * 
     * @param statusId
     */
    public void setStatusId(_int.wipo.ipas.IpasServices.CStatusId statusId) {
        this.statusId = statusId;
    }


    /**
     * Gets the workflowWarningText value for this CFileSummary.
     * 
     * @return workflowWarningText
     */
    public java.lang.String getWorkflowWarningText() {
        return workflowWarningText;
    }


    /**
     * Sets the workflowWarningText value for this CFileSummary.
     * 
     * @param workflowWarningText
     */
    public void setWorkflowWarningText(java.lang.String workflowWarningText) {
        this.workflowWarningText = workflowWarningText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CFileSummary)) return false;
        CFileSummary other = (CFileSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CUserdocs==null && other.getCUserdocs()==null) || 
             (this.CUserdocs!=null &&
              java.util.Arrays.equals(this.CUserdocs, other.getCUserdocs()))) &&
            ((this.disclaimer==null && other.getDisclaimer()==null) || 
             (this.disclaimer!=null &&
              this.disclaimer.equals(other.getDisclaimer()))) &&
            ((this.disclaimerInOtherLang==null && other.getDisclaimerInOtherLang()==null) || 
             (this.disclaimerInOtherLang!=null &&
              this.disclaimerInOtherLang.equals(other.getDisclaimerInOtherLang()))) &&
            ((this.fileId==null && other.getFileId()==null) || 
             (this.fileId!=null &&
              this.fileId.equals(other.getFileId()))) &&
            ((this.fileIdAsString==null && other.getFileIdAsString()==null) || 
             (this.fileIdAsString!=null &&
              this.fileIdAsString.equals(other.getFileIdAsString()))) &&
            ((this.fileSummaryClasses==null && other.getFileSummaryClasses()==null) || 
             (this.fileSummaryClasses!=null &&
              this.fileSummaryClasses.equals(other.getFileSummaryClasses()))) &&
            ((this.fileSummaryCountry==null && other.getFileSummaryCountry()==null) || 
             (this.fileSummaryCountry!=null &&
              this.fileSummaryCountry.equals(other.getFileSummaryCountry()))) &&
            ((this.fileSummaryDescription==null && other.getFileSummaryDescription()==null) || 
             (this.fileSummaryDescription!=null &&
              this.fileSummaryDescription.equals(other.getFileSummaryDescription()))) &&
            ((this.fileSummaryDescriptionInOtherLang==null && other.getFileSummaryDescriptionInOtherLang()==null) || 
             (this.fileSummaryDescriptionInOtherLang!=null &&
              this.fileSummaryDescriptionInOtherLang.equals(other.getFileSummaryDescriptionInOtherLang()))) &&
            ((this.fileSummaryOwner==null && other.getFileSummaryOwner()==null) || 
             (this.fileSummaryOwner!=null &&
              this.fileSummaryOwner.equals(other.getFileSummaryOwner()))) &&
            ((this.fileSummaryOwnerInOtherLang==null && other.getFileSummaryOwnerInOtherLang()==null) || 
             (this.fileSummaryOwnerInOtherLang!=null &&
              this.fileSummaryOwnerInOtherLang.equals(other.getFileSummaryOwnerInOtherLang()))) &&
            ((this.fileSummaryRepresentative==null && other.getFileSummaryRepresentative()==null) || 
             (this.fileSummaryRepresentative!=null &&
              this.fileSummaryRepresentative.equals(other.getFileSummaryRepresentative()))) &&
            ((this.fileSummaryRepresentativeInOtherLang==null && other.getFileSummaryRepresentativeInOtherLang()==null) || 
             (this.fileSummaryRepresentativeInOtherLang!=null &&
              this.fileSummaryRepresentativeInOtherLang.equals(other.getFileSummaryRepresentativeInOtherLang()))) &&
            ((this.fileSummaryResponsibleName==null && other.getFileSummaryResponsibleName()==null) || 
             (this.fileSummaryResponsibleName!=null &&
              this.fileSummaryResponsibleName.equals(other.getFileSummaryResponsibleName()))) &&
            ((this.fileSummaryStatus==null && other.getFileSummaryStatus()==null) || 
             (this.fileSummaryStatus!=null &&
              this.fileSummaryStatus.equals(other.getFileSummaryStatus()))) &&
            ((this.filingData==null && other.getFilingData()==null) || 
             (this.filingData!=null &&
              this.filingData.equals(other.getFilingData()))) &&
            ((this.indMark==null && other.getIndMark()==null) || 
             (this.indMark!=null &&
              this.indMark.equals(other.getIndMark()))) &&
            ((this.indPatent==null && other.getIndPatent()==null) || 
             (this.indPatent!=null &&
              this.indPatent.equals(other.getIndPatent()))) &&
            ((this.pctApplicationId==null && other.getPctApplicationId()==null) || 
             (this.pctApplicationId!=null &&
              this.pctApplicationId.equals(other.getPctApplicationId()))) &&
            ((this.publicationNbr==null && other.getPublicationNbr()==null) || 
             (this.publicationNbr!=null &&
              this.publicationNbr.equals(other.getPublicationNbr()))) &&
            ((this.publicationSer==null && other.getPublicationSer()==null) || 
             (this.publicationSer!=null &&
              this.publicationSer.equals(other.getPublicationSer()))) &&
            ((this.publicationTyp==null && other.getPublicationTyp()==null) || 
             (this.publicationTyp!=null &&
              this.publicationTyp.equals(other.getPublicationTyp()))) &&
            ((this.registrationData==null && other.getRegistrationData()==null) || 
             (this.registrationData!=null &&
              this.registrationData.equals(other.getRegistrationData()))) &&
            ((this.selected==null && other.getSelected()==null) || 
             (this.selected!=null &&
              this.selected.equals(other.getSelected()))) &&
            ((this.similarityPercent==null && other.getSimilarityPercent()==null) || 
             (this.similarityPercent!=null &&
              this.similarityPercent.equals(other.getSimilarityPercent()))) &&
            ((this.statusId==null && other.getStatusId()==null) || 
             (this.statusId!=null &&
              this.statusId.equals(other.getStatusId()))) &&
            ((this.workflowWarningText==null && other.getWorkflowWarningText()==null) || 
             (this.workflowWarningText!=null &&
              this.workflowWarningText.equals(other.getWorkflowWarningText())));
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
        if (getCUserdocs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCUserdocs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCUserdocs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisclaimer() != null) {
            _hashCode += getDisclaimer().hashCode();
        }
        if (getDisclaimerInOtherLang() != null) {
            _hashCode += getDisclaimerInOtherLang().hashCode();
        }
        if (getFileId() != null) {
            _hashCode += getFileId().hashCode();
        }
        if (getFileIdAsString() != null) {
            _hashCode += getFileIdAsString().hashCode();
        }
        if (getFileSummaryClasses() != null) {
            _hashCode += getFileSummaryClasses().hashCode();
        }
        if (getFileSummaryCountry() != null) {
            _hashCode += getFileSummaryCountry().hashCode();
        }
        if (getFileSummaryDescription() != null) {
            _hashCode += getFileSummaryDescription().hashCode();
        }
        if (getFileSummaryDescriptionInOtherLang() != null) {
            _hashCode += getFileSummaryDescriptionInOtherLang().hashCode();
        }
        if (getFileSummaryOwner() != null) {
            _hashCode += getFileSummaryOwner().hashCode();
        }
        if (getFileSummaryOwnerInOtherLang() != null) {
            _hashCode += getFileSummaryOwnerInOtherLang().hashCode();
        }
        if (getFileSummaryRepresentative() != null) {
            _hashCode += getFileSummaryRepresentative().hashCode();
        }
        if (getFileSummaryRepresentativeInOtherLang() != null) {
            _hashCode += getFileSummaryRepresentativeInOtherLang().hashCode();
        }
        if (getFileSummaryResponsibleName() != null) {
            _hashCode += getFileSummaryResponsibleName().hashCode();
        }
        if (getFileSummaryStatus() != null) {
            _hashCode += getFileSummaryStatus().hashCode();
        }
        if (getFilingData() != null) {
            _hashCode += getFilingData().hashCode();
        }
        if (getIndMark() != null) {
            _hashCode += getIndMark().hashCode();
        }
        if (getIndPatent() != null) {
            _hashCode += getIndPatent().hashCode();
        }
        if (getPctApplicationId() != null) {
            _hashCode += getPctApplicationId().hashCode();
        }
        if (getPublicationNbr() != null) {
            _hashCode += getPublicationNbr().hashCode();
        }
        if (getPublicationSer() != null) {
            _hashCode += getPublicationSer().hashCode();
        }
        if (getPublicationTyp() != null) {
            _hashCode += getPublicationTyp().hashCode();
        }
        if (getRegistrationData() != null) {
            _hashCode += getRegistrationData().hashCode();
        }
        if (getSelected() != null) {
            _hashCode += getSelected().hashCode();
        }
        if (getSimilarityPercent() != null) {
            _hashCode += getSimilarityPercent().hashCode();
        }
        if (getStatusId() != null) {
            _hashCode += getStatusId().hashCode();
        }
        if (getWorkflowWarningText() != null) {
            _hashCode += getWorkflowWarningText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CFileSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUserdocs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CUserdocs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserdoc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disclaimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disclaimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disclaimerInOtherLang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disclaimerInOtherLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileIdAsString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileIdAsString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSummaryClasses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSummaryClasses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSummaryCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSummaryCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSummaryDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSummaryDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSummaryDescriptionInOtherLang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSummaryDescriptionInOtherLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSummaryOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSummaryOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSummaryOwnerInOtherLang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSummaryOwnerInOtherLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSummaryRepresentative");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSummaryRepresentative"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSummaryRepresentativeInOtherLang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSummaryRepresentativeInOtherLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSummaryResponsibleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSummaryResponsibleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSummaryStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSummaryStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filingData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filingData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFilingData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indMark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indMark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indPatent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indPatent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pctApplicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pctApplicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicationNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicationNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicationSer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicationSer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicationTyp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicationTyp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRegistrationData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("similarityPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "similarityPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStatusId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowWarningText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workflowWarningText"));
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
