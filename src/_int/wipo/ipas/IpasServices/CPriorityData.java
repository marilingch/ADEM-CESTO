/**
 * CPriorityData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CPriorityData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime earliestAcceptedParisPriorityDate;

    private _int.wipo.ipas.IpasServices.IpasDateTime exhibitionDate;

    private java.lang.String exhibitionNotes;

    private _int.wipo.ipas.IpasServices.CParisPriority[] parisPriorityList;

    public CPriorityData() {
    }

    public CPriorityData(
           _int.wipo.ipas.IpasServices.IpasDateTime earliestAcceptedParisPriorityDate,
           _int.wipo.ipas.IpasServices.IpasDateTime exhibitionDate,
           java.lang.String exhibitionNotes,
           _int.wipo.ipas.IpasServices.CParisPriority[] parisPriorityList) {
           this.earliestAcceptedParisPriorityDate = earliestAcceptedParisPriorityDate;
           this.exhibitionDate = exhibitionDate;
           this.exhibitionNotes = exhibitionNotes;
           this.parisPriorityList = parisPriorityList;
    }


    /**
     * Gets the earliestAcceptedParisPriorityDate value for this CPriorityData.
     * 
     * @return earliestAcceptedParisPriorityDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getEarliestAcceptedParisPriorityDate() {
        return earliestAcceptedParisPriorityDate;
    }


    /**
     * Sets the earliestAcceptedParisPriorityDate value for this CPriorityData.
     * 
     * @param earliestAcceptedParisPriorityDate
     */
    public void setEarliestAcceptedParisPriorityDate(_int.wipo.ipas.IpasServices.IpasDateTime earliestAcceptedParisPriorityDate) {
        this.earliestAcceptedParisPriorityDate = earliestAcceptedParisPriorityDate;
    }


    /**
     * Gets the exhibitionDate value for this CPriorityData.
     * 
     * @return exhibitionDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getExhibitionDate() {
        return exhibitionDate;
    }


    /**
     * Sets the exhibitionDate value for this CPriorityData.
     * 
     * @param exhibitionDate
     */
    public void setExhibitionDate(_int.wipo.ipas.IpasServices.IpasDateTime exhibitionDate) {
        this.exhibitionDate = exhibitionDate;
    }


    /**
     * Gets the exhibitionNotes value for this CPriorityData.
     * 
     * @return exhibitionNotes
     */
    public java.lang.String getExhibitionNotes() {
        return exhibitionNotes;
    }


    /**
     * Sets the exhibitionNotes value for this CPriorityData.
     * 
     * @param exhibitionNotes
     */
    public void setExhibitionNotes(java.lang.String exhibitionNotes) {
        this.exhibitionNotes = exhibitionNotes;
    }


    /**
     * Gets the parisPriorityList value for this CPriorityData.
     * 
     * @return parisPriorityList
     */
    public _int.wipo.ipas.IpasServices.CParisPriority[] getParisPriorityList() {
        return parisPriorityList;
    }


    /**
     * Sets the parisPriorityList value for this CPriorityData.
     * 
     * @param parisPriorityList
     */
    public void setParisPriorityList(_int.wipo.ipas.IpasServices.CParisPriority[] parisPriorityList) {
        this.parisPriorityList = parisPriorityList;
    }

    public _int.wipo.ipas.IpasServices.CParisPriority getParisPriorityList(int i) {
        return this.parisPriorityList[i];
    }

    public void setParisPriorityList(int i, _int.wipo.ipas.IpasServices.CParisPriority _value) {
        this.parisPriorityList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CPriorityData)) return false;
        CPriorityData other = (CPriorityData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.earliestAcceptedParisPriorityDate==null && other.getEarliestAcceptedParisPriorityDate()==null) || 
             (this.earliestAcceptedParisPriorityDate!=null &&
              this.earliestAcceptedParisPriorityDate.equals(other.getEarliestAcceptedParisPriorityDate()))) &&
            ((this.exhibitionDate==null && other.getExhibitionDate()==null) || 
             (this.exhibitionDate!=null &&
              this.exhibitionDate.equals(other.getExhibitionDate()))) &&
            ((this.exhibitionNotes==null && other.getExhibitionNotes()==null) || 
             (this.exhibitionNotes!=null &&
              this.exhibitionNotes.equals(other.getExhibitionNotes()))) &&
            ((this.parisPriorityList==null && other.getParisPriorityList()==null) || 
             (this.parisPriorityList!=null &&
              java.util.Arrays.equals(this.parisPriorityList, other.getParisPriorityList())));
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
        if (getEarliestAcceptedParisPriorityDate() != null) {
            _hashCode += getEarliestAcceptedParisPriorityDate().hashCode();
        }
        if (getExhibitionDate() != null) {
            _hashCode += getExhibitionDate().hashCode();
        }
        if (getExhibitionNotes() != null) {
            _hashCode += getExhibitionNotes().hashCode();
        }
        if (getParisPriorityList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParisPriorityList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParisPriorityList(), i);
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
        new org.apache.axis.description.TypeDesc(CPriorityData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPriorityData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("earliestAcceptedParisPriorityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "earliestAcceptedParisPriorityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exhibitionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exhibitionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exhibitionNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exhibitionNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parisPriorityList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parisPriorityList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cParisPriority"));
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
