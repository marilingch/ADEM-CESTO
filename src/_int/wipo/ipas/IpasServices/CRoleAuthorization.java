/**
 * CRoleAuthorization.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CRoleAuthorization  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasInteger authorisationCode;

    private java.lang.String authorisationType;

    private _int.wipo.ipas.IpasServices.IpasInteger groupId;

    private java.lang.String objectId;

    public CRoleAuthorization() {
    }

    public CRoleAuthorization(
           _int.wipo.ipas.IpasServices.IpasInteger authorisationCode,
           java.lang.String authorisationType,
           _int.wipo.ipas.IpasServices.IpasInteger groupId,
           java.lang.String objectId) {
           this.authorisationCode = authorisationCode;
           this.authorisationType = authorisationType;
           this.groupId = groupId;
           this.objectId = objectId;
    }


    /**
     * Gets the authorisationCode value for this CRoleAuthorization.
     * 
     * @return authorisationCode
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getAuthorisationCode() {
        return authorisationCode;
    }


    /**
     * Sets the authorisationCode value for this CRoleAuthorization.
     * 
     * @param authorisationCode
     */
    public void setAuthorisationCode(_int.wipo.ipas.IpasServices.IpasInteger authorisationCode) {
        this.authorisationCode = authorisationCode;
    }


    /**
     * Gets the authorisationType value for this CRoleAuthorization.
     * 
     * @return authorisationType
     */
    public java.lang.String getAuthorisationType() {
        return authorisationType;
    }


    /**
     * Sets the authorisationType value for this CRoleAuthorization.
     * 
     * @param authorisationType
     */
    public void setAuthorisationType(java.lang.String authorisationType) {
        this.authorisationType = authorisationType;
    }


    /**
     * Gets the groupId value for this CRoleAuthorization.
     * 
     * @return groupId
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this CRoleAuthorization.
     * 
     * @param groupId
     */
    public void setGroupId(_int.wipo.ipas.IpasServices.IpasInteger groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the objectId value for this CRoleAuthorization.
     * 
     * @return objectId
     */
    public java.lang.String getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this CRoleAuthorization.
     * 
     * @param objectId
     */
    public void setObjectId(java.lang.String objectId) {
        this.objectId = objectId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CRoleAuthorization)) return false;
        CRoleAuthorization other = (CRoleAuthorization) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authorisationCode==null && other.getAuthorisationCode()==null) || 
             (this.authorisationCode!=null &&
              this.authorisationCode.equals(other.getAuthorisationCode()))) &&
            ((this.authorisationType==null && other.getAuthorisationType()==null) || 
             (this.authorisationType!=null &&
              this.authorisationType.equals(other.getAuthorisationType()))) &&
            ((this.groupId==null && other.getGroupId()==null) || 
             (this.groupId!=null &&
              this.groupId.equals(other.getGroupId()))) &&
            ((this.objectId==null && other.getObjectId()==null) || 
             (this.objectId!=null &&
              this.objectId.equals(other.getObjectId())));
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
        if (getAuthorisationCode() != null) {
            _hashCode += getAuthorisationCode().hashCode();
        }
        if (getAuthorisationType() != null) {
            _hashCode += getAuthorisationType().hashCode();
        }
        if (getGroupId() != null) {
            _hashCode += getGroupId().hashCode();
        }
        if (getObjectId() != null) {
            _hashCode += getObjectId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CRoleAuthorization.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRoleAuthorization"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorisationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorisationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorisationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorisationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectId"));
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
