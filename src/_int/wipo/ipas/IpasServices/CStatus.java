/**
 * CStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CStatus  implements java.io.Serializable {
    private java.lang.Boolean indPending;

    private java.lang.Boolean indResponsibleRequired;

    private java.lang.String processTypeName;

    private _int.wipo.ipas.IpasServices.CStatusId statusId;

    private java.lang.String statusName;

    public CStatus() {
    }

    public CStatus(
           java.lang.Boolean indPending,
           java.lang.Boolean indResponsibleRequired,
           java.lang.String processTypeName,
           _int.wipo.ipas.IpasServices.CStatusId statusId,
           java.lang.String statusName) {
           this.indPending = indPending;
           this.indResponsibleRequired = indResponsibleRequired;
           this.processTypeName = processTypeName;
           this.statusId = statusId;
           this.statusName = statusName;
    }


    /**
     * Gets the indPending value for this CStatus.
     * 
     * @return indPending
     */
    public java.lang.Boolean getIndPending() {
        return indPending;
    }


    /**
     * Sets the indPending value for this CStatus.
     * 
     * @param indPending
     */
    public void setIndPending(java.lang.Boolean indPending) {
        this.indPending = indPending;
    }


    /**
     * Gets the indResponsibleRequired value for this CStatus.
     * 
     * @return indResponsibleRequired
     */
    public java.lang.Boolean getIndResponsibleRequired() {
        return indResponsibleRequired;
    }


    /**
     * Sets the indResponsibleRequired value for this CStatus.
     * 
     * @param indResponsibleRequired
     */
    public void setIndResponsibleRequired(java.lang.Boolean indResponsibleRequired) {
        this.indResponsibleRequired = indResponsibleRequired;
    }


    /**
     * Gets the processTypeName value for this CStatus.
     * 
     * @return processTypeName
     */
    public java.lang.String getProcessTypeName() {
        return processTypeName;
    }


    /**
     * Sets the processTypeName value for this CStatus.
     * 
     * @param processTypeName
     */
    public void setProcessTypeName(java.lang.String processTypeName) {
        this.processTypeName = processTypeName;
    }


    /**
     * Gets the statusId value for this CStatus.
     * 
     * @return statusId
     */
    public _int.wipo.ipas.IpasServices.CStatusId getStatusId() {
        return statusId;
    }


    /**
     * Sets the statusId value for this CStatus.
     * 
     * @param statusId
     */
    public void setStatusId(_int.wipo.ipas.IpasServices.CStatusId statusId) {
        this.statusId = statusId;
    }


    /**
     * Gets the statusName value for this CStatus.
     * 
     * @return statusName
     */
    public java.lang.String getStatusName() {
        return statusName;
    }


    /**
     * Sets the statusName value for this CStatus.
     * 
     * @param statusName
     */
    public void setStatusName(java.lang.String statusName) {
        this.statusName = statusName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CStatus)) return false;
        CStatus other = (CStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.indPending==null && other.getIndPending()==null) || 
             (this.indPending!=null &&
              this.indPending.equals(other.getIndPending()))) &&
            ((this.indResponsibleRequired==null && other.getIndResponsibleRequired()==null) || 
             (this.indResponsibleRequired!=null &&
              this.indResponsibleRequired.equals(other.getIndResponsibleRequired()))) &&
            ((this.processTypeName==null && other.getProcessTypeName()==null) || 
             (this.processTypeName!=null &&
              this.processTypeName.equals(other.getProcessTypeName()))) &&
            ((this.statusId==null && other.getStatusId()==null) || 
             (this.statusId!=null &&
              this.statusId.equals(other.getStatusId()))) &&
            ((this.statusName==null && other.getStatusName()==null) || 
             (this.statusName!=null &&
              this.statusName.equals(other.getStatusName())));
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
        if (getIndPending() != null) {
            _hashCode += getIndPending().hashCode();
        }
        if (getIndResponsibleRequired() != null) {
            _hashCode += getIndResponsibleRequired().hashCode();
        }
        if (getProcessTypeName() != null) {
            _hashCode += getProcessTypeName().hashCode();
        }
        if (getStatusId() != null) {
            _hashCode += getStatusId().hashCode();
        }
        if (getStatusName() != null) {
            _hashCode += getStatusName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indPending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indResponsibleRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indResponsibleRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("statusName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusName"));
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
