/**
 * CpoaData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CpoaData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CDocumentId documentId;

    private _int.wipo.ipas.IpasServices.IpasDateTime poaDate;

    private _int.wipo.ipas.IpasServices.CpoaGrantee[] poaGranteeList;

    private _int.wipo.ipas.IpasServices.CpoaGrantor poaGrantor;

    private _int.wipo.ipas.IpasServices.IpasInteger poaRegNumber;

    private java.lang.String scope;

    public CpoaData() {
    }

    public CpoaData(
           _int.wipo.ipas.IpasServices.CDocumentId documentId,
           _int.wipo.ipas.IpasServices.IpasDateTime poaDate,
           _int.wipo.ipas.IpasServices.CpoaGrantee[] poaGranteeList,
           _int.wipo.ipas.IpasServices.CpoaGrantor poaGrantor,
           _int.wipo.ipas.IpasServices.IpasInteger poaRegNumber,
           java.lang.String scope) {
           this.documentId = documentId;
           this.poaDate = poaDate;
           this.poaGranteeList = poaGranteeList;
           this.poaGrantor = poaGrantor;
           this.poaRegNumber = poaRegNumber;
           this.scope = scope;
    }


    /**
     * Gets the documentId value for this CpoaData.
     * 
     * @return documentId
     */
    public _int.wipo.ipas.IpasServices.CDocumentId getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this CpoaData.
     * 
     * @param documentId
     */
    public void setDocumentId(_int.wipo.ipas.IpasServices.CDocumentId documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the poaDate value for this CpoaData.
     * 
     * @return poaDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getPoaDate() {
        return poaDate;
    }


    /**
     * Sets the poaDate value for this CpoaData.
     * 
     * @param poaDate
     */
    public void setPoaDate(_int.wipo.ipas.IpasServices.IpasDateTime poaDate) {
        this.poaDate = poaDate;
    }


    /**
     * Gets the poaGranteeList value for this CpoaData.
     * 
     * @return poaGranteeList
     */
    public _int.wipo.ipas.IpasServices.CpoaGrantee[] getPoaGranteeList() {
        return poaGranteeList;
    }


    /**
     * Sets the poaGranteeList value for this CpoaData.
     * 
     * @param poaGranteeList
     */
    public void setPoaGranteeList(_int.wipo.ipas.IpasServices.CpoaGrantee[] poaGranteeList) {
        this.poaGranteeList = poaGranteeList;
    }

    public _int.wipo.ipas.IpasServices.CpoaGrantee getPoaGranteeList(int i) {
        return this.poaGranteeList[i];
    }

    public void setPoaGranteeList(int i, _int.wipo.ipas.IpasServices.CpoaGrantee _value) {
        this.poaGranteeList[i] = _value;
    }


    /**
     * Gets the poaGrantor value for this CpoaData.
     * 
     * @return poaGrantor
     */
    public _int.wipo.ipas.IpasServices.CpoaGrantor getPoaGrantor() {
        return poaGrantor;
    }


    /**
     * Sets the poaGrantor value for this CpoaData.
     * 
     * @param poaGrantor
     */
    public void setPoaGrantor(_int.wipo.ipas.IpasServices.CpoaGrantor poaGrantor) {
        this.poaGrantor = poaGrantor;
    }


    /**
     * Gets the poaRegNumber value for this CpoaData.
     * 
     * @return poaRegNumber
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getPoaRegNumber() {
        return poaRegNumber;
    }


    /**
     * Sets the poaRegNumber value for this CpoaData.
     * 
     * @param poaRegNumber
     */
    public void setPoaRegNumber(_int.wipo.ipas.IpasServices.IpasInteger poaRegNumber) {
        this.poaRegNumber = poaRegNumber;
    }


    /**
     * Gets the scope value for this CpoaData.
     * 
     * @return scope
     */
    public java.lang.String getScope() {
        return scope;
    }


    /**
     * Sets the scope value for this CpoaData.
     * 
     * @param scope
     */
    public void setScope(java.lang.String scope) {
        this.scope = scope;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpoaData)) return false;
        CpoaData other = (CpoaData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentId==null && other.getDocumentId()==null) || 
             (this.documentId!=null &&
              this.documentId.equals(other.getDocumentId()))) &&
            ((this.poaDate==null && other.getPoaDate()==null) || 
             (this.poaDate!=null &&
              this.poaDate.equals(other.getPoaDate()))) &&
            ((this.poaGranteeList==null && other.getPoaGranteeList()==null) || 
             (this.poaGranteeList!=null &&
              java.util.Arrays.equals(this.poaGranteeList, other.getPoaGranteeList()))) &&
            ((this.poaGrantor==null && other.getPoaGrantor()==null) || 
             (this.poaGrantor!=null &&
              this.poaGrantor.equals(other.getPoaGrantor()))) &&
            ((this.poaRegNumber==null && other.getPoaRegNumber()==null) || 
             (this.poaRegNumber!=null &&
              this.poaRegNumber.equals(other.getPoaRegNumber()))) &&
            ((this.scope==null && other.getScope()==null) || 
             (this.scope!=null &&
              this.scope.equals(other.getScope())));
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
        if (getDocumentId() != null) {
            _hashCode += getDocumentId().hashCode();
        }
        if (getPoaDate() != null) {
            _hashCode += getPoaDate().hashCode();
        }
        if (getPoaGranteeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPoaGranteeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPoaGranteeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPoaGrantor() != null) {
            _hashCode += getPoaGrantor().hashCode();
        }
        if (getPoaRegNumber() != null) {
            _hashCode += getPoaRegNumber().hashCode();
        }
        if (getScope() != null) {
            _hashCode += getScope().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpoaData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cpoaData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poaDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "poaDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poaGranteeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "poaGranteeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cpoaGrantee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poaGrantor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "poaGrantor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cpoaGrantor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poaRegNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "poaRegNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scope"));
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
