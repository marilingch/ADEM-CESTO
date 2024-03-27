/**
 * CProcessFreezing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CProcessFreezing  implements java.io.Serializable {
    private java.lang.String freezingProcessDescription;

    private _int.wipo.ipas.IpasServices.CProcessId freezingProcessId;

    private java.lang.Boolean indContinueWhenEnd;

    private java.lang.Boolean indNoOfficedoc;

    public CProcessFreezing() {
    }

    public CProcessFreezing(
           java.lang.String freezingProcessDescription,
           _int.wipo.ipas.IpasServices.CProcessId freezingProcessId,
           java.lang.Boolean indContinueWhenEnd,
           java.lang.Boolean indNoOfficedoc) {
           this.freezingProcessDescription = freezingProcessDescription;
           this.freezingProcessId = freezingProcessId;
           this.indContinueWhenEnd = indContinueWhenEnd;
           this.indNoOfficedoc = indNoOfficedoc;
    }


    /**
     * Gets the freezingProcessDescription value for this CProcessFreezing.
     * 
     * @return freezingProcessDescription
     */
    public java.lang.String getFreezingProcessDescription() {
        return freezingProcessDescription;
    }


    /**
     * Sets the freezingProcessDescription value for this CProcessFreezing.
     * 
     * @param freezingProcessDescription
     */
    public void setFreezingProcessDescription(java.lang.String freezingProcessDescription) {
        this.freezingProcessDescription = freezingProcessDescription;
    }


    /**
     * Gets the freezingProcessId value for this CProcessFreezing.
     * 
     * @return freezingProcessId
     */
    public _int.wipo.ipas.IpasServices.CProcessId getFreezingProcessId() {
        return freezingProcessId;
    }


    /**
     * Sets the freezingProcessId value for this CProcessFreezing.
     * 
     * @param freezingProcessId
     */
    public void setFreezingProcessId(_int.wipo.ipas.IpasServices.CProcessId freezingProcessId) {
        this.freezingProcessId = freezingProcessId;
    }


    /**
     * Gets the indContinueWhenEnd value for this CProcessFreezing.
     * 
     * @return indContinueWhenEnd
     */
    public java.lang.Boolean getIndContinueWhenEnd() {
        return indContinueWhenEnd;
    }


    /**
     * Sets the indContinueWhenEnd value for this CProcessFreezing.
     * 
     * @param indContinueWhenEnd
     */
    public void setIndContinueWhenEnd(java.lang.Boolean indContinueWhenEnd) {
        this.indContinueWhenEnd = indContinueWhenEnd;
    }


    /**
     * Gets the indNoOfficedoc value for this CProcessFreezing.
     * 
     * @return indNoOfficedoc
     */
    public java.lang.Boolean getIndNoOfficedoc() {
        return indNoOfficedoc;
    }


    /**
     * Sets the indNoOfficedoc value for this CProcessFreezing.
     * 
     * @param indNoOfficedoc
     */
    public void setIndNoOfficedoc(java.lang.Boolean indNoOfficedoc) {
        this.indNoOfficedoc = indNoOfficedoc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CProcessFreezing)) return false;
        CProcessFreezing other = (CProcessFreezing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.freezingProcessDescription==null && other.getFreezingProcessDescription()==null) || 
             (this.freezingProcessDescription!=null &&
              this.freezingProcessDescription.equals(other.getFreezingProcessDescription()))) &&
            ((this.freezingProcessId==null && other.getFreezingProcessId()==null) || 
             (this.freezingProcessId!=null &&
              this.freezingProcessId.equals(other.getFreezingProcessId()))) &&
            ((this.indContinueWhenEnd==null && other.getIndContinueWhenEnd()==null) || 
             (this.indContinueWhenEnd!=null &&
              this.indContinueWhenEnd.equals(other.getIndContinueWhenEnd()))) &&
            ((this.indNoOfficedoc==null && other.getIndNoOfficedoc()==null) || 
             (this.indNoOfficedoc!=null &&
              this.indNoOfficedoc.equals(other.getIndNoOfficedoc())));
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
        if (getFreezingProcessDescription() != null) {
            _hashCode += getFreezingProcessDescription().hashCode();
        }
        if (getFreezingProcessId() != null) {
            _hashCode += getFreezingProcessId().hashCode();
        }
        if (getIndContinueWhenEnd() != null) {
            _hashCode += getIndContinueWhenEnd().hashCode();
        }
        if (getIndNoOfficedoc() != null) {
            _hashCode += getIndNoOfficedoc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CProcessFreezing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessFreezing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freezingProcessDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freezingProcessDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freezingProcessId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freezingProcessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indContinueWhenEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indContinueWhenEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indNoOfficedoc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indNoOfficedoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
