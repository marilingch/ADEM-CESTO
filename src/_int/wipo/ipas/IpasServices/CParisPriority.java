/**
 * CParisPriority.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CParisPriority  implements java.io.Serializable {
    private java.lang.String applicationId;

    private java.lang.String countryCode;

    private java.lang.String notes;

    private _int.wipo.ipas.IpasServices.IpasDateTime priorityDate;

    private _int.wipo.ipas.IpasServices.IpasInteger priorityStatus;

    public CParisPriority() {
    }

    public CParisPriority(
           java.lang.String applicationId,
           java.lang.String countryCode,
           java.lang.String notes,
           _int.wipo.ipas.IpasServices.IpasDateTime priorityDate,
           _int.wipo.ipas.IpasServices.IpasInteger priorityStatus) {
           this.applicationId = applicationId;
           this.countryCode = countryCode;
           this.notes = notes;
           this.priorityDate = priorityDate;
           this.priorityStatus = priorityStatus;
    }


    /**
     * Gets the applicationId value for this CParisPriority.
     * 
     * @return applicationId
     */
    public java.lang.String getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this CParisPriority.
     * 
     * @param applicationId
     */
    public void setApplicationId(java.lang.String applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * Gets the countryCode value for this CParisPriority.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this CParisPriority.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the notes value for this CParisPriority.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CParisPriority.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the priorityDate value for this CParisPriority.
     * 
     * @return priorityDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getPriorityDate() {
        return priorityDate;
    }


    /**
     * Sets the priorityDate value for this CParisPriority.
     * 
     * @param priorityDate
     */
    public void setPriorityDate(_int.wipo.ipas.IpasServices.IpasDateTime priorityDate) {
        this.priorityDate = priorityDate;
    }


    /**
     * Gets the priorityStatus value for this CParisPriority.
     * 
     * @return priorityStatus
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getPriorityStatus() {
        return priorityStatus;
    }


    /**
     * Sets the priorityStatus value for this CParisPriority.
     * 
     * @param priorityStatus
     */
    public void setPriorityStatus(_int.wipo.ipas.IpasServices.IpasInteger priorityStatus) {
        this.priorityStatus = priorityStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CParisPriority)) return false;
        CParisPriority other = (CParisPriority) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationId==null && other.getApplicationId()==null) || 
             (this.applicationId!=null &&
              this.applicationId.equals(other.getApplicationId()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.priorityDate==null && other.getPriorityDate()==null) || 
             (this.priorityDate!=null &&
              this.priorityDate.equals(other.getPriorityDate()))) &&
            ((this.priorityStatus==null && other.getPriorityStatus()==null) || 
             (this.priorityStatus!=null &&
              this.priorityStatus.equals(other.getPriorityStatus())));
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
        if (getApplicationId() != null) {
            _hashCode += getApplicationId().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getPriorityDate() != null) {
            _hashCode += getPriorityDate().hashCode();
        }
        if (getPriorityStatus() != null) {
            _hashCode += getPriorityStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CParisPriority.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cParisPriority"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("priorityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priorityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priorityStatus"));
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
