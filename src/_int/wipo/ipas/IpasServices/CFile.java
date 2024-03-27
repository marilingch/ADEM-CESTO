/**
 * CFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CFile  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CFileId fileId;

    private _int.wipo.ipas.IpasServices.CFilingData filingData;

    private java.lang.String notes;

    private _int.wipo.ipas.IpasServices.COwnershipData ownershipData;

    private _int.wipo.ipas.IpasServices.CPriorityData priorityData;

    private _int.wipo.ipas.IpasServices.CProcessId processId;

    private _int.wipo.ipas.IpasServices.CPublicationData publicationData;

    private _int.wipo.ipas.IpasServices.CRegistrationData registrationData;

    private _int.wipo.ipas.IpasServices.CRelationship[] relationshipList;

    private _int.wipo.ipas.IpasServices.CRepresentationData representationData;

    private _int.wipo.ipas.IpasServices.IpasInteger rowVersion;

    private _int.wipo.ipas.IpasServices.CStateValidityData stateValidityData;

    public CFile() {
    }

    public CFile(
           _int.wipo.ipas.IpasServices.CFileId fileId,
           _int.wipo.ipas.IpasServices.CFilingData filingData,
           java.lang.String notes,
           _int.wipo.ipas.IpasServices.COwnershipData ownershipData,
           _int.wipo.ipas.IpasServices.CPriorityData priorityData,
           _int.wipo.ipas.IpasServices.CProcessId processId,
           _int.wipo.ipas.IpasServices.CPublicationData publicationData,
           _int.wipo.ipas.IpasServices.CRegistrationData registrationData,
           _int.wipo.ipas.IpasServices.CRelationship[] relationshipList,
           _int.wipo.ipas.IpasServices.CRepresentationData representationData,
           _int.wipo.ipas.IpasServices.IpasInteger rowVersion,
           _int.wipo.ipas.IpasServices.CStateValidityData stateValidityData) {
           this.fileId = fileId;
           this.filingData = filingData;
           this.notes = notes;
           this.ownershipData = ownershipData;
           this.priorityData = priorityData;
           this.processId = processId;
           this.publicationData = publicationData;
           this.registrationData = registrationData;
           this.relationshipList = relationshipList;
           this.representationData = representationData;
           this.rowVersion = rowVersion;
           this.stateValidityData = stateValidityData;
    }


    /**
     * Gets the fileId value for this CFile.
     * 
     * @return fileId
     */
    public _int.wipo.ipas.IpasServices.CFileId getFileId() {
        return fileId;
    }


    /**
     * Sets the fileId value for this CFile.
     * 
     * @param fileId
     */
    public void setFileId(_int.wipo.ipas.IpasServices.CFileId fileId) {
        this.fileId = fileId;
    }


    /**
     * Gets the filingData value for this CFile.
     * 
     * @return filingData
     */
    public _int.wipo.ipas.IpasServices.CFilingData getFilingData() {
        return filingData;
    }


    /**
     * Sets the filingData value for this CFile.
     * 
     * @param filingData
     */
    public void setFilingData(_int.wipo.ipas.IpasServices.CFilingData filingData) {
        this.filingData = filingData;
    }


    /**
     * Gets the notes value for this CFile.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CFile.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the ownershipData value for this CFile.
     * 
     * @return ownershipData
     */
    public _int.wipo.ipas.IpasServices.COwnershipData getOwnershipData() {
        return ownershipData;
    }


    /**
     * Sets the ownershipData value for this CFile.
     * 
     * @param ownershipData
     */
    public void setOwnershipData(_int.wipo.ipas.IpasServices.COwnershipData ownershipData) {
        this.ownershipData = ownershipData;
    }


    /**
     * Gets the priorityData value for this CFile.
     * 
     * @return priorityData
     */
    public _int.wipo.ipas.IpasServices.CPriorityData getPriorityData() {
        return priorityData;
    }


    /**
     * Sets the priorityData value for this CFile.
     * 
     * @param priorityData
     */
    public void setPriorityData(_int.wipo.ipas.IpasServices.CPriorityData priorityData) {
        this.priorityData = priorityData;
    }


    /**
     * Gets the processId value for this CFile.
     * 
     * @return processId
     */
    public _int.wipo.ipas.IpasServices.CProcessId getProcessId() {
        return processId;
    }


    /**
     * Sets the processId value for this CFile.
     * 
     * @param processId
     */
    public void setProcessId(_int.wipo.ipas.IpasServices.CProcessId processId) {
        this.processId = processId;
    }


    /**
     * Gets the publicationData value for this CFile.
     * 
     * @return publicationData
     */
    public _int.wipo.ipas.IpasServices.CPublicationData getPublicationData() {
        return publicationData;
    }


    /**
     * Sets the publicationData value for this CFile.
     * 
     * @param publicationData
     */
    public void setPublicationData(_int.wipo.ipas.IpasServices.CPublicationData publicationData) {
        this.publicationData = publicationData;
    }


    /**
     * Gets the registrationData value for this CFile.
     * 
     * @return registrationData
     */
    public _int.wipo.ipas.IpasServices.CRegistrationData getRegistrationData() {
        return registrationData;
    }


    /**
     * Sets the registrationData value for this CFile.
     * 
     * @param registrationData
     */
    public void setRegistrationData(_int.wipo.ipas.IpasServices.CRegistrationData registrationData) {
        this.registrationData = registrationData;
    }


    /**
     * Gets the relationshipList value for this CFile.
     * 
     * @return relationshipList
     */
    public _int.wipo.ipas.IpasServices.CRelationship[] getRelationshipList() {
        return relationshipList;
    }


    /**
     * Sets the relationshipList value for this CFile.
     * 
     * @param relationshipList
     */
    public void setRelationshipList(_int.wipo.ipas.IpasServices.CRelationship[] relationshipList) {
        this.relationshipList = relationshipList;
    }

    public _int.wipo.ipas.IpasServices.CRelationship getRelationshipList(int i) {
        return this.relationshipList[i];
    }

    public void setRelationshipList(int i, _int.wipo.ipas.IpasServices.CRelationship _value) {
        this.relationshipList[i] = _value;
    }


    /**
     * Gets the representationData value for this CFile.
     * 
     * @return representationData
     */
    public _int.wipo.ipas.IpasServices.CRepresentationData getRepresentationData() {
        return representationData;
    }


    /**
     * Sets the representationData value for this CFile.
     * 
     * @param representationData
     */
    public void setRepresentationData(_int.wipo.ipas.IpasServices.CRepresentationData representationData) {
        this.representationData = representationData;
    }


    /**
     * Gets the rowVersion value for this CFile.
     * 
     * @return rowVersion
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getRowVersion() {
        return rowVersion;
    }


    /**
     * Sets the rowVersion value for this CFile.
     * 
     * @param rowVersion
     */
    public void setRowVersion(_int.wipo.ipas.IpasServices.IpasInteger rowVersion) {
        this.rowVersion = rowVersion;
    }


    /**
     * Gets the stateValidityData value for this CFile.
     * 
     * @return stateValidityData
     */
    public _int.wipo.ipas.IpasServices.CStateValidityData getStateValidityData() {
        return stateValidityData;
    }


    /**
     * Sets the stateValidityData value for this CFile.
     * 
     * @param stateValidityData
     */
    public void setStateValidityData(_int.wipo.ipas.IpasServices.CStateValidityData stateValidityData) {
        this.stateValidityData = stateValidityData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CFile)) return false;
        CFile other = (CFile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileId==null && other.getFileId()==null) || 
             (this.fileId!=null &&
              this.fileId.equals(other.getFileId()))) &&
            ((this.filingData==null && other.getFilingData()==null) || 
             (this.filingData!=null &&
              this.filingData.equals(other.getFilingData()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.ownershipData==null && other.getOwnershipData()==null) || 
             (this.ownershipData!=null &&
              this.ownershipData.equals(other.getOwnershipData()))) &&
            ((this.priorityData==null && other.getPriorityData()==null) || 
             (this.priorityData!=null &&
              this.priorityData.equals(other.getPriorityData()))) &&
            ((this.processId==null && other.getProcessId()==null) || 
             (this.processId!=null &&
              this.processId.equals(other.getProcessId()))) &&
            ((this.publicationData==null && other.getPublicationData()==null) || 
             (this.publicationData!=null &&
              this.publicationData.equals(other.getPublicationData()))) &&
            ((this.registrationData==null && other.getRegistrationData()==null) || 
             (this.registrationData!=null &&
              this.registrationData.equals(other.getRegistrationData()))) &&
            ((this.relationshipList==null && other.getRelationshipList()==null) || 
             (this.relationshipList!=null &&
              java.util.Arrays.equals(this.relationshipList, other.getRelationshipList()))) &&
            ((this.representationData==null && other.getRepresentationData()==null) || 
             (this.representationData!=null &&
              this.representationData.equals(other.getRepresentationData()))) &&
            ((this.rowVersion==null && other.getRowVersion()==null) || 
             (this.rowVersion!=null &&
              this.rowVersion.equals(other.getRowVersion()))) &&
            ((this.stateValidityData==null && other.getStateValidityData()==null) || 
             (this.stateValidityData!=null &&
              this.stateValidityData.equals(other.getStateValidityData())));
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
        if (getFileId() != null) {
            _hashCode += getFileId().hashCode();
        }
        if (getFilingData() != null) {
            _hashCode += getFilingData().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getOwnershipData() != null) {
            _hashCode += getOwnershipData().hashCode();
        }
        if (getPriorityData() != null) {
            _hashCode += getPriorityData().hashCode();
        }
        if (getProcessId() != null) {
            _hashCode += getProcessId().hashCode();
        }
        if (getPublicationData() != null) {
            _hashCode += getPublicationData().hashCode();
        }
        if (getRegistrationData() != null) {
            _hashCode += getRegistrationData().hashCode();
        }
        if (getRelationshipList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelationshipList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelationshipList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRepresentationData() != null) {
            _hashCode += getRepresentationData().hashCode();
        }
        if (getRowVersion() != null) {
            _hashCode += getRowVersion().hashCode();
        }
        if (getStateValidityData() != null) {
            _hashCode += getStateValidityData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CFile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"));
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
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownershipData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownershipData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOwnershipData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priorityData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPriorityData"));
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
        elemField.setFieldName("publicationData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPublicationData"));
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
        elemField.setFieldName("relationshipList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationshipList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRelationship"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representationData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "representationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRepresentationData"));
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
        elemField.setFieldName("stateValidityData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateValidityData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStateValidityData"));
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
