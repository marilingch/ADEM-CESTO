/**
 * CCriteriaProcessByAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaProcessByAction  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime actionDateFrom;

    private _int.wipo.ipas.IpasServices.IpasDateTime actionDateTo;

    private _int.wipo.ipas.IpasServices.CActionTypeId actionTypeId;

    private _int.wipo.ipas.IpasServices.CUserId captureUserId;

    private java.lang.Boolean indChk1;

    private java.lang.Boolean indChk2;

    private java.lang.Boolean indChk3;

    private java.lang.Boolean indChk4;

    private java.lang.Boolean indChk5;

    private java.lang.Boolean indSignaturePending;

    private _int.wipo.ipas.IpasServices.CJournal journal;

    private _int.wipo.ipas.IpasServices.CActionTypeId notHavingActionTypeId;

    private java.lang.String notes1Containing;

    private java.lang.String notes1NotContaining;

    private java.lang.String notes2Containing;

    private java.lang.String notes2NotContaining;

    private java.lang.String notes3Containing;

    private java.lang.String notes3NotContaining;

    private java.lang.String notes4Containing;

    private java.lang.String notes4NotContaining;

    private java.lang.String notes5Containing;

    private java.lang.String notes5NotContaining;

    private java.lang.String notesContaining;

    private java.lang.String notesNotContaining;

    public CCriteriaProcessByAction() {
    }

    public CCriteriaProcessByAction(
           _int.wipo.ipas.IpasServices.IpasDateTime actionDateFrom,
           _int.wipo.ipas.IpasServices.IpasDateTime actionDateTo,
           _int.wipo.ipas.IpasServices.CActionTypeId actionTypeId,
           _int.wipo.ipas.IpasServices.CUserId captureUserId,
           java.lang.Boolean indChk1,
           java.lang.Boolean indChk2,
           java.lang.Boolean indChk3,
           java.lang.Boolean indChk4,
           java.lang.Boolean indChk5,
           java.lang.Boolean indSignaturePending,
           _int.wipo.ipas.IpasServices.CJournal journal,
           _int.wipo.ipas.IpasServices.CActionTypeId notHavingActionTypeId,
           java.lang.String notes1Containing,
           java.lang.String notes1NotContaining,
           java.lang.String notes2Containing,
           java.lang.String notes2NotContaining,
           java.lang.String notes3Containing,
           java.lang.String notes3NotContaining,
           java.lang.String notes4Containing,
           java.lang.String notes4NotContaining,
           java.lang.String notes5Containing,
           java.lang.String notes5NotContaining,
           java.lang.String notesContaining,
           java.lang.String notesNotContaining) {
           this.actionDateFrom = actionDateFrom;
           this.actionDateTo = actionDateTo;
           this.actionTypeId = actionTypeId;
           this.captureUserId = captureUserId;
           this.indChk1 = indChk1;
           this.indChk2 = indChk2;
           this.indChk3 = indChk3;
           this.indChk4 = indChk4;
           this.indChk5 = indChk5;
           this.indSignaturePending = indSignaturePending;
           this.journal = journal;
           this.notHavingActionTypeId = notHavingActionTypeId;
           this.notes1Containing = notes1Containing;
           this.notes1NotContaining = notes1NotContaining;
           this.notes2Containing = notes2Containing;
           this.notes2NotContaining = notes2NotContaining;
           this.notes3Containing = notes3Containing;
           this.notes3NotContaining = notes3NotContaining;
           this.notes4Containing = notes4Containing;
           this.notes4NotContaining = notes4NotContaining;
           this.notes5Containing = notes5Containing;
           this.notes5NotContaining = notes5NotContaining;
           this.notesContaining = notesContaining;
           this.notesNotContaining = notesNotContaining;
    }


    /**
     * Gets the actionDateFrom value for this CCriteriaProcessByAction.
     * 
     * @return actionDateFrom
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getActionDateFrom() {
        return actionDateFrom;
    }


    /**
     * Sets the actionDateFrom value for this CCriteriaProcessByAction.
     * 
     * @param actionDateFrom
     */
    public void setActionDateFrom(_int.wipo.ipas.IpasServices.IpasDateTime actionDateFrom) {
        this.actionDateFrom = actionDateFrom;
    }


    /**
     * Gets the actionDateTo value for this CCriteriaProcessByAction.
     * 
     * @return actionDateTo
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getActionDateTo() {
        return actionDateTo;
    }


    /**
     * Sets the actionDateTo value for this CCriteriaProcessByAction.
     * 
     * @param actionDateTo
     */
    public void setActionDateTo(_int.wipo.ipas.IpasServices.IpasDateTime actionDateTo) {
        this.actionDateTo = actionDateTo;
    }


    /**
     * Gets the actionTypeId value for this CCriteriaProcessByAction.
     * 
     * @return actionTypeId
     */
    public _int.wipo.ipas.IpasServices.CActionTypeId getActionTypeId() {
        return actionTypeId;
    }


    /**
     * Sets the actionTypeId value for this CCriteriaProcessByAction.
     * 
     * @param actionTypeId
     */
    public void setActionTypeId(_int.wipo.ipas.IpasServices.CActionTypeId actionTypeId) {
        this.actionTypeId = actionTypeId;
    }


    /**
     * Gets the captureUserId value for this CCriteriaProcessByAction.
     * 
     * @return captureUserId
     */
    public _int.wipo.ipas.IpasServices.CUserId getCaptureUserId() {
        return captureUserId;
    }


    /**
     * Sets the captureUserId value for this CCriteriaProcessByAction.
     * 
     * @param captureUserId
     */
    public void setCaptureUserId(_int.wipo.ipas.IpasServices.CUserId captureUserId) {
        this.captureUserId = captureUserId;
    }


    /**
     * Gets the indChk1 value for this CCriteriaProcessByAction.
     * 
     * @return indChk1
     */
    public java.lang.Boolean getIndChk1() {
        return indChk1;
    }


    /**
     * Sets the indChk1 value for this CCriteriaProcessByAction.
     * 
     * @param indChk1
     */
    public void setIndChk1(java.lang.Boolean indChk1) {
        this.indChk1 = indChk1;
    }


    /**
     * Gets the indChk2 value for this CCriteriaProcessByAction.
     * 
     * @return indChk2
     */
    public java.lang.Boolean getIndChk2() {
        return indChk2;
    }


    /**
     * Sets the indChk2 value for this CCriteriaProcessByAction.
     * 
     * @param indChk2
     */
    public void setIndChk2(java.lang.Boolean indChk2) {
        this.indChk2 = indChk2;
    }


    /**
     * Gets the indChk3 value for this CCriteriaProcessByAction.
     * 
     * @return indChk3
     */
    public java.lang.Boolean getIndChk3() {
        return indChk3;
    }


    /**
     * Sets the indChk3 value for this CCriteriaProcessByAction.
     * 
     * @param indChk3
     */
    public void setIndChk3(java.lang.Boolean indChk3) {
        this.indChk3 = indChk3;
    }


    /**
     * Gets the indChk4 value for this CCriteriaProcessByAction.
     * 
     * @return indChk4
     */
    public java.lang.Boolean getIndChk4() {
        return indChk4;
    }


    /**
     * Sets the indChk4 value for this CCriteriaProcessByAction.
     * 
     * @param indChk4
     */
    public void setIndChk4(java.lang.Boolean indChk4) {
        this.indChk4 = indChk4;
    }


    /**
     * Gets the indChk5 value for this CCriteriaProcessByAction.
     * 
     * @return indChk5
     */
    public java.lang.Boolean getIndChk5() {
        return indChk5;
    }


    /**
     * Sets the indChk5 value for this CCriteriaProcessByAction.
     * 
     * @param indChk5
     */
    public void setIndChk5(java.lang.Boolean indChk5) {
        this.indChk5 = indChk5;
    }


    /**
     * Gets the indSignaturePending value for this CCriteriaProcessByAction.
     * 
     * @return indSignaturePending
     */
    public java.lang.Boolean getIndSignaturePending() {
        return indSignaturePending;
    }


    /**
     * Sets the indSignaturePending value for this CCriteriaProcessByAction.
     * 
     * @param indSignaturePending
     */
    public void setIndSignaturePending(java.lang.Boolean indSignaturePending) {
        this.indSignaturePending = indSignaturePending;
    }


    /**
     * Gets the journal value for this CCriteriaProcessByAction.
     * 
     * @return journal
     */
    public _int.wipo.ipas.IpasServices.CJournal getJournal() {
        return journal;
    }


    /**
     * Sets the journal value for this CCriteriaProcessByAction.
     * 
     * @param journal
     */
    public void setJournal(_int.wipo.ipas.IpasServices.CJournal journal) {
        this.journal = journal;
    }


    /**
     * Gets the notHavingActionTypeId value for this CCriteriaProcessByAction.
     * 
     * @return notHavingActionTypeId
     */
    public _int.wipo.ipas.IpasServices.CActionTypeId getNotHavingActionTypeId() {
        return notHavingActionTypeId;
    }


    /**
     * Sets the notHavingActionTypeId value for this CCriteriaProcessByAction.
     * 
     * @param notHavingActionTypeId
     */
    public void setNotHavingActionTypeId(_int.wipo.ipas.IpasServices.CActionTypeId notHavingActionTypeId) {
        this.notHavingActionTypeId = notHavingActionTypeId;
    }


    /**
     * Gets the notes1Containing value for this CCriteriaProcessByAction.
     * 
     * @return notes1Containing
     */
    public java.lang.String getNotes1Containing() {
        return notes1Containing;
    }


    /**
     * Sets the notes1Containing value for this CCriteriaProcessByAction.
     * 
     * @param notes1Containing
     */
    public void setNotes1Containing(java.lang.String notes1Containing) {
        this.notes1Containing = notes1Containing;
    }


    /**
     * Gets the notes1NotContaining value for this CCriteriaProcessByAction.
     * 
     * @return notes1NotContaining
     */
    public java.lang.String getNotes1NotContaining() {
        return notes1NotContaining;
    }


    /**
     * Sets the notes1NotContaining value for this CCriteriaProcessByAction.
     * 
     * @param notes1NotContaining
     */
    public void setNotes1NotContaining(java.lang.String notes1NotContaining) {
        this.notes1NotContaining = notes1NotContaining;
    }


    /**
     * Gets the notes2Containing value for this CCriteriaProcessByAction.
     * 
     * @return notes2Containing
     */
    public java.lang.String getNotes2Containing() {
        return notes2Containing;
    }


    /**
     * Sets the notes2Containing value for this CCriteriaProcessByAction.
     * 
     * @param notes2Containing
     */
    public void setNotes2Containing(java.lang.String notes2Containing) {
        this.notes2Containing = notes2Containing;
    }


    /**
     * Gets the notes2NotContaining value for this CCriteriaProcessByAction.
     * 
     * @return notes2NotContaining
     */
    public java.lang.String getNotes2NotContaining() {
        return notes2NotContaining;
    }


    /**
     * Sets the notes2NotContaining value for this CCriteriaProcessByAction.
     * 
     * @param notes2NotContaining
     */
    public void setNotes2NotContaining(java.lang.String notes2NotContaining) {
        this.notes2NotContaining = notes2NotContaining;
    }


    /**
     * Gets the notes3Containing value for this CCriteriaProcessByAction.
     * 
     * @return notes3Containing
     */
    public java.lang.String getNotes3Containing() {
        return notes3Containing;
    }


    /**
     * Sets the notes3Containing value for this CCriteriaProcessByAction.
     * 
     * @param notes3Containing
     */
    public void setNotes3Containing(java.lang.String notes3Containing) {
        this.notes3Containing = notes3Containing;
    }


    /**
     * Gets the notes3NotContaining value for this CCriteriaProcessByAction.
     * 
     * @return notes3NotContaining
     */
    public java.lang.String getNotes3NotContaining() {
        return notes3NotContaining;
    }


    /**
     * Sets the notes3NotContaining value for this CCriteriaProcessByAction.
     * 
     * @param notes3NotContaining
     */
    public void setNotes3NotContaining(java.lang.String notes3NotContaining) {
        this.notes3NotContaining = notes3NotContaining;
    }


    /**
     * Gets the notes4Containing value for this CCriteriaProcessByAction.
     * 
     * @return notes4Containing
     */
    public java.lang.String getNotes4Containing() {
        return notes4Containing;
    }


    /**
     * Sets the notes4Containing value for this CCriteriaProcessByAction.
     * 
     * @param notes4Containing
     */
    public void setNotes4Containing(java.lang.String notes4Containing) {
        this.notes4Containing = notes4Containing;
    }


    /**
     * Gets the notes4NotContaining value for this CCriteriaProcessByAction.
     * 
     * @return notes4NotContaining
     */
    public java.lang.String getNotes4NotContaining() {
        return notes4NotContaining;
    }


    /**
     * Sets the notes4NotContaining value for this CCriteriaProcessByAction.
     * 
     * @param notes4NotContaining
     */
    public void setNotes4NotContaining(java.lang.String notes4NotContaining) {
        this.notes4NotContaining = notes4NotContaining;
    }


    /**
     * Gets the notes5Containing value for this CCriteriaProcessByAction.
     * 
     * @return notes5Containing
     */
    public java.lang.String getNotes5Containing() {
        return notes5Containing;
    }


    /**
     * Sets the notes5Containing value for this CCriteriaProcessByAction.
     * 
     * @param notes5Containing
     */
    public void setNotes5Containing(java.lang.String notes5Containing) {
        this.notes5Containing = notes5Containing;
    }


    /**
     * Gets the notes5NotContaining value for this CCriteriaProcessByAction.
     * 
     * @return notes5NotContaining
     */
    public java.lang.String getNotes5NotContaining() {
        return notes5NotContaining;
    }


    /**
     * Sets the notes5NotContaining value for this CCriteriaProcessByAction.
     * 
     * @param notes5NotContaining
     */
    public void setNotes5NotContaining(java.lang.String notes5NotContaining) {
        this.notes5NotContaining = notes5NotContaining;
    }


    /**
     * Gets the notesContaining value for this CCriteriaProcessByAction.
     * 
     * @return notesContaining
     */
    public java.lang.String getNotesContaining() {
        return notesContaining;
    }


    /**
     * Sets the notesContaining value for this CCriteriaProcessByAction.
     * 
     * @param notesContaining
     */
    public void setNotesContaining(java.lang.String notesContaining) {
        this.notesContaining = notesContaining;
    }


    /**
     * Gets the notesNotContaining value for this CCriteriaProcessByAction.
     * 
     * @return notesNotContaining
     */
    public java.lang.String getNotesNotContaining() {
        return notesNotContaining;
    }


    /**
     * Sets the notesNotContaining value for this CCriteriaProcessByAction.
     * 
     * @param notesNotContaining
     */
    public void setNotesNotContaining(java.lang.String notesNotContaining) {
        this.notesNotContaining = notesNotContaining;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaProcessByAction)) return false;
        CCriteriaProcessByAction other = (CCriteriaProcessByAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionDateFrom==null && other.getActionDateFrom()==null) || 
             (this.actionDateFrom!=null &&
              this.actionDateFrom.equals(other.getActionDateFrom()))) &&
            ((this.actionDateTo==null && other.getActionDateTo()==null) || 
             (this.actionDateTo!=null &&
              this.actionDateTo.equals(other.getActionDateTo()))) &&
            ((this.actionTypeId==null && other.getActionTypeId()==null) || 
             (this.actionTypeId!=null &&
              this.actionTypeId.equals(other.getActionTypeId()))) &&
            ((this.captureUserId==null && other.getCaptureUserId()==null) || 
             (this.captureUserId!=null &&
              this.captureUserId.equals(other.getCaptureUserId()))) &&
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
            ((this.journal==null && other.getJournal()==null) || 
             (this.journal!=null &&
              this.journal.equals(other.getJournal()))) &&
            ((this.notHavingActionTypeId==null && other.getNotHavingActionTypeId()==null) || 
             (this.notHavingActionTypeId!=null &&
              this.notHavingActionTypeId.equals(other.getNotHavingActionTypeId()))) &&
            ((this.notes1Containing==null && other.getNotes1Containing()==null) || 
             (this.notes1Containing!=null &&
              this.notes1Containing.equals(other.getNotes1Containing()))) &&
            ((this.notes1NotContaining==null && other.getNotes1NotContaining()==null) || 
             (this.notes1NotContaining!=null &&
              this.notes1NotContaining.equals(other.getNotes1NotContaining()))) &&
            ((this.notes2Containing==null && other.getNotes2Containing()==null) || 
             (this.notes2Containing!=null &&
              this.notes2Containing.equals(other.getNotes2Containing()))) &&
            ((this.notes2NotContaining==null && other.getNotes2NotContaining()==null) || 
             (this.notes2NotContaining!=null &&
              this.notes2NotContaining.equals(other.getNotes2NotContaining()))) &&
            ((this.notes3Containing==null && other.getNotes3Containing()==null) || 
             (this.notes3Containing!=null &&
              this.notes3Containing.equals(other.getNotes3Containing()))) &&
            ((this.notes3NotContaining==null && other.getNotes3NotContaining()==null) || 
             (this.notes3NotContaining!=null &&
              this.notes3NotContaining.equals(other.getNotes3NotContaining()))) &&
            ((this.notes4Containing==null && other.getNotes4Containing()==null) || 
             (this.notes4Containing!=null &&
              this.notes4Containing.equals(other.getNotes4Containing()))) &&
            ((this.notes4NotContaining==null && other.getNotes4NotContaining()==null) || 
             (this.notes4NotContaining!=null &&
              this.notes4NotContaining.equals(other.getNotes4NotContaining()))) &&
            ((this.notes5Containing==null && other.getNotes5Containing()==null) || 
             (this.notes5Containing!=null &&
              this.notes5Containing.equals(other.getNotes5Containing()))) &&
            ((this.notes5NotContaining==null && other.getNotes5NotContaining()==null) || 
             (this.notes5NotContaining!=null &&
              this.notes5NotContaining.equals(other.getNotes5NotContaining()))) &&
            ((this.notesContaining==null && other.getNotesContaining()==null) || 
             (this.notesContaining!=null &&
              this.notesContaining.equals(other.getNotesContaining()))) &&
            ((this.notesNotContaining==null && other.getNotesNotContaining()==null) || 
             (this.notesNotContaining!=null &&
              this.notesNotContaining.equals(other.getNotesNotContaining())));
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
        if (getActionDateFrom() != null) {
            _hashCode += getActionDateFrom().hashCode();
        }
        if (getActionDateTo() != null) {
            _hashCode += getActionDateTo().hashCode();
        }
        if (getActionTypeId() != null) {
            _hashCode += getActionTypeId().hashCode();
        }
        if (getCaptureUserId() != null) {
            _hashCode += getCaptureUserId().hashCode();
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
        if (getJournal() != null) {
            _hashCode += getJournal().hashCode();
        }
        if (getNotHavingActionTypeId() != null) {
            _hashCode += getNotHavingActionTypeId().hashCode();
        }
        if (getNotes1Containing() != null) {
            _hashCode += getNotes1Containing().hashCode();
        }
        if (getNotes1NotContaining() != null) {
            _hashCode += getNotes1NotContaining().hashCode();
        }
        if (getNotes2Containing() != null) {
            _hashCode += getNotes2Containing().hashCode();
        }
        if (getNotes2NotContaining() != null) {
            _hashCode += getNotes2NotContaining().hashCode();
        }
        if (getNotes3Containing() != null) {
            _hashCode += getNotes3Containing().hashCode();
        }
        if (getNotes3NotContaining() != null) {
            _hashCode += getNotes3NotContaining().hashCode();
        }
        if (getNotes4Containing() != null) {
            _hashCode += getNotes4Containing().hashCode();
        }
        if (getNotes4NotContaining() != null) {
            _hashCode += getNotes4NotContaining().hashCode();
        }
        if (getNotes5Containing() != null) {
            _hashCode += getNotes5Containing().hashCode();
        }
        if (getNotes5NotContaining() != null) {
            _hashCode += getNotes5NotContaining().hashCode();
        }
        if (getNotesContaining() != null) {
            _hashCode += getNotesContaining().hashCode();
        }
        if (getNotesNotContaining() != null) {
            _hashCode += getNotesNotContaining().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaProcessByAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcessByAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionTypeId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "captureUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserId"));
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
        elemField.setFieldName("journal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "journal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cJournal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notHavingActionTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notHavingActionTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionTypeId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes1Containing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes1Containing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes1NotContaining");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes1NotContaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes2Containing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes2Containing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes2NotContaining");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes2NotContaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes3Containing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes3Containing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes3NotContaining");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes3NotContaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes4Containing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes4Containing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes4NotContaining");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes4NotContaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes5Containing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes5Containing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes5NotContaining");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes5NotContaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notesContaining");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notesContaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notesNotContaining");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notesNotContaining"));
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
