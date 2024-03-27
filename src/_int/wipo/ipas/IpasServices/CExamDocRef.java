/**
 * CExamDocRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CExamDocRef  implements java.io.Serializable {
    private java.lang.String refAffectedClaims;

    private java.lang.String refCategCode;

    private java.lang.String refDescription;

    private _int.wipo.ipas.IpasServices.IpasInteger refNbr;

    public CExamDocRef() {
    }

    public CExamDocRef(
           java.lang.String refAffectedClaims,
           java.lang.String refCategCode,
           java.lang.String refDescription,
           _int.wipo.ipas.IpasServices.IpasInteger refNbr) {
           this.refAffectedClaims = refAffectedClaims;
           this.refCategCode = refCategCode;
           this.refDescription = refDescription;
           this.refNbr = refNbr;
    }


    /**
     * Gets the refAffectedClaims value for this CExamDocRef.
     * 
     * @return refAffectedClaims
     */
    public java.lang.String getRefAffectedClaims() {
        return refAffectedClaims;
    }


    /**
     * Sets the refAffectedClaims value for this CExamDocRef.
     * 
     * @param refAffectedClaims
     */
    public void setRefAffectedClaims(java.lang.String refAffectedClaims) {
        this.refAffectedClaims = refAffectedClaims;
    }


    /**
     * Gets the refCategCode value for this CExamDocRef.
     * 
     * @return refCategCode
     */
    public java.lang.String getRefCategCode() {
        return refCategCode;
    }


    /**
     * Sets the refCategCode value for this CExamDocRef.
     * 
     * @param refCategCode
     */
    public void setRefCategCode(java.lang.String refCategCode) {
        this.refCategCode = refCategCode;
    }


    /**
     * Gets the refDescription value for this CExamDocRef.
     * 
     * @return refDescription
     */
    public java.lang.String getRefDescription() {
        return refDescription;
    }


    /**
     * Sets the refDescription value for this CExamDocRef.
     * 
     * @param refDescription
     */
    public void setRefDescription(java.lang.String refDescription) {
        this.refDescription = refDescription;
    }


    /**
     * Gets the refNbr value for this CExamDocRef.
     * 
     * @return refNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getRefNbr() {
        return refNbr;
    }


    /**
     * Sets the refNbr value for this CExamDocRef.
     * 
     * @param refNbr
     */
    public void setRefNbr(_int.wipo.ipas.IpasServices.IpasInteger refNbr) {
        this.refNbr = refNbr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CExamDocRef)) return false;
        CExamDocRef other = (CExamDocRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.refAffectedClaims==null && other.getRefAffectedClaims()==null) || 
             (this.refAffectedClaims!=null &&
              this.refAffectedClaims.equals(other.getRefAffectedClaims()))) &&
            ((this.refCategCode==null && other.getRefCategCode()==null) || 
             (this.refCategCode!=null &&
              this.refCategCode.equals(other.getRefCategCode()))) &&
            ((this.refDescription==null && other.getRefDescription()==null) || 
             (this.refDescription!=null &&
              this.refDescription.equals(other.getRefDescription()))) &&
            ((this.refNbr==null && other.getRefNbr()==null) || 
             (this.refNbr!=null &&
              this.refNbr.equals(other.getRefNbr())));
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
        if (getRefAffectedClaims() != null) {
            _hashCode += getRefAffectedClaims().hashCode();
        }
        if (getRefCategCode() != null) {
            _hashCode += getRefCategCode().hashCode();
        }
        if (getRefDescription() != null) {
            _hashCode += getRefDescription().hashCode();
        }
        if (getRefNbr() != null) {
            _hashCode += getRefNbr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CExamDocRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cExamDocRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refAffectedClaims");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refAffectedClaims"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refCategCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refCategCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refNbr"));
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
