/**
 * CCriteriaProtectionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaProtectionData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CCriteriaNiceClass[] criteriaNiceClassList;

    private java.lang.Boolean indIgnoreNotRegisteredNiceClasses;

    private java.lang.Boolean indIncludeReclassifiedNiceClasses;

    private java.lang.Boolean indIncludeRelatedNiceClasses;

    private _int.wipo.ipas.IpasServices.CCriteriaSearchClass[] searchClassList;

    public CCriteriaProtectionData() {
    }

    public CCriteriaProtectionData(
           _int.wipo.ipas.IpasServices.CCriteriaNiceClass[] criteriaNiceClassList,
           java.lang.Boolean indIgnoreNotRegisteredNiceClasses,
           java.lang.Boolean indIncludeReclassifiedNiceClasses,
           java.lang.Boolean indIncludeRelatedNiceClasses,
           _int.wipo.ipas.IpasServices.CCriteriaSearchClass[] searchClassList) {
           this.criteriaNiceClassList = criteriaNiceClassList;
           this.indIgnoreNotRegisteredNiceClasses = indIgnoreNotRegisteredNiceClasses;
           this.indIncludeReclassifiedNiceClasses = indIncludeReclassifiedNiceClasses;
           this.indIncludeRelatedNiceClasses = indIncludeRelatedNiceClasses;
           this.searchClassList = searchClassList;
    }


    /**
     * Gets the criteriaNiceClassList value for this CCriteriaProtectionData.
     * 
     * @return criteriaNiceClassList
     */
    public _int.wipo.ipas.IpasServices.CCriteriaNiceClass[] getCriteriaNiceClassList() {
        return criteriaNiceClassList;
    }


    /**
     * Sets the criteriaNiceClassList value for this CCriteriaProtectionData.
     * 
     * @param criteriaNiceClassList
     */
    public void setCriteriaNiceClassList(_int.wipo.ipas.IpasServices.CCriteriaNiceClass[] criteriaNiceClassList) {
        this.criteriaNiceClassList = criteriaNiceClassList;
    }

    public _int.wipo.ipas.IpasServices.CCriteriaNiceClass getCriteriaNiceClassList(int i) {
        return this.criteriaNiceClassList[i];
    }

    public void setCriteriaNiceClassList(int i, _int.wipo.ipas.IpasServices.CCriteriaNiceClass _value) {
        this.criteriaNiceClassList[i] = _value;
    }


    /**
     * Gets the indIgnoreNotRegisteredNiceClasses value for this CCriteriaProtectionData.
     * 
     * @return indIgnoreNotRegisteredNiceClasses
     */
    public java.lang.Boolean getIndIgnoreNotRegisteredNiceClasses() {
        return indIgnoreNotRegisteredNiceClasses;
    }


    /**
     * Sets the indIgnoreNotRegisteredNiceClasses value for this CCriteriaProtectionData.
     * 
     * @param indIgnoreNotRegisteredNiceClasses
     */
    public void setIndIgnoreNotRegisteredNiceClasses(java.lang.Boolean indIgnoreNotRegisteredNiceClasses) {
        this.indIgnoreNotRegisteredNiceClasses = indIgnoreNotRegisteredNiceClasses;
    }


    /**
     * Gets the indIncludeReclassifiedNiceClasses value for this CCriteriaProtectionData.
     * 
     * @return indIncludeReclassifiedNiceClasses
     */
    public java.lang.Boolean getIndIncludeReclassifiedNiceClasses() {
        return indIncludeReclassifiedNiceClasses;
    }


    /**
     * Sets the indIncludeReclassifiedNiceClasses value for this CCriteriaProtectionData.
     * 
     * @param indIncludeReclassifiedNiceClasses
     */
    public void setIndIncludeReclassifiedNiceClasses(java.lang.Boolean indIncludeReclassifiedNiceClasses) {
        this.indIncludeReclassifiedNiceClasses = indIncludeReclassifiedNiceClasses;
    }


    /**
     * Gets the indIncludeRelatedNiceClasses value for this CCriteriaProtectionData.
     * 
     * @return indIncludeRelatedNiceClasses
     */
    public java.lang.Boolean getIndIncludeRelatedNiceClasses() {
        return indIncludeRelatedNiceClasses;
    }


    /**
     * Sets the indIncludeRelatedNiceClasses value for this CCriteriaProtectionData.
     * 
     * @param indIncludeRelatedNiceClasses
     */
    public void setIndIncludeRelatedNiceClasses(java.lang.Boolean indIncludeRelatedNiceClasses) {
        this.indIncludeRelatedNiceClasses = indIncludeRelatedNiceClasses;
    }


    /**
     * Gets the searchClassList value for this CCriteriaProtectionData.
     * 
     * @return searchClassList
     */
    public _int.wipo.ipas.IpasServices.CCriteriaSearchClass[] getSearchClassList() {
        return searchClassList;
    }


    /**
     * Sets the searchClassList value for this CCriteriaProtectionData.
     * 
     * @param searchClassList
     */
    public void setSearchClassList(_int.wipo.ipas.IpasServices.CCriteriaSearchClass[] searchClassList) {
        this.searchClassList = searchClassList;
    }

    public _int.wipo.ipas.IpasServices.CCriteriaSearchClass getSearchClassList(int i) {
        return this.searchClassList[i];
    }

    public void setSearchClassList(int i, _int.wipo.ipas.IpasServices.CCriteriaSearchClass _value) {
        this.searchClassList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaProtectionData)) return false;
        CCriteriaProtectionData other = (CCriteriaProtectionData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.criteriaNiceClassList==null && other.getCriteriaNiceClassList()==null) || 
             (this.criteriaNiceClassList!=null &&
              java.util.Arrays.equals(this.criteriaNiceClassList, other.getCriteriaNiceClassList()))) &&
            ((this.indIgnoreNotRegisteredNiceClasses==null && other.getIndIgnoreNotRegisteredNiceClasses()==null) || 
             (this.indIgnoreNotRegisteredNiceClasses!=null &&
              this.indIgnoreNotRegisteredNiceClasses.equals(other.getIndIgnoreNotRegisteredNiceClasses()))) &&
            ((this.indIncludeReclassifiedNiceClasses==null && other.getIndIncludeReclassifiedNiceClasses()==null) || 
             (this.indIncludeReclassifiedNiceClasses!=null &&
              this.indIncludeReclassifiedNiceClasses.equals(other.getIndIncludeReclassifiedNiceClasses()))) &&
            ((this.indIncludeRelatedNiceClasses==null && other.getIndIncludeRelatedNiceClasses()==null) || 
             (this.indIncludeRelatedNiceClasses!=null &&
              this.indIncludeRelatedNiceClasses.equals(other.getIndIncludeRelatedNiceClasses()))) &&
            ((this.searchClassList==null && other.getSearchClassList()==null) || 
             (this.searchClassList!=null &&
              java.util.Arrays.equals(this.searchClassList, other.getSearchClassList())));
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
        if (getCriteriaNiceClassList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCriteriaNiceClassList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCriteriaNiceClassList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIndIgnoreNotRegisteredNiceClasses() != null) {
            _hashCode += getIndIgnoreNotRegisteredNiceClasses().hashCode();
        }
        if (getIndIncludeReclassifiedNiceClasses() != null) {
            _hashCode += getIndIncludeReclassifiedNiceClasses().hashCode();
        }
        if (getIndIncludeRelatedNiceClasses() != null) {
            _hashCode += getIndIncludeRelatedNiceClasses().hashCode();
        }
        if (getSearchClassList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchClassList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchClassList(), i);
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
        new org.apache.axis.description.TypeDesc(CCriteriaProtectionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaProtectionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaNiceClassList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criteriaNiceClassList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaNiceClass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indIgnoreNotRegisteredNiceClasses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indIgnoreNotRegisteredNiceClasses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indIncludeReclassifiedNiceClasses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indIncludeReclassifiedNiceClasses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indIncludeRelatedNiceClasses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indIncludeRelatedNiceClasses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchClassList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searchClassList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaSearchClass"));
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
