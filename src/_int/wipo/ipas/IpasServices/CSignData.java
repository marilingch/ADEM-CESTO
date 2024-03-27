/**
 * CSignData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CSignData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CLogo logo;

    private java.lang.String markName;

    private java.lang.String markNameInOtherLang;

    private java.lang.String markTranslation;

    private java.lang.String markTranslationInOtherLang;

    private java.lang.String markTransliteration;

    private java.lang.String markTransliterationInOtherLang;

    private java.lang.String seriesDescription;

    private java.lang.String signType;

    private _int.wipo.ipas.IpasServices.CSound sound;

    public CSignData() {
    }

    public CSignData(
           _int.wipo.ipas.IpasServices.CLogo logo,
           java.lang.String markName,
           java.lang.String markNameInOtherLang,
           java.lang.String markTranslation,
           java.lang.String markTranslationInOtherLang,
           java.lang.String markTransliteration,
           java.lang.String markTransliterationInOtherLang,
           java.lang.String seriesDescription,
           java.lang.String signType,
           _int.wipo.ipas.IpasServices.CSound sound) {
           this.logo = logo;
           this.markName = markName;
           this.markNameInOtherLang = markNameInOtherLang;
           this.markTranslation = markTranslation;
           this.markTranslationInOtherLang = markTranslationInOtherLang;
           this.markTransliteration = markTransliteration;
           this.markTransliterationInOtherLang = markTransliterationInOtherLang;
           this.seriesDescription = seriesDescription;
           this.signType = signType;
           this.sound = sound;
    }


    /**
     * Gets the logo value for this CSignData.
     * 
     * @return logo
     */
    public _int.wipo.ipas.IpasServices.CLogo getLogo() {
        return logo;
    }


    /**
     * Sets the logo value for this CSignData.
     * 
     * @param logo
     */
    public void setLogo(_int.wipo.ipas.IpasServices.CLogo logo) {
        this.logo = logo;
    }


    /**
     * Gets the markName value for this CSignData.
     * 
     * @return markName
     */
    public java.lang.String getMarkName() {
        return markName;
    }


    /**
     * Sets the markName value for this CSignData.
     * 
     * @param markName
     */
    public void setMarkName(java.lang.String markName) {
        this.markName = markName;
    }


    /**
     * Gets the markNameInOtherLang value for this CSignData.
     * 
     * @return markNameInOtherLang
     */
    public java.lang.String getMarkNameInOtherLang() {
        return markNameInOtherLang;
    }


    /**
     * Sets the markNameInOtherLang value for this CSignData.
     * 
     * @param markNameInOtherLang
     */
    public void setMarkNameInOtherLang(java.lang.String markNameInOtherLang) {
        this.markNameInOtherLang = markNameInOtherLang;
    }


    /**
     * Gets the markTranslation value for this CSignData.
     * 
     * @return markTranslation
     */
    public java.lang.String getMarkTranslation() {
        return markTranslation;
    }


    /**
     * Sets the markTranslation value for this CSignData.
     * 
     * @param markTranslation
     */
    public void setMarkTranslation(java.lang.String markTranslation) {
        this.markTranslation = markTranslation;
    }


    /**
     * Gets the markTranslationInOtherLang value for this CSignData.
     * 
     * @return markTranslationInOtherLang
     */
    public java.lang.String getMarkTranslationInOtherLang() {
        return markTranslationInOtherLang;
    }


    /**
     * Sets the markTranslationInOtherLang value for this CSignData.
     * 
     * @param markTranslationInOtherLang
     */
    public void setMarkTranslationInOtherLang(java.lang.String markTranslationInOtherLang) {
        this.markTranslationInOtherLang = markTranslationInOtherLang;
    }


    /**
     * Gets the markTransliteration value for this CSignData.
     * 
     * @return markTransliteration
     */
    public java.lang.String getMarkTransliteration() {
        return markTransliteration;
    }


    /**
     * Sets the markTransliteration value for this CSignData.
     * 
     * @param markTransliteration
     */
    public void setMarkTransliteration(java.lang.String markTransliteration) {
        this.markTransliteration = markTransliteration;
    }


    /**
     * Gets the markTransliterationInOtherLang value for this CSignData.
     * 
     * @return markTransliterationInOtherLang
     */
    public java.lang.String getMarkTransliterationInOtherLang() {
        return markTransliterationInOtherLang;
    }


    /**
     * Sets the markTransliterationInOtherLang value for this CSignData.
     * 
     * @param markTransliterationInOtherLang
     */
    public void setMarkTransliterationInOtherLang(java.lang.String markTransliterationInOtherLang) {
        this.markTransliterationInOtherLang = markTransliterationInOtherLang;
    }


    /**
     * Gets the seriesDescription value for this CSignData.
     * 
     * @return seriesDescription
     */
    public java.lang.String getSeriesDescription() {
        return seriesDescription;
    }


    /**
     * Sets the seriesDescription value for this CSignData.
     * 
     * @param seriesDescription
     */
    public void setSeriesDescription(java.lang.String seriesDescription) {
        this.seriesDescription = seriesDescription;
    }


    /**
     * Gets the signType value for this CSignData.
     * 
     * @return signType
     */
    public java.lang.String getSignType() {
        return signType;
    }


    /**
     * Sets the signType value for this CSignData.
     * 
     * @param signType
     */
    public void setSignType(java.lang.String signType) {
        this.signType = signType;
    }


    /**
     * Gets the sound value for this CSignData.
     * 
     * @return sound
     */
    public _int.wipo.ipas.IpasServices.CSound getSound() {
        return sound;
    }


    /**
     * Sets the sound value for this CSignData.
     * 
     * @param sound
     */
    public void setSound(_int.wipo.ipas.IpasServices.CSound sound) {
        this.sound = sound;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSignData)) return false;
        CSignData other = (CSignData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.logo==null && other.getLogo()==null) || 
             (this.logo!=null &&
              this.logo.equals(other.getLogo()))) &&
            ((this.markName==null && other.getMarkName()==null) || 
             (this.markName!=null &&
              this.markName.equals(other.getMarkName()))) &&
            ((this.markNameInOtherLang==null && other.getMarkNameInOtherLang()==null) || 
             (this.markNameInOtherLang!=null &&
              this.markNameInOtherLang.equals(other.getMarkNameInOtherLang()))) &&
            ((this.markTranslation==null && other.getMarkTranslation()==null) || 
             (this.markTranslation!=null &&
              this.markTranslation.equals(other.getMarkTranslation()))) &&
            ((this.markTranslationInOtherLang==null && other.getMarkTranslationInOtherLang()==null) || 
             (this.markTranslationInOtherLang!=null &&
              this.markTranslationInOtherLang.equals(other.getMarkTranslationInOtherLang()))) &&
            ((this.markTransliteration==null && other.getMarkTransliteration()==null) || 
             (this.markTransliteration!=null &&
              this.markTransliteration.equals(other.getMarkTransliteration()))) &&
            ((this.markTransliterationInOtherLang==null && other.getMarkTransliterationInOtherLang()==null) || 
             (this.markTransliterationInOtherLang!=null &&
              this.markTransliterationInOtherLang.equals(other.getMarkTransliterationInOtherLang()))) &&
            ((this.seriesDescription==null && other.getSeriesDescription()==null) || 
             (this.seriesDescription!=null &&
              this.seriesDescription.equals(other.getSeriesDescription()))) &&
            ((this.signType==null && other.getSignType()==null) || 
             (this.signType!=null &&
              this.signType.equals(other.getSignType()))) &&
            ((this.sound==null && other.getSound()==null) || 
             (this.sound!=null &&
              this.sound.equals(other.getSound())));
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
        if (getLogo() != null) {
            _hashCode += getLogo().hashCode();
        }
        if (getMarkName() != null) {
            _hashCode += getMarkName().hashCode();
        }
        if (getMarkNameInOtherLang() != null) {
            _hashCode += getMarkNameInOtherLang().hashCode();
        }
        if (getMarkTranslation() != null) {
            _hashCode += getMarkTranslation().hashCode();
        }
        if (getMarkTranslationInOtherLang() != null) {
            _hashCode += getMarkTranslationInOtherLang().hashCode();
        }
        if (getMarkTransliteration() != null) {
            _hashCode += getMarkTransliteration().hashCode();
        }
        if (getMarkTransliterationInOtherLang() != null) {
            _hashCode += getMarkTransliterationInOtherLang().hashCode();
        }
        if (getSeriesDescription() != null) {
            _hashCode += getSeriesDescription().hashCode();
        }
        if (getSignType() != null) {
            _hashCode += getSignType().hashCode();
        }
        if (getSound() != null) {
            _hashCode += getSound().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSignData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSignData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cLogo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markNameInOtherLang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markNameInOtherLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markTranslation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markTranslation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markTranslationInOtherLang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markTranslationInOtherLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markTransliteration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markTransliteration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markTransliterationInOtherLang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markTransliterationInOtherLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seriesDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seriesDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sound");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSound"));
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
