/**
 * CProcessGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CProcessGroup  implements java.io.Serializable {
    private java.lang.Boolean indProcessGroupContainsProcessList;

    private java.lang.Boolean indReadProcessList;

    private _int.wipo.ipas.IpasServices.CProcessCodes[] processCodesList;

    private _int.wipo.ipas.IpasServices.CProcessGroupId processGroupId;

    private java.lang.String processGroupName;

    private _int.wipo.ipas.IpasServices.CProcessSummary[] processSummaryList;

    private java.lang.String processType;

    private java.lang.String processTypeName;

    private _int.wipo.ipas.IpasServices.IpasInteger qtyProcesses;

    public CProcessGroup() {
    }

    public CProcessGroup(
           java.lang.Boolean indProcessGroupContainsProcessList,
           java.lang.Boolean indReadProcessList,
           _int.wipo.ipas.IpasServices.CProcessCodes[] processCodesList,
           _int.wipo.ipas.IpasServices.CProcessGroupId processGroupId,
           java.lang.String processGroupName,
           _int.wipo.ipas.IpasServices.CProcessSummary[] processSummaryList,
           java.lang.String processType,
           java.lang.String processTypeName,
           _int.wipo.ipas.IpasServices.IpasInteger qtyProcesses) {
           this.indProcessGroupContainsProcessList = indProcessGroupContainsProcessList;
           this.indReadProcessList = indReadProcessList;
           this.processCodesList = processCodesList;
           this.processGroupId = processGroupId;
           this.processGroupName = processGroupName;
           this.processSummaryList = processSummaryList;
           this.processType = processType;
           this.processTypeName = processTypeName;
           this.qtyProcesses = qtyProcesses;
    }


    /**
     * Gets the indProcessGroupContainsProcessList value for this CProcessGroup.
     * 
     * @return indProcessGroupContainsProcessList
     */
    public java.lang.Boolean getIndProcessGroupContainsProcessList() {
        return indProcessGroupContainsProcessList;
    }


    /**
     * Sets the indProcessGroupContainsProcessList value for this CProcessGroup.
     * 
     * @param indProcessGroupContainsProcessList
     */
    public void setIndProcessGroupContainsProcessList(java.lang.Boolean indProcessGroupContainsProcessList) {
        this.indProcessGroupContainsProcessList = indProcessGroupContainsProcessList;
    }


    /**
     * Gets the indReadProcessList value for this CProcessGroup.
     * 
     * @return indReadProcessList
     */
    public java.lang.Boolean getIndReadProcessList() {
        return indReadProcessList;
    }


    /**
     * Sets the indReadProcessList value for this CProcessGroup.
     * 
     * @param indReadProcessList
     */
    public void setIndReadProcessList(java.lang.Boolean indReadProcessList) {
        this.indReadProcessList = indReadProcessList;
    }


    /**
     * Gets the processCodesList value for this CProcessGroup.
     * 
     * @return processCodesList
     */
    public _int.wipo.ipas.IpasServices.CProcessCodes[] getProcessCodesList() {
        return processCodesList;
    }


    /**
     * Sets the processCodesList value for this CProcessGroup.
     * 
     * @param processCodesList
     */
    public void setProcessCodesList(_int.wipo.ipas.IpasServices.CProcessCodes[] processCodesList) {
        this.processCodesList = processCodesList;
    }

    public _int.wipo.ipas.IpasServices.CProcessCodes getProcessCodesList(int i) {
        return this.processCodesList[i];
    }

    public void setProcessCodesList(int i, _int.wipo.ipas.IpasServices.CProcessCodes _value) {
        this.processCodesList[i] = _value;
    }


    /**
     * Gets the processGroupId value for this CProcessGroup.
     * 
     * @return processGroupId
     */
    public _int.wipo.ipas.IpasServices.CProcessGroupId getProcessGroupId() {
        return processGroupId;
    }


    /**
     * Sets the processGroupId value for this CProcessGroup.
     * 
     * @param processGroupId
     */
    public void setProcessGroupId(_int.wipo.ipas.IpasServices.CProcessGroupId processGroupId) {
        this.processGroupId = processGroupId;
    }


    /**
     * Gets the processGroupName value for this CProcessGroup.
     * 
     * @return processGroupName
     */
    public java.lang.String getProcessGroupName() {
        return processGroupName;
    }


    /**
     * Sets the processGroupName value for this CProcessGroup.
     * 
     * @param processGroupName
     */
    public void setProcessGroupName(java.lang.String processGroupName) {
        this.processGroupName = processGroupName;
    }


    /**
     * Gets the processSummaryList value for this CProcessGroup.
     * 
     * @return processSummaryList
     */
    public _int.wipo.ipas.IpasServices.CProcessSummary[] getProcessSummaryList() {
        return processSummaryList;
    }


    /**
     * Sets the processSummaryList value for this CProcessGroup.
     * 
     * @param processSummaryList
     */
    public void setProcessSummaryList(_int.wipo.ipas.IpasServices.CProcessSummary[] processSummaryList) {
        this.processSummaryList = processSummaryList;
    }

    public _int.wipo.ipas.IpasServices.CProcessSummary getProcessSummaryList(int i) {
        return this.processSummaryList[i];
    }

    public void setProcessSummaryList(int i, _int.wipo.ipas.IpasServices.CProcessSummary _value) {
        this.processSummaryList[i] = _value;
    }


    /**
     * Gets the processType value for this CProcessGroup.
     * 
     * @return processType
     */
    public java.lang.String getProcessType() {
        return processType;
    }


    /**
     * Sets the processType value for this CProcessGroup.
     * 
     * @param processType
     */
    public void setProcessType(java.lang.String processType) {
        this.processType = processType;
    }


    /**
     * Gets the processTypeName value for this CProcessGroup.
     * 
     * @return processTypeName
     */
    public java.lang.String getProcessTypeName() {
        return processTypeName;
    }


    /**
     * Sets the processTypeName value for this CProcessGroup.
     * 
     * @param processTypeName
     */
    public void setProcessTypeName(java.lang.String processTypeName) {
        this.processTypeName = processTypeName;
    }


    /**
     * Gets the qtyProcesses value for this CProcessGroup.
     * 
     * @return qtyProcesses
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getQtyProcesses() {
        return qtyProcesses;
    }


    /**
     * Sets the qtyProcesses value for this CProcessGroup.
     * 
     * @param qtyProcesses
     */
    public void setQtyProcesses(_int.wipo.ipas.IpasServices.IpasInteger qtyProcesses) {
        this.qtyProcesses = qtyProcesses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CProcessGroup)) return false;
        CProcessGroup other = (CProcessGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.indProcessGroupContainsProcessList==null && other.getIndProcessGroupContainsProcessList()==null) || 
             (this.indProcessGroupContainsProcessList!=null &&
              this.indProcessGroupContainsProcessList.equals(other.getIndProcessGroupContainsProcessList()))) &&
            ((this.indReadProcessList==null && other.getIndReadProcessList()==null) || 
             (this.indReadProcessList!=null &&
              this.indReadProcessList.equals(other.getIndReadProcessList()))) &&
            ((this.processCodesList==null && other.getProcessCodesList()==null) || 
             (this.processCodesList!=null &&
              java.util.Arrays.equals(this.processCodesList, other.getProcessCodesList()))) &&
            ((this.processGroupId==null && other.getProcessGroupId()==null) || 
             (this.processGroupId!=null &&
              this.processGroupId.equals(other.getProcessGroupId()))) &&
            ((this.processGroupName==null && other.getProcessGroupName()==null) || 
             (this.processGroupName!=null &&
              this.processGroupName.equals(other.getProcessGroupName()))) &&
            ((this.processSummaryList==null && other.getProcessSummaryList()==null) || 
             (this.processSummaryList!=null &&
              java.util.Arrays.equals(this.processSummaryList, other.getProcessSummaryList()))) &&
            ((this.processType==null && other.getProcessType()==null) || 
             (this.processType!=null &&
              this.processType.equals(other.getProcessType()))) &&
            ((this.processTypeName==null && other.getProcessTypeName()==null) || 
             (this.processTypeName!=null &&
              this.processTypeName.equals(other.getProcessTypeName()))) &&
            ((this.qtyProcesses==null && other.getQtyProcesses()==null) || 
             (this.qtyProcesses!=null &&
              this.qtyProcesses.equals(other.getQtyProcesses())));
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
        if (getIndProcessGroupContainsProcessList() != null) {
            _hashCode += getIndProcessGroupContainsProcessList().hashCode();
        }
        if (getIndReadProcessList() != null) {
            _hashCode += getIndReadProcessList().hashCode();
        }
        if (getProcessCodesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessCodesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcessCodesList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProcessGroupId() != null) {
            _hashCode += getProcessGroupId().hashCode();
        }
        if (getProcessGroupName() != null) {
            _hashCode += getProcessGroupName().hashCode();
        }
        if (getProcessSummaryList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessSummaryList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcessSummaryList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProcessType() != null) {
            _hashCode += getProcessType().hashCode();
        }
        if (getProcessTypeName() != null) {
            _hashCode += getProcessTypeName().hashCode();
        }
        if (getQtyProcesses() != null) {
            _hashCode += getQtyProcesses().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CProcessGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indProcessGroupContainsProcessList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indProcessGroupContainsProcessList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indReadProcessList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indReadProcessList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processCodesList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processCodesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessCodes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessGroupId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processSummaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processSummaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("qtyProcesses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qtyProcesses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
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
