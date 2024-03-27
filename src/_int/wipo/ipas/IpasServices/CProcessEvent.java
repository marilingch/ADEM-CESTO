/**
 * CProcessEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CProcessEvent  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime actionAuthorizationDate;

    private _int.wipo.ipas.IpasServices.IpasDateTime actionJournalDate;

    private java.lang.String actionUser;

    private _int.wipo.ipas.IpasServices.CActionId eventActionId;

    private java.lang.String eventActionTypeCode;

    private _int.wipo.ipas.IpasServices.IpasInteger eventChildActionNbr;

    private _int.wipo.ipas.IpasServices.IpasDateTime eventDate;

    private _int.wipo.ipas.IpasServices.IpasDateTime eventDeleteDateTime;

    private _int.wipo.ipas.IpasServices.IpasInteger eventDeleteUserId;

    private _int.wipo.ipas.IpasServices.CDeliveryId eventDeliveryId;

    private java.lang.String eventDescription;

    private _int.wipo.ipas.IpasServices.IpasInteger eventEdocId;

    private _int.wipo.ipas.IpasServices.IpasInteger eventEfolderId;

    private java.lang.String eventNotes;

    private java.lang.String eventOfficedocTypeCode;

    private _int.wipo.ipas.IpasServices.IpasInteger eventParentActionNbr;

    private _int.wipo.ipas.IpasServices.CProcessId eventProcessId;

    private java.lang.String eventSubtypeCode;

    private java.lang.String eventSubtypeName;

    private java.lang.String eventTypeCode;

    private java.lang.String eventUserdocTypeCode;

    private java.lang.Boolean indEventIsDeleted;

    private java.lang.Boolean indEventProcessPending;

    private java.lang.Boolean isEventDeleted;

    private java.lang.Boolean isEventRevised;

    private java.lang.Boolean isSecret;

    public CProcessEvent() {
    }

    public CProcessEvent(
           _int.wipo.ipas.IpasServices.IpasDateTime actionAuthorizationDate,
           _int.wipo.ipas.IpasServices.IpasDateTime actionJournalDate,
           java.lang.String actionUser,
           _int.wipo.ipas.IpasServices.CActionId eventActionId,
           java.lang.String eventActionTypeCode,
           _int.wipo.ipas.IpasServices.IpasInteger eventChildActionNbr,
           _int.wipo.ipas.IpasServices.IpasDateTime eventDate,
           _int.wipo.ipas.IpasServices.IpasDateTime eventDeleteDateTime,
           _int.wipo.ipas.IpasServices.IpasInteger eventDeleteUserId,
           _int.wipo.ipas.IpasServices.CDeliveryId eventDeliveryId,
           java.lang.String eventDescription,
           _int.wipo.ipas.IpasServices.IpasInteger eventEdocId,
           _int.wipo.ipas.IpasServices.IpasInteger eventEfolderId,
           java.lang.String eventNotes,
           java.lang.String eventOfficedocTypeCode,
           _int.wipo.ipas.IpasServices.IpasInteger eventParentActionNbr,
           _int.wipo.ipas.IpasServices.CProcessId eventProcessId,
           java.lang.String eventSubtypeCode,
           java.lang.String eventSubtypeName,
           java.lang.String eventTypeCode,
           java.lang.String eventUserdocTypeCode,
           java.lang.Boolean indEventIsDeleted,
           java.lang.Boolean indEventProcessPending,
           java.lang.Boolean isEventDeleted,
           java.lang.Boolean isEventRevised,
           java.lang.Boolean isSecret) {
           this.actionAuthorizationDate = actionAuthorizationDate;
           this.actionJournalDate = actionJournalDate;
           this.actionUser = actionUser;
           this.eventActionId = eventActionId;
           this.eventActionTypeCode = eventActionTypeCode;
           this.eventChildActionNbr = eventChildActionNbr;
           this.eventDate = eventDate;
           this.eventDeleteDateTime = eventDeleteDateTime;
           this.eventDeleteUserId = eventDeleteUserId;
           this.eventDeliveryId = eventDeliveryId;
           this.eventDescription = eventDescription;
           this.eventEdocId = eventEdocId;
           this.eventEfolderId = eventEfolderId;
           this.eventNotes = eventNotes;
           this.eventOfficedocTypeCode = eventOfficedocTypeCode;
           this.eventParentActionNbr = eventParentActionNbr;
           this.eventProcessId = eventProcessId;
           this.eventSubtypeCode = eventSubtypeCode;
           this.eventSubtypeName = eventSubtypeName;
           this.eventTypeCode = eventTypeCode;
           this.eventUserdocTypeCode = eventUserdocTypeCode;
           this.indEventIsDeleted = indEventIsDeleted;
           this.indEventProcessPending = indEventProcessPending;
           this.isEventDeleted = isEventDeleted;
           this.isEventRevised = isEventRevised;
           this.isSecret = isSecret;
    }


    /**
     * Gets the actionAuthorizationDate value for this CProcessEvent.
     * 
     * @return actionAuthorizationDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getActionAuthorizationDate() {
        return actionAuthorizationDate;
    }


    /**
     * Sets the actionAuthorizationDate value for this CProcessEvent.
     * 
     * @param actionAuthorizationDate
     */
    public void setActionAuthorizationDate(_int.wipo.ipas.IpasServices.IpasDateTime actionAuthorizationDate) {
        this.actionAuthorizationDate = actionAuthorizationDate;
    }


    /**
     * Gets the actionJournalDate value for this CProcessEvent.
     * 
     * @return actionJournalDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getActionJournalDate() {
        return actionJournalDate;
    }


    /**
     * Sets the actionJournalDate value for this CProcessEvent.
     * 
     * @param actionJournalDate
     */
    public void setActionJournalDate(_int.wipo.ipas.IpasServices.IpasDateTime actionJournalDate) {
        this.actionJournalDate = actionJournalDate;
    }


    /**
     * Gets the actionUser value for this CProcessEvent.
     * 
     * @return actionUser
     */
    public java.lang.String getActionUser() {
        return actionUser;
    }


    /**
     * Sets the actionUser value for this CProcessEvent.
     * 
     * @param actionUser
     */
    public void setActionUser(java.lang.String actionUser) {
        this.actionUser = actionUser;
    }


    /**
     * Gets the eventActionId value for this CProcessEvent.
     * 
     * @return eventActionId
     */
    public _int.wipo.ipas.IpasServices.CActionId getEventActionId() {
        return eventActionId;
    }


    /**
     * Sets the eventActionId value for this CProcessEvent.
     * 
     * @param eventActionId
     */
    public void setEventActionId(_int.wipo.ipas.IpasServices.CActionId eventActionId) {
        this.eventActionId = eventActionId;
    }


    /**
     * Gets the eventActionTypeCode value for this CProcessEvent.
     * 
     * @return eventActionTypeCode
     */
    public java.lang.String getEventActionTypeCode() {
        return eventActionTypeCode;
    }


    /**
     * Sets the eventActionTypeCode value for this CProcessEvent.
     * 
     * @param eventActionTypeCode
     */
    public void setEventActionTypeCode(java.lang.String eventActionTypeCode) {
        this.eventActionTypeCode = eventActionTypeCode;
    }


    /**
     * Gets the eventChildActionNbr value for this CProcessEvent.
     * 
     * @return eventChildActionNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getEventChildActionNbr() {
        return eventChildActionNbr;
    }


    /**
     * Sets the eventChildActionNbr value for this CProcessEvent.
     * 
     * @param eventChildActionNbr
     */
    public void setEventChildActionNbr(_int.wipo.ipas.IpasServices.IpasInteger eventChildActionNbr) {
        this.eventChildActionNbr = eventChildActionNbr;
    }


    /**
     * Gets the eventDate value for this CProcessEvent.
     * 
     * @return eventDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getEventDate() {
        return eventDate;
    }


    /**
     * Sets the eventDate value for this CProcessEvent.
     * 
     * @param eventDate
     */
    public void setEventDate(_int.wipo.ipas.IpasServices.IpasDateTime eventDate) {
        this.eventDate = eventDate;
    }


    /**
     * Gets the eventDeleteDateTime value for this CProcessEvent.
     * 
     * @return eventDeleteDateTime
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getEventDeleteDateTime() {
        return eventDeleteDateTime;
    }


    /**
     * Sets the eventDeleteDateTime value for this CProcessEvent.
     * 
     * @param eventDeleteDateTime
     */
    public void setEventDeleteDateTime(_int.wipo.ipas.IpasServices.IpasDateTime eventDeleteDateTime) {
        this.eventDeleteDateTime = eventDeleteDateTime;
    }


    /**
     * Gets the eventDeleteUserId value for this CProcessEvent.
     * 
     * @return eventDeleteUserId
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getEventDeleteUserId() {
        return eventDeleteUserId;
    }


    /**
     * Sets the eventDeleteUserId value for this CProcessEvent.
     * 
     * @param eventDeleteUserId
     */
    public void setEventDeleteUserId(_int.wipo.ipas.IpasServices.IpasInteger eventDeleteUserId) {
        this.eventDeleteUserId = eventDeleteUserId;
    }


    /**
     * Gets the eventDeliveryId value for this CProcessEvent.
     * 
     * @return eventDeliveryId
     */
    public _int.wipo.ipas.IpasServices.CDeliveryId getEventDeliveryId() {
        return eventDeliveryId;
    }


    /**
     * Sets the eventDeliveryId value for this CProcessEvent.
     * 
     * @param eventDeliveryId
     */
    public void setEventDeliveryId(_int.wipo.ipas.IpasServices.CDeliveryId eventDeliveryId) {
        this.eventDeliveryId = eventDeliveryId;
    }


    /**
     * Gets the eventDescription value for this CProcessEvent.
     * 
     * @return eventDescription
     */
    public java.lang.String getEventDescription() {
        return eventDescription;
    }


    /**
     * Sets the eventDescription value for this CProcessEvent.
     * 
     * @param eventDescription
     */
    public void setEventDescription(java.lang.String eventDescription) {
        this.eventDescription = eventDescription;
    }


    /**
     * Gets the eventEdocId value for this CProcessEvent.
     * 
     * @return eventEdocId
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getEventEdocId() {
        return eventEdocId;
    }


    /**
     * Sets the eventEdocId value for this CProcessEvent.
     * 
     * @param eventEdocId
     */
    public void setEventEdocId(_int.wipo.ipas.IpasServices.IpasInteger eventEdocId) {
        this.eventEdocId = eventEdocId;
    }


    /**
     * Gets the eventEfolderId value for this CProcessEvent.
     * 
     * @return eventEfolderId
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getEventEfolderId() {
        return eventEfolderId;
    }


    /**
     * Sets the eventEfolderId value for this CProcessEvent.
     * 
     * @param eventEfolderId
     */
    public void setEventEfolderId(_int.wipo.ipas.IpasServices.IpasInteger eventEfolderId) {
        this.eventEfolderId = eventEfolderId;
    }


    /**
     * Gets the eventNotes value for this CProcessEvent.
     * 
     * @return eventNotes
     */
    public java.lang.String getEventNotes() {
        return eventNotes;
    }


    /**
     * Sets the eventNotes value for this CProcessEvent.
     * 
     * @param eventNotes
     */
    public void setEventNotes(java.lang.String eventNotes) {
        this.eventNotes = eventNotes;
    }


    /**
     * Gets the eventOfficedocTypeCode value for this CProcessEvent.
     * 
     * @return eventOfficedocTypeCode
     */
    public java.lang.String getEventOfficedocTypeCode() {
        return eventOfficedocTypeCode;
    }


    /**
     * Sets the eventOfficedocTypeCode value for this CProcessEvent.
     * 
     * @param eventOfficedocTypeCode
     */
    public void setEventOfficedocTypeCode(java.lang.String eventOfficedocTypeCode) {
        this.eventOfficedocTypeCode = eventOfficedocTypeCode;
    }


    /**
     * Gets the eventParentActionNbr value for this CProcessEvent.
     * 
     * @return eventParentActionNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getEventParentActionNbr() {
        return eventParentActionNbr;
    }


    /**
     * Sets the eventParentActionNbr value for this CProcessEvent.
     * 
     * @param eventParentActionNbr
     */
    public void setEventParentActionNbr(_int.wipo.ipas.IpasServices.IpasInteger eventParentActionNbr) {
        this.eventParentActionNbr = eventParentActionNbr;
    }


    /**
     * Gets the eventProcessId value for this CProcessEvent.
     * 
     * @return eventProcessId
     */
    public _int.wipo.ipas.IpasServices.CProcessId getEventProcessId() {
        return eventProcessId;
    }


    /**
     * Sets the eventProcessId value for this CProcessEvent.
     * 
     * @param eventProcessId
     */
    public void setEventProcessId(_int.wipo.ipas.IpasServices.CProcessId eventProcessId) {
        this.eventProcessId = eventProcessId;
    }


    /**
     * Gets the eventSubtypeCode value for this CProcessEvent.
     * 
     * @return eventSubtypeCode
     */
    public java.lang.String getEventSubtypeCode() {
        return eventSubtypeCode;
    }


    /**
     * Sets the eventSubtypeCode value for this CProcessEvent.
     * 
     * @param eventSubtypeCode
     */
    public void setEventSubtypeCode(java.lang.String eventSubtypeCode) {
        this.eventSubtypeCode = eventSubtypeCode;
    }


    /**
     * Gets the eventSubtypeName value for this CProcessEvent.
     * 
     * @return eventSubtypeName
     */
    public java.lang.String getEventSubtypeName() {
        return eventSubtypeName;
    }


    /**
     * Sets the eventSubtypeName value for this CProcessEvent.
     * 
     * @param eventSubtypeName
     */
    public void setEventSubtypeName(java.lang.String eventSubtypeName) {
        this.eventSubtypeName = eventSubtypeName;
    }


    /**
     * Gets the eventTypeCode value for this CProcessEvent.
     * 
     * @return eventTypeCode
     */
    public java.lang.String getEventTypeCode() {
        return eventTypeCode;
    }


    /**
     * Sets the eventTypeCode value for this CProcessEvent.
     * 
     * @param eventTypeCode
     */
    public void setEventTypeCode(java.lang.String eventTypeCode) {
        this.eventTypeCode = eventTypeCode;
    }


    /**
     * Gets the eventUserdocTypeCode value for this CProcessEvent.
     * 
     * @return eventUserdocTypeCode
     */
    public java.lang.String getEventUserdocTypeCode() {
        return eventUserdocTypeCode;
    }


    /**
     * Sets the eventUserdocTypeCode value for this CProcessEvent.
     * 
     * @param eventUserdocTypeCode
     */
    public void setEventUserdocTypeCode(java.lang.String eventUserdocTypeCode) {
        this.eventUserdocTypeCode = eventUserdocTypeCode;
    }


    /**
     * Gets the indEventIsDeleted value for this CProcessEvent.
     * 
     * @return indEventIsDeleted
     */
    public java.lang.Boolean getIndEventIsDeleted() {
        return indEventIsDeleted;
    }


    /**
     * Sets the indEventIsDeleted value for this CProcessEvent.
     * 
     * @param indEventIsDeleted
     */
    public void setIndEventIsDeleted(java.lang.Boolean indEventIsDeleted) {
        this.indEventIsDeleted = indEventIsDeleted;
    }


    /**
     * Gets the indEventProcessPending value for this CProcessEvent.
     * 
     * @return indEventProcessPending
     */
    public java.lang.Boolean getIndEventProcessPending() {
        return indEventProcessPending;
    }


    /**
     * Sets the indEventProcessPending value for this CProcessEvent.
     * 
     * @param indEventProcessPending
     */
    public void setIndEventProcessPending(java.lang.Boolean indEventProcessPending) {
        this.indEventProcessPending = indEventProcessPending;
    }


    /**
     * Gets the isEventDeleted value for this CProcessEvent.
     * 
     * @return isEventDeleted
     */
    public java.lang.Boolean getIsEventDeleted() {
        return isEventDeleted;
    }


    /**
     * Sets the isEventDeleted value for this CProcessEvent.
     * 
     * @param isEventDeleted
     */
    public void setIsEventDeleted(java.lang.Boolean isEventDeleted) {
        this.isEventDeleted = isEventDeleted;
    }


    /**
     * Gets the isEventRevised value for this CProcessEvent.
     * 
     * @return isEventRevised
     */
    public java.lang.Boolean getIsEventRevised() {
        return isEventRevised;
    }


    /**
     * Sets the isEventRevised value for this CProcessEvent.
     * 
     * @param isEventRevised
     */
    public void setIsEventRevised(java.lang.Boolean isEventRevised) {
        this.isEventRevised = isEventRevised;
    }


    /**
     * Gets the isSecret value for this CProcessEvent.
     * 
     * @return isSecret
     */
    public java.lang.Boolean getIsSecret() {
        return isSecret;
    }


    /**
     * Sets the isSecret value for this CProcessEvent.
     * 
     * @param isSecret
     */
    public void setIsSecret(java.lang.Boolean isSecret) {
        this.isSecret = isSecret;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CProcessEvent)) return false;
        CProcessEvent other = (CProcessEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionAuthorizationDate==null && other.getActionAuthorizationDate()==null) || 
             (this.actionAuthorizationDate!=null &&
              this.actionAuthorizationDate.equals(other.getActionAuthorizationDate()))) &&
            ((this.actionJournalDate==null && other.getActionJournalDate()==null) || 
             (this.actionJournalDate!=null &&
              this.actionJournalDate.equals(other.getActionJournalDate()))) &&
            ((this.actionUser==null && other.getActionUser()==null) || 
             (this.actionUser!=null &&
              this.actionUser.equals(other.getActionUser()))) &&
            ((this.eventActionId==null && other.getEventActionId()==null) || 
             (this.eventActionId!=null &&
              this.eventActionId.equals(other.getEventActionId()))) &&
            ((this.eventActionTypeCode==null && other.getEventActionTypeCode()==null) || 
             (this.eventActionTypeCode!=null &&
              this.eventActionTypeCode.equals(other.getEventActionTypeCode()))) &&
            ((this.eventChildActionNbr==null && other.getEventChildActionNbr()==null) || 
             (this.eventChildActionNbr!=null &&
              this.eventChildActionNbr.equals(other.getEventChildActionNbr()))) &&
            ((this.eventDate==null && other.getEventDate()==null) || 
             (this.eventDate!=null &&
              this.eventDate.equals(other.getEventDate()))) &&
            ((this.eventDeleteDateTime==null && other.getEventDeleteDateTime()==null) || 
             (this.eventDeleteDateTime!=null &&
              this.eventDeleteDateTime.equals(other.getEventDeleteDateTime()))) &&
            ((this.eventDeleteUserId==null && other.getEventDeleteUserId()==null) || 
             (this.eventDeleteUserId!=null &&
              this.eventDeleteUserId.equals(other.getEventDeleteUserId()))) &&
            ((this.eventDeliveryId==null && other.getEventDeliveryId()==null) || 
             (this.eventDeliveryId!=null &&
              this.eventDeliveryId.equals(other.getEventDeliveryId()))) &&
            ((this.eventDescription==null && other.getEventDescription()==null) || 
             (this.eventDescription!=null &&
              this.eventDescription.equals(other.getEventDescription()))) &&
            ((this.eventEdocId==null && other.getEventEdocId()==null) || 
             (this.eventEdocId!=null &&
              this.eventEdocId.equals(other.getEventEdocId()))) &&
            ((this.eventEfolderId==null && other.getEventEfolderId()==null) || 
             (this.eventEfolderId!=null &&
              this.eventEfolderId.equals(other.getEventEfolderId()))) &&
            ((this.eventNotes==null && other.getEventNotes()==null) || 
             (this.eventNotes!=null &&
              this.eventNotes.equals(other.getEventNotes()))) &&
            ((this.eventOfficedocTypeCode==null && other.getEventOfficedocTypeCode()==null) || 
             (this.eventOfficedocTypeCode!=null &&
              this.eventOfficedocTypeCode.equals(other.getEventOfficedocTypeCode()))) &&
            ((this.eventParentActionNbr==null && other.getEventParentActionNbr()==null) || 
             (this.eventParentActionNbr!=null &&
              this.eventParentActionNbr.equals(other.getEventParentActionNbr()))) &&
            ((this.eventProcessId==null && other.getEventProcessId()==null) || 
             (this.eventProcessId!=null &&
              this.eventProcessId.equals(other.getEventProcessId()))) &&
            ((this.eventSubtypeCode==null && other.getEventSubtypeCode()==null) || 
             (this.eventSubtypeCode!=null &&
              this.eventSubtypeCode.equals(other.getEventSubtypeCode()))) &&
            ((this.eventSubtypeName==null && other.getEventSubtypeName()==null) || 
             (this.eventSubtypeName!=null &&
              this.eventSubtypeName.equals(other.getEventSubtypeName()))) &&
            ((this.eventTypeCode==null && other.getEventTypeCode()==null) || 
             (this.eventTypeCode!=null &&
              this.eventTypeCode.equals(other.getEventTypeCode()))) &&
            ((this.eventUserdocTypeCode==null && other.getEventUserdocTypeCode()==null) || 
             (this.eventUserdocTypeCode!=null &&
              this.eventUserdocTypeCode.equals(other.getEventUserdocTypeCode()))) &&
            ((this.indEventIsDeleted==null && other.getIndEventIsDeleted()==null) || 
             (this.indEventIsDeleted!=null &&
              this.indEventIsDeleted.equals(other.getIndEventIsDeleted()))) &&
            ((this.indEventProcessPending==null && other.getIndEventProcessPending()==null) || 
             (this.indEventProcessPending!=null &&
              this.indEventProcessPending.equals(other.getIndEventProcessPending()))) &&
            ((this.isEventDeleted==null && other.getIsEventDeleted()==null) || 
             (this.isEventDeleted!=null &&
              this.isEventDeleted.equals(other.getIsEventDeleted()))) &&
            ((this.isEventRevised==null && other.getIsEventRevised()==null) || 
             (this.isEventRevised!=null &&
              this.isEventRevised.equals(other.getIsEventRevised()))) &&
            ((this.isSecret==null && other.getIsSecret()==null) || 
             (this.isSecret!=null &&
              this.isSecret.equals(other.getIsSecret())));
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
        if (getActionAuthorizationDate() != null) {
            _hashCode += getActionAuthorizationDate().hashCode();
        }
        if (getActionJournalDate() != null) {
            _hashCode += getActionJournalDate().hashCode();
        }
        if (getActionUser() != null) {
            _hashCode += getActionUser().hashCode();
        }
        if (getEventActionId() != null) {
            _hashCode += getEventActionId().hashCode();
        }
        if (getEventActionTypeCode() != null) {
            _hashCode += getEventActionTypeCode().hashCode();
        }
        if (getEventChildActionNbr() != null) {
            _hashCode += getEventChildActionNbr().hashCode();
        }
        if (getEventDate() != null) {
            _hashCode += getEventDate().hashCode();
        }
        if (getEventDeleteDateTime() != null) {
            _hashCode += getEventDeleteDateTime().hashCode();
        }
        if (getEventDeleteUserId() != null) {
            _hashCode += getEventDeleteUserId().hashCode();
        }
        if (getEventDeliveryId() != null) {
            _hashCode += getEventDeliveryId().hashCode();
        }
        if (getEventDescription() != null) {
            _hashCode += getEventDescription().hashCode();
        }
        if (getEventEdocId() != null) {
            _hashCode += getEventEdocId().hashCode();
        }
        if (getEventEfolderId() != null) {
            _hashCode += getEventEfolderId().hashCode();
        }
        if (getEventNotes() != null) {
            _hashCode += getEventNotes().hashCode();
        }
        if (getEventOfficedocTypeCode() != null) {
            _hashCode += getEventOfficedocTypeCode().hashCode();
        }
        if (getEventParentActionNbr() != null) {
            _hashCode += getEventParentActionNbr().hashCode();
        }
        if (getEventProcessId() != null) {
            _hashCode += getEventProcessId().hashCode();
        }
        if (getEventSubtypeCode() != null) {
            _hashCode += getEventSubtypeCode().hashCode();
        }
        if (getEventSubtypeName() != null) {
            _hashCode += getEventSubtypeName().hashCode();
        }
        if (getEventTypeCode() != null) {
            _hashCode += getEventTypeCode().hashCode();
        }
        if (getEventUserdocTypeCode() != null) {
            _hashCode += getEventUserdocTypeCode().hashCode();
        }
        if (getIndEventIsDeleted() != null) {
            _hashCode += getIndEventIsDeleted().hashCode();
        }
        if (getIndEventProcessPending() != null) {
            _hashCode += getIndEventProcessPending().hashCode();
        }
        if (getIsEventDeleted() != null) {
            _hashCode += getIsEventDeleted().hashCode();
        }
        if (getIsEventRevised() != null) {
            _hashCode += getIsEventRevised().hashCode();
        }
        if (getIsSecret() != null) {
            _hashCode += getIsSecret().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CProcessEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionAuthorizationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionAuthorizationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionJournalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionJournalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventActionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventActionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventActionTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventActionTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventChildActionNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventChildActionNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDeleteDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventDeleteDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDeleteUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventDeleteUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDeliveryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventDeliveryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventEdocId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventEdocId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventEfolderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventEfolderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventOfficedocTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventOfficedocTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventParentActionNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventParentActionNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventProcessId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventProcessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventSubtypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventSubtypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventSubtypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventSubtypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventUserdocTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventUserdocTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indEventIsDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indEventIsDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indEventProcessPending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indEventProcessPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEventDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isEventDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEventRevised");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isEventRevised"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSecret");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isSecret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
