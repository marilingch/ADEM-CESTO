/**
 * CAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CAction  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime actionDate;

    private _int.wipo.ipas.IpasServices.CActionId actionId;

    private _int.wipo.ipas.IpasServices.CActionSequenceEntry actionSequenceEntry;

    private _int.wipo.ipas.IpasServices.CActionType actionType;

    private _int.wipo.ipas.IpasServices.CUser captureUser;

    private _int.wipo.ipas.IpasServices.IpasDateTime deleteDate;

    private java.lang.String deleteReason;

    private _int.wipo.ipas.IpasServices.IpasInteger deleteUserId;

    private _int.wipo.ipas.IpasServices.COfficedocId generatedOfficedocId;

    private java.lang.Boolean indCancelled;

    private java.lang.Boolean indChk1;

    private java.lang.Boolean indChk2;

    private java.lang.Boolean indChk3;

    private java.lang.Boolean indChk4;

    private java.lang.Boolean indChk5;

    private java.lang.Boolean indSignaturePending;

    private java.lang.Boolean isDeleted;

    private _int.wipo.ipas.IpasServices.CJournal journal;

    private _int.wipo.ipas.IpasServices.IpasDateTime manualDueDate;

    private _int.wipo.ipas.IpasServices.CStatus newStatus;

    private java.lang.String notes;

    private java.lang.String notes1;

    private java.lang.String notes2;

    private java.lang.String notes3;

    private java.lang.String notes4;

    private java.lang.String notes5;

    private _int.wipo.ipas.IpasServices.CStatus oldStatus;

    private _int.wipo.ipas.IpasServices.CUser responsibleUser;

    private _int.wipo.ipas.IpasServices.COptionListSet[] selectedOptionLists;

    public CAction() {
    }

    public CAction(
           _int.wipo.ipas.IpasServices.IpasDateTime actionDate,
           _int.wipo.ipas.IpasServices.CActionId actionId,
           _int.wipo.ipas.IpasServices.CActionSequenceEntry actionSequenceEntry,
           _int.wipo.ipas.IpasServices.CActionType actionType,
           _int.wipo.ipas.IpasServices.CUser captureUser,
           _int.wipo.ipas.IpasServices.IpasDateTime deleteDate,
           java.lang.String deleteReason,
           _int.wipo.ipas.IpasServices.IpasInteger deleteUserId,
           _int.wipo.ipas.IpasServices.COfficedocId generatedOfficedocId,
           java.lang.Boolean indCancelled,
           java.lang.Boolean indChk1,
           java.lang.Boolean indChk2,
           java.lang.Boolean indChk3,
           java.lang.Boolean indChk4,
           java.lang.Boolean indChk5,
           java.lang.Boolean indSignaturePending,
           java.lang.Boolean isDeleted,
           _int.wipo.ipas.IpasServices.CJournal journal,
           _int.wipo.ipas.IpasServices.IpasDateTime manualDueDate,
           _int.wipo.ipas.IpasServices.CStatus newStatus,
           java.lang.String notes,
           java.lang.String notes1,
           java.lang.String notes2,
           java.lang.String notes3,
           java.lang.String notes4,
           java.lang.String notes5,
           _int.wipo.ipas.IpasServices.CStatus oldStatus,
           _int.wipo.ipas.IpasServices.CUser responsibleUser,
           _int.wipo.ipas.IpasServices.COptionListSet[] selectedOptionLists) {
           this.actionDate = actionDate;
           this.actionId = actionId;
           this.actionSequenceEntry = actionSequenceEntry;
           this.actionType = actionType;
           this.captureUser = captureUser;
           this.deleteDate = deleteDate;
           this.deleteReason = deleteReason;
           this.deleteUserId = deleteUserId;
           this.generatedOfficedocId = generatedOfficedocId;
           this.indCancelled = indCancelled;
           this.indChk1 = indChk1;
           this.indChk2 = indChk2;
           this.indChk3 = indChk3;
           this.indChk4 = indChk4;
           this.indChk5 = indChk5;
           this.indSignaturePending = indSignaturePending;
           this.isDeleted = isDeleted;
           this.journal = journal;
           this.manualDueDate = manualDueDate;
           this.newStatus = newStatus;
           this.notes = notes;
           this.notes1 = notes1;
           this.notes2 = notes2;
           this.notes3 = notes3;
           this.notes4 = notes4;
           this.notes5 = notes5;
           this.oldStatus = oldStatus;
           this.responsibleUser = responsibleUser;
           this.selectedOptionLists = selectedOptionLists;
    }


    /**
     * Gets the actionDate value for this CAction.
     * 
     * @return actionDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getActionDate() {
        return actionDate;
    }


    /**
     * Sets the actionDate value for this CAction.
     * 
     * @param actionDate
     */
    public void setActionDate(_int.wipo.ipas.IpasServices.IpasDateTime actionDate) {
        this.actionDate = actionDate;
    }


    /**
     * Gets the actionId value for this CAction.
     * 
     * @return actionId
     */
    public _int.wipo.ipas.IpasServices.CActionId getActionId() {
        return actionId;
    }


    /**
     * Sets the actionId value for this CAction.
     * 
     * @param actionId
     */
    public void setActionId(_int.wipo.ipas.IpasServices.CActionId actionId) {
        this.actionId = actionId;
    }


    /**
     * Gets the actionSequenceEntry value for this CAction.
     * 
     * @return actionSequenceEntry
     */
    public _int.wipo.ipas.IpasServices.CActionSequenceEntry getActionSequenceEntry() {
        return actionSequenceEntry;
    }


    /**
     * Sets the actionSequenceEntry value for this CAction.
     * 
     * @param actionSequenceEntry
     */
    public void setActionSequenceEntry(_int.wipo.ipas.IpasServices.CActionSequenceEntry actionSequenceEntry) {
        this.actionSequenceEntry = actionSequenceEntry;
    }


    /**
     * Gets the actionType value for this CAction.
     * 
     * @return actionType
     */
    public _int.wipo.ipas.IpasServices.CActionType getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this CAction.
     * 
     * @param actionType
     */
    public void setActionType(_int.wipo.ipas.IpasServices.CActionType actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the captureUser value for this CAction.
     * 
     * @return captureUser
     */
    public _int.wipo.ipas.IpasServices.CUser getCaptureUser() {
        return captureUser;
    }


    /**
     * Sets the captureUser value for this CAction.
     * 
     * @param captureUser
     */
    public void setCaptureUser(_int.wipo.ipas.IpasServices.CUser captureUser) {
        this.captureUser = captureUser;
    }


    /**
     * Gets the deleteDate value for this CAction.
     * 
     * @return deleteDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getDeleteDate() {
        return deleteDate;
    }


    /**
     * Sets the deleteDate value for this CAction.
     * 
     * @param deleteDate
     */
    public void setDeleteDate(_int.wipo.ipas.IpasServices.IpasDateTime deleteDate) {
        this.deleteDate = deleteDate;
    }


    /**
     * Gets the deleteReason value for this CAction.
     * 
     * @return deleteReason
     */
    public java.lang.String getDeleteReason() {
        return deleteReason;
    }


    /**
     * Sets the deleteReason value for this CAction.
     * 
     * @param deleteReason
     */
    public void setDeleteReason(java.lang.String deleteReason) {
        this.deleteReason = deleteReason;
    }


    /**
     * Gets the deleteUserId value for this CAction.
     * 
     * @return deleteUserId
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDeleteUserId() {
        return deleteUserId;
    }


    /**
     * Sets the deleteUserId value for this CAction.
     * 
     * @param deleteUserId
     */
    public void setDeleteUserId(_int.wipo.ipas.IpasServices.IpasInteger deleteUserId) {
        this.deleteUserId = deleteUserId;
    }


    /**
     * Gets the generatedOfficedocId value for this CAction.
     * 
     * @return generatedOfficedocId
     */
    public _int.wipo.ipas.IpasServices.COfficedocId getGeneratedOfficedocId() {
        return generatedOfficedocId;
    }


    /**
     * Sets the generatedOfficedocId value for this CAction.
     * 
     * @param generatedOfficedocId
     */
    public void setGeneratedOfficedocId(_int.wipo.ipas.IpasServices.COfficedocId generatedOfficedocId) {
        this.generatedOfficedocId = generatedOfficedocId;
    }


    /**
     * Gets the indCancelled value for this CAction.
     * 
     * @return indCancelled
     */
    public java.lang.Boolean getIndCancelled() {
        return indCancelled;
    }


    /**
     * Sets the indCancelled value for this CAction.
     * 
     * @param indCancelled
     */
    public void setIndCancelled(java.lang.Boolean indCancelled) {
        this.indCancelled = indCancelled;
    }


    /**
     * Gets the indChk1 value for this CAction.
     * 
     * @return indChk1
     */
    public java.lang.Boolean getIndChk1() {
        return indChk1;
    }


    /**
     * Sets the indChk1 value for this CAction.
     * 
     * @param indChk1
     */
    public void setIndChk1(java.lang.Boolean indChk1) {
        this.indChk1 = indChk1;
    }


    /**
     * Gets the indChk2 value for this CAction.
     * 
     * @return indChk2
     */
    public java.lang.Boolean getIndChk2() {
        return indChk2;
    }


    /**
     * Sets the indChk2 value for this CAction.
     * 
     * @param indChk2
     */
    public void setIndChk2(java.lang.Boolean indChk2) {
        this.indChk2 = indChk2;
    }


    /**
     * Gets the indChk3 value for this CAction.
     * 
     * @return indChk3
     */
    public java.lang.Boolean getIndChk3() {
        return indChk3;
    }


    /**
     * Sets the indChk3 value for this CAction.
     * 
     * @param indChk3
     */
    public void setIndChk3(java.lang.Boolean indChk3) {
        this.indChk3 = indChk3;
    }


    /**
     * Gets the indChk4 value for this CAction.
     * 
     * @return indChk4
     */
    public java.lang.Boolean getIndChk4() {
        return indChk4;
    }


    /**
     * Sets the indChk4 value for this CAction.
     * 
     * @param indChk4
     */
    public void setIndChk4(java.lang.Boolean indChk4) {
        this.indChk4 = indChk4;
    }


    /**
     * Gets the indChk5 value for this CAction.
     * 
     * @return indChk5
     */
    public java.lang.Boolean getIndChk5() {
        return indChk5;
    }


    /**
     * Sets the indChk5 value for this CAction.
     * 
     * @param indChk5
     */
    public void setIndChk5(java.lang.Boolean indChk5) {
        this.indChk5 = indChk5;
    }


    /**
     * Gets the indSignaturePending value for this CAction.
     * 
     * @return indSignaturePending
     */
    public java.lang.Boolean getIndSignaturePending() {
        return indSignaturePending;
    }


    /**
     * Sets the indSignaturePending value for this CAction.
     * 
     * @param indSignaturePending
     */
    public void setIndSignaturePending(java.lang.Boolean indSignaturePending) {
        this.indSignaturePending = indSignaturePending;
    }


    /**
     * Gets the isDeleted value for this CAction.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CAction.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the journal value for this CAction.
     * 
     * @return journal
     */
    public _int.wipo.ipas.IpasServices.CJournal getJournal() {
        return journal;
    }


    /**
     * Sets the journal value for this CAction.
     * 
     * @param journal
     */
    public void setJournal(_int.wipo.ipas.IpasServices.CJournal journal) {
        this.journal = journal;
    }


    /**
     * Gets the manualDueDate value for this CAction.
     * 
     * @return manualDueDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getManualDueDate() {
        return manualDueDate;
    }


    /**
     * Sets the manualDueDate value for this CAction.
     * 
     * @param manualDueDate
     */
    public void setManualDueDate(_int.wipo.ipas.IpasServices.IpasDateTime manualDueDate) {
        this.manualDueDate = manualDueDate;
    }


    /**
     * Gets the newStatus value for this CAction.
     * 
     * @return newStatus
     */
    public _int.wipo.ipas.IpasServices.CStatus getNewStatus() {
        return newStatus;
    }


    /**
     * Sets the newStatus value for this CAction.
     * 
     * @param newStatus
     */
    public void setNewStatus(_int.wipo.ipas.IpasServices.CStatus newStatus) {
        this.newStatus = newStatus;
    }


    /**
     * Gets the notes value for this CAction.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CAction.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the notes1 value for this CAction.
     * 
     * @return notes1
     */
    public java.lang.String getNotes1() {
        return notes1;
    }


    /**
     * Sets the notes1 value for this CAction.
     * 
     * @param notes1
     */
    public void setNotes1(java.lang.String notes1) {
        this.notes1 = notes1;
    }


    /**
     * Gets the notes2 value for this CAction.
     * 
     * @return notes2
     */
    public java.lang.String getNotes2() {
        return notes2;
    }


    /**
     * Sets the notes2 value for this CAction.
     * 
     * @param notes2
     */
    public void setNotes2(java.lang.String notes2) {
        this.notes2 = notes2;
    }


    /**
     * Gets the notes3 value for this CAction.
     * 
     * @return notes3
     */
    public java.lang.String getNotes3() {
        return notes3;
    }


    /**
     * Sets the notes3 value for this CAction.
     * 
     * @param notes3
     */
    public void setNotes3(java.lang.String notes3) {
        this.notes3 = notes3;
    }


    /**
     * Gets the notes4 value for this CAction.
     * 
     * @return notes4
     */
    public java.lang.String getNotes4() {
        return notes4;
    }


    /**
     * Sets the notes4 value for this CAction.
     * 
     * @param notes4
     */
    public void setNotes4(java.lang.String notes4) {
        this.notes4 = notes4;
    }


    /**
     * Gets the notes5 value for this CAction.
     * 
     * @return notes5
     */
    public java.lang.String getNotes5() {
        return notes5;
    }


    /**
     * Sets the notes5 value for this CAction.
     * 
     * @param notes5
     */
    public void setNotes5(java.lang.String notes5) {
        this.notes5 = notes5;
    }


    /**
     * Gets the oldStatus value for this CAction.
     * 
     * @return oldStatus
     */
    public _int.wipo.ipas.IpasServices.CStatus getOldStatus() {
        return oldStatus;
    }


    /**
     * Sets the oldStatus value for this CAction.
     * 
     * @param oldStatus
     */
    public void setOldStatus(_int.wipo.ipas.IpasServices.CStatus oldStatus) {
        this.oldStatus = oldStatus;
    }


    /**
     * Gets the responsibleUser value for this CAction.
     * 
     * @return responsibleUser
     */
    public _int.wipo.ipas.IpasServices.CUser getResponsibleUser() {
        return responsibleUser;
    }


    /**
     * Sets the responsibleUser value for this CAction.
     * 
     * @param responsibleUser
     */
    public void setResponsibleUser(_int.wipo.ipas.IpasServices.CUser responsibleUser) {
        this.responsibleUser = responsibleUser;
    }


    /**
     * Gets the selectedOptionLists value for this CAction.
     * 
     * @return selectedOptionLists
     */
    public _int.wipo.ipas.IpasServices.COptionListSet[] getSelectedOptionLists() {
        return selectedOptionLists;
    }


    /**
     * Sets the selectedOptionLists value for this CAction.
     * 
     * @param selectedOptionLists
     */
    public void setSelectedOptionLists(_int.wipo.ipas.IpasServices.COptionListSet[] selectedOptionLists) {
        this.selectedOptionLists = selectedOptionLists;
    }

    public _int.wipo.ipas.IpasServices.COptionListSet getSelectedOptionLists(int i) {
        return this.selectedOptionLists[i];
    }

    public void setSelectedOptionLists(int i, _int.wipo.ipas.IpasServices.COptionListSet _value) {
        this.selectedOptionLists[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CAction)) return false;
        CAction other = (CAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionDate==null && other.getActionDate()==null) || 
             (this.actionDate!=null &&
              this.actionDate.equals(other.getActionDate()))) &&
            ((this.actionId==null && other.getActionId()==null) || 
             (this.actionId!=null &&
              this.actionId.equals(other.getActionId()))) &&
            ((this.actionSequenceEntry==null && other.getActionSequenceEntry()==null) || 
             (this.actionSequenceEntry!=null &&
              this.actionSequenceEntry.equals(other.getActionSequenceEntry()))) &&
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.captureUser==null && other.getCaptureUser()==null) || 
             (this.captureUser!=null &&
              this.captureUser.equals(other.getCaptureUser()))) &&
            ((this.deleteDate==null && other.getDeleteDate()==null) || 
             (this.deleteDate!=null &&
              this.deleteDate.equals(other.getDeleteDate()))) &&
            ((this.deleteReason==null && other.getDeleteReason()==null) || 
             (this.deleteReason!=null &&
              this.deleteReason.equals(other.getDeleteReason()))) &&
            ((this.deleteUserId==null && other.getDeleteUserId()==null) || 
             (this.deleteUserId!=null &&
              this.deleteUserId.equals(other.getDeleteUserId()))) &&
            ((this.generatedOfficedocId==null && other.getGeneratedOfficedocId()==null) || 
             (this.generatedOfficedocId!=null &&
              this.generatedOfficedocId.equals(other.getGeneratedOfficedocId()))) &&
            ((this.indCancelled==null && other.getIndCancelled()==null) || 
             (this.indCancelled!=null &&
              this.indCancelled.equals(other.getIndCancelled()))) &&
            ((this.indChk1==null && other.getIndChk1()==null) || 
             (this.indChk1!=null &&
              this.indChk1.equals(other.getIndChk1()))) &&
            ((this.indChk2==null && other.getIndChk2()==null) || 
             (this.indChk2!=null &&
              this.indChk2.equals(other.getIndChk2()))) &&
            ((this.indChk3==null && other.getIndChk3()==null) || 
             (this.indChk3!=null &&
              this.indChk3.equals(other.getIndChk3()))) &&
            ((this.indChk4==null && other.getIndChk4()==null) || 
             (this.indChk4!=null &&
              this.indChk4.equals(other.getIndChk4()))) &&
            ((this.indChk5==null && other.getIndChk5()==null) || 
             (this.indChk5!=null &&
              this.indChk5.equals(other.getIndChk5()))) &&
            ((this.indSignaturePending==null && other.getIndSignaturePending()==null) || 
             (this.indSignaturePending!=null &&
              this.indSignaturePending.equals(other.getIndSignaturePending()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.journal==null && other.getJournal()==null) || 
             (this.journal!=null &&
              this.journal.equals(other.getJournal()))) &&
            ((this.manualDueDate==null && other.getManualDueDate()==null) || 
             (this.manualDueDate!=null &&
              this.manualDueDate.equals(other.getManualDueDate()))) &&
            ((this.newStatus==null && other.getNewStatus()==null) || 
             (this.newStatus!=null &&
              this.newStatus.equals(other.getNewStatus()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notes1==null && other.getNotes1()==null) || 
             (this.notes1!=null &&
              this.notes1.equals(other.getNotes1()))) &&
            ((this.notes2==null && other.getNotes2()==null) || 
             (this.notes2!=null &&
              this.notes2.equals(other.getNotes2()))) &&
            ((this.notes3==null && other.getNotes3()==null) || 
             (this.notes3!=null &&
              this.notes3.equals(other.getNotes3()))) &&
            ((this.notes4==null && other.getNotes4()==null) || 
             (this.notes4!=null &&
              this.notes4.equals(other.getNotes4()))) &&
            ((this.notes5==null && other.getNotes5()==null) || 
             (this.notes5!=null &&
              this.notes5.equals(other.getNotes5()))) &&
            ((this.oldStatus==null && other.getOldStatus()==null) || 
             (this.oldStatus!=null &&
              this.oldStatus.equals(other.getOldStatus()))) &&
            ((this.responsibleUser==null && other.getResponsibleUser()==null) || 
             (this.responsibleUser!=null &&
              this.responsibleUser.equals(other.getResponsibleUser()))) &&
            ((this.selectedOptionLists==null && other.getSelectedOptionLists()==null) || 
             (this.selectedOptionLists!=null &&
              java.util.Arrays.equals(this.selectedOptionLists, other.getSelectedOptionLists())));
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
        if (getActionDate() != null) {
            _hashCode += getActionDate().hashCode();
        }
        if (getActionId() != null) {
            _hashCode += getActionId().hashCode();
        }
        if (getActionSequenceEntry() != null) {
            _hashCode += getActionSequenceEntry().hashCode();
        }
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getCaptureUser() != null) {
            _hashCode += getCaptureUser().hashCode();
        }
        if (getDeleteDate() != null) {
            _hashCode += getDeleteDate().hashCode();
        }
        if (getDeleteReason() != null) {
            _hashCode += getDeleteReason().hashCode();
        }
        if (getDeleteUserId() != null) {
            _hashCode += getDeleteUserId().hashCode();
        }
        if (getGeneratedOfficedocId() != null) {
            _hashCode += getGeneratedOfficedocId().hashCode();
        }
        if (getIndCancelled() != null) {
            _hashCode += getIndCancelled().hashCode();
        }
        if (getIndChk1() != null) {
            _hashCode += getIndChk1().hashCode();
        }
        if (getIndChk2() != null) {
            _hashCode += getIndChk2().hashCode();
        }
        if (getIndChk3() != null) {
            _hashCode += getIndChk3().hashCode();
        }
        if (getIndChk4() != null) {
            _hashCode += getIndChk4().hashCode();
        }
        if (getIndChk5() != null) {
            _hashCode += getIndChk5().hashCode();
        }
        if (getIndSignaturePending() != null) {
            _hashCode += getIndSignaturePending().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getJournal() != null) {
            _hashCode += getJournal().hashCode();
        }
        if (getManualDueDate() != null) {
            _hashCode += getManualDueDate().hashCode();
        }
        if (getNewStatus() != null) {
            _hashCode += getNewStatus().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotes1() != null) {
            _hashCode += getNotes1().hashCode();
        }
        if (getNotes2() != null) {
            _hashCode += getNotes2().hashCode();
        }
        if (getNotes3() != null) {
            _hashCode += getNotes3().hashCode();
        }
        if (getNotes4() != null) {
            _hashCode += getNotes4().hashCode();
        }
        if (getNotes5() != null) {
            _hashCode += getNotes5().hashCode();
        }
        if (getOldStatus() != null) {
            _hashCode += getOldStatus().hashCode();
        }
        if (getResponsibleUser() != null) {
            _hashCode += getResponsibleUser().hashCode();
        }
        if (getSelectedOptionLists() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSelectedOptionLists());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSelectedOptionLists(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionSequenceEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionSequenceEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionSequenceEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "captureUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUser"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deleteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deleteReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deleteUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generatedOfficedocId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "generatedOfficedocId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOfficedocId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indCancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indCancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indChk1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indChk1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indChk2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indChk2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indChk3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indChk3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indChk4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indChk4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indChk5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indChk5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indSignaturePending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indSignaturePending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "journal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manualDueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStatus"));
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
        elemField.setFieldName("notes1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsibleUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responsibleUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUser"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedOptionLists");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectedOptionLists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOptionListSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
