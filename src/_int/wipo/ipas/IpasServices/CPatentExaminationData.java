/**
 * CPatentExaminationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CPatentExaminationData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CExamDocRef[] examDocRefList;

    private java.lang.String examResult;

    private java.lang.Boolean indExamIndustrial;

    private java.lang.Boolean indExamInventive;

    private java.lang.Boolean indExamNovelty;

    private java.lang.String usedIpcDescription;

    private java.lang.String usedKeywordDescription;

    public CPatentExaminationData() {
    }

    public CPatentExaminationData(
           _int.wipo.ipas.IpasServices.CExamDocRef[] examDocRefList,
           java.lang.String examResult,
           java.lang.Boolean indExamIndustrial,
           java.lang.Boolean indExamInventive,
           java.lang.Boolean indExamNovelty,
           java.lang.String usedIpcDescription,
           java.lang.String usedKeywordDescription) {
           this.examDocRefList = examDocRefList;
           this.examResult = examResult;
           this.indExamIndustrial = indExamIndustrial;
           this.indExamInventive = indExamInventive;
           this.indExamNovelty = indExamNovelty;
           this.usedIpcDescription = usedIpcDescription;
           this.usedKeywordDescription = usedKeywordDescription;
    }


    /**
     * Gets the examDocRefList value for this CPatentExaminationData.
     * 
     * @return examDocRefList
     */
    public _int.wipo.ipas.IpasServices.CExamDocRef[] getExamDocRefList() {
        return examDocRefList;
    }


    /**
     * Sets the examDocRefList value for this CPatentExaminationData.
     * 
     * @param examDocRefList
     */
    public void setExamDocRefList(_int.wipo.ipas.IpasServices.CExamDocRef[] examDocRefList) {
        this.examDocRefList = examDocRefList;
    }

    public _int.wipo.ipas.IpasServices.CExamDocRef getExamDocRefList(int i) {
        return this.examDocRefList[i];
    }

    public void setExamDocRefList(int i, _int.wipo.ipas.IpasServices.CExamDocRef _value) {
        this.examDocRefList[i] = _value;
    }


    /**
     * Gets the examResult value for this CPatentExaminationData.
     * 
     * @return examResult
     */
    public java.lang.String getExamResult() {
        return examResult;
    }


    /**
     * Sets the examResult value for this CPatentExaminationData.
     * 
     * @param examResult
     */
    public void setExamResult(java.lang.String examResult) {
        this.examResult = examResult;
    }


    /**
     * Gets the indExamIndustrial value for this CPatentExaminationData.
     * 
     * @return indExamIndustrial
     */
    public java.lang.Boolean getIndExamIndustrial() {
        return indExamIndustrial;
    }


    /**
     * Sets the indExamIndustrial value for this CPatentExaminationData.
     * 
     * @param indExamIndustrial
     */
    public void setIndExamIndustrial(java.lang.Boolean indExamIndustrial) {
        this.indExamIndustrial = indExamIndustrial;
    }


    /**
     * Gets the indExamInventive value for this CPatentExaminationData.
     * 
     * @return indExamInventive
     */
    public java.lang.Boolean getIndExamInventive() {
        return indExamInventive;
    }


    /**
     * Sets the indExamInventive value for this CPatentExaminationData.
     * 
     * @param indExamInventive
     */
    public void setIndExamInventive(java.lang.Boolean indExamInventive) {
        this.indExamInventive = indExamInventive;
    }


    /**
     * Gets the indExamNovelty value for this CPatentExaminationData.
     * 
     * @return indExamNovelty
     */
    public java.lang.Boolean getIndExamNovelty() {
        return indExamNovelty;
    }


    /**
     * Sets the indExamNovelty value for this CPatentExaminationData.
     * 
     * @param indExamNovelty
     */
    public void setIndExamNovelty(java.lang.Boolean indExamNovelty) {
        this.indExamNovelty = indExamNovelty;
    }


    /**
     * Gets the usedIpcDescription value for this CPatentExaminationData.
     * 
     * @return usedIpcDescription
     */
    public java.lang.String getUsedIpcDescription() {
        return usedIpcDescription;
    }


    /**
     * Sets the usedIpcDescription value for this CPatentExaminationData.
     * 
     * @param usedIpcDescription
     */
    public void setUsedIpcDescription(java.lang.String usedIpcDescription) {
        this.usedIpcDescription = usedIpcDescription;
    }


    /**
     * Gets the usedKeywordDescription value for this CPatentExaminationData.
     * 
     * @return usedKeywordDescription
     */
    public java.lang.String getUsedKeywordDescription() {
        return usedKeywordDescription;
    }


    /**
     * Sets the usedKeywordDescription value for this CPatentExaminationData.
     * 
     * @param usedKeywordDescription
     */
    public void setUsedKeywordDescription(java.lang.String usedKeywordDescription) {
        this.usedKeywordDescription = usedKeywordDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CPatentExaminationData)) return false;
        CPatentExaminationData other = (CPatentExaminationData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.examDocRefList==null && other.getExamDocRefList()==null) || 
             (this.examDocRefList!=null &&
              java.util.Arrays.equals(this.examDocRefList, other.getExamDocRefList()))) &&
            ((this.examResult==null && other.getExamResult()==null) || 
             (this.examResult!=null &&
              this.examResult.equals(other.getExamResult()))) &&
            ((this.indExamIndustrial==null && other.getIndExamIndustrial()==null) || 
             (this.indExamIndustrial!=null &&
              this.indExamIndustrial.equals(other.getIndExamIndustrial()))) &&
            ((this.indExamInventive==null && other.getIndExamInventive()==null) || 
             (this.indExamInventive!=null &&
              this.indExamInventive.equals(other.getIndExamInventive()))) &&
            ((this.indExamNovelty==null && other.getIndExamNovelty()==null) || 
             (this.indExamNovelty!=null &&
              this.indExamNovelty.equals(other.getIndExamNovelty()))) &&
            ((this.usedIpcDescription==null && other.getUsedIpcDescription()==null) || 
             (this.usedIpcDescription!=null &&
              this.usedIpcDescription.equals(other.getUsedIpcDescription()))) &&
            ((this.usedKeywordDescription==null && other.getUsedKeywordDescription()==null) || 
             (this.usedKeywordDescription!=null &&
              this.usedKeywordDescription.equals(other.getUsedKeywordDescription())));
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
        if (getExamDocRefList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExamDocRefList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExamDocRefList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExamResult() != null) {
            _hashCode += getExamResult().hashCode();
        }
        if (getIndExamIndustrial() != null) {
            _hashCode += getIndExamIndustrial().hashCode();
        }
        if (getIndExamInventive() != null) {
            _hashCode += getIndExamInventive().hashCode();
        }
        if (getIndExamNovelty() != null) {
            _hashCode += getIndExamNovelty().hashCode();
        }
        if (getUsedIpcDescription() != null) {
            _hashCode += getUsedIpcDescription().hashCode();
        }
        if (getUsedKeywordDescription() != null) {
            _hashCode += getUsedKeywordDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CPatentExaminationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPatentExaminationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("examDocRefList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "examDocRefList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cExamDocRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("examResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "examResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indExamIndustrial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indExamIndustrial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indExamInventive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indExamInventive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indExamNovelty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indExamNovelty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedIpcDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usedIpcDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedKeywordDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usedKeywordDescription"));
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
