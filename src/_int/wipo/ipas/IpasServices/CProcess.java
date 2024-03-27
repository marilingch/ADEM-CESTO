/**
 * CProcess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CProcess  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime creationDate;

    private java.lang.String description;

    private _int.wipo.ipas.IpasServices.IpasDateTime dueDate;

    private java.lang.Boolean indProcessContainsEventList;

    private java.lang.Boolean indProcessContainsFreezeList;

    private java.lang.Boolean indReadEventList;

    private java.lang.Boolean indReadFreezeList;

    private _int.wipo.ipas.IpasServices.CProcessEvent[] processEventList;

    private _int.wipo.ipas.IpasServices.CProcessFreezing[] processFreezingList;

    private _int.wipo.ipas.IpasServices.CProcessFrozen[] processFrozenList;

    private _int.wipo.ipas.IpasServices.CProcessId processId;

    private _int.wipo.ipas.IpasServices.CProcessOriginData processOriginData;

    private _int.wipo.ipas.IpasServices.CUser responsibleUser;

    private _int.wipo.ipas.IpasServices.CStatus status;

    private _int.wipo.ipas.IpasServices.IpasDateTime statusDate;

    private java.lang.String statusGroupName;

    private _int.wipo.ipas.IpasServices.CSubstatus substatus;

    private java.lang.String workflowWarningText;

    public CProcess() {
    }

    public CProcess(
           _int.wipo.ipas.IpasServices.IpasDateTime creationDate,
           java.lang.String description,
           _int.wipo.ipas.IpasServices.IpasDateTime dueDate,
           java.lang.Boolean indProcessContainsEventList,
           java.lang.Boolean indProcessContainsFreezeList,
           java.lang.Boolean indReadEventList,
           java.lang.Boolean indReadFreezeList,
           _int.wipo.ipas.IpasServices.CProcessEvent[] processEventList,
           _int.wipo.ipas.IpasServices.CProcessFreezing[] processFreezingList,
           _int.wipo.ipas.IpasServices.CProcessFrozen[] processFrozenList,
           _int.wipo.ipas.IpasServices.CProcessId processId,
           _int.wipo.ipas.IpasServices.CProcessOriginData processOriginData,
           _int.wipo.ipas.IpasServices.CUser responsibleUser,
           _int.wipo.ipas.IpasServices.CStatus status,
           _int.wipo.ipas.IpasServices.IpasDateTime statusDate,
           java.lang.String statusGroupName,
           _int.wipo.ipas.IpasServices.CSubstatus substatus,
           java.lang.String workflowWarningText) {
           this.creationDate = creationDate;
           this.description = description;
           this.dueDate = dueDate;
           this.indProcessContainsEventList = indProcessContainsEventList;
           this.indProcessContainsFreezeList = indProcessContainsFreezeList;
           this.indReadEventList = indReadEventList;
           this.indReadFreezeList = indReadFreezeList;
           this.processEventList = processEventList;
           this.processFreezingList = processFreezingList;
           this.processFrozenList = processFrozenList;
           this.processId = processId;
           this.processOriginData = processOriginData;
           this.responsibleUser = responsibleUser;
           this.status = status;
           this.statusDate = statusDate;
           this.statusGroupName = statusGroupName;
           this.substatus = substatus;
           this.workflowWarningText = workflowWarningText;
    }


    /**
     * Gets the creationDate value for this CProcess.
     * 
     * @return creationDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this CProcess.
     * 
     * @param creationDate
     */
    public void setCreationDate(_int.wipo.ipas.IpasServices.IpasDateTime creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the description value for this CProcess.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CProcess.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dueDate value for this CProcess.
     * 
     * @return dueDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this CProcess.
     * 
     * @param dueDate
     */
    public void setDueDate(_int.wipo.ipas.IpasServices.IpasDateTime dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the indProcessContainsEventList value for this CProcess.
     * 
     * @return indProcessContainsEventList
     */
    public java.lang.Boolean getIndProcessContainsEventList() {
        return indProcessContainsEventList;
    }


    /**
     * Sets the indProcessContainsEventList value for this CProcess.
     * 
     * @param indProcessContainsEventList
     */
    public void setIndProcessContainsEventList(java.lang.Boolean indProcessContainsEventList) {
        this.indProcessContainsEventList = indProcessContainsEventList;
    }


    /**
     * Gets the indProcessContainsFreezeList value for this CProcess.
     * 
     * @return indProcessContainsFreezeList
     */
    public java.lang.Boolean getIndProcessContainsFreezeList() {
        return indProcessContainsFreezeList;
    }


    /**
     * Sets the indProcessContainsFreezeList value for this CProcess.
     * 
     * @param indProcessContainsFreezeList
     */
    public void setIndProcessContainsFreezeList(java.lang.Boolean indProcessContainsFreezeList) {
        this.indProcessContainsFreezeList = indProcessContainsFreezeList;
    }


    /**
     * Gets the indReadEventList value for this CProcess.
     * 
     * @return indReadEventList
     */
    public java.lang.Boolean getIndReadEventList() {
        return indReadEventList;
    }


    /**
     * Sets the indReadEventList value for this CProcess.
     * 
     * @param indReadEventList
     */
    public void setIndReadEventList(java.lang.Boolean indReadEventList) {
        this.indReadEventList = indReadEventList;
    }


    /**
     * Gets the indReadFreezeList value for this CProcess.
     * 
     * @return indReadFreezeList
     */
    public java.lang.Boolean getIndReadFreezeList() {
        return indReadFreezeList;
    }


    /**
     * Sets the indReadFreezeList value for this CProcess.
     * 
     * @param indReadFreezeList
     */
    public void setIndReadFreezeList(java.lang.Boolean indReadFreezeList) {
        this.indReadFreezeList = indReadFreezeList;
    }


    /**
     * Gets the processEventList value for this CProcess.
     * 
     * @return processEventList
     */
    public _int.wipo.ipas.IpasServices.CProcessEvent[] getProcessEventList() {
        return processEventList;
    }


    /**
     * Sets the processEventList value for this CProcess.
     * 
     * @param processEventList
     */
    public void setProcessEventList(_int.wipo.ipas.IpasServices.CProcessEvent[] processEventList) {
        this.processEventList = processEventList;
    }

    public _int.wipo.ipas.IpasServices.CProcessEvent getProcessEventList(int i) {
        return this.processEventList[i];
    }

    public void setProcessEventList(int i, _int.wipo.ipas.IpasServices.CProcessEvent _value) {
        this.processEventList[i] = _value;
    }


    /**
     * Gets the processFreezingList value for this CProcess.
     * 
     * @return processFreezingList
     */
    public _int.wipo.ipas.IpasServices.CProcessFreezing[] getProcessFreezingList() {
        return processFreezingList;
    }


    /**
     * Sets the processFreezingList value for this CProcess.
     * 
     * @param processFreezingList
     */
    public void setProcessFreezingList(_int.wipo.ipas.IpasServices.CProcessFreezing[] processFreezingList) {
        this.processFreezingList = processFreezingList;
    }

    public _int.wipo.ipas.IpasServices.CProcessFreezing getProcessFreezingList(int i) {
        return this.processFreezingList[i];
    }

    public void setProcessFreezingList(int i, _int.wipo.ipas.IpasServices.CProcessFreezing _value) {
        this.processFreezingList[i] = _value;
    }


    /**
     * Gets the processFrozenList value for this CProcess.
     * 
     * @return processFrozenList
     */
    public _int.wipo.ipas.IpasServices.CProcessFrozen[] getProcessFrozenList() {
        return processFrozenList;
    }


    /**
     * Sets the processFrozenList value for this CProcess.
     * 
     * @param processFrozenList
     */
    public void setProcessFrozenList(_int.wipo.ipas.IpasServices.CProcessFrozen[] processFrozenList) {
        this.processFrozenList = processFrozenList;
    }

    public _int.wipo.ipas.IpasServices.CProcessFrozen getProcessFrozenList(int i) {
        return this.processFrozenList[i];
    }

    public void setProcessFrozenList(int i, _int.wipo.ipas.IpasServices.CProcessFrozen _value) {
        this.processFrozenList[i] = _value;
    }


    /**
     * Gets the processId value for this CProcess.
     * 
     * @return processId
     */
    public _int.wipo.ipas.IpasServices.CProcessId getProcessId() {
        return processId;
    }


    /**
     * Sets the processId value for this CProcess.
     * 
     * @param processId
     */
    public void setProcessId(_int.wipo.ipas.IpasServices.CProcessId processId) {
        this.processId = processId;
    }


    /**
     * Gets the processOriginData value for this CProcess.
     * 
     * @return processOriginData
     */
    public _int.wipo.ipas.IpasServices.CProcessOriginData getProcessOriginData() {
        return processOriginData;
    }


    /**
     * Sets the processOriginData value for this CProcess.
     * 
     * @param processOriginData
     */
    public void setProcessOriginData(_int.wipo.ipas.IpasServices.CProcessOriginData processOriginData) {
        this.processOriginData = processOriginData;
    }


    /**
     * Gets the responsibleUser value for this CProcess.
     * 
     * @return responsibleUser
     */
    public _int.wipo.ipas.IpasServices.CUser getResponsibleUser() {
        return responsibleUser;
    }


    /**
     * Sets the responsibleUser value for this CProcess.
     * 
     * @param responsibleUser
     */
    public void setResponsibleUser(_int.wipo.ipas.IpasServices.CUser responsibleUser) {
        this.responsibleUser = responsibleUser;
    }


    /**
     * Gets the status value for this CProcess.
     * 
     * @return status
     */
    public _int.wipo.ipas.IpasServices.CStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CProcess.
     * 
     * @param status
     */
    public void setStatus(_int.wipo.ipas.IpasServices.CStatus status) {
        this.status = status;
    }


    /**
     * Gets the statusDate value for this CProcess.
     * 
     * @return statusDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getStatusDate() {
        return statusDate;
    }


    /**
     * Sets the statusDate value for this CProcess.
     * 
     * @param statusDate
     */
    public void setStatusDate(_int.wipo.ipas.IpasServices.IpasDateTime statusDate) {
        this.statusDate = statusDate;
    }


    /**
     * Gets the statusGroupName value for this CProcess.
     * 
     * @return statusGroupName
     */
    public java.lang.String getStatusGroupName() {
        return statusGroupName;
    }


    /**
     * Sets the statusGroupName value for this CProcess.
     * 
     * @param statusGroupName
     */
    public void setStatusGroupName(java.lang.String statusGroupName) {
        this.statusGroupName = statusGroupName;
    }


    /**
     * Gets the substatus value for this CProcess.
     * 
     * @return substatus
     */
    public _int.wipo.ipas.IpasServices.CSubstatus getSubstatus() {
        return substatus;
    }


    /**
     * Sets the substatus value for this CProcess.
     * 
     * @param substatus
     */
    public void setSubstatus(_int.wipo.ipas.IpasServices.CSubstatus substatus) {
        this.substatus = substatus;
    }


    /**
     * Gets the workflowWarningText value for this CProcess.
     * 
     * @return workflowWarningText
     */
    public java.lang.String getWorkflowWarningText() {
        return workflowWarningText;
    }


    /**
     * Sets the workflowWarningText value for this CProcess.
     * 
     * @param workflowWarningText
     */
    public void setWorkflowWarningText(java.lang.String workflowWarningText) {
        this.workflowWarningText = workflowWarningText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CProcess)) return false;
        CProcess other = (CProcess) obj;
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
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.indProcessContainsEventList==null && other.getIndProcessContainsEventList()==null) || 
             (this.indProcessContainsEventList!=null &&
              this.indProcessContainsEventList.equals(other.getIndProcessContainsEventList()))) &&
            ((this.indProcessContainsFreezeList==null && other.getIndProcessContainsFreezeList()==null) || 
             (this.indProcessContainsFreezeList!=null &&
              this.indProcessContainsFreezeList.equals(other.getIndProcessContainsFreezeList()))) &&
            ((this.indReadEventList==null && other.getIndReadEventList()==null) || 
             (this.indReadEventList!=null &&
              this.indReadEventList.equals(other.getIndReadEventList()))) &&
            ((this.indReadFreezeList==null && other.getIndReadFreezeList()==null) || 
             (this.indReadFreezeList!=null &&
              this.indReadFreezeList.equals(other.getIndReadFreezeList()))) &&
            ((this.processEventList==null && other.getProcessEventList()==null) || 
             (this.processEventList!=null &&
              java.util.Arrays.equals(this.processEventList, other.getProcessEventList()))) &&
            ((this.processFreezingList==null && other.getProcessFreezingList()==null) || 
             (this.processFreezingList!=null &&
              java.util.Arrays.equals(this.processFreezingList, other.getProcessFreezingList()))) &&
            ((this.processFrozenList==null && other.getProcessFrozenList()==null) || 
             (this.processFrozenList!=null &&
              java.util.Arrays.equals(this.processFrozenList, other.getProcessFrozenList()))) &&
            ((this.processId==null && other.getProcessId()==null) || 
             (this.processId!=null &&
              this.processId.equals(other.getProcessId()))) &&
            ((this.processOriginData==null && other.getProcessOriginData()==null) || 
             (this.processOriginData!=null &&
              this.processOriginData.equals(other.getProcessOriginData()))) &&
            ((this.responsibleUser==null && other.getResponsibleUser()==null) || 
             (this.responsibleUser!=null &&
              this.responsibleUser.equals(other.getResponsibleUser()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDate==null && other.getStatusDate()==null) || 
             (this.statusDate!=null &&
              this.statusDate.equals(other.getStatusDate()))) &&
            ((this.statusGroupName==null && other.getStatusGroupName()==null) || 
             (this.statusGroupName!=null &&
              this.statusGroupName.equals(other.getStatusGroupName()))) &&
            ((this.substatus==null && other.getSubstatus()==null) || 
             (this.substatus!=null &&
              this.substatus.equals(other.getSubstatus()))) &&
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
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getIndProcessContainsEventList() != null) {
            _hashCode += getIndProcessContainsEventList().hashCode();
        }
        if (getIndProcessContainsFreezeList() != null) {
            _hashCode += getIndProcessContainsFreezeList().hashCode();
        }
        if (getIndReadEventList() != null) {
            _hashCode += getIndReadEventList().hashCode();
        }
        if (getIndReadFreezeList() != null) {
            _hashCode += getIndReadFreezeList().hashCode();
        }
        if (getProcessEventList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessEventList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcessEventList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProcessFreezingList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessFreezingList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcessFreezingList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProcessFrozenList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessFrozenList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcessFrozenList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProcessId() != null) {
            _hashCode += getProcessId().hashCode();
        }
        if (getProcessOriginData() != null) {
            _hashCode += getProcessOriginData().hashCode();
        }
        if (getResponsibleUser() != null) {
            _hashCode += getResponsibleUser().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDate() != null) {
            _hashCode += getStatusDate().hashCode();
        }
        if (getStatusGroupName() != null) {
            _hashCode += getStatusGroupName().hashCode();
        }
        if (getSubstatus() != null) {
            _hashCode += getSubstatus().hashCode();
        }
        if (getWorkflowWarningText() != null) {
            _hashCode += getWorkflowWarningText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CProcess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcess"));
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
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indProcessContainsEventList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indProcessContainsEventList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indProcessContainsFreezeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indProcessContainsFreezeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indReadEventList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indReadEventList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indReadFreezeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indReadFreezeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processEventList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processEventList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processFreezingList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processFreezingList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessFreezing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processFrozenList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processFrozenList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessFrozen"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processOriginData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processOriginData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessOriginData"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStatus"));
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
        elemField.setFieldName("statusGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("substatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "substatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSubstatus"));
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
