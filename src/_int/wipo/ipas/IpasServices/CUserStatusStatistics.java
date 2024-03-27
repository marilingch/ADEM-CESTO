/**
 * CUserStatusStatistics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CUserStatusStatistics  implements java.io.Serializable {
    private java.lang.String applicationSubtype;

    private java.lang.String applicationSubtypeName;

    private java.lang.String applicationType;

    private java.lang.String applicationTypeName;

    private _int.wipo.ipas.IpasServices.IpasInteger processAvgDaysOld;

    private _int.wipo.ipas.IpasServices.IpasInteger processMaxDaysOld;

    private _int.wipo.ipas.IpasServices.IpasInteger processMinDaysOld;

    private _int.wipo.ipas.IpasServices.IpasInteger processQty;

    private _int.wipo.ipas.IpasServices.IpasInteger processTotalDaysOld;

    private _int.wipo.ipas.IpasServices.CUser responsibleUser;

    private _int.wipo.ipas.IpasServices.CStatus status;

    private java.lang.String userdocType;

    private java.lang.String userdocTypeName;

    public CUserStatusStatistics() {
    }

    public CUserStatusStatistics(
           java.lang.String applicationSubtype,
           java.lang.String applicationSubtypeName,
           java.lang.String applicationType,
           java.lang.String applicationTypeName,
           _int.wipo.ipas.IpasServices.IpasInteger processAvgDaysOld,
           _int.wipo.ipas.IpasServices.IpasInteger processMaxDaysOld,
           _int.wipo.ipas.IpasServices.IpasInteger processMinDaysOld,
           _int.wipo.ipas.IpasServices.IpasInteger processQty,
           _int.wipo.ipas.IpasServices.IpasInteger processTotalDaysOld,
           _int.wipo.ipas.IpasServices.CUser responsibleUser,
           _int.wipo.ipas.IpasServices.CStatus status,
           java.lang.String userdocType,
           java.lang.String userdocTypeName) {
           this.applicationSubtype = applicationSubtype;
           this.applicationSubtypeName = applicationSubtypeName;
           this.applicationType = applicationType;
           this.applicationTypeName = applicationTypeName;
           this.processAvgDaysOld = processAvgDaysOld;
           this.processMaxDaysOld = processMaxDaysOld;
           this.processMinDaysOld = processMinDaysOld;
           this.processQty = processQty;
           this.processTotalDaysOld = processTotalDaysOld;
           this.responsibleUser = responsibleUser;
           this.status = status;
           this.userdocType = userdocType;
           this.userdocTypeName = userdocTypeName;
    }


    /**
     * Gets the applicationSubtype value for this CUserStatusStatistics.
     * 
     * @return applicationSubtype
     */
    public java.lang.String getApplicationSubtype() {
        return applicationSubtype;
    }


    /**
     * Sets the applicationSubtype value for this CUserStatusStatistics.
     * 
     * @param applicationSubtype
     */
    public void setApplicationSubtype(java.lang.String applicationSubtype) {
        this.applicationSubtype = applicationSubtype;
    }


    /**
     * Gets the applicationSubtypeName value for this CUserStatusStatistics.
     * 
     * @return applicationSubtypeName
     */
    public java.lang.String getApplicationSubtypeName() {
        return applicationSubtypeName;
    }


    /**
     * Sets the applicationSubtypeName value for this CUserStatusStatistics.
     * 
     * @param applicationSubtypeName
     */
    public void setApplicationSubtypeName(java.lang.String applicationSubtypeName) {
        this.applicationSubtypeName = applicationSubtypeName;
    }


    /**
     * Gets the applicationType value for this CUserStatusStatistics.
     * 
     * @return applicationType
     */
    public java.lang.String getApplicationType() {
        return applicationType;
    }


    /**
     * Sets the applicationType value for this CUserStatusStatistics.
     * 
     * @param applicationType
     */
    public void setApplicationType(java.lang.String applicationType) {
        this.applicationType = applicationType;
    }


    /**
     * Gets the applicationTypeName value for this CUserStatusStatistics.
     * 
     * @return applicationTypeName
     */
    public java.lang.String getApplicationTypeName() {
        return applicationTypeName;
    }


    /**
     * Sets the applicationTypeName value for this CUserStatusStatistics.
     * 
     * @param applicationTypeName
     */
    public void setApplicationTypeName(java.lang.String applicationTypeName) {
        this.applicationTypeName = applicationTypeName;
    }


    /**
     * Gets the processAvgDaysOld value for this CUserStatusStatistics.
     * 
     * @return processAvgDaysOld
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getProcessAvgDaysOld() {
        return processAvgDaysOld;
    }


    /**
     * Sets the processAvgDaysOld value for this CUserStatusStatistics.
     * 
     * @param processAvgDaysOld
     */
    public void setProcessAvgDaysOld(_int.wipo.ipas.IpasServices.IpasInteger processAvgDaysOld) {
        this.processAvgDaysOld = processAvgDaysOld;
    }


    /**
     * Gets the processMaxDaysOld value for this CUserStatusStatistics.
     * 
     * @return processMaxDaysOld
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getProcessMaxDaysOld() {
        return processMaxDaysOld;
    }


    /**
     * Sets the processMaxDaysOld value for this CUserStatusStatistics.
     * 
     * @param processMaxDaysOld
     */
    public void setProcessMaxDaysOld(_int.wipo.ipas.IpasServices.IpasInteger processMaxDaysOld) {
        this.processMaxDaysOld = processMaxDaysOld;
    }


    /**
     * Gets the processMinDaysOld value for this CUserStatusStatistics.
     * 
     * @return processMinDaysOld
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getProcessMinDaysOld() {
        return processMinDaysOld;
    }


    /**
     * Sets the processMinDaysOld value for this CUserStatusStatistics.
     * 
     * @param processMinDaysOld
     */
    public void setProcessMinDaysOld(_int.wipo.ipas.IpasServices.IpasInteger processMinDaysOld) {
        this.processMinDaysOld = processMinDaysOld;
    }


    /**
     * Gets the processQty value for this CUserStatusStatistics.
     * 
     * @return processQty
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getProcessQty() {
        return processQty;
    }


    /**
     * Sets the processQty value for this CUserStatusStatistics.
     * 
     * @param processQty
     */
    public void setProcessQty(_int.wipo.ipas.IpasServices.IpasInteger processQty) {
        this.processQty = processQty;
    }


    /**
     * Gets the processTotalDaysOld value for this CUserStatusStatistics.
     * 
     * @return processTotalDaysOld
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getProcessTotalDaysOld() {
        return processTotalDaysOld;
    }


    /**
     * Sets the processTotalDaysOld value for this CUserStatusStatistics.
     * 
     * @param processTotalDaysOld
     */
    public void setProcessTotalDaysOld(_int.wipo.ipas.IpasServices.IpasInteger processTotalDaysOld) {
        this.processTotalDaysOld = processTotalDaysOld;
    }


    /**
     * Gets the responsibleUser value for this CUserStatusStatistics.
     * 
     * @return responsibleUser
     */
    public _int.wipo.ipas.IpasServices.CUser getResponsibleUser() {
        return responsibleUser;
    }


    /**
     * Sets the responsibleUser value for this CUserStatusStatistics.
     * 
     * @param responsibleUser
     */
    public void setResponsibleUser(_int.wipo.ipas.IpasServices.CUser responsibleUser) {
        this.responsibleUser = responsibleUser;
    }


    /**
     * Gets the status value for this CUserStatusStatistics.
     * 
     * @return status
     */
    public _int.wipo.ipas.IpasServices.CStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CUserStatusStatistics.
     * 
     * @param status
     */
    public void setStatus(_int.wipo.ipas.IpasServices.CStatus status) {
        this.status = status;
    }


    /**
     * Gets the userdocType value for this CUserStatusStatistics.
     * 
     * @return userdocType
     */
    public java.lang.String getUserdocType() {
        return userdocType;
    }


    /**
     * Sets the userdocType value for this CUserStatusStatistics.
     * 
     * @param userdocType
     */
    public void setUserdocType(java.lang.String userdocType) {
        this.userdocType = userdocType;
    }


    /**
     * Gets the userdocTypeName value for this CUserStatusStatistics.
     * 
     * @return userdocTypeName
     */
    public java.lang.String getUserdocTypeName() {
        return userdocTypeName;
    }


    /**
     * Sets the userdocTypeName value for this CUserStatusStatistics.
     * 
     * @param userdocTypeName
     */
    public void setUserdocTypeName(java.lang.String userdocTypeName) {
        this.userdocTypeName = userdocTypeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CUserStatusStatistics)) return false;
        CUserStatusStatistics other = (CUserStatusStatistics) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationSubtype==null && other.getApplicationSubtype()==null) || 
             (this.applicationSubtype!=null &&
              this.applicationSubtype.equals(other.getApplicationSubtype()))) &&
            ((this.applicationSubtypeName==null && other.getApplicationSubtypeName()==null) || 
             (this.applicationSubtypeName!=null &&
              this.applicationSubtypeName.equals(other.getApplicationSubtypeName()))) &&
            ((this.applicationType==null && other.getApplicationType()==null) || 
             (this.applicationType!=null &&
              this.applicationType.equals(other.getApplicationType()))) &&
            ((this.applicationTypeName==null && other.getApplicationTypeName()==null) || 
             (this.applicationTypeName!=null &&
              this.applicationTypeName.equals(other.getApplicationTypeName()))) &&
            ((this.processAvgDaysOld==null && other.getProcessAvgDaysOld()==null) || 
             (this.processAvgDaysOld!=null &&
              this.processAvgDaysOld.equals(other.getProcessAvgDaysOld()))) &&
            ((this.processMaxDaysOld==null && other.getProcessMaxDaysOld()==null) || 
             (this.processMaxDaysOld!=null &&
              this.processMaxDaysOld.equals(other.getProcessMaxDaysOld()))) &&
            ((this.processMinDaysOld==null && other.getProcessMinDaysOld()==null) || 
             (this.processMinDaysOld!=null &&
              this.processMinDaysOld.equals(other.getProcessMinDaysOld()))) &&
            ((this.processQty==null && other.getProcessQty()==null) || 
             (this.processQty!=null &&
              this.processQty.equals(other.getProcessQty()))) &&
            ((this.processTotalDaysOld==null && other.getProcessTotalDaysOld()==null) || 
             (this.processTotalDaysOld!=null &&
              this.processTotalDaysOld.equals(other.getProcessTotalDaysOld()))) &&
            ((this.responsibleUser==null && other.getResponsibleUser()==null) || 
             (this.responsibleUser!=null &&
              this.responsibleUser.equals(other.getResponsibleUser()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.userdocType==null && other.getUserdocType()==null) || 
             (this.userdocType!=null &&
              this.userdocType.equals(other.getUserdocType()))) &&
            ((this.userdocTypeName==null && other.getUserdocTypeName()==null) || 
             (this.userdocTypeName!=null &&
              this.userdocTypeName.equals(other.getUserdocTypeName())));
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
        if (getApplicationSubtype() != null) {
            _hashCode += getApplicationSubtype().hashCode();
        }
        if (getApplicationSubtypeName() != null) {
            _hashCode += getApplicationSubtypeName().hashCode();
        }
        if (getApplicationType() != null) {
            _hashCode += getApplicationType().hashCode();
        }
        if (getApplicationTypeName() != null) {
            _hashCode += getApplicationTypeName().hashCode();
        }
        if (getProcessAvgDaysOld() != null) {
            _hashCode += getProcessAvgDaysOld().hashCode();
        }
        if (getProcessMaxDaysOld() != null) {
            _hashCode += getProcessMaxDaysOld().hashCode();
        }
        if (getProcessMinDaysOld() != null) {
            _hashCode += getProcessMinDaysOld().hashCode();
        }
        if (getProcessQty() != null) {
            _hashCode += getProcessQty().hashCode();
        }
        if (getProcessTotalDaysOld() != null) {
            _hashCode += getProcessTotalDaysOld().hashCode();
        }
        if (getResponsibleUser() != null) {
            _hashCode += getResponsibleUser().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getUserdocType() != null) {
            _hashCode += getUserdocType().hashCode();
        }
        if (getUserdocTypeName() != null) {
            _hashCode += getUserdocTypeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CUserStatusStatistics.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cUserStatusStatistics"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationSubtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationSubtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationSubtypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationSubtypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processAvgDaysOld");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processAvgDaysOld"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processMaxDaysOld");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processMaxDaysOld"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processMinDaysOld");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processMinDaysOld"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processQty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processQty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processTotalDaysOld");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processTotalDaysOld"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
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
        elemField.setFieldName("userdocType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdocType"));
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
