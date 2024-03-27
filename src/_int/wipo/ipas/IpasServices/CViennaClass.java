/**
 * CViennaClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CViennaClass  implements java.io.Serializable {
    private java.lang.String vclWpublishValidated;

    private _int.wipo.ipas.IpasServices.IpasInteger viennaCategory;

    private java.lang.String viennaDescription;

    private _int.wipo.ipas.IpasServices.IpasInteger viennaDivision;

    private _int.wipo.ipas.IpasServices.IpasInteger viennaSection;

    private java.lang.String viennaVersion;

    private java.lang.String viennaVersionCalculated;

    public CViennaClass() {
    }

    public CViennaClass(
           java.lang.String vclWpublishValidated,
           _int.wipo.ipas.IpasServices.IpasInteger viennaCategory,
           java.lang.String viennaDescription,
           _int.wipo.ipas.IpasServices.IpasInteger viennaDivision,
           _int.wipo.ipas.IpasServices.IpasInteger viennaSection,
           java.lang.String viennaVersion,
           java.lang.String viennaVersionCalculated) {
           this.vclWpublishValidated = vclWpublishValidated;
           this.viennaCategory = viennaCategory;
           this.viennaDescription = viennaDescription;
           this.viennaDivision = viennaDivision;
           this.viennaSection = viennaSection;
           this.viennaVersion = viennaVersion;
           this.viennaVersionCalculated = viennaVersionCalculated;
    }


    /**
     * Gets the vclWpublishValidated value for this CViennaClass.
     * 
     * @return vclWpublishValidated
     */
    public java.lang.String getVclWpublishValidated() {
        return vclWpublishValidated;
    }


    /**
     * Sets the vclWpublishValidated value for this CViennaClass.
     * 
     * @param vclWpublishValidated
     */
    public void setVclWpublishValidated(java.lang.String vclWpublishValidated) {
        this.vclWpublishValidated = vclWpublishValidated;
    }


    /**
     * Gets the viennaCategory value for this CViennaClass.
     * 
     * @return viennaCategory
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getViennaCategory() {
        return viennaCategory;
    }


    /**
     * Sets the viennaCategory value for this CViennaClass.
     * 
     * @param viennaCategory
     */
    public void setViennaCategory(_int.wipo.ipas.IpasServices.IpasInteger viennaCategory) {
        this.viennaCategory = viennaCategory;
    }


    /**
     * Gets the viennaDescription value for this CViennaClass.
     * 
     * @return viennaDescription
     */
    public java.lang.String getViennaDescription() {
        return viennaDescription;
    }


    /**
     * Sets the viennaDescription value for this CViennaClass.
     * 
     * @param viennaDescription
     */
    public void setViennaDescription(java.lang.String viennaDescription) {
        this.viennaDescription = viennaDescription;
    }


    /**
     * Gets the viennaDivision value for this CViennaClass.
     * 
     * @return viennaDivision
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getViennaDivision() {
        return viennaDivision;
    }


    /**
     * Sets the viennaDivision value for this CViennaClass.
     * 
     * @param viennaDivision
     */
    public void setViennaDivision(_int.wipo.ipas.IpasServices.IpasInteger viennaDivision) {
        this.viennaDivision = viennaDivision;
    }


    /**
     * Gets the viennaSection value for this CViennaClass.
     * 
     * @return viennaSection
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getViennaSection() {
        return viennaSection;
    }


    /**
     * Sets the viennaSection value for this CViennaClass.
     * 
     * @param viennaSection
     */
    public void setViennaSection(_int.wipo.ipas.IpasServices.IpasInteger viennaSection) {
        this.viennaSection = viennaSection;
    }


    /**
     * Gets the viennaVersion value for this CViennaClass.
     * 
     * @return viennaVersion
     */
    public java.lang.String getViennaVersion() {
        return viennaVersion;
    }


    /**
     * Sets the viennaVersion value for this CViennaClass.
     * 
     * @param viennaVersion
     */
    public void setViennaVersion(java.lang.String viennaVersion) {
        this.viennaVersion = viennaVersion;
    }


    /**
     * Gets the viennaVersionCalculated value for this CViennaClass.
     * 
     * @return viennaVersionCalculated
     */
    public java.lang.String getViennaVersionCalculated() {
        return viennaVersionCalculated;
    }


    /**
     * Sets the viennaVersionCalculated value for this CViennaClass.
     * 
     * @param viennaVersionCalculated
     */
    public void setViennaVersionCalculated(java.lang.String viennaVersionCalculated) {
        this.viennaVersionCalculated = viennaVersionCalculated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CViennaClass)) return false;
        CViennaClass other = (CViennaClass) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vclWpublishValidated==null && other.getVclWpublishValidated()==null) || 
             (this.vclWpublishValidated!=null &&
              this.vclWpublishValidated.equals(other.getVclWpublishValidated()))) &&
            ((this.viennaCategory==null && other.getViennaCategory()==null) || 
             (this.viennaCategory!=null &&
              this.viennaCategory.equals(other.getViennaCategory()))) &&
            ((this.viennaDescription==null && other.getViennaDescription()==null) || 
             (this.viennaDescription!=null &&
              this.viennaDescription.equals(other.getViennaDescription()))) &&
            ((this.viennaDivision==null && other.getViennaDivision()==null) || 
             (this.viennaDivision!=null &&
              this.viennaDivision.equals(other.getViennaDivision()))) &&
            ((this.viennaSection==null && other.getViennaSection()==null) || 
             (this.viennaSection!=null &&
              this.viennaSection.equals(other.getViennaSection()))) &&
            ((this.viennaVersion==null && other.getViennaVersion()==null) || 
             (this.viennaVersion!=null &&
              this.viennaVersion.equals(other.getViennaVersion()))) &&
            ((this.viennaVersionCalculated==null && other.getViennaVersionCalculated()==null) || 
             (this.viennaVersionCalculated!=null &&
              this.viennaVersionCalculated.equals(other.getViennaVersionCalculated())));
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
        if (getVclWpublishValidated() != null) {
            _hashCode += getVclWpublishValidated().hashCode();
        }
        if (getViennaCategory() != null) {
            _hashCode += getViennaCategory().hashCode();
        }
        if (getViennaDescription() != null) {
            _hashCode += getViennaDescription().hashCode();
        }
        if (getViennaDivision() != null) {
            _hashCode += getViennaDivision().hashCode();
        }
        if (getViennaSection() != null) {
            _hashCode += getViennaSection().hashCode();
        }
        if (getViennaVersion() != null) {
            _hashCode += getViennaVersion().hashCode();
        }
        if (getViennaVersionCalculated() != null) {
            _hashCode += getViennaVersionCalculated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CViennaClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cViennaClass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vclWpublishValidated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vclWpublishValidated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viennaCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viennaCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viennaDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viennaDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viennaDivision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viennaDivision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viennaSection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viennaSection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viennaVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viennaVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viennaVersionCalculated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viennaVersionCalculated"));
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
