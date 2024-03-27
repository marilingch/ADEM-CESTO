/**
 * CProcessSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CProcessSummary  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime creationDate;

    private java.lang.String description;

    private _int.wipo.ipas.IpasServices.CDocumentId documentId;

    private _int.wipo.ipas.IpasServices.IpasDateTime dueDate;

    private java.lang.Boolean indTopFileMark;

    private java.lang.Boolean indTopMarkPatent;

    private java.lang.String lastActionName;

    private java.lang.String lastActionUsername;

    private _int.wipo.ipas.IpasServices.COfficedocId officedocId;

    private java.lang.String officedocTypeName;

    private _int.wipo.ipas.IpasServices.CProcessId processId;

    private java.lang.String processIdAsString;

    private _int.wipo.ipas.IpasServices.IpasInteger relatedToWorkcode;

    private java.lang.String responsibleUserName;

    private _int.wipo.ipas.IpasServices.IpasDateTime statusDate;

    private java.lang.String statusName;

    private java.lang.String topFileDescription;

    private _int.wipo.ipas.IpasServices.IpasDateTime topFileFilingDate;

    private _int.wipo.ipas.IpasServices.CFileId topFileId;

    private java.lang.String topFileOwner;

    private _int.wipo.ipas.IpasServices.CRegistrationId topFileRegistrationId;

    private java.lang.String topFileStatusName;

    private _int.wipo.ipas.IpasServices.CProcessId topProcessId;

    private _int.wipo.ipas.IpasServices.CProcessId upperProcessId;

    private java.lang.String userdocSeqName;

    private _int.wipo.ipas.IpasServices.IpasInteger userdocSeqNbr;

    private _int.wipo.ipas.IpasServices.IpasInteger userdocSeqSeries;

    private java.lang.String userdocSeqType;

    private java.lang.String userdocTypeName;

    private java.lang.String workflowWarningText;

    public CProcessSummary() {
    }

    public CProcessSummary(
           _int.wipo.ipas.IpasServices.IpasDateTime creationDate,
           java.lang.String description,
           _int.wipo.ipas.IpasServices.CDocumentId documentId,
           _int.wipo.ipas.IpasServices.IpasDateTime dueDate,
           java.lang.Boolean indTopFileMark,
           java.lang.Boolean indTopMarkPatent,
           java.lang.String lastActionName,
           java.lang.String lastActionUsername,
           _int.wipo.ipas.IpasServices.COfficedocId officedocId,
           java.lang.String officedocTypeName,
           _int.wipo.ipas.IpasServices.CProcessId processId,
           java.lang.String processIdAsString,
           _int.wipo.ipas.IpasServices.IpasInteger relatedToWorkcode,
           java.lang.String responsibleUserName,
           _int.wipo.ipas.IpasServices.IpasDateTime statusDate,
           java.lang.String statusName,
           java.lang.String topFileDescription,
           _int.wipo.ipas.IpasServices.IpasDateTime topFileFilingDate,
           _int.wipo.ipas.IpasServices.CFileId topFileId,
           java.lang.String topFileOwner,
           _int.wipo.ipas.IpasServices.CRegistrationId topFileRegistrationId,
           java.lang.String topFileStatusName,
           _int.wipo.ipas.IpasServices.CProcessId topProcessId,
           _int.wipo.ipas.IpasServices.CProcessId upperProcessId,
           java.lang.String userdocSeqName,
           _int.wipo.ipas.IpasServices.IpasInteger userdocSeqNbr,
           _int.wipo.ipas.IpasServices.IpasInteger userdocSeqSeries,
           java.lang.String userdocSeqType,
           java.lang.String userdocTypeName,
           java.lang.String workflowWarningText) {
           this.creationDate = creationDate;
           this.description = description;
           this.documentId = documentId;
           this.dueDate = dueDate;
           this.indTopFileMark = indTopFileMark;
           this.indTopMarkPatent = indTopMarkPatent;
           this.lastActionName = lastActionName;
           this.lastActionUsername = lastActionUsername;
           this.officedocId = officedocId;
           this.officedocTypeName = officedocTypeName;
           this.processId = processId;
           this.processIdAsString = processIdAsString;
           this.relatedToWorkcode = relatedToWorkcode;
           this.responsibleUserName = responsibleUserName;
           this.statusDate = statusDate;
           this.statusName = statusName;
           this.topFileDescription = topFileDescription;
           this.topFileFilingDate = topFileFilingDate;
           this.topFileId = topFileId;
           this.topFileOwner = topFileOwner;
           this.topFileRegistrationId = topFileRegistrationId;
           this.topFileStatusName = topFileStatusName;
           this.topProcessId = topProcessId;
           this.upperProcessId = upperProcessId;
           this.userdocSeqName = userdocSeqName;
           this.userdocSeqNbr = userdocSeqNbr;
           this.userdocSeqSeries = userdocSeqSeries;
           this.userdocSeqType = userdocSeqType;
           this.userdocTypeName = userdocTypeName;
           this.workflowWarningText = workflowWarningText;
    }


    /**
     * Gets the creationDate value for this CProcessSummary.
     * 
     * @return creationDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this CProcessSummary.
     * 
     * @param creationDate
     */
    public void setCreationDate(_int.wipo.ipas.IpasServices.IpasDateTime creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the description value for this CProcessSummary.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CProcessSummary.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the documentId value for this CProcessSummary.
     * 
     * @return documentId
     */
    public _int.wipo.ipas.IpasServices.CDocumentId getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this CProcessSummary.
     * 
     * @param documentId
     */
    public void setDocumentId(_int.wipo.ipas.IpasServices.CDocumentId documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the dueDate value for this CProcessSummary.
     * 
     * @return dueDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this CProcessSummary.
     * 
     * @param dueDate
     */
    public void setDueDate(_int.wipo.ipas.IpasServices.IpasDateTime dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the indTopFileMark value for this CProcessSummary.
     * 
     * @return indTopFileMark
     */
    public java.lang.Boolean getIndTopFileMark() {
        return indTopFileMark;
    }


    /**
     * Sets the indTopFileMark value for this CProcessSummary.
     * 
     * @param indTopFileMark
     */
    public void setIndTopFileMark(java.lang.Boolean indTopFileMark) {
        this.indTopFileMark = indTopFileMark;
    }


    /**
     * Gets the indTopMarkPatent value for this CProcessSummary.
     * 
     * @return indTopMarkPatent
     */
    public java.lang.Boolean getIndTopMarkPatent() {
        return indTopMarkPatent;
    }


    /**
     * Sets the indTopMarkPatent value for this CProcessSummary.
     * 
     * @param indTopMarkPatent
     */
    public void setIndTopMarkPatent(java.lang.Boolean indTopMarkPatent) {
        this.indTopMarkPatent = indTopMarkPatent;
    }


    /**
     * Gets the lastActionName value for this CProcessSummary.
     * 
     * @return lastActionName
     */
    public java.lang.String getLastActionName() {
        return lastActionName;
    }


    /**
     * Sets the lastActionName value for this CProcessSummary.
     * 
     * @param lastActionName
     */
    public void setLastActionName(java.lang.String lastActionName) {
        this.lastActionName = lastActionName;
    }


    /**
     * Gets the lastActionUsername value for this CProcessSummary.
     * 
     * @return lastActionUsername
     */
    public java.lang.String getLastActionUsername() {
        return lastActionUsername;
    }


    /**
     * Sets the lastActionUsername value for this CProcessSummary.
     * 
     * @param lastActionUsername
     */
    public void setLastActionUsername(java.lang.String lastActionUsername) {
        this.lastActionUsername = lastActionUsername;
    }


    /**
     * Gets the officedocId value for this CProcessSummary.
     * 
     * @return officedocId
     */
    public _int.wipo.ipas.IpasServices.COfficedocId getOfficedocId() {
        return officedocId;
    }


    /**
     * Sets the officedocId value for this CProcessSummary.
     * 
     * @param officedocId
     */
    public void setOfficedocId(_int.wipo.ipas.IpasServices.COfficedocId officedocId) {
        this.officedocId = officedocId;
    }


    /**
     * Gets the officedocTypeName value for this CProcessSummary.
     * 
     * @return officedocTypeName
     */
    public java.lang.String getOfficedocTypeName() {
        return officedocTypeName;
    }


    /**
     * Sets the officedocTypeName value for this CProcessSummary.
     * 
     * @param officedocTypeName
     */
    public void setOfficedocTypeName(java.lang.String officedocTypeName) {
        this.officedocTypeName = officedocTypeName;
    }


    /**
     * Gets the processId value for this CProcessSummary.
     * 
     * @return processId
     */
    public _int.wipo.ipas.IpasServices.CProcessId getProcessId() {
        return processId;
    }


    /**
     * Sets the processId value for this CProcessSummary.
     * 
     * @param processId
     */
    public void setProcessId(_int.wipo.ipas.IpasServices.CProcessId processId) {
        this.processId = processId;
    }


    /**
     * Gets the processIdAsString value for this CProcessSummary.
     * 
     * @return processIdAsString
     */
    public java.lang.String getProcessIdAsString() {
        return processIdAsString;
    }


    /**
     * Sets the processIdAsString value for this CProcessSummary.
     * 
     * @param processIdAsString
     */
    public void setProcessIdAsString(java.lang.String processIdAsString) {
        this.processIdAsString = processIdAsString;
    }


    /**
     * Gets the relatedToWorkcode value for this CProcessSummary.
     * 
     * @return relatedToWorkcode
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getRelatedToWorkcode() {
        return relatedToWorkcode;
    }


    /**
     * Sets the relatedToWorkcode value for this CProcessSummary.
     * 
     * @param relatedToWorkcode
     */
    public void setRelatedToWorkcode(_int.wipo.ipas.IpasServices.IpasInteger relatedToWorkcode) {
        this.relatedToWorkcode = relatedToWorkcode;
    }


    /**
     * Gets the responsibleUserName value for this CProcessSummary.
     * 
     * @return responsibleUserName
     */
    public java.lang.String getResponsibleUserName() {
        return responsibleUserName;
    }


    /**
     * Sets the responsibleUserName value for this CProcessSummary.
     * 
     * @param responsibleUserName
     */
    public void setResponsibleUserName(java.lang.String responsibleUserName) {
        this.responsibleUserName = responsibleUserName;
    }


    /**
     * Gets the statusDate value for this CProcessSummary.
     * 
     * @return statusDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getStatusDate() {
        return statusDate;
    }


    /**
     * Sets the statusDate value for this CProcessSummary.
     * 
     * @param statusDate
     */
    public void setStatusDate(_int.wipo.ipas.IpasServices.IpasDateTime statusDate) {
        this.statusDate = statusDate;
    }


    /**
     * Gets the statusName value for this CProcessSummary.
     * 
     * @return statusName
     */
    public java.lang.String getStatusName() {
        return statusName;
    }


    /**
     * Sets the statusName value for this CProcessSummary.
     * 
     * @param statusName
     */
    public void setStatusName(java.lang.String statusName) {
        this.statusName = statusName;
    }


    /**
     * Gets the topFileDescription value for this CProcessSummary.
     * 
     * @return topFileDescription
     */
    public java.lang.String getTopFileDescription() {
        return topFileDescription;
    }


    /**
     * Sets the topFileDescription value for this CProcessSummary.
     * 
     * @param topFileDescription
     */
    public void setTopFileDescription(java.lang.String topFileDescription) {
        this.topFileDescription = topFileDescription;
    }


    /**
     * Gets the topFileFilingDate value for this CProcessSummary.
     * 
     * @return topFileFilingDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getTopFileFilingDate() {
        return topFileFilingDate;
    }


    /**
     * Sets the topFileFilingDate value for this CProcessSummary.
     * 
     * @param topFileFilingDate
     */
    public void setTopFileFilingDate(_int.wipo.ipas.IpasServices.IpasDateTime topFileFilingDate) {
        this.topFileFilingDate = topFileFilingDate;
    }


    /**
     * Gets the topFileId value for this CProcessSummary.
     * 
     * @return topFileId
     */
    public _int.wipo.ipas.IpasServices.CFileId getTopFileId() {
        return topFileId;
    }


    /**
     * Sets the topFileId value for this CProcessSummary.
     * 
     * @param topFileId
     */
    public void setTopFileId(_int.wipo.ipas.IpasServices.CFileId topFileId) {
        this.topFileId = topFileId;
    }


    /**
     * Gets the topFileOwner value for this CProcessSummary.
     * 
     * @return topFileOwner
     */
    public java.lang.String getTopFileOwner() {
        return topFileOwner;
    }


    /**
     * Sets the topFileOwner value for this CProcessSummary.
     * 
     * @param topFileOwner
     */
    public void setTopFileOwner(java.lang.String topFileOwner) {
        this.topFileOwner = topFileOwner;
    }


    /**
     * Gets the topFileRegistrationId value for this CProcessSummary.
     * 
     * @return topFileRegistrationId
     */
    public _int.wipo.ipas.IpasServices.CRegistrationId getTopFileRegistrationId() {
        return topFileRegistrationId;
    }


    /**
     * Sets the topFileRegistrationId value for this CProcessSummary.
     * 
     * @param topFileRegistrationId
     */
    public void setTopFileRegistrationId(_int.wipo.ipas.IpasServices.CRegistrationId topFileRegistrationId) {
        this.topFileRegistrationId = topFileRegistrationId;
    }


    /**
     * Gets the topFileStatusName value for this CProcessSummary.
     * 
     * @return topFileStatusName
     */
    public java.lang.String getTopFileStatusName() {
        return topFileStatusName;
    }


    /**
     * Sets the topFileStatusName value for this CProcessSummary.
     * 
     * @param topFileStatusName
     */
    public void setTopFileStatusName(java.lang.String topFileStatusName) {
        this.topFileStatusName = topFileStatusName;
    }


    /**
     * Gets the topProcessId value for this CProcessSummary.
     * 
     * @return topProcessId
     */
    public _int.wipo.ipas.IpasServices.CProcessId getTopProcessId() {
        return topProcessId;
    }


    /**
     * Sets the topProcessId value for this CProcessSummary.
     * 
     * @param topProcessId
     */
    public void setTopProcessId(_int.wipo.ipas.IpasServices.CProcessId topProcessId) {
        this.topProcessId = topProcessId;
    }


    /**
     * Gets the upperProcessId value for this CProcessSummary.
     * 
     * @return upperProcessId
     */
    public _int.wipo.ipas.IpasServices.CProcessId getUpperProcessId() {
        return upperProcessId;
    }


    /**
     * Sets the upperProcessId value for this CProcessSummary.
     * 
     * @param upperProcessId
     */
    public void setUpperProcessId(_int.wipo.ipas.IpasServices.CProcessId upperProcessId) {
        this.upperProcessId = upperProcessId;
    }


    /**
     * Gets the userdocSeqName value for this CProcessSummary.
     * 
     * @return userdocSeqName
     */
    public java.lang.String getUserdocSeqName() {
        return userdocSeqName;
    }


    /**
     * Sets the userdocSeqName value for this CProcessSummary.
     * 
     * @param userdocSeqName
     */
    public void setUserdocSeqName(java.lang.String userdocSeqName) {
        this.userdocSeqName = userdocSeqName;
    }


    /**
     * Gets the userdocSeqNbr value for this CProcessSummary.
     * 
     * @return userdocSeqNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getUserdocSeqNbr() {
        return userdocSeqNbr;
    }


    /**
     * Sets the userdocSeqNbr value for this CProcessSummary.
     * 
     * @param userdocSeqNbr
     */
    public void setUserdocSeqNbr(_int.wipo.ipas.IpasServices.IpasInteger userdocSeqNbr) {
        this.userdocSeqNbr = userdocSeqNbr;
    }


    /**
     * Gets the userdocSeqSeries value for this CProcessSummary.
     * 
     * @return userdocSeqSeries
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getUserdocSeqSeries() {
        return userdocSeqSeries;
    }


    /**
     * Sets the userdocSeqSeries value for this CProcessSummary.
     * 
     * @param userdocSeqSeries
     */
    public void setUserdocSeqSeries(_int.wipo.ipas.IpasServices.IpasInteger userdocSeqSeries) {
        this.userdocSeqSeries = userdocSeqSeries;
    }


    /**
     * Gets the userdocSeqType value for this CProcessSummary.
     * 
     * @return userdocSeqType
     */
    public java.lang.String getUserdocSeqType() {
        return userdocSeqType;
    }


    /**
     * Sets the userdocSeqType value for this CProcessSummary.
     * 
     * @param userdocSeqType
     */
    public void setUserdocSeqType(java.lang.String userdocSeqType) {
        this.userdocSeqType = userdocSeqType;
    }


    /**
     * Gets the userdocTypeName value for this CProcessSummary.
     * 
     * @return userdocTypeName
     */
    public java.lang.String getUserdocTypeName() {
        return userdocTypeName;
    }


    /**
     * Sets the userdocTypeName value for this CProcessSummary.
     * 
     * @param userdocTypeName
     */
    public void setUserdocTypeName(java.lang.String userdocTypeName) {
        this.userdocTypeName = userdocTypeName;
    }


    /**
     * Gets the workflowWarningText value for this CProcessSummary.
     * 
     * @return workflowWarningText
     */
    public java.lang.String getWorkflowWarningText() {
        return workflowWarningText;
    }


    /**
     * Sets the workflowWarningText value for this CProcessSummary.
     * 
     * @param workflowWarningText
     */
    public void setWorkflowWarningText(java.lang.String workflowWarningText) {
        this.workflowWarningText = workflowWarningText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CProcessSummary)) return false;
        CProcessSummary other = (CProcessSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.documentId==null && other.getDocumentId()==null) || 
             (this.documentId!=null &&
              this.documentId.equals(other.getDocumentId()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.indTopFileMark==null && other.getIndTopFileMark()==null) || 
             (this.indTopFileMark!=null &&
              this.indTopFileMark.equals(other.getIndTopFileMark()))) &&
            ((this.indTopMarkPatent==null && other.getIndTopMarkPatent()==null) || 
             (this.indTopMarkPatent!=null &&
              this.indTopMarkPatent.equals(other.getIndTopMarkPatent()))) &&
            ((this.lastActionName==null && other.getLastActionName()==null) || 
             (this.lastActionName!=null &&
              this.lastActionName.equals(other.getLastActionName()))) &&
            ((this.lastActionUsername==null && other.getLastActionUsername()==null) || 
             (this.lastActionUsername!=null &&
              this.lastActionUsername.equals(other.getLastActionUsername()))) &&
            ((this.officedocId==null && other.getOfficedocId()==null) || 
             (this.officedocId!=null &&
              this.officedocId.equals(other.getOfficedocId()))) &&
            ((this.officedocTypeName==null && other.getOfficedocTypeName()==null) || 
             (this.officedocTypeName!=null &&
              this.officedocTypeName.equals(other.getOfficedocTypeName()))) &&
            ((this.processId==null && other.getProcessId()==null) || 
             (this.processId!=null &&
              this.processId.equals(other.getProcessId()))) &&
            ((this.processIdAsString==null && other.getProcessIdAsString()==null) || 
             (this.processIdAsString!=null &&
              this.processIdAsString.equals(other.getProcessIdAsString()))) &&
            ((this.relatedToWorkcode==null && other.getRelatedToWorkcode()==null) || 
             (this.relatedToWorkcode!=null &&
              this.relatedToWorkcode.equals(other.getRelatedToWorkcode()))) &&
            ((this.responsibleUserName==null && other.getResponsibleUserName()==null) || 
             (this.responsibleUserName!=null &&
              this.responsibleUserName.equals(other.getResponsibleUserName()))) &&
            ((this.statusDate==null && other.getStatusDate()==null) || 
             (this.statusDate!=null &&
              this.statusDate.equals(other.getStatusDate()))) &&
            ((this.statusName==null && other.getStatusName()==null) || 
             (this.statusName!=null &&
              this.statusName.equals(other.getStatusName()))) &&
            ((this.topFileDescription==null && other.getTopFileDescription()==null) || 
             (this.topFileDescription!=null &&
              this.topFileDescription.equals(other.getTopFileDescription()))) &&
            ((this.topFileFilingDate==null && other.getTopFileFilingDate()==null) || 
             (this.topFileFilingDate!=null &&
              this.topFileFilingDate.equals(other.getTopFileFilingDate()))) &&
            ((this.topFileId==null && other.getTopFileId()==null) || 
             (this.topFileId!=null &&
              this.topFileId.equals(other.getTopFileId()))) &&
            ((this.topFileOwner==null && other.getTopFileOwner()==null) || 
             (this.topFileOwner!=null &&
              this.topFileOwner.equals(other.getTopFileOwner()))) &&
            ((this.topFileRegistrationId==null && other.getTopFileRegistrationId()==null) || 
             (this.topFileRegistrationId!=null &&
              this.topFileRegistrationId.equals(other.getTopFileRegistrationId()))) &&
            ((this.topFileStatusName==null && other.getTopFileStatusName()==null) || 
             (this.topFileStatusName!=null &&
              this.topFileStatusName.equals(other.getTopFileStatusName()))) &&
            ((this.topProcessId==null && other.getTopProcessId()==null) || 
             (this.topProcessId!=null &&
              this.topProcessId.equals(other.getTopProcessId()))) &&
            ((this.upperProcessId==null && other.getUpperProcessId()==null) || 
             (this.upperProcessId!=null &&
              this.upperProcessId.equals(other.getUpperProcessId()))) &&
            ((this.userdocSeqName==null && other.getUserdocSeqName()==null) || 
             (this.userdocSeqName!=null &&
              this.userdocSeqName.equals(other.getUserdocSeqName()))) &&
            ((this.userdocSeqNbr==null && other.getUserdocSeqNbr()==null) || 
             (this.userdocSeqNbr!=null &&
              this.userdocSeqNbr.equals(other.getUserdocSeqNbr()))) &&
            ((this.userdocSeqSeries==null && other.getUserdocSeqSeries()==null) || 
             (this.userdocSeqSeries!=null &&
              this.userdocSeqSeries.equals(other.getUserdocSeqSeries()))) &&
            ((this.userdocSeqType==null && other.getUserdocSeqType()==null) || 
             (this.userdocSeqType!=null &&
              this.userdocSeqType.equals(other.getUserdocSeqType()))) &&
            ((this.userdocTypeName==null && other.getUserdocTypeName()==null) || 
             (this.userdocTypeName!=null &&
              this.userdocTypeName.equals(other.getUserdocTypeName()))) &&
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
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDocumentId() != null) {
            _hashCode += getDocumentId().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getIndTopFileMark() != null) {
            _hashCode += getIndTopFileMark().hashCode();
        }
        if (getIndTopMarkPatent() != null) {
            _hashCode += getIndTopMarkPatent().hashCode();
        }
        if (getLastActionName() != null) {
            _hashCode += getLastActionName().hashCode();
        }
        if (getLastActionUsername() != null) {
            _hashCode += getLastActionUsername().hashCode();
        }
        if (getOfficedocId() != null) {
            _hashCode += getOfficedocId().hashCode();
        }
        if (getOfficedocTypeName() != null) {
            _hashCode += getOfficedocTypeName().hashCode();
        }
        if (getProcessId() != null) {
            _hashCode += getProcessId().hashCode();
        }
        if (getProcessIdAsString() != null) {
            _hashCode += getProcessIdAsString().hashCode();
        }
        if (getRelatedToWorkcode() != null) {
            _hashCode += getRelatedToWorkcode().hashCode();
        }
        if (getResponsibleUserName() != null) {
            _hashCode += getResponsibleUserName().hashCode();
        }
        if (getStatusDate() != null) {
            _hashCode += getStatusDate().hashCode();
        }
        if (getStatusName() != null) {
            _hashCode += getStatusName().hashCode();
        }
        if (getTopFileDescription() != null) {
            _hashCode += getTopFileDescription().hashCode();
        }
        if (getTopFileFilingDate() != null) {
            _hashCode += getTopFileFilingDate().hashCode();
        }
        if (getTopFileId() != null) {
            _hashCode += getTopFileId().hashCode();
        }
        if (getTopFileOwner() != null) {
            _hashCode += getTopFileOwner().hashCode();
        }
        if (getTopFileRegistrationId() != null) {
            _hashCode += getTopFileRegistrationId().hashCode();
        }
        if (getTopFileStatusName() != null) {
            _hashCode += getTopFileStatusName().hashCode();
        }
        if (getTopProcessId() != null) {
            _hashCode += getTopProcessId().hashCode();
        }
        if (getUpperProcessId() != null) {
            _hashCode += getUpperProcessId().hashCode();
        }
        if (getUserdocSeqName() != null) {
            _hashCode += getUserdocSeqName().hashCode();
        }
        if (getUserdocSeqNbr() != null) {
            _hashCode += getUserdocSeqNbr().hashCode();
        }
        if (getUserdocSeqSeries() != null) {
            _hashCode += getUserdocSeqSeries().hashCode();
        }
        if (getUserdocSeqType() != null) {
            _hashCode += getUserdocSeqType().hashCode();
        }
        if (getUserdocTypeName() != null) {
            _hashCode += getUserdocTypeName().hashCode();
        }
        if (getWorkflowWarningText() != null) {
            _hashCode += getWorkflowWarningText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CProcessSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indTopFileMark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indTopFileMark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indTopMarkPatent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indTopMarkPatent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastActionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActionUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastActionUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officedocId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officedocId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officedocTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officedocTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processIdAsString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processIdAsString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedToWorkcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatedToWorkcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsibleUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responsibleUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topFileDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topFileDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topFileFilingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topFileFilingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topFileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topFileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topFileOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topFileOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topFileRegistrationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topFileRegistrationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRegistrationId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topFileStatusName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topFileStatusName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topProcessId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topProcessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upperProcessId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upperProcessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdocSeqName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdocSeqName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdocSeqNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdocSeqNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdocSeqSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdocSeqSeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdocSeqType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdocSeqType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdocTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdocTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
