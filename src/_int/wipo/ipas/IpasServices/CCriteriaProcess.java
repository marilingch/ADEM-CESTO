/**
 * CCriteriaProcess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaProcess  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CCriteriaProcessByAction criteriaProcessByAction;

    private _int.wipo.ipas.IpasServices.CCriteriaProcessByFile criteriaProcessByFile;

    private _int.wipo.ipas.IpasServices.CCriteriaProcessByOfficedoc criteriaProcessByOfficedoc;

    private _int.wipo.ipas.IpasServices.CCriteriaProcessByStatus criteriaProcessByStatus;

    private _int.wipo.ipas.IpasServices.CCriteriaProcessByUserdoc criteriaProcessByUserdoc;

    private _int.wipo.ipas.IpasServices.CDeliveryId deliveryId;

    private _int.wipo.ipas.IpasServices.CProcessGroupId processGroupId;

    public CCriteriaProcess() {
    }

    public CCriteriaProcess(
           _int.wipo.ipas.IpasServices.CCriteriaProcessByAction criteriaProcessByAction,
           _int.wipo.ipas.IpasServices.CCriteriaProcessByFile criteriaProcessByFile,
           _int.wipo.ipas.IpasServices.CCriteriaProcessByOfficedoc criteriaProcessByOfficedoc,
           _int.wipo.ipas.IpasServices.CCriteriaProcessByStatus criteriaProcessByStatus,
           _int.wipo.ipas.IpasServices.CCriteriaProcessByUserdoc criteriaProcessByUserdoc,
           _int.wipo.ipas.IpasServices.CDeliveryId deliveryId,
           _int.wipo.ipas.IpasServices.CProcessGroupId processGroupId) {
           this.criteriaProcessByAction = criteriaProcessByAction;
           this.criteriaProcessByFile = criteriaProcessByFile;
           this.criteriaProcessByOfficedoc = criteriaProcessByOfficedoc;
           this.criteriaProcessByStatus = criteriaProcessByStatus;
           this.criteriaProcessByUserdoc = criteriaProcessByUserdoc;
           this.deliveryId = deliveryId;
           this.processGroupId = processGroupId;
    }


    /**
     * Gets the criteriaProcessByAction value for this CCriteriaProcess.
     * 
     * @return criteriaProcessByAction
     */
    public _int.wipo.ipas.IpasServices.CCriteriaProcessByAction getCriteriaProcessByAction() {
        return criteriaProcessByAction;
    }


    /**
     * Sets the criteriaProcessByAction value for this CCriteriaProcess.
     * 
     * @param criteriaProcessByAction
     */
    public void setCriteriaProcessByAction(_int.wipo.ipas.IpasServices.CCriteriaProcessByAction criteriaProcessByAction) {
        this.criteriaProcessByAction = criteriaProcessByAction;
    }


    /**
     * Gets the criteriaProcessByFile value for this CCriteriaProcess.
     * 
     * @return criteriaProcessByFile
     */
    public _int.wipo.ipas.IpasServices.CCriteriaProcessByFile getCriteriaProcessByFile() {
        return criteriaProcessByFile;
    }


    /**
     * Sets the criteriaProcessByFile value for this CCriteriaProcess.
     * 
     * @param criteriaProcessByFile
     */
    public void setCriteriaProcessByFile(_int.wipo.ipas.IpasServices.CCriteriaProcessByFile criteriaProcessByFile) {
        this.criteriaProcessByFile = criteriaProcessByFile;
    }


    /**
     * Gets the criteriaProcessByOfficedoc value for this CCriteriaProcess.
     * 
     * @return criteriaProcessByOfficedoc
     */
    public _int.wipo.ipas.IpasServices.CCriteriaProcessByOfficedoc getCriteriaProcessByOfficedoc() {
        return criteriaProcessByOfficedoc;
    }


    /**
     * Sets the criteriaProcessByOfficedoc value for this CCriteriaProcess.
     * 
     * @param criteriaProcessByOfficedoc
     */
    public void setCriteriaProcessByOfficedoc(_int.wipo.ipas.IpasServices.CCriteriaProcessByOfficedoc criteriaProcessByOfficedoc) {
        this.criteriaProcessByOfficedoc = criteriaProcessByOfficedoc;
    }


    /**
     * Gets the criteriaProcessByStatus value for this CCriteriaProcess.
     * 
     * @return criteriaProcessByStatus
     */
    public _int.wipo.ipas.IpasServices.CCriteriaProcessByStatus getCriteriaProcessByStatus() {
        return criteriaProcessByStatus;
    }


    /**
     * Sets the criteriaProcessByStatus value for this CCriteriaProcess.
     * 
     * @param criteriaProcessByStatus
     */
    public void setCriteriaProcessByStatus(_int.wipo.ipas.IpasServices.CCriteriaProcessByStatus criteriaProcessByStatus) {
        this.criteriaProcessByStatus = criteriaProcessByStatus;
    }


    /**
     * Gets the criteriaProcessByUserdoc value for this CCriteriaProcess.
     * 
     * @return criteriaProcessByUserdoc
     */
    public _int.wipo.ipas.IpasServices.CCriteriaProcessByUserdoc getCriteriaProcessByUserdoc() {
        return criteriaProcessByUserdoc;
    }


    /**
     * Sets the criteriaProcessByUserdoc value for this CCriteriaProcess.
     * 
     * @param criteriaProcessByUserdoc
     */
    public void setCriteriaProcessByUserdoc(_int.wipo.ipas.IpasServices.CCriteriaProcessByUserdoc criteriaProcessByUserdoc) {
        this.criteriaProcessByUserdoc = criteriaProcessByUserdoc;
    }


    /**
     * Gets the deliveryId value for this CCriteriaProcess.
     * 
     * @return deliveryId
     */
    public _int.wipo.ipas.IpasServices.CDeliveryId getDeliveryId() {
        return deliveryId;
    }


    /**
     * Sets the deliveryId value for this CCriteriaProcess.
     * 
     * @param deliveryId
     */
    public void setDeliveryId(_int.wipo.ipas.IpasServices.CDeliveryId deliveryId) {
        this.deliveryId = deliveryId;
    }


    /**
     * Gets the processGroupId value for this CCriteriaProcess.
     * 
     * @return processGroupId
     */
    public _int.wipo.ipas.IpasServices.CProcessGroupId getProcessGroupId() {
        return processGroupId;
    }


    /**
     * Sets the processGroupId value for this CCriteriaProcess.
     * 
     * @param processGroupId
     */
    public void setProcessGroupId(_int.wipo.ipas.IpasServices.CProcessGroupId processGroupId) {
        this.processGroupId = processGroupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaProcess)) return false;
        CCriteriaProcess other = (CCriteriaProcess) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.criteriaProcessByAction==null && other.getCriteriaProcessByAction()==null) || 
             (this.criteriaProcessByAction!=null &&
              this.criteriaProcessByAction.equals(other.getCriteriaProcessByAction()))) &&
            ((this.criteriaProcessByFile==null && other.getCriteriaProcessByFile()==null) || 
             (this.criteriaProcessByFile!=null &&
              this.criteriaProcessByFile.equals(other.getCriteriaProcessByFile()))) &&
            ((this.criteriaProcessByOfficedoc==null && other.getCriteriaProcessByOfficedoc()==null) || 
             (this.criteriaProcessByOfficedoc!=null &&
              this.criteriaProcessByOfficedoc.equals(other.getCriteriaProcessByOfficedoc()))) &&
            ((this.criteriaProcessByStatus==null && other.getCriteriaProcessByStatus()==null) || 
             (this.criteriaProcessByStatus!=null &&
              this.criteriaProcessByStatus.equals(other.getCriteriaProcessByStatus()))) &&
            ((this.criteriaProcessByUserdoc==null && other.getCriteriaProcessByUserdoc()==null) || 
             (this.criteriaProcessByUserdoc!=null &&
              this.criteriaProcessByUserdoc.equals(other.getCriteriaProcessByUserdoc()))) &&
            ((this.deliveryId==null && other.getDeliveryId()==null) || 
             (this.deliveryId!=null &&
              this.deliveryId.equals(other.getDeliveryId()))) &&
            ((this.processGroupId==null && other.getProcessGroupId()==null) || 
             (this.processGroupId!=null &&
              this.processGroupId.equals(other.getProcessGroupId())));
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
        if (getCriteriaProcessByAction() != null) {
            _hashCode += getCriteriaProcessByAction().hashCode();
        }
        if (getCriteriaProcessByFile() != null) {
            _hashCode += getCriteriaProcessByFile().hashCode();
        }
        if (getCriteriaProcessByOfficedoc() != null) {
            _hashCode += getCriteriaProcessByOfficedoc().hashCode();
        }
        if (getCriteriaProcessByStatus() != null) {
            _hashCode += getCriteriaProcessByStatus().hashCode();
        }
        if (getCriteriaProcessByUserdoc() != null) {
            _hashCode += getCriteriaProcessByUserdoc().hashCode();
        }
        if (getDeliveryId() != null) {
            _hashCode += getDeliveryId().hashCode();
        }
        if (getProcessGroupId() != null) {
            _hashCode += getProcessGroupId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaProcess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcess"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaProcessByAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criteriaProcessByAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcessByAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaProcessByFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criteriaProcessByFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcessByFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaProcessByOfficedoc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criteriaProcessByOfficedoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcessByOfficedoc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaProcessByStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criteriaProcessByStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcessByStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaProcessByUserdoc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criteriaProcessByUserdoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProcessByUserdoc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDeliveryId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroupId"));
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
