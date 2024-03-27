/**
 * CProcessCodes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CProcessCodes  implements java.io.Serializable {
    private java.lang.String documentIdAsString;

    private java.lang.String officedocIdAsString;

    private java.lang.String processIdAsString;

    private java.lang.String topFileIdAsString;

    public CProcessCodes() {
    }

    public CProcessCodes(
           java.lang.String documentIdAsString,
           java.lang.String officedocIdAsString,
           java.lang.String processIdAsString,
           java.lang.String topFileIdAsString) {
           this.documentIdAsString = documentIdAsString;
           this.officedocIdAsString = officedocIdAsString;
           this.processIdAsString = processIdAsString;
           this.topFileIdAsString = topFileIdAsString;
    }


    /**
     * Gets the documentIdAsString value for this CProcessCodes.
     * 
     * @return documentIdAsString
     */
    public java.lang.String getDocumentIdAsString() {
        return documentIdAsString;
    }


    /**
     * Sets the documentIdAsString value for this CProcessCodes.
     * 
     * @param documentIdAsString
     */
    public void setDocumentIdAsString(java.lang.String documentIdAsString) {
        this.documentIdAsString = documentIdAsString;
    }


    /**
     * Gets the officedocIdAsString value for this CProcessCodes.
     * 
     * @return officedocIdAsString
     */
    public java.lang.String getOfficedocIdAsString() {
        return officedocIdAsString;
    }


    /**
     * Sets the officedocIdAsString value for this CProcessCodes.
     * 
     * @param officedocIdAsString
     */
    public void setOfficedocIdAsString(java.lang.String officedocIdAsString) {
        this.officedocIdAsString = officedocIdAsString;
    }


    /**
     * Gets the processIdAsString value for this CProcessCodes.
     * 
     * @return processIdAsString
     */
    public java.lang.String getProcessIdAsString() {
        return processIdAsString;
    }


    /**
     * Sets the processIdAsString value for this CProcessCodes.
     * 
     * @param processIdAsString
     */
    public void setProcessIdAsString(java.lang.String processIdAsString) {
        this.processIdAsString = processIdAsString;
    }


    /**
     * Gets the topFileIdAsString value for this CProcessCodes.
     * 
     * @return topFileIdAsString
     */
    public java.lang.String getTopFileIdAsString() {
        return topFileIdAsString;
    }


    /**
     * Sets the topFileIdAsString value for this CProcessCodes.
     * 
     * @param topFileIdAsString
     */
    public void setTopFileIdAsString(java.lang.String topFileIdAsString) {
        this.topFileIdAsString = topFileIdAsString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CProcessCodes)) return false;
        CProcessCodes other = (CProcessCodes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentIdAsString==null && other.getDocumentIdAsString()==null) || 
             (this.documentIdAsString!=null &&
              this.documentIdAsString.equals(other.getDocumentIdAsString()))) &&
            ((this.officedocIdAsString==null && other.getOfficedocIdAsString()==null) || 
             (this.officedocIdAsString!=null &&
              this.officedocIdAsString.equals(other.getOfficedocIdAsString()))) &&
            ((this.processIdAsString==null && other.getProcessIdAsString()==null) || 
             (this.processIdAsString!=null &&
              this.processIdAsString.equals(other.getProcessIdAsString()))) &&
            ((this.topFileIdAsString==null && other.getTopFileIdAsString()==null) || 
             (this.topFileIdAsString!=null &&
              this.topFileIdAsString.equals(other.getTopFileIdAsString())));
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
        if (getDocumentIdAsString() != null) {
            _hashCode += getDocumentIdAsString().hashCode();
        }
        if (getOfficedocIdAsString() != null) {
            _hashCode += getOfficedocIdAsString().hashCode();
        }
        if (getProcessIdAsString() != null) {
            _hashCode += getProcessIdAsString().hashCode();
        }
        if (getTopFileIdAsString() != null) {
            _hashCode += getTopFileIdAsString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CProcessCodes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessCodes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentIdAsString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentIdAsString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officedocIdAsString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officedocIdAsString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processIdAsString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processIdAsString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topFileIdAsString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topFileIdAsString"));
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
