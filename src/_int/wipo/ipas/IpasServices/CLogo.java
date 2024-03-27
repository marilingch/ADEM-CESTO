/**
 * CLogo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CLogo  implements java.io.Serializable {
    private java.lang.String colourDescription;

    private java.lang.String colourDescriptionInOtherLang;

    private byte[] logoData;

    private java.lang.String logoType;

    private _int.wipo.ipas.IpasServices.CViennaClass[] viennaClassList;

    public CLogo() {
    }

    public CLogo(
           java.lang.String colourDescription,
           java.lang.String colourDescriptionInOtherLang,
           byte[] logoData,
           java.lang.String logoType,
           _int.wipo.ipas.IpasServices.CViennaClass[] viennaClassList) {
           this.colourDescription = colourDescription;
           this.colourDescriptionInOtherLang = colourDescriptionInOtherLang;
           this.logoData = logoData;
           this.logoType = logoType;
           this.viennaClassList = viennaClassList;
    }


    /**
     * Gets the colourDescription value for this CLogo.
     * 
     * @return colourDescription
     */
    public java.lang.String getColourDescription() {
        return colourDescription;
    }


    /**
     * Sets the colourDescription value for this CLogo.
     * 
     * @param colourDescription
     */
    public void setColourDescription(java.lang.String colourDescription) {
        this.colourDescription = colourDescription;
    }


    /**
     * Gets the colourDescriptionInOtherLang value for this CLogo.
     * 
     * @return colourDescriptionInOtherLang
     */
    public java.lang.String getColourDescriptionInOtherLang() {
        return colourDescriptionInOtherLang;
    }


    /**
     * Sets the colourDescriptionInOtherLang value for this CLogo.
     * 
     * @param colourDescriptionInOtherLang
     */
    public void setColourDescriptionInOtherLang(java.lang.String colourDescriptionInOtherLang) {
        this.colourDescriptionInOtherLang = colourDescriptionInOtherLang;
    }


    /**
     * Gets the logoData value for this CLogo.
     * 
     * @return logoData
     */
    public byte[] getLogoData() {
        return logoData;
    }


    /**
     * Sets the logoData value for this CLogo.
     * 
     * @param logoData
     */
    public void setLogoData(byte[] logoData) {
        this.logoData = logoData;
    }


    /**
     * Gets the logoType value for this CLogo.
     * 
     * @return logoType
     */
    public java.lang.String getLogoType() {
        return logoType;
    }


    /**
     * Sets the logoType value for this CLogo.
     * 
     * @param logoType
     */
    public void setLogoType(java.lang.String logoType) {
        this.logoType = logoType;
    }


    /**
     * Gets the viennaClassList value for this CLogo.
     * 
     * @return viennaClassList
     */
    public _int.wipo.ipas.IpasServices.CViennaClass[] getViennaClassList() {
        return viennaClassList;
    }


    /**
     * Sets the viennaClassList value for this CLogo.
     * 
     * @param viennaClassList
     */
    public void setViennaClassList(_int.wipo.ipas.IpasServices.CViennaClass[] viennaClassList) {
        this.viennaClassList = viennaClassList;
    }

    public _int.wipo.ipas.IpasServices.CViennaClass getViennaClassList(int i) {
        return this.viennaClassList[i];
    }

    public void setViennaClassList(int i, _int.wipo.ipas.IpasServices.CViennaClass _value) {
        this.viennaClassList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CLogo)) return false;
        CLogo other = (CLogo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.colourDescription==null && other.getColourDescription()==null) || 
             (this.colourDescription!=null &&
              this.colourDescription.equals(other.getColourDescription()))) &&
            ((this.colourDescriptionInOtherLang==null && other.getColourDescriptionInOtherLang()==null) || 
             (this.colourDescriptionInOtherLang!=null &&
              this.colourDescriptionInOtherLang.equals(other.getColourDescriptionInOtherLang()))) &&
            ((this.logoData==null && other.getLogoData()==null) || 
             (this.logoData!=null &&
              java.util.Arrays.equals(this.logoData, other.getLogoData()))) &&
            ((this.logoType==null && other.getLogoType()==null) || 
             (this.logoType!=null &&
              this.logoType.equals(other.getLogoType()))) &&
            ((this.viennaClassList==null && other.getViennaClassList()==null) || 
             (this.viennaClassList!=null &&
              java.util.Arrays.equals(this.viennaClassList, other.getViennaClassList())));
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
        if (getColourDescription() != null) {
            _hashCode += getColourDescription().hashCode();
        }
        if (getColourDescriptionInOtherLang() != null) {
            _hashCode += getColourDescriptionInOtherLang().hashCode();
        }
        if (getLogoData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogoData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogoData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogoType() != null) {
            _hashCode += getLogoType().hashCode();
        }
        if (getViennaClassList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getViennaClassList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getViennaClassList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CLogo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cLogo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colourDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colourDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colourDescriptionInOtherLang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colourDescriptionInOtherLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logoData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logoType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viennaClassList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viennaClassList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cViennaClass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
