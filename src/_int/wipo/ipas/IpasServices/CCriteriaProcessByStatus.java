/**
 * CCriteriaProcessByStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaProcessByStatus  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime creationDateFrom;

    private _int.wipo.ipas.IpasServices.IpasDateTime creationDateTo;

    private _int.wipo.ipas.IpasServices.IpasDateTime dueDateFrom;

    private _int.wipo.ipas.IpasServices.IpasDateTime dueDateTo;

    private java.lang.Boolean indFreezing;

    private java.lang.Boolean indFrozen;

    private java.lang.Boolean indIgnoreNotSigned;

    private java.lang.Boolean indNoResponsibleUser;

    private java.lang.Boolean indNotFrozen;

    private java.lang.Boolean indReactivated;

    private _int.wipo.ipas.IpasServices.CUserId responsibleUserId;

    private _int.wipo.ipas.IpasServices.IpasDateTime statusDateFrom;

    private _int.wipo.ipas.IpasServices.IpasDateTime statusDateTo;

    private _int.wipo.ipas.IpasServices.CStatusId statusId;

    private _int.wipo.ipas.IpasServices.CSubStatusId substatusId;

    public CCriteriaProcessByStatus() {
    }

    public CCriteriaProcessByStatus(
           _int.wipo.ipas.IpasServices.IpasDateTime creationDateFrom,
           _int.wipo.ipas.IpasServices.IpasDateTime creationDateTo,
           _int.wipo.ipas.IpasServices.IpasDateTime dueDateFrom,
           _int.wipo.ipas.IpasServices.IpasDateTime dueDateTo,
           java.lang.Boolean indFreezing,
           java.lang.Boolean indFrozen,
           java.lang.Boolean indIgnoreNotSigned,
           java.lang.Boolean indNoResponsibleUser,
           java.lang.Boolean indNotFrozen,
           java.lang.Boolean indReactivated,
           _int.wipo.ipas.IpasServices.CUserId responsibleUserId,
           _int.wipo.ipas.IpasServices.IpasDateTime statusDateFrom,
           _int.wipo.ipas.IpasServices.IpasDateTime statusDateTo,
           _int.wipo.ipas.IpasServices.CStatusId statusId,
           _int.wipo.ipas.IpasServices.CSubStatusId substatusId) {
           this.creationDateFrom = creationDateFrom;
           this.creationDateTo = creationDateTo;
           this.dueDateFrom = dueDateFrom;
           this.dueDateTo = dueDateTo;
           this.indFreezing = indFreezing;
           this.indFrozen = indFrozen;
           this.indIgnoreNotSigned = indIgnoreNotSigned;
           this.indNoResponsibleUser = indNoResponsibleUser;
           this.indNotFrozen = indNotFrozen;
           this.indReactivated = indReactivated;
           this.responsibleUserId = responsibleUserId;
           this.statusDateFrom = statusDateFrom;
           this.statusDateTo = statusDateTo;
           this.statusId = statusId;
           this.substatusId = substatusId;
    }


    /**
     * Gets the creationDateFrom value for this CCriteriaProcessByStatus.
     * 
     * @return creationDateFrom
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getCreationDateFrom() {
        return creationDateFrom;
    }


    /**
     * Sets the creationDateFrom value for this CCriteriaProcessByStatus.
     * 
     * @param creationDateFrom
     */
    public void setCreationDateFrom(_int.wipo.ipas.IpasServices.IpasDateTime creationDateFrom) {
        this.creationDateFrom = creationDateFrom;
    }


    /**
     * Gets the creationDateTo value for this CCriteriaProcessByStatus.
     * 
     * @return creationDateTo
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getCreationDateTo() {
        return creationDateTo;
    }


    /**
     * Sets the creationDateTo value for this CCriteriaProcessByStatus.
     * 
     * @param creationDateTo
     */
    public void setCreationDateTo(_int.wipo.ipas.IpasServices.IpasDateTime creationDateTo) {
        this.creationDateTo = creationDateTo;
    }


    /**
     * Gets the dueDateFrom value for this CCriteriaProcessByStatus.
     * 
     * @return dueDateFrom
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getDueDateFrom() {
        return dueDateFrom;
    }


    /**
     * Sets the dueDateFrom value for this CCriteriaProcessByStatus.
     * 
     * @param dueDateFrom
     */
    public void setDueDateFrom(_int.wipo.ipas.IpasServices.IpasDateTime dueDateFrom) {
        this.dueDateFrom = dueDateFrom;
    }


    /**
     * Gets the dueDateTo value for this CCriteriaProcessByStatus.
     * 
     * @return dueDateTo
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getDueDateTo() {
        return dueDateTo;
    }


    /**
     * Sets the dueDateTo value for this CCriteriaProcessByStatus.
     * 
     * @param dueDateTo
     */
    public void setDueDateTo(_int.wipo.ipas.IpasServices.IpasDateTime dueDateTo) {
        this.dueDateTo = dueDateTo;
    }


    /**
     * Gets the indFreezing value for this CCriteriaProcessByStatus.
     * 
     * @return indFreezing
     */
    public java.lang.Boolean getIndFreezing() {
        return indFreezing;
    }


    /**
     * Sets the indFreezing value for this CCriteriaProcessByStatus.
     * 
     * @param indFreezing
     */
    public void setIndFreezing(java.lang.Boolean indFreezing) {
        this.indFreezing = indFreezing;
    }


    /**
     * Gets the indFrozen value for this CCriteriaProcessByStatus.
     * 
     * @return indFrozen
     */
    public java.lang.Boolean getIndFrozen() {
        return indFrozen;
    }


    /**
     * Sets the indFrozen value for this CCriteriaProcessByStatus.
     * 
     * @param indFrozen
     */
    public void setIndFrozen(java.lang.Boolean indFrozen) {
        this.indFrozen = indFrozen;
    }


    /**
     * Gets the indIgnoreNotSigned value for this CCriteriaProcessByStatus.
     * 
     * @return indIgnoreNotSigned
     */
    public java.lang.Boolean getIndIgnoreNotSigned() {
        return indIgnoreNotSigned;
    }


    /**
     * Sets the indIgnoreNotSigned value for this CCriteriaProcessByStatus.
     * 
     * @param indIgnoreNotSigned
     */
    public void setIndIgnoreNotSigned(java.lang.Boolean indIgnoreNotSigned) {
        this.indIgnoreNotSigned = indIgnoreNotSigned;
    }


    /**
     * Gets the indNoResponsibleUser value for this CCriteriaProcessByStatus.
     * 
     * @return indNoResponsibleUser
     */
    public java.lang.Boolean getIndNoResponsibleUser() {
        return indNoResponsibleUser;
    }


    /**
     * Sets the indNoResponsibleUser value for this CCriteriaProcessByStatus.
     * 
     * @param indNoResponsibleUser
     */
    public void setIndNoResponsibleUser(java.lang.Boolean indNoResponsibleUser) {
        this.indNoResponsibleUser = indNoResponsibleUser;
    }


    /**
     * Gets the indNotFrozen value for this CCriteriaProcessByStatus.
     * 
     * @return indNotFrozen
     */
    public java.lang.Boolean getIndNotFrozen() {
        return indNotFrozen;
    }


    /**
     * Sets the indNotFrozen value for this CCriteriaProcessByStatus.
     * 
     * @param indNotFrozen
     */
    public void setIndNotFrozen(java.lang.Boolean indNotFrozen) {
        this.indNotFrozen = indNotFrozen;
    }


    /**
     * Gets the indReactivated value for this CCriteriaProcessByStatus.
     * 
     * @return indReactivated
     */
    public java.lang.Boolean getIndReactivated() {
        return indReactivated;
    }


    /**
     * Sets the indReactivated value for this CCriteriaProcessByStatus.
     * 
     * @param indReactivated
     */
    public void setIndReactivated(java.lang.Boolean indReactivated) {
        this.indReactivated = indReactivated;
    }


    /**
     * Gets the responsibleUserId value for this CCriteriaProcessByStatus.
     * 
     * @return responsibleUserId
     */
    public _int.wipo.ipas.IpasServices.CUserId getResponsibleUserId() {
        return responsibleUserId;
    }


    /**
     * Sets the responsibleUserId value for this CCriteriaProcessByStatus.
     * 
     * @param responsibleUserId
     */
    public void setResponsibleUserId(_int.wipo.ipas.IpasServices.CUserId responsibleUserId) {
        this.responsibleUserId = responsibleUserId;
    }


    /**
     * Gets the statusDateFrom value for this CCriteriaProcessByStatus.
     * 
     * @return statusDateFrom
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getStatusDateFrom() {
        return statusDateFrom;
    }


    /**
     * Sets the statusDateFrom value for this CCriteriaProcessByStatus.
     * 
     * @param statusDateFrom
     */
    public void setStatusDateFrom(_int.wipo.ipas.IpasServices.IpasDateTime statusDateFrom) {
        this.statusDateFrom = statusDateFrom;
    }


    /**
     * Gets the statusDateTo value for this CCriteriaProcessByStatus.
     * 
     * @return statusDateTo
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getStatusDateTo() {
        return statusDateTo;
    }


    /**
     * Sets the statusDateTo value for this CCriteriaProcessByStatus.
     * 
     * @param statusDateTo
     */
    public void setStatusDateTo(_int.wipo.ipas.IpasServices.IpasDateTime statusDateTo) {
        this.statusDateTo = statusDateTo;
    }


    /**
     * Gets the statusId value for this CCriteriaProcessByStatus.
     * 
     * @return statusId
     */
    public _int.wipo.ipas.IpasServices.CStatusId getStatusId() {
        return statusId;
    }


    /**
     * Sets the statusId value for this CCriteriaProcessByStatus.
     * 
     * @param statusId
     */
    public void setStatusId(_int.wipo.ipas.IpasServices.CStatusId statusId) {
        this.statusId = statusId;
    }


    /**
     * Gets the substatusId value for this CCriteriaProcessByStatus.
     * 
     * @return substatusId
     */
    public _int.wipo.ipas.IpasServices.CSubStatusId getSubstatusId() {
        return substatusId;
    }


    /**
     * Sets the substatusId value for this CCriteriaProcessByStatus.
     * 
     * @param substatusId
     */
    public void setSubstatusId(_int.wipo.ipas.IpasServices.CSubStatusId substatusId) {
        this.substatusId = substatusId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaProcessByStatus)) return false;
        CCriteriaProcessByStatus other = (CCriteriaProcessByStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creationDateFrom==null && other.getCreationDateFrom()==null) || 
             (this.creationDateFrom!=null &&
              this.creationDateFrom.equals(other.getCreationDateFrom()))) &&
            ((this.creationDateTo==null && other.getCreationDateTo()==null) || 
             (this.creationDateTo!=null &&
              this.creationDateTo.equals(other.getCreationDateTo()))) &&
            ((this.dueDateFrom==null && other.getDueDateFrom()==null) || 
             (this.dueDateFrom!=null &&
              this.dueDateFrom.equals(other.getDueDateFrom()))) &&
            ((this.dueDateTo==null && other.getDueDateTo()==null) || 
             (this.dueDateTo!=null &&
              this.dueDateTo.equals(other.getDueDateTo()))) &&
            ((this.indFreezing==null && other.getIndFreezing()==null) || 
             (this.indFreezing!=null &&
              this.indFreezing.equals(other.getIndFreezing()))) &&
            ((this.indFrozen==null && other.getIndFrozen()==null) || 
             (this.indFrozen!=null &&
              this.indFrozen.equals(other.getIndFrozen()))) &&
            ((this.indIgnoreNotSigned==null && other.getIndIgnoreNotSigned()==null) || 
             (this.indIgnoreNotSigned!=null &&
              this.indIgnoreNotSigned.equals(other.getIndIgnoreNotSigned()))) &&
            ((this.indNoResponsibleUser==null && other.getIndNoResponsibleUser()==null) || 
             (this.indNoResponsibleUser!=null &&
              this.indNoResponsibleUser.equals(other.getIndNoResponsibleUser()))) &&
            ((this.indNotFrozen==null && other.getIndNotFrozen()==null) || 
             (this.indNotFrozen!=null &&
              this.indNotFrozen.equals(other.getIndNotFrozen()))) &&
            ((this.indReactivated==null && other.getIndReactivated()==null) || 
             (this.indReactivated!=null &&
              this.indReactivated.equals(other.getIndReactivated()))) &&
            ((this.responsibleUserId==null && other.getResponsibleUserId()==null) || 
             (this.responsibleUserId!=null &&
              this.responsibleUserId.equals(other.getResponsibleUserId()))) &&
            ((this.statusDateFrom==null && other.getStatusDateFrom()==null) || 
             (this.statusDateFrom!=null &&
              this.statusDateFrom.equals(other.getStatusDateFrom()))) &&
            ((this.statusDateTo==null && other.getStatusDateTo()==null) || 
             (this.statusDateTo!=null &&
              this.statusDateTo.equals(other.getStatusDateTo()))) &&
            ((this.statusId==null && other.getStatusId()==null) || 
             (this.statusId!=null &&
              this.statusId.equals(other.getStatusId()))) &&
            ((this.substatusId==null && other.getSubstatusId()==null) || 
             (this.substatusId!=null &&
              this.substatusId.equals(other.getSubstatusId())));
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
        if (getCreationDateFrom() != null) {
            _hashCode += getCreationDateFrom().hashCode();
        }
        if (getCreationDateTo() != null) {
            _hashCode += getCreationDateTo().hashCode();
        }
        if (getDueDateFrom() != null) {
            _hashCode += getDueDateFrom().hashCode();
        }
        if (getDueDateTo() != null) {
            _hashCode += getDueDateTo().hashCode();
        }
        if (getIndFreezing() != null) {
            _hashCode += getIndFreezing().hashCode();
        }
        if (getIndFrozen() != null) {
            _hashCode += getIndFrozen().hashCode();
        }
        if (getIndIgnoreNotSigned() != null) {
            _hashCode += getIndIgnoreNotSigned().hashCode();
        }
        if (getIndNoResponsibleUser() != null) {
            _hashCode += getIndNoResponsibleUser().hashCode();
        }
        if (getIndNotFrozen() != null) {
            _hashCode += getIndNotFrozen().hashCode();
        }
        if (getIndReactivated() != null) {
            _hashCode += getIndReactivated().hashCode();
        }
        if (getResponsibleUserId() != null) {
            _hashCode += getResponsibleUserId().hashCode();
        }
        if (getStatusDateFrom() != null) {
            _hashCode += getStatusDateFrom().hashCode();
        }
        if (getStatusDateTo() != null) {
            _hashCode += getStatusDateTo().hashCode();
        }
        if (getStatusId() != null) {
            _hashCode += getStatusId().hashCode();
        }
        if (getSubstatusId() != null) {
            _hashCode += getSubstatusId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaProcessByStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcessByStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indFreezing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indFreezing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indFrozen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indFrozen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indIgnoreNotSigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indIgnoreNotSigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indNoResponsibleUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indNoResponsibleUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indNotFrozen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indNotFrozen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indReactivated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indReactivated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsibleUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responsibleUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
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
        elemField.setFieldName("substatusId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "substatusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSubStatusId"));
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
