/**
 * CLimitationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CLimitationData  implements java.io.Serializable {
    private java.lang.String byConsent;

    private java.lang.String disclaimer;

    private java.lang.String disclaimerInOtherLang;

    private java.lang.String regulations;

    public CLimitationData() {
    }

    public CLimitationData(
           java.lang.String byConsent,
           java.lang.String disclaimer,
           java.lang.String disclaimerInOtherLang,
           java.lang.String regulations) {
           this.byConsent = byConsent;
           this.disclaimer = disclaimer;
           this.disclaimerInOtherLang = disclaimerInOtherLang;
           this.regulations = regulations;
    }


    /**
     * Gets the byConsent value for this CLimitationData.
     * 
     * @return byConsent
     */
    public java.lang.String getByConsent() {
        return byConsent;
    }


    /**
     * Sets the byConsent value for this CLimitationData.
     * 
     * @param byConsent
     */
    public void setByConsent(java.lang.String byConsent) {
        this.byConsent = byConsent;
    }


    /**
     * Gets the disclaimer value for this CLimitationData.
     * 
     * @return disclaimer
     */
    public java.lang.String getDisclaimer() {
        return disclaimer;
    }


    /**
     * Sets the disclaimer value for this CLimitationData.
     * 
     * @param disclaimer
     */
    public void setDisclaimer(java.lang.String disclaimer) {
        this.disclaimer = disclaimer;
    }


    /**
     * Gets the disclaimerInOtherLang value for this CLimitationData.
     * 
     * @return disclaimerInOtherLang
     */
    public java.lang.String getDisclaimerInOtherLang() {
        return disclaimerInOtherLang;
    }


    /**
     * Sets the disclaimerInOtherLang value for this CLimitationData.
     * 
     * @param disclaimerInOtherLang
     */
    public void setDisclaimerInOtherLang(java.lang.String disclaimerInOtherLang) {
        this.disclaimerInOtherLang = disclaimerInOtherLang;
    }


    /**
     * Gets the regulations value for this CLimitationData.
     * 
     * @return regulations
     */
    public java.lang.String getRegulations() {
        return regulations;
    }


    /**
     * Sets the regulations value for this CLimitationData.
     * 
     * @param regulations
     */
    public void setRegulations(java.lang.String regulations) {
        this.regulations = regulations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CLimitationData)) return false;
        CLimitationData other = (CLimitationData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.byConsent==null && other.getByConsent()==null) || 
             (this.byConsent!=null &&
              this.byConsent.equals(other.getByConsent()))) &&
            ((this.disclaimer==null && other.getDisclaimer()==null) || 
             (this.disclaimer!=null &&
              this.disclaimer.equals(other.getDisclaimer()))) &&
            ((this.disclaimerInOtherLang==null && other.getDisclaimerInOtherLang()==null) || 
             (this.disclaimerInOtherLang!=null &&
              this.disclaimerInOtherLang.equals(other.getDisclaimerInOtherLang()))) &&
            ((this.regulations==null && other.getRegulations()==null) || 
             (this.regulations!=null &&
              this.regulations.equals(other.getRegulations())));
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
        if (getByConsent() != null) {
            _hashCode += getByConsent().hashCode();
        }
        if (getDisclaimer() != null) {
            _hashCode += getDisclaimer().hashCode();
        }
        if (getDisclaimerInOtherLang() != null) {
            _hashCode += getDisclaimerInOtherLang().hashCode();
        }
        if (getRegulations() != null) {
            _hashCode += getRegulations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CLimitationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cLimitationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byConsent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "byConsent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disclaimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disclaimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disclaimerInOtherLang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disclaimerInOtherLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regulations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regulations"));
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
