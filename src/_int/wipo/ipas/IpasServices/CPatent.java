/**
 * CPatent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CPatent  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CAnnuity[] annuityList;

    private _int.wipo.ipas.IpasServices.CAuthorshipData authorshipData;

    private _int.wipo.ipas.IpasServices.CFile file;

    private java.lang.Boolean indReadDrawingList;

    private java.lang.Boolean indReadWordfileTitle;

    private java.lang.Boolean patentContainsDrawingList;

    private java.lang.Boolean patentContainsWordfileTitle;

    private _int.wipo.ipas.IpasServices.CPatentExaminationData patentExaminationData;

    private _int.wipo.ipas.IpasServices.CPctApplicationData pctApplicationData;

    private _int.wipo.ipas.IpasServices.CRegionalApplData regionalApplData;

    private _int.wipo.ipas.IpasServices.IpasInteger rowVersion;

    private _int.wipo.ipas.IpasServices.CTechnicalData technicalData;

    public CPatent() {
    }

    public CPatent(
           _int.wipo.ipas.IpasServices.CAnnuity[] annuityList,
           _int.wipo.ipas.IpasServices.CAuthorshipData authorshipData,
           _int.wipo.ipas.IpasServices.CFile file,
           java.lang.Boolean indReadDrawingList,
           java.lang.Boolean indReadWordfileTitle,
           java.lang.Boolean patentContainsDrawingList,
           java.lang.Boolean patentContainsWordfileTitle,
           _int.wipo.ipas.IpasServices.CPatentExaminationData patentExaminationData,
           _int.wipo.ipas.IpasServices.CPctApplicationData pctApplicationData,
           _int.wipo.ipas.IpasServices.CRegionalApplData regionalApplData,
           _int.wipo.ipas.IpasServices.IpasInteger rowVersion,
           _int.wipo.ipas.IpasServices.CTechnicalData technicalData) {
           this.annuityList = annuityList;
           this.authorshipData = authorshipData;
           this.file = file;
           this.indReadDrawingList = indReadDrawingList;
           this.indReadWordfileTitle = indReadWordfileTitle;
           this.patentContainsDrawingList = patentContainsDrawingList;
           this.patentContainsWordfileTitle = patentContainsWordfileTitle;
           this.patentExaminationData = patentExaminationData;
           this.pctApplicationData = pctApplicationData;
           this.regionalApplData = regionalApplData;
           this.rowVersion = rowVersion;
           this.technicalData = technicalData;
    }


    /**
     * Gets the annuityList value for this CPatent.
     * 
     * @return annuityList
     */
    public _int.wipo.ipas.IpasServices.CAnnuity[] getAnnuityList() {
        return annuityList;
    }


    /**
     * Sets the annuityList value for this CPatent.
     * 
     * @param annuityList
     */
    public void setAnnuityList(_int.wipo.ipas.IpasServices.CAnnuity[] annuityList) {
        this.annuityList = annuityList;
    }

    public _int.wipo.ipas.IpasServices.CAnnuity getAnnuityList(int i) {
        return this.annuityList[i];
    }

    public void setAnnuityList(int i, _int.wipo.ipas.IpasServices.CAnnuity _value) {
        this.annuityList[i] = _value;
    }


    /**
     * Gets the authorshipData value for this CPatent.
     * 
     * @return authorshipData
     */
    public _int.wipo.ipas.IpasServices.CAuthorshipData getAuthorshipData() {
        return authorshipData;
    }


    /**
     * Sets the authorshipData value for this CPatent.
     * 
     * @param authorshipData
     */
    public void setAuthorshipData(_int.wipo.ipas.IpasServices.CAuthorshipData authorshipData) {
        this.authorshipData = authorshipData;
    }


    /**
     * Gets the file value for this CPatent.
     * 
     * @return file
     */
    public _int.wipo.ipas.IpasServices.CFile getFile() {
        return file;
    }


    /**
     * Sets the file value for this CPatent.
     * 
     * @param file
     */
    public void setFile(_int.wipo.ipas.IpasServices.CFile file) {
        this.file = file;
    }


    /**
     * Gets the indReadDrawingList value for this CPatent.
     * 
     * @return indReadDrawingList
     */
    public java.lang.Boolean getIndReadDrawingList() {
        return indReadDrawingList;
    }


    /**
     * Sets the indReadDrawingList value for this CPatent.
     * 
     * @param indReadDrawingList
     */
    public void setIndReadDrawingList(java.lang.Boolean indReadDrawingList) {
        this.indReadDrawingList = indReadDrawingList;
    }


    /**
     * Gets the indReadWordfileTitle value for this CPatent.
     * 
     * @return indReadWordfileTitle
     */
    public java.lang.Boolean getIndReadWordfileTitle() {
        return indReadWordfileTitle;
    }


    /**
     * Sets the indReadWordfileTitle value for this CPatent.
     * 
     * @param indReadWordfileTitle
     */
    public void setIndReadWordfileTitle(java.lang.Boolean indReadWordfileTitle) {
        this.indReadWordfileTitle = indReadWordfileTitle;
    }


    /**
     * Gets the patentContainsDrawingList value for this CPatent.
     * 
     * @return patentContainsDrawingList
     */
    public java.lang.Boolean getPatentContainsDrawingList() {
        return patentContainsDrawingList;
    }


    /**
     * Sets the patentContainsDrawingList value for this CPatent.
     * 
     * @param patentContainsDrawingList
     */
    public void setPatentContainsDrawingList(java.lang.Boolean patentContainsDrawingList) {
        this.patentContainsDrawingList = patentContainsDrawingList;
    }


    /**
     * Gets the patentContainsWordfileTitle value for this CPatent.
     * 
     * @return patentContainsWordfileTitle
     */
    public java.lang.Boolean getPatentContainsWordfileTitle() {
        return patentContainsWordfileTitle;
    }


    /**
     * Sets the patentContainsWordfileTitle value for this CPatent.
     * 
     * @param patentContainsWordfileTitle
     */
    public void setPatentContainsWordfileTitle(java.lang.Boolean patentContainsWordfileTitle) {
        this.patentContainsWordfileTitle = patentContainsWordfileTitle;
    }


    /**
     * Gets the patentExaminationData value for this CPatent.
     * 
     * @return patentExaminationData
     */
    public _int.wipo.ipas.IpasServices.CPatentExaminationData getPatentExaminationData() {
        return patentExaminationData;
    }


    /**
     * Sets the patentExaminationData value for this CPatent.
     * 
     * @param patentExaminationData
     */
    public void setPatentExaminationData(_int.wipo.ipas.IpasServices.CPatentExaminationData patentExaminationData) {
        this.patentExaminationData = patentExaminationData;
    }


    /**
     * Gets the pctApplicationData value for this CPatent.
     * 
     * @return pctApplicationData
     */
    public _int.wipo.ipas.IpasServices.CPctApplicationData getPctApplicationData() {
        return pctApplicationData;
    }


    /**
     * Sets the pctApplicationData value for this CPatent.
     * 
     * @param pctApplicationData
     */
    public void setPctApplicationData(_int.wipo.ipas.IpasServices.CPctApplicationData pctApplicationData) {
        this.pctApplicationData = pctApplicationData;
    }


    /**
     * Gets the regionalApplData value for this CPatent.
     * 
     * @return regionalApplData
     */
    public _int.wipo.ipas.IpasServices.CRegionalApplData getRegionalApplData() {
        return regionalApplData;
    }


    /**
     * Sets the regionalApplData value for this CPatent.
     * 
     * @param regionalApplData
     */
    public void setRegionalApplData(_int.wipo.ipas.IpasServices.CRegionalApplData regionalApplData) {
        this.regionalApplData = regionalApplData;
    }


    /**
     * Gets the rowVersion value for this CPatent.
     * 
     * @return rowVersion
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getRowVersion() {
        return rowVersion;
    }


    /**
     * Sets the rowVersion value for this CPatent.
     * 
     * @param rowVersion
     */
    public void setRowVersion(_int.wipo.ipas.IpasServices.IpasInteger rowVersion) {
        this.rowVersion = rowVersion;
    }


    /**
     * Gets the technicalData value for this CPatent.
     * 
     * @return technicalData
     */
    public _int.wipo.ipas.IpasServices.CTechnicalData getTechnicalData() {
        return technicalData;
    }


    /**
     * Sets the technicalData value for this CPatent.
     * 
     * @param technicalData
     */
    public void setTechnicalData(_int.wipo.ipas.IpasServices.CTechnicalData technicalData) {
        this.technicalData = technicalData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CPatent)) return false;
        CPatent other = (CPatent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.annuityList==null && other.getAnnuityList()==null) || 
             (this.annuityList!=null &&
              java.util.Arrays.equals(this.annuityList, other.getAnnuityList()))) &&
            ((this.authorshipData==null && other.getAuthorshipData()==null) || 
             (this.authorshipData!=null &&
              this.authorshipData.equals(other.getAuthorshipData()))) &&
            ((this.file==null && other.getFile()==null) || 
             (this.file!=null &&
              this.file.equals(other.getFile()))) &&
            ((this.indReadDrawingList==null && other.getIndReadDrawingList()==null) || 
             (this.indReadDrawingList!=null &&
              this.indReadDrawingList.equals(other.getIndReadDrawingList()))) &&
            ((this.indReadWordfileTitle==null && other.getIndReadWordfileTitle()==null) || 
             (this.indReadWordfileTitle!=null &&
              this.indReadWordfileTitle.equals(other.getIndReadWordfileTitle()))) &&
            ((this.patentContainsDrawingList==null && other.getPatentContainsDrawingList()==null) || 
             (this.patentContainsDrawingList!=null &&
              this.patentContainsDrawingList.equals(other.getPatentContainsDrawingList()))) &&
            ((this.patentContainsWordfileTitle==null && other.getPatentContainsWordfileTitle()==null) || 
             (this.patentContainsWordfileTitle!=null &&
              this.patentContainsWordfileTitle.equals(other.getPatentContainsWordfileTitle()))) &&
            ((this.patentExaminationData==null && other.getPatentExaminationData()==null) || 
             (this.patentExaminationData!=null &&
              this.patentExaminationData.equals(other.getPatentExaminationData()))) &&
            ((this.pctApplicationData==null && other.getPctApplicationData()==null) || 
             (this.pctApplicationData!=null &&
              this.pctApplicationData.equals(other.getPctApplicationData()))) &&
            ((this.regionalApplData==null && other.getRegionalApplData()==null) || 
             (this.regionalApplData!=null &&
              this.regionalApplData.equals(other.getRegionalApplData()))) &&
            ((this.rowVersion==null && other.getRowVersion()==null) || 
             (this.rowVersion!=null &&
              this.rowVersion.equals(other.getRowVersion()))) &&
            ((this.technicalData==null && other.getTechnicalData()==null) || 
             (this.technicalData!=null &&
              this.technicalData.equals(other.getTechnicalData())));
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
        if (getAnnuityList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnnuityList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnnuityList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthorshipData() != null) {
            _hashCode += getAuthorshipData().hashCode();
        }
        if (getFile() != null) {
            _hashCode += getFile().hashCode();
        }
        if (getIndReadDrawingList() != null) {
            _hashCode += getIndReadDrawingList().hashCode();
        }
        if (getIndReadWordfileTitle() != null) {
            _hashCode += getIndReadWordfileTitle().hashCode();
        }
        if (getPatentContainsDrawingList() != null) {
            _hashCode += getPatentContainsDrawingList().hashCode();
        }
        if (getPatentContainsWordfileTitle() != null) {
            _hashCode += getPatentContainsWordfileTitle().hashCode();
        }
        if (getPatentExaminationData() != null) {
            _hashCode += getPatentExaminationData().hashCode();
        }
        if (getPctApplicationData() != null) {
            _hashCode += getPctApplicationData().hashCode();
        }
        if (getRegionalApplData() != null) {
            _hashCode += getRegionalApplData().hashCode();
        }
        if (getRowVersion() != null) {
            _hashCode += getRowVersion().hashCode();
        }
        if (getTechnicalData() != null) {
            _hashCode += getTechnicalData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CPatent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPatent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annuityList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annuityList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAnnuity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorshipData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorshipData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cAuthorshipData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indReadDrawingList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indReadDrawingList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indReadWordfileTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indReadWordfileTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patentContainsDrawingList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "patentContainsDrawingList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patentContainsWordfileTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "patentContainsWordfileTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patentExaminationData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "patentExaminationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPatentExaminationData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pctApplicationData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pctApplicationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPctApplicationData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionalApplData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionalApplData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRegionalApplData"));
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
        elemField.setFieldName("technicalData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "technicalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cTechnicalData"));
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
