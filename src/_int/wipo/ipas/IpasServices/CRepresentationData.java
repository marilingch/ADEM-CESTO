/**
 * CRepresentationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CRepresentationData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CDocumentId documentId_PowerOfAttorneyRegister;

    private _int.wipo.ipas.IpasServices.CpoaData referencedPOAData;

    private _int.wipo.ipas.IpasServices.CRepresentative[] representativeList;

    public CRepresentationData() {
    }

    public CRepresentationData(
           _int.wipo.ipas.IpasServices.CDocumentId documentId_PowerOfAttorneyRegister,
           _int.wipo.ipas.IpasServices.CpoaData referencedPOAData,
           _int.wipo.ipas.IpasServices.CRepresentative[] representativeList) {
           this.documentId_PowerOfAttorneyRegister = documentId_PowerOfAttorneyRegister;
           this.referencedPOAData = referencedPOAData;
           this.representativeList = representativeList;
    }


    /**
     * Gets the documentId_PowerOfAttorneyRegister value for this CRepresentationData.
     * 
     * @return documentId_PowerOfAttorneyRegister
     */
    public _int.wipo.ipas.IpasServices.CDocumentId getDocumentId_PowerOfAttorneyRegister() {
        return documentId_PowerOfAttorneyRegister;
    }


    /**
     * Sets the documentId_PowerOfAttorneyRegister value for this CRepresentationData.
     * 
     * @param documentId_PowerOfAttorneyRegister
     */
    public void setDocumentId_PowerOfAttorneyRegister(_int.wipo.ipas.IpasServices.CDocumentId documentId_PowerOfAttorneyRegister) {
        this.documentId_PowerOfAttorneyRegister = documentId_PowerOfAttorneyRegister;
    }


    /**
     * Gets the referencedPOAData value for this CRepresentationData.
     * 
     * @return referencedPOAData
     */
    public _int.wipo.ipas.IpasServices.CpoaData getReferencedPOAData() {
        return referencedPOAData;
    }


    /**
     * Sets the referencedPOAData value for this CRepresentationData.
     * 
     * @param referencedPOAData
     */
    public void setReferencedPOAData(_int.wipo.ipas.IpasServices.CpoaData referencedPOAData) {
        this.referencedPOAData = referencedPOAData;
    }


    /**
     * Gets the representativeList value for this CRepresentationData.
     * 
     * @return representativeList
     */
    public _int.wipo.ipas.IpasServices.CRepresentative[] getRepresentativeList() {
        return representativeList;
    }


    /**
     * Sets the representativeList value for this CRepresentationData.
     * 
     * @param representativeList
     */
    public void setRepresentativeList(_int.wipo.ipas.IpasServices.CRepresentative[] representativeList) {
        this.representativeList = representativeList;
    }

    public _int.wipo.ipas.IpasServices.CRepresentative getRepresentativeList(int i) {
        return this.representativeList[i];
    }

    public void setRepresentativeList(int i, _int.wipo.ipas.IpasServices.CRepresentative _value) {
        this.representativeList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CRepresentationData)) return false;
        CRepresentationData other = (CRepresentationData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentId_PowerOfAttorneyRegister==null && other.getDocumentId_PowerOfAttorneyRegister()==null) || 
             (this.documentId_PowerOfAttorneyRegister!=null &&
              this.documentId_PowerOfAttorneyRegister.equals(other.getDocumentId_PowerOfAttorneyRegister()))) &&
            ((this.referencedPOAData==null && other.getReferencedPOAData()==null) || 
             (this.referencedPOAData!=null &&
              this.referencedPOAData.equals(other.getReferencedPOAData()))) &&
            ((this.representativeList==null && other.getRepresentativeList()==null) || 
             (this.representativeList!=null &&
              java.util.Arrays.equals(this.representativeList, other.getRepresentativeList())));
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
        if (getDocumentId_PowerOfAttorneyRegister() != null) {
            _hashCode += getDocumentId_PowerOfAttorneyRegister().hashCode();
        }
        if (getReferencedPOAData() != null) {
            _hashCode += getReferencedPOAData().hashCode();
        }
        if (getRepresentativeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRepresentativeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRepresentativeList(), i);
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
        new org.apache.axis.description.TypeDesc(CRepresentationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRepresentationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentId_PowerOfAttorneyRegister");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentId_PowerOfAttorneyRegister"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDocumentId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencedPOAData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referencedPOAData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cpoaData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representativeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "representativeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cRepresentative"));
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
