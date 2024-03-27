/**
 * CLocarnoClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CLocarnoClass  implements java.io.Serializable {
    private java.lang.String locVersionCalculated;

    private java.lang.String locWpublishValidated;

    private _int.wipo.ipas.IpasServices.IpasInteger locarnoClassNbr;

    private java.lang.String locarnoEdition;

    private _int.wipo.ipas.IpasServices.IpasInteger locarnoSubclassNbr;

    public CLocarnoClass() {
    }

    public CLocarnoClass(
           java.lang.String locVersionCalculated,
           java.lang.String locWpublishValidated,
           _int.wipo.ipas.IpasServices.IpasInteger locarnoClassNbr,
           java.lang.String locarnoEdition,
           _int.wipo.ipas.IpasServices.IpasInteger locarnoSubclassNbr) {
           this.locVersionCalculated = locVersionCalculated;
           this.locWpublishValidated = locWpublishValidated;
           this.locarnoClassNbr = locarnoClassNbr;
           this.locarnoEdition = locarnoEdition;
           this.locarnoSubclassNbr = locarnoSubclassNbr;
    }


    /**
     * Gets the locVersionCalculated value for this CLocarnoClass.
     * 
     * @return locVersionCalculated
     */
    public java.lang.String getLocVersionCalculated() {
        return locVersionCalculated;
    }


    /**
     * Sets the locVersionCalculated value for this CLocarnoClass.
     * 
     * @param locVersionCalculated
     */
    public void setLocVersionCalculated(java.lang.String locVersionCalculated) {
        this.locVersionCalculated = locVersionCalculated;
    }


    /**
     * Gets the locWpublishValidated value for this CLocarnoClass.
     * 
     * @return locWpublishValidated
     */
    public java.lang.String getLocWpublishValidated() {
        return locWpublishValidated;
    }


    /**
     * Sets the locWpublishValidated value for this CLocarnoClass.
     * 
     * @param locWpublishValidated
     */
    public void setLocWpublishValidated(java.lang.String locWpublishValidated) {
        this.locWpublishValidated = locWpublishValidated;
    }


    /**
     * Gets the locarnoClassNbr value for this CLocarnoClass.
     * 
     * @return locarnoClassNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getLocarnoClassNbr() {
        return locarnoClassNbr;
    }


    /**
     * Sets the locarnoClassNbr value for this CLocarnoClass.
     * 
     * @param locarnoClassNbr
     */
    public void setLocarnoClassNbr(_int.wipo.ipas.IpasServices.IpasInteger locarnoClassNbr) {
        this.locarnoClassNbr = locarnoClassNbr;
    }


    /**
     * Gets the locarnoEdition value for this CLocarnoClass.
     * 
     * @return locarnoEdition
     */
    public java.lang.String getLocarnoEdition() {
        return locarnoEdition;
    }


    /**
     * Sets the locarnoEdition value for this CLocarnoClass.
     * 
     * @param locarnoEdition
     */
    public void setLocarnoEdition(java.lang.String locarnoEdition) {
        this.locarnoEdition = locarnoEdition;
    }


    /**
     * Gets the locarnoSubclassNbr value for this CLocarnoClass.
     * 
     * @return locarnoSubclassNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getLocarnoSubclassNbr() {
        return locarnoSubclassNbr;
    }


    /**
     * Sets the locarnoSubclassNbr value for this CLocarnoClass.
     * 
     * @param locarnoSubclassNbr
     */
    public void setLocarnoSubclassNbr(_int.wipo.ipas.IpasServices.IpasInteger locarnoSubclassNbr) {
        this.locarnoSubclassNbr = locarnoSubclassNbr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CLocarnoClass)) return false;
        CLocarnoClass other = (CLocarnoClass) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.locVersionCalculated==null && other.getLocVersionCalculated()==null) || 
             (this.locVersionCalculated!=null &&
              this.locVersionCalculated.equals(other.getLocVersionCalculated()))) &&
            ((this.locWpublishValidated==null && other.getLocWpublishValidated()==null) || 
             (this.locWpublishValidated!=null &&
              this.locWpublishValidated.equals(other.getLocWpublishValidated()))) &&
            ((this.locarnoClassNbr==null && other.getLocarnoClassNbr()==null) || 
             (this.locarnoClassNbr!=null &&
              this.locarnoClassNbr.equals(other.getLocarnoClassNbr()))) &&
            ((this.locarnoEdition==null && other.getLocarnoEdition()==null) || 
             (this.locarnoEdition!=null &&
              this.locarnoEdition.equals(other.getLocarnoEdition()))) &&
            ((this.locarnoSubclassNbr==null && other.getLocarnoSubclassNbr()==null) || 
             (this.locarnoSubclassNbr!=null &&
              this.locarnoSubclassNbr.equals(other.getLocarnoSubclassNbr())));
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
        if (getLocVersionCalculated() != null) {
            _hashCode += getLocVersionCalculated().hashCode();
        }
        if (getLocWpublishValidated() != null) {
            _hashCode += getLocWpublishValidated().hashCode();
        }
        if (getLocarnoClassNbr() != null) {
            _hashCode += getLocarnoClassNbr().hashCode();
        }
        if (getLocarnoEdition() != null) {
            _hashCode += getLocarnoEdition().hashCode();
        }
        if (getLocarnoSubclassNbr() != null) {
            _hashCode += getLocarnoSubclassNbr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CLocarnoClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cLocarnoClass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locVersionCalculated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locVersionCalculated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locWpublishValidated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locWpublishValidated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locarnoClassNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locarnoClassNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locarnoEdition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locarnoEdition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locarnoSubclassNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locarnoSubclassNbr"));
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
