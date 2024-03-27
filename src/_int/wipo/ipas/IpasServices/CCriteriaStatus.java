/**
 * CCriteriaStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaStatus  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime expirationDateFrom;

    private java.lang.Boolean expirationDateIsDue;

    private _int.wipo.ipas.IpasServices.IpasDateTime expirationDateTo;

    private java.lang.Boolean indApplyStatusSimilarityIgnore;

    private java.lang.Boolean indStatusInactive;

    private java.lang.Boolean indStatusPending;

    private java.lang.Boolean indStatusRegistered;

    private java.lang.String processResultType;

    private java.lang.String processType;

    private java.lang.String statusCode;

    private java.lang.String statusGroupCode;

    private java.lang.String substatusCode;

    public CCriteriaStatus() {
    }

    public CCriteriaStatus(
           _int.wipo.ipas.IpasServices.IpasDateTime expirationDateFrom,
           java.lang.Boolean expirationDateIsDue,
           _int.wipo.ipas.IpasServices.IpasDateTime expirationDateTo,
           java.lang.Boolean indApplyStatusSimilarityIgnore,
           java.lang.Boolean indStatusInactive,
           java.lang.Boolean indStatusPending,
           java.lang.Boolean indStatusRegistered,
           java.lang.String processResultType,
           java.lang.String processType,
           java.lang.String statusCode,
           java.lang.String statusGroupCode,
           java.lang.String substatusCode) {
           this.expirationDateFrom = expirationDateFrom;
           this.expirationDateIsDue = expirationDateIsDue;
           this.expirationDateTo = expirationDateTo;
           this.indApplyStatusSimilarityIgnore = indApplyStatusSimilarityIgnore;
           this.indStatusInactive = indStatusInactive;
           this.indStatusPending = indStatusPending;
           this.indStatusRegistered = indStatusRegistered;
           this.processResultType = processResultType;
           this.processType = processType;
           this.statusCode = statusCode;
           this.statusGroupCode = statusGroupCode;
           this.substatusCode = substatusCode;
    }


    /**
     * Gets the expirationDateFrom value for this CCriteriaStatus.
     * 
     * @return expirationDateFrom
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getExpirationDateFrom() {
        return expirationDateFrom;
    }


    /**
     * Sets the expirationDateFrom value for this CCriteriaStatus.
     * 
     * @param expirationDateFrom
     */
    public void setExpirationDateFrom(_int.wipo.ipas.IpasServices.IpasDateTime expirationDateFrom) {
        this.expirationDateFrom = expirationDateFrom;
    }


    /**
     * Gets the expirationDateIsDue value for this CCriteriaStatus.
     * 
     * @return expirationDateIsDue
     */
    public java.lang.Boolean getExpirationDateIsDue() {
        return expirationDateIsDue;
    }


    /**
     * Sets the expirationDateIsDue value for this CCriteriaStatus.
     * 
     * @param expirationDateIsDue
     */
    public void setExpirationDateIsDue(java.lang.Boolean expirationDateIsDue) {
        this.expirationDateIsDue = expirationDateIsDue;
    }


    /**
     * Gets the expirationDateTo value for this CCriteriaStatus.
     * 
     * @return expirationDateTo
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getExpirationDateTo() {
        return expirationDateTo;
    }


    /**
     * Sets the expirationDateTo value for this CCriteriaStatus.
     * 
     * @param expirationDateTo
     */
    public void setExpirationDateTo(_int.wipo.ipas.IpasServices.IpasDateTime expirationDateTo) {
        this.expirationDateTo = expirationDateTo;
    }


    /**
     * Gets the indApplyStatusSimilarityIgnore value for this CCriteriaStatus.
     * 
     * @return indApplyStatusSimilarityIgnore
     */
    public java.lang.Boolean getIndApplyStatusSimilarityIgnore() {
        return indApplyStatusSimilarityIgnore;
    }


    /**
     * Sets the indApplyStatusSimilarityIgnore value for this CCriteriaStatus.
     * 
     * @param indApplyStatusSimilarityIgnore
     */
    public void setIndApplyStatusSimilarityIgnore(java.lang.Boolean indApplyStatusSimilarityIgnore) {
        this.indApplyStatusSimilarityIgnore = indApplyStatusSimilarityIgnore;
    }


    /**
     * Gets the indStatusInactive value for this CCriteriaStatus.
     * 
     * @return indStatusInactive
     */
    public java.lang.Boolean getIndStatusInactive() {
        return indStatusInactive;
    }


    /**
     * Sets the indStatusInactive value for this CCriteriaStatus.
     * 
     * @param indStatusInactive
     */
    public void setIndStatusInactive(java.lang.Boolean indStatusInactive) {
        this.indStatusInactive = indStatusInactive;
    }


    /**
     * Gets the indStatusPending value for this CCriteriaStatus.
     * 
     * @return indStatusPending
     */
    public java.lang.Boolean getIndStatusPending() {
        return indStatusPending;
    }


    /**
     * Sets the indStatusPending value for this CCriteriaStatus.
     * 
     * @param indStatusPending
     */
    public void setIndStatusPending(java.lang.Boolean indStatusPending) {
        this.indStatusPending = indStatusPending;
    }


    /**
     * Gets the indStatusRegistered value for this CCriteriaStatus.
     * 
     * @return indStatusRegistered
     */
    public java.lang.Boolean getIndStatusRegistered() {
        return indStatusRegistered;
    }


    /**
     * Sets the indStatusRegistered value for this CCriteriaStatus.
     * 
     * @param indStatusRegistered
     */
    public void setIndStatusRegistered(java.lang.Boolean indStatusRegistered) {
        this.indStatusRegistered = indStatusRegistered;
    }


    /**
     * Gets the processResultType value for this CCriteriaStatus.
     * 
     * @return processResultType
     */
    public java.lang.String getProcessResultType() {
        return processResultType;
    }


    /**
     * Sets the processResultType value for this CCriteriaStatus.
     * 
     * @param processResultType
     */
    public void setProcessResultType(java.lang.String processResultType) {
        this.processResultType = processResultType;
    }


    /**
     * Gets the processType value for this CCriteriaStatus.
     * 
     * @return processType
     */
    public java.lang.String getProcessType() {
        return processType;
    }


    /**
     * Sets the processType value for this CCriteriaStatus.
     * 
     * @param processType
     */
    public void setProcessType(java.lang.String processType) {
        this.processType = processType;
    }


    /**
     * Gets the statusCode value for this CCriteriaStatus.
     * 
     * @return statusCode
     */
    public java.lang.String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this CCriteriaStatus.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusGroupCode value for this CCriteriaStatus.
     * 
     * @return statusGroupCode
     */
    public java.lang.String getStatusGroupCode() {
        return statusGroupCode;
    }


    /**
     * Sets the statusGroupCode value for this CCriteriaStatus.
     * 
     * @param statusGroupCode
     */
    public void setStatusGroupCode(java.lang.String statusGroupCode) {
        this.statusGroupCode = statusGroupCode;
    }


    /**
     * Gets the substatusCode value for this CCriteriaStatus.
     * 
     * @return substatusCode
     */
    public java.lang.String getSubstatusCode() {
        return substatusCode;
    }


    /**
     * Sets the substatusCode value for this CCriteriaStatus.
     * 
     * @param substatusCode
     */
    public void setSubstatusCode(java.lang.String substatusCode) {
        this.substatusCode = substatusCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaStatus)) return false;
        CCriteriaStatus other = (CCriteriaStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.expirationDateFrom==null && other.getExpirationDateFrom()==null) || 
             (this.expirationDateFrom!=null &&
              this.expirationDateFrom.equals(other.getExpirationDateFrom()))) &&
            ((this.expirationDateIsDue==null && other.getExpirationDateIsDue()==null) || 
             (this.expirationDateIsDue!=null &&
              this.expirationDateIsDue.equals(other.getExpirationDateIsDue()))) &&
            ((this.expirationDateTo==null && other.getExpirationDateTo()==null) || 
             (this.expirationDateTo!=null &&
              this.expirationDateTo.equals(other.getExpirationDateTo()))) &&
            ((this.indApplyStatusSimilarityIgnore==null && other.getIndApplyStatusSimilarityIgnore()==null) || 
             (this.indApplyStatusSimilarityIgnore!=null &&
              this.indApplyStatusSimilarityIgnore.equals(other.getIndApplyStatusSimilarityIgnore()))) &&
            ((this.indStatusInactive==null && other.getIndStatusInactive()==null) || 
             (this.indStatusInactive!=null &&
              this.indStatusInactive.equals(other.getIndStatusInactive()))) &&
            ((this.indStatusPending==null && other.getIndStatusPending()==null) || 
             (this.indStatusPending!=null &&
              this.indStatusPending.equals(other.getIndStatusPending()))) &&
            ((this.indStatusRegistered==null && other.getIndStatusRegistered()==null) || 
             (this.indStatusRegistered!=null &&
              this.indStatusRegistered.equals(other.getIndStatusRegistered()))) &&
            ((this.processResultType==null && other.getProcessResultType()==null) || 
             (this.processResultType!=null &&
              this.processResultType.equals(other.getProcessResultType()))) &&
            ((this.processType==null && other.getProcessType()==null) || 
             (this.processType!=null &&
              this.processType.equals(other.getProcessType()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.statusGroupCode==null && other.getStatusGroupCode()==null) || 
             (this.statusGroupCode!=null &&
              this.statusGroupCode.equals(other.getStatusGroupCode()))) &&
            ((this.substatusCode==null && other.getSubstatusCode()==null) || 
             (this.substatusCode!=null &&
              this.substatusCode.equals(other.getSubstatusCode())));
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
        if (getExpirationDateFrom() != null) {
            _hashCode += getExpirationDateFrom().hashCode();
        }
        if (getExpirationDateIsDue() != null) {
            _hashCode += getExpirationDateIsDue().hashCode();
        }
        if (getExpirationDateTo() != null) {
            _hashCode += getExpirationDateTo().hashCode();
        }
        if (getIndApplyStatusSimilarityIgnore() != null) {
            _hashCode += getIndApplyStatusSimilarityIgnore().hashCode();
        }
        if (getIndStatusInactive() != null) {
            _hashCode += getIndStatusInactive().hashCode();
        }
        if (getIndStatusPending() != null) {
            _hashCode += getIndStatusPending().hashCode();
        }
        if (getIndStatusRegistered() != null) {
            _hashCode += getIndStatusRegistered().hashCode();
        }
        if (getProcessResultType() != null) {
            _hashCode += getProcessResultType().hashCode();
        }
        if (getProcessType() != null) {
            _hashCode += getProcessType().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getStatusGroupCode() != null) {
            _hashCode += getStatusGroupCode().hashCode();
        }
        if (getSubstatusCode() != null) {
            _hashCode += getSubstatusCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDateIsDue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDateIsDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indApplyStatusSimilarityIgnore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indApplyStatusSimilarityIgnore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indStatusInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indStatusInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indStatusPending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indStatusPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indStatusRegistered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indStatusRegistered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processResultType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processResultType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusGroupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("substatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "substatusCode"));
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
