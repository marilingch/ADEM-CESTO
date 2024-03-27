/**
 * CClaim.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CClaim  implements java.io.Serializable {
    private java.lang.String claimDescription;

    private java.lang.String claimEnglishDescription;

    private _int.wipo.ipas.IpasServices.IpasInteger claimNbr;

    public CClaim() {
    }

    public CClaim(
           java.lang.String claimDescription,
           java.lang.String claimEnglishDescription,
           _int.wipo.ipas.IpasServices.IpasInteger claimNbr) {
           this.claimDescription = claimDescription;
           this.claimEnglishDescription = claimEnglishDescription;
           this.claimNbr = claimNbr;
    }


    /**
     * Gets the claimDescription value for this CClaim.
     * 
     * @return claimDescription
     */
    public java.lang.String getClaimDescription() {
        return claimDescription;
    }


    /**
     * Sets the claimDescription value for this CClaim.
     * 
     * @param claimDescription
     */
    public void setClaimDescription(java.lang.String claimDescription) {
        this.claimDescription = claimDescription;
    }


    /**
     * Gets the claimEnglishDescription value for this CClaim.
     * 
     * @return claimEnglishDescription
     */
    public java.lang.String getClaimEnglishDescription() {
        return claimEnglishDescription;
    }


    /**
     * Sets the claimEnglishDescription value for this CClaim.
     * 
     * @param claimEnglishDescription
     */
    public void setClaimEnglishDescription(java.lang.String claimEnglishDescription) {
        this.claimEnglishDescription = claimEnglishDescription;
    }


    /**
     * Gets the claimNbr value for this CClaim.
     * 
     * @return claimNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getClaimNbr() {
        return claimNbr;
    }


    /**
     * Sets the claimNbr value for this CClaim.
     * 
     * @param claimNbr
     */
    public void setClaimNbr(_int.wipo.ipas.IpasServices.IpasInteger claimNbr) {
        this.claimNbr = claimNbr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CClaim)) return false;
        CClaim other = (CClaim) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claimDescription==null && other.getClaimDescription()==null) || 
             (this.claimDescription!=null &&
              this.claimDescription.equals(other.getClaimDescription()))) &&
            ((this.claimEnglishDescription==null && other.getClaimEnglishDescription()==null) || 
             (this.claimEnglishDescription!=null &&
              this.claimEnglishDescription.equals(other.getClaimEnglishDescription()))) &&
            ((this.claimNbr==null && other.getClaimNbr()==null) || 
             (this.claimNbr!=null &&
              this.claimNbr.equals(other.getClaimNbr())));
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
        if (getClaimDescription() != null) {
            _hashCode += getClaimDescription().hashCode();
        }
        if (getClaimEnglishDescription() != null) {
            _hashCode += getClaimEnglishDescription().hashCode();
        }
        if (getClaimNbr() != null) {
            _hashCode += getClaimNbr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CClaim.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cClaim"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "claimDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimEnglishDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "claimEnglishDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "claimNbr"));
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
