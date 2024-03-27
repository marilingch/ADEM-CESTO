/**
 * CUserdoc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CUserdoc  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CDocumentId affectedDocumentId;

    private _int.wipo.ipas.IpasServices.CFileId[] affectedFileIdList;

    private _int.wipo.ipas.IpasServices.CFileSummary[] affectedFileSummaryList;

    private _int.wipo.ipas.IpasServices.CAnnuityPayment[] annuityPaymentList;

    private _int.wipo.ipas.IpasServices.CApplicant applicant;

    private _int.wipo.ipas.IpasServices.CAuxiliaryRegisterData auxiliaryRegisterData;

    private _int.wipo.ipas.IpasServices.CCourtDoc courtDoc;

    private _int.wipo.ipas.IpasServices.CDocumentId documentId;

    private _int.wipo.ipas.IpasServices.CDocumentSeqId documentSeqId;

    private _int.wipo.ipas.IpasServices.CFilingData filingData;

    private java.lang.Boolean indNotAllFilesCapturedYet;

    private _int.wipo.ipas.IpasServices.COwnershipData newOwnershipData;

    private java.lang.String notes;

    private _int.wipo.ipas.IpasServices.COfficeSectionId officeSectionId;

    private _int.wipo.ipas.IpasServices.CpoaData poaData;

    private _int.wipo.ipas.IpasServices.CRepresentationData representationData;

    private _int.wipo.ipas.IpasServices.COfficedocId respondedOfficedocId;

    private _int.wipo.ipas.IpasServices.IpasInteger rowVersion;

    private _int.wipo.ipas.IpasServices.CProcessId userdocProcessId;

    public CUserdoc() {
    }

    public CUserdoc(
           _int.wipo.ipas.IpasServices.CDocumentId affectedDocumentId,
           _int.wipo.ipas.IpasServices.CFileId[] affectedFileIdList,
           _int.wipo.ipas.IpasServices.CFileSummary[] affectedFileSummaryList,
           _int.wipo.ipas.IpasServices.CAnnuityPayment[] annuityPaymentList,
           _int.wipo.ipas.IpasServices.CApplicant applicant,
           _int.wipo.ipas.IpasServices.CAuxiliaryRegisterData auxiliaryRegisterData,
           _int.wipo.ipas.IpasServices.CCourtDoc courtDoc,
           _int.wipo.ipas.IpasServices.CDocumentId documentId,
           _int.wipo.ipas.IpasServices.CDocumentSeqId documentSeqId,
           _int.wipo.ipas.IpasServices.CFilingData filingData,
           java.lang.Boolean indNotAllFilesCapturedYet,
           _int.wipo.ipas.IpasServices.COwnershipData newOwnershipData,
           java.lang.String notes,
           _int.wipo.ipas.IpasServices.COfficeSectionId officeSectionId,
           _int.wipo.ipas.IpasServices.CpoaData poaData,
           _int.wipo.ipas.IpasServices.CRepresentationData representationData,
           _int.wipo.ipas.IpasServices.COfficedocId respondedOfficedocId,
           _int.wipo.ipas.IpasServices.IpasInteger rowVersion,
           _int.wipo.ipas.IpasServices.CProcessId userdocProcessId) {
           this.affectedDocumentId = affectedDocumentId;
           this.affectedFileIdList = affectedFileIdList;
           this.affectedFileSummaryList = affectedFileSummaryList;
           this.annuityPaymentList = annuityPaymentList;
           this.applicant = applicant;
           this.auxiliaryRegisterData = auxiliaryRegisterData;
           this.courtDoc = courtDoc;
           this.documentId = documentId;
           this.documentSeqId = documentSeqId;
           this.filingData = filingData;
           this.indNotAllFilesCapturedYet = indNotAllFilesCapturedYet;
           this.newOwnershipData = newOwnershipData;
           this.notes = notes;
           this.officeSectionId = officeSectionId;
           this.poaData = poaData;
           this.representationData = representationData;
           this.respondedOfficedocId = respondedOfficedocId;
           this.rowVersion = rowVersion;
           this.userdocProcessId = userdocProcessId;
    }


    /**
     * Gets the affectedDocumentId value for this CUserdoc.
     * 
     * @return affectedDocumentId
     */
    public _int.wipo.ipas.IpasServices.CDocumentId getAffectedDocumentId() {
        return affectedDocumentId;
    }


    /**
     * Sets the affectedDocumentId value for this CUserdoc.
     * 
     * @param affectedDocumentId
     */
    public void setAffectedDocumentId(_int.wipo.ipas.IpasServices.CDocumentId affectedDocumentId) {
        this.affectedDocumentId = affectedDocumentId;
    }


    /**
     * Gets the affectedFileIdList value for this CUserdoc.
     * 
     * @return affectedFileIdList
     */
    public _int.wipo.ipas.IpasServices.CFileId[] getAffectedFileIdList() {
        return affectedFileIdList;
    }


    /**
     * Sets the affectedFileIdList value for this CUserdoc.
     * 
     * @param affectedFileIdList
     */
    public void setAffectedFileIdList(_int.wipo.ipas.IpasServices.CFileId[] affectedFileIdList) {
        this.affectedFileIdList = affectedFileIdList;
    }

    public _int.wipo.ipas.IpasServices.CFileId getAffectedFileIdList(int i) {
        return this.affectedFileIdList[i];
    }

    public void setAffectedFileIdList(int i, _int.wipo.ipas.IpasServices.CFileId _value) {
        this.affectedFileIdList[i] = _value;
    }


    /**
     * Gets the affectedFileSummaryList value for this CUserdoc.
     * 
     * @return affectedFileSummaryList
     */
    public _int.wipo.ipas.IpasServices.CFileSummary[] getAffectedFileSummaryList() {
        return affectedFileSummaryList;
    }


    /**
     * Sets the affectedFileSummaryList value for this CUserdoc.
     * 
     * @param affectedFileSummaryList
     */
    public void setAffectedFileSummaryList(_int.wipo.ipas.IpasServices.CFileSummary[] affectedFileSummaryList) {
        this.affectedFileSummaryList = affectedFileSummaryList;
    }

    public _int.wipo.ipas.IpasServices.CFileSummary getAffectedFileSummaryList(int i) {
        return this.affectedFileSummaryList[i];
    }

    public void setAffectedFileSummaryList(int i, _int.wipo.ipas.IpasServices.CFileSummary _value) {
        this.affectedFileSummaryList[i] = _value;
    }


    /**
     * Gets the annuityPaymentList value for this CUserdoc.
     * 
     * @return annuityPaymentList
     */
    public _int.wipo.ipas.IpasServices.CAnnuityPayment[] getAnnuityPaymentList() {
        return annuityPaymentList;
    }


    /**
     * Sets the annuityPaymentList value for this CUserdoc.
     * 
     * @param annuityPaymentList
     */
    public void setAnnuityPaymentList(_int.wipo.ipas.IpasServices.CAnnuityPayment[] annuityPaymentList) {
        this.annuityPaymentList = annuityPaymentList;
    }

    public _int.wipo.ipas.IpasServices.CAnnuityPayment getAnnuityPaymentList(int i) {
        return this.annuityPaymentList[i];
    }

    public void setAnnuityPaymentList(int i, _int.wipo.ipas.IpasServices.CAnnuityPayment _value) {
        this.annuityPaymentList[i] = _value;
    }


    /**
     * Gets the applicant value for this CUserdoc.
     * 
     * @return applicant
     */
    public _int.wipo.ipas.IpasServices.CApplicant getApplicant() {
        return applicant;
    }


    /**
     * Sets the applicant value for this CUserdoc.
     * 
     * @param applicant
     */
    public void setApplicant(_int.wipo.ipas.IpasServices.CApplicant applicant) {
        this.applicant = applicant;
    }


    /**
     * Gets the auxiliaryRegisterData value for this CUserdoc.
     * 
     * @return auxiliaryRegisterData
     */
    public _int.wipo.ipas.IpasServices.CAuxiliaryRegisterData getAuxiliaryRegisterData() {
        return auxiliaryRegisterData;
    }


    /**
     * Sets the auxiliaryRegisterData value for this CUserdoc.
     * 
     * @param auxiliaryRegisterData
     */
    public void setAuxiliaryRegisterData(_int.wipo.ipas.IpasServices.CAuxiliaryRegisterData auxiliaryRegisterData) {
        this.auxiliaryRegisterData = auxiliaryRegisterData;
    }


    /**
     * Gets the courtDoc value for this CUserdoc.
     * 
     * @return courtDoc
     */
    public _int.wipo.ipas.IpasServices.CCourtDoc getCourtDoc() {
        return courtDoc;
    }


    /**
     * Sets the courtDoc value for this CUserdoc.
     * 
     * @param courtDoc
     */
    public void setCourtDoc(_int.wipo.ipas.IpasServices.CCourtDoc courtDoc) {
        this.courtDoc = courtDoc;
    }


    /**
     * Gets the documentId value for this CUserdoc.
     * 
     * @return documentId
     */
    public _int.wipo.ipas.IpasServices.CDocumentId getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this CUserdoc.
     * 
     * @param documentId
     */
    public void setDocumentId(_int.wipo.ipas.IpasServices.CDocumentId documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the documentSeqId value for this CUserdoc.
     * 
     * @return documentSeqId
     */
    public _int.wipo.ipas.IpasServices.CDocumentSeqId getDocumentSeqId() {
        return documentSeqId;
    }


    /**
     * Sets the documentSeqId value for this CUserdoc.
     * 
     * @param documentSeqId
     */
    public void setDocumentSeqId(_int.wipo.ipas.IpasServices.CDocumentSeqId documentSeqId) {
        this.documentSeqId = documentSeqId;
    }


    /**
     * Gets the filingData value for this CUserdoc.
     * 
     * @return filingData
     */
    public _int.wipo.ipas.IpasServices.CFilingData getFilingData() {
        return filingData;
    }


    /**
     * Sets the filingData value for this CUserdoc.
     * 
     * @param filingData
     */
    public void setFilingData(_int.wipo.ipas.IpasServices.CFilingData filingData) {
        this.filingData = filingData;
    }


    /**
     * Gets the indNotAllFilesCapturedYet value for this CUserdoc.
     * 
     * @return indNotAllFilesCapturedYet
     */
    public java.lang.Boolean getIndNotAllFilesCapturedYet() {
        return indNotAllFilesCapturedYet;
    }


    /**
     * Sets the indNotAllFilesCapturedYet value for this CUserdoc.
     * 
     * @param indNotAllFilesCapturedYet
     */
    public void setIndNotAllFilesCapturedYet(java.lang.Boolean indNotAllFilesCapturedYet) {
        this.indNotAllFilesCapturedYet = indNotAllFilesCapturedYet;
    }


    /**
     * Gets the newOwnershipData value for this CUserdoc.
     * 
     * @return newOwnershipData
     */
    public _int.wipo.ipas.IpasServices.COwnershipData getNewOwnershipData() {
        return newOwnershipData;
    }


    /**
     * Sets the newOwnershipData value for this CUserdoc.
     * 
     * @param newOwnershipData
     */
    public void setNewOwnershipData(_int.wipo.ipas.IpasServices.COwnershipData newOwnershipData) {
        this.newOwnershipData = newOwnershipData;
    }


    /**
     * Gets the notes value for this CUserdoc.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CUserdoc.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the officeSectionId value for this CUserdoc.
     * 
     * @return officeSectionId
     */
    public _int.wipo.ipas.IpasServices.COfficeSectionId getOfficeSectionId() {
        return officeSectionId;
    }


    /**
     * Sets the officeSectionId value for this CUserdoc.
     * 
     * @param officeSectionId
     */
    public void setOfficeSectionId(_int.wipo.ipas.IpasServices.COfficeSectionId officeSectionId) {
        this.officeSectionId = officeSectionId;
    }


    /**
     * Gets the poaData value for this CUserdoc.
     * 
     * @return poaData
     */
    public _int.wipo.ipas.IpasServices.CpoaData getPoaData() {
        return poaData;
    }


    /**
     * Sets the poaData value for this CUserdoc.
     * 
     * @param poaData
     */
    public void setPoaData(_int.wipo.ipas.IpasServices.CpoaData poaData) {
        this.poaData = poaData;
    }


    /**
     * Gets the representationData value for this CUserdoc.
     * 
     * @return representationData
     */
    public _int.wipo.ipas.IpasServices.CRepresentationData getRepresentationData() {
        return representationData;
    }


    /**
     * Sets the representationData value for this CUserdoc.
     * 
     * @param representationData
     */
    public void setRepresentationData(_int.wipo.ipas.IpasServices.CRepresentationData representationData) {
        this.representationData = representationData;
    }


    /**
     * Gets the respondedOfficedocId value for this CUserdoc.
     * 
     * @return respondedOfficedocId
     */
    public _int.wipo.ipas.IpasServices.COfficedocId getRespondedOfficedocId() {
        return respondedOfficedocId;
    }


    /**
     * Sets the respondedOfficedocId value for this CUserdoc.
     * 
     * @param respondedOfficedocId
     */
    public void setRespondedOfficedocId(_int.wipo.ipas.IpasServices.COfficedocId respondedOfficedocId) {
        this.respondedOfficedocId = respondedOfficedocId;
    }


    /**
     * Gets the rowVersion value for this CUserdoc.
     * 
     * @return rowVersion
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getRowVersion() {
        return rowVersion;
    }


    /**
     * Sets the rowVersion value for this CUserdoc.
     * 
     * @param rowVersion
     */
    public void setRowVersion(_int.wipo.ipas.IpasServices.IpasInteger rowVersion) {
        this.rowVersion = rowVersion;
    }


    /**
     * Gets the userdocProcessId value for this CUserdoc.
     * 
     * @return userdocProcessId
     */
    public _int.wipo.ipas.IpasServices.CProcessId getUserdocProcessId() {
        return userdocProcessId;
    }


    /**
     * Sets the userdocProcessId value for this CUserdoc.
     * 
     * @param userdocProcessId
     */
    public void setUserdocProcessId(_int.wipo.ipas.IpasServices.CProcessId userdocProcessId) {
        this.userdocProcessId = userdocProcessId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CUserdoc)) return false;
        CUserdoc other = (CUserdoc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.affectedDocumentId==null && other.getAffectedDocumentId()==null) || 
             (this.affectedDocumentId!=null &&
              this.affectedDocumentId.equals(other.getAffectedDocumentId()))) &&
            ((this.affectedFileIdList==null && other.getAffectedFileIdList()==null) || 
             (this.affectedFileIdList!=null &&
              java.util.Arrays.equals(this.affectedFileIdList, other.getAffectedFileIdList()))) &&
            ((this.affectedFileSummaryList==null && other.getAffectedFileSummaryList()==null) || 
             (this.affectedFileSummaryList!=null &&
              java.util.Arrays.equals(this.affectedFileSummaryList, other.getAffectedFileSummaryList()))) &&
            ((this.annuityPaymentList==null && other.getAnnuityPaymentList()==null) || 
             (this.annuityPaymentList!=null &&
              java.util.Arrays.equals(this.annuityPaymentList, other.getAnnuityPaymentList()))) &&
            ((this.applicant==null && other.getApplicant()==null) || 
             (this.applicant!=null &&
              this.applicant.equals(other.getApplicant()))) &&
            ((this.auxiliaryRegisterData==null && other.getAuxiliaryRegisterData()==null) || 
             (this.auxiliaryRegisterData!=null &&
              this.auxiliaryRegisterData.equals(other.getAuxiliaryRegisterData()))) &&
            ((this.courtDoc==null && other.getCourtDoc()==null) || 
             (this.courtDoc!=null &&
              this.courtDoc.equals(other.getCourtDoc()))) &&
            ((this.documentId==null && other.getDocumentId()==null) || 
             (this.documentId!=null &&
              this.documentId.equals(other.getDocumentId()))) &&
            ((this.documentSeqId==null && other.getDocumentSeqId()==null) || 
             (this.documentSeqId!=null &&
              this.documentSeqId.equals(other.getDocumentSeqId()))) &&
            ((this.filingData==null && other.getFilingData()==null) || 
             (this.filingData!=null &&
              this.filingData.equals(other.getFilingData()))) &&
            ((this.indNotAllFilesCapturedYet==null && other.getIndNotAllFilesCapturedYet()==null) || 
             (this.indNotAllFilesCapturedYet!=null &&
              this.indNotAllFilesCapturedYet.equals(other.getIndNotAllFilesCapturedYet()))) &&
            ((this.newOwnershipData==null && other.getNewOwnershipData()==null) || 
             (this.newOwnershipData!=null &&
              this.newOwnershipData.equals(other.getNewOwnershipData()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.officeSectionId==null && other.getOfficeSectionId()==null) || 
             (this.officeSectionId!=null &&
              this.officeSectionId.equals(other.getOfficeSectionId()))) &&
            ((this.poaData==null && other.getPoaData()==null) || 
             (this.poaData!=null &&
              this.poaData.equals(other.getPoaData()))) &&
            ((this.representationData==null && other.getRepresentationData()==null) || 
             (this.representationData!=null &&
              this.representationData.equals(other.getRepresentationData()))) &&
            ((this.respondedOfficedocId==null && other.getRespondedOfficedocId()==null) || 
             (this.respondedOfficedocId!=null &&
              this.respondedOfficedocId.equals(other.getRespondedOfficedocId()))) &&
            ((this.rowVersion==null && other.getRowVersion()==null) || 
             (this.rowVersion!=null &&
              this.rowVersion.equals(other.getRowVersion()))) &&
            ((this.userdocProcessId==null && other.getUserdocProcessId()==null) || 
             (this.userdocProcessId!=null &&
              this.userdocProcessId.equals(other.getUserdocProcessId())));
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
        if (getAffectedDocumentId() != null) {
            _hashCode += getAffectedDocumentId().hashCode();
        }
        if (getAffectedFileIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAffectedFileIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAffectedFileIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAffectedFileSummaryList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAffectedFileSummaryList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAffectedFileSummaryList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnnuityPaymentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnnuityPaymentList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnnuityPaymentList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplicant() != null) {
            _hashCode += getApplicant().hashCode();
        }
        if (getAuxiliaryRegisterData() != null) {
            _hashCode += getAuxiliaryRegisterData().hashCode();
        }
        if (getCourtDoc() != null) {
            _hashCode += getCourtDoc().hashCode();
        }
        if (getDocumentId() != null) {
            _hashCode += getDocumentId().hashCode();
        }
        if (getDocumentSeqId() != null) {
            _hashCode += getDocumentSeqId().hashCode();
        }
        if (getFilingData() != null) {
            _hashCode += getFilingData().hashCode();
        }
        if (getIndNotAllFilesCapturedYet() != null) {
            _hashCode += getIndNotAllFilesCapturedYet().hashCode();
        }
        if (getNewOwnershipData() != null) {
            _hashCode += getNewOwnershipData().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getOfficeSectionId() != null) {
            _hashCode += getOfficeSectionId().hashCode();
        }
        if (getPoaData() != null) {
            _hashCode += getPoaData().hashCode();
        }
        if (getRepresentationData() != null) {
            _hashCode += getRepresentationData().hashCode();
        }
        if (getRespondedOfficedocId() != null) {
            _hashCode += getRespondedOfficedocId().hashCode();
        }
        if (getRowVersion() != null) {
            _hashCode += getRowVersion().hashCode();
        }
        if (getUserdocProcessId() != null) {
            _hashCode += getUserdocProcessId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CUserdoc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserdoc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affectedDocumentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "affectedDocumentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affectedFileIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "affectedFileIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affectedFileSummaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "affectedFileSummaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annuityPaymentList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annuityPaymentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAnnuityPayment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cApplicant"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auxiliaryRegisterData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auxiliaryRegisterData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAuxiliaryRegisterData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courtDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courtDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCourtDoc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentSeqId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentSeqId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentSeqId"));
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
        elemField.setFieldName("indNotAllFilesCapturedYet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indNotAllFilesCapturedYet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newOwnershipData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newOwnershipData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOwnershipData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeSectionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officeSectionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficeSectionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poaData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "poaData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cpoaData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representationData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "representationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRepresentationData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respondedOfficedocId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respondedOfficedocId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdocProcessId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdocProcessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"));
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
