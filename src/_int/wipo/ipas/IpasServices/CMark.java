/**
 * CMark.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CMark  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CFile file;

    private java.lang.Boolean indReadLogo;

    private java.lang.Boolean indReadSound;

    private _int.wipo.ipas.IpasServices.CLimitationData limitationData;

    private _int.wipo.ipas.IpasServices.CMadridApplicationData madridApplicationData;

    private java.lang.Boolean markContainsLogo;

    private java.lang.Boolean markContainsSound;

    private _int.wipo.ipas.IpasServices.CProtectionData protectionData;

    private _int.wipo.ipas.IpasServices.IpasInteger rowVersion;

    private _int.wipo.ipas.IpasServices.CSignData signData;

    public CMark() {
    }

    public CMark(
           _int.wipo.ipas.IpasServices.CFile file,
           java.lang.Boolean indReadLogo,
           java.lang.Boolean indReadSound,
           _int.wipo.ipas.IpasServices.CLimitationData limitationData,
           _int.wipo.ipas.IpasServices.CMadridApplicationData madridApplicationData,
           java.lang.Boolean markContainsLogo,
           java.lang.Boolean markContainsSound,
           _int.wipo.ipas.IpasServices.CProtectionData protectionData,
           _int.wipo.ipas.IpasServices.IpasInteger rowVersion,
           _int.wipo.ipas.IpasServices.CSignData signData) {
           this.file = file;
           this.indReadLogo = indReadLogo;
           this.indReadSound = indReadSound;
           this.limitationData = limitationData;
           this.madridApplicationData = madridApplicationData;
           this.markContainsLogo = markContainsLogo;
           this.markContainsSound = markContainsSound;
           this.protectionData = protectionData;
           this.rowVersion = rowVersion;
           this.signData = signData;
    }


    /**
     * Gets the file value for this CMark.
     * 
     * @return file
     */
    public _int.wipo.ipas.IpasServices.CFile getFile() {
        return file;
    }


    /**
     * Sets the file value for this CMark.
     * 
     * @param file
     */
    public void setFile(_int.wipo.ipas.IpasServices.CFile file) {
        this.file = file;
    }


    /**
     * Gets the indReadLogo value for this CMark.
     * 
     * @return indReadLogo
     */
    public java.lang.Boolean getIndReadLogo() {
        return indReadLogo;
    }


    /**
     * Sets the indReadLogo value for this CMark.
     * 
     * @param indReadLogo
     */
    public void setIndReadLogo(java.lang.Boolean indReadLogo) {
        this.indReadLogo = indReadLogo;
    }


    /**
     * Gets the indReadSound value for this CMark.
     * 
     * @return indReadSound
     */
    public java.lang.Boolean getIndReadSound() {
        return indReadSound;
    }


    /**
     * Sets the indReadSound value for this CMark.
     * 
     * @param indReadSound
     */
    public void setIndReadSound(java.lang.Boolean indReadSound) {
        this.indReadSound = indReadSound;
    }


    /**
     * Gets the limitationData value for this CMark.
     * 
     * @return limitationData
     */
    public _int.wipo.ipas.IpasServices.CLimitationData getLimitationData() {
        return limitationData;
    }


    /**
     * Sets the limitationData value for this CMark.
     * 
     * @param limitationData
     */
    public void setLimitationData(_int.wipo.ipas.IpasServices.CLimitationData limitationData) {
        this.limitationData = limitationData;
    }


    /**
     * Gets the madridApplicationData value for this CMark.
     * 
     * @return madridApplicationData
     */
    public _int.wipo.ipas.IpasServices.CMadridApplicationData getMadridApplicationData() {
        return madridApplicationData;
    }


    /**
     * Sets the madridApplicationData value for this CMark.
     * 
     * @param madridApplicationData
     */
    public void setMadridApplicationData(_int.wipo.ipas.IpasServices.CMadridApplicationData madridApplicationData) {
        this.madridApplicationData = madridApplicationData;
    }


    /**
     * Gets the markContainsLogo value for this CMark.
     * 
     * @return markContainsLogo
     */
    public java.lang.Boolean getMarkContainsLogo() {
        return markContainsLogo;
    }


    /**
     * Sets the markContainsLogo value for this CMark.
     * 
     * @param markContainsLogo
     */
    public void setMarkContainsLogo(java.lang.Boolean markContainsLogo) {
        this.markContainsLogo = markContainsLogo;
    }


    /**
     * Gets the markContainsSound value for this CMark.
     * 
     * @return markContainsSound
     */
    public java.lang.Boolean getMarkContainsSound() {
        return markContainsSound;
    }


    /**
     * Sets the markContainsSound value for this CMark.
     * 
     * @param markContainsSound
     */
    public void setMarkContainsSound(java.lang.Boolean markContainsSound) {
        this.markContainsSound = markContainsSound;
    }


    /**
     * Gets the protectionData value for this CMark.
     * 
     * @return protectionData
     */
    public _int.wipo.ipas.IpasServices.CProtectionData getProtectionData() {
        return protectionData;
    }


    /**
     * Sets the protectionData value for this CMark.
     * 
     * @param protectionData
     */
    public void setProtectionData(_int.wipo.ipas.IpasServices.CProtectionData protectionData) {
        this.protectionData = protectionData;
    }


    /**
     * Gets the rowVersion value for this CMark.
     * 
     * @return rowVersion
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getRowVersion() {
        return rowVersion;
    }


    /**
     * Sets the rowVersion value for this CMark.
     * 
     * @param rowVersion
     */
    public void setRowVersion(_int.wipo.ipas.IpasServices.IpasInteger rowVersion) {
        this.rowVersion = rowVersion;
    }


    /**
     * Gets the signData value for this CMark.
     * 
     * @return signData
     */
    public _int.wipo.ipas.IpasServices.CSignData getSignData() {
        return signData;
    }


    /**
     * Sets the signData value for this CMark.
     * 
     * @param signData
     */
    public void setSignData(_int.wipo.ipas.IpasServices.CSignData signData) {
        this.signData = signData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CMark)) return false;
        CMark other = (CMark) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.file==null && other.getFile()==null) || 
             (this.file!=null &&
              this.file.equals(other.getFile()))) &&
            ((this.indReadLogo==null && other.getIndReadLogo()==null) || 
             (this.indReadLogo!=null &&
              this.indReadLogo.equals(other.getIndReadLogo()))) &&
            ((this.indReadSound==null && other.getIndReadSound()==null) || 
             (this.indReadSound!=null &&
              this.indReadSound.equals(other.getIndReadSound()))) &&
            ((this.limitationData==null && other.getLimitationData()==null) || 
             (this.limitationData!=null &&
              this.limitationData.equals(other.getLimitationData()))) &&
            ((this.madridApplicationData==null && other.getMadridApplicationData()==null) || 
             (this.madridApplicationData!=null &&
              this.madridApplicationData.equals(other.getMadridApplicationData()))) &&
            ((this.markContainsLogo==null && other.getMarkContainsLogo()==null) || 
             (this.markContainsLogo!=null &&
              this.markContainsLogo.equals(other.getMarkContainsLogo()))) &&
            ((this.markContainsSound==null && other.getMarkContainsSound()==null) || 
             (this.markContainsSound!=null &&
              this.markContainsSound.equals(other.getMarkContainsSound()))) &&
            ((this.protectionData==null && other.getProtectionData()==null) || 
             (this.protectionData!=null &&
              this.protectionData.equals(other.getProtectionData()))) &&
            ((this.rowVersion==null && other.getRowVersion()==null) || 
             (this.rowVersion!=null &&
              this.rowVersion.equals(other.getRowVersion()))) &&
            ((this.signData==null && other.getSignData()==null) || 
             (this.signData!=null &&
              this.signData.equals(other.getSignData())));
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
        if (getFile() != null) {
            _hashCode += getFile().hashCode();
        }
        if (getIndReadLogo() != null) {
            _hashCode += getIndReadLogo().hashCode();
        }
        if (getIndReadSound() != null) {
            _hashCode += getIndReadSound().hashCode();
        }
        if (getLimitationData() != null) {
            _hashCode += getLimitationData().hashCode();
        }
        if (getMadridApplicationData() != null) {
            _hashCode += getMadridApplicationData().hashCode();
        }
        if (getMarkContainsLogo() != null) {
            _hashCode += getMarkContainsLogo().hashCode();
        }
        if (getMarkContainsSound() != null) {
            _hashCode += getMarkContainsSound().hashCode();
        }
        if (getProtectionData() != null) {
            _hashCode += getProtectionData().hashCode();
        }
        if (getRowVersion() != null) {
            _hashCode += getRowVersion().hashCode();
        }
        if (getSignData() != null) {
            _hashCode += getSignData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CMark.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMark"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indReadLogo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indReadLogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indReadSound");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indReadSound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitationData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limitationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cLimitationData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("madridApplicationData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "madridApplicationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cMadridApplicationData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markContainsLogo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markContainsLogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markContainsSound");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markContainsSound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protectionData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protectionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProtectionData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cSignData"));
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
