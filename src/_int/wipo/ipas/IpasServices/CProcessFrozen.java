/**
 * CProcessFrozen.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CProcessFrozen  implements java.io.Serializable {
    private java.lang.String frozenProcessDescription;

    private _int.wipo.ipas.IpasServices.CProcessId frozenProcessId;

    private java.lang.Boolean indContinueWhenEnd;

    private java.lang.Boolean indNoOfficedoc;

    public CProcessFrozen() {
    }

    public CProcessFrozen(
           java.lang.String frozenProcessDescription,
           _int.wipo.ipas.IpasServices.CProcessId frozenProcessId,
           java.lang.Boolean indContinueWhenEnd,
           java.lang.Boolean indNoOfficedoc) {
           this.frozenProcessDescription = frozenProcessDescription;
           this.frozenProcessId = frozenProcessId;
           this.indContinueWhenEnd = indContinueWhenEnd;
           this.indNoOfficedoc = indNoOfficedoc;
    }


    /**
     * Gets the frozenProcessDescription value for this CProcessFrozen.
     * 
     * @return frozenProcessDescription
     */
    public java.lang.String getFrozenProcessDescription() {
        return frozenProcessDescription;
    }


    /**
     * Sets the frozenProcessDescription value for this CProcessFrozen.
     * 
     * @param frozenProcessDescription
     */
    public void setFrozenProcessDescription(java.lang.String frozenProcessDescription) {
        this.frozenProcessDescription = frozenProcessDescription;
    }


    /**
     * Gets the frozenProcessId value for this CProcessFrozen.
     * 
     * @return frozenProcessId
     */
    public _int.wipo.ipas.IpasServices.CProcessId getFrozenProcessId() {
        return frozenProcessId;
    }


    /**
     * Sets the frozenProcessId value for this CProcessFrozen.
     * 
     * @param frozenProcessId
     */
    public void setFrozenProcessId(_int.wipo.ipas.IpasServices.CProcessId frozenProcessId) {
        this.frozenProcessId = frozenProcessId;
    }


    /**
     * Gets the indContinueWhenEnd value for this CProcessFrozen.
     * 
     * @return indContinueWhenEnd
     */
    public java.lang.Boolean getIndContinueWhenEnd() {
        return indContinueWhenEnd;
    }


    /**
     * Sets the indContinueWhenEnd value for this CProcessFrozen.
     * 
     * @param indContinueWhenEnd
     */
    public void setIndContinueWhenEnd(java.lang.Boolean indContinueWhenEnd) {
        this.indContinueWhenEnd = indContinueWhenEnd;
    }


    /**
     * Gets the indNoOfficedoc value for this CProcessFrozen.
     * 
     * @return indNoOfficedoc
     */
    public java.lang.Boolean getIndNoOfficedoc() {
        return indNoOfficedoc;
    }


    /**
     * Sets the indNoOfficedoc value for this CProcessFrozen.
     * 
     * @param indNoOfficedoc
     */
    public void setIndNoOfficedoc(java.lang.Boolean indNoOfficedoc) {
        this.indNoOfficedoc = indNoOfficedoc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CProcessFrozen)) return false;
        CProcessFrozen other = (CProcessFrozen) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.frozenProcessDescription==null && other.getFrozenProcessDescription()==null) || 
             (this.frozenProcessDescription!=null &&
              this.frozenProcessDescription.equals(other.getFrozenProcessDescription()))) &&
            ((this.frozenProcessId==null && other.getFrozenProcessId()==null) || 
             (this.frozenProcessId!=null &&
              this.frozenProcessId.equals(other.getFrozenProcessId()))) &&
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
        if (getFrozenProcessDescription() != null) {
            _hashCode += getFrozenProcessDescription().hashCode();
        }
        if (getFrozenProcessId() != null) {
            _hashCode += getFrozenProcessId().hashCode();
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
        new org.apache.axis.description.TypeDesc(CProcessFrozen.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessFrozen"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frozenProcessDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frozenProcessDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frozenProcessId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frozenProcessId"));
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
