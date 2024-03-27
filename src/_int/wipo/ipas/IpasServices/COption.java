/**
 * COption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class COption  implements java.io.Serializable {
    private java.lang.Boolean indSelected;

    private java.lang.String intermediateName;

    private java.lang.String listCode;

    private java.lang.String longName;

    private java.lang.String name;

    private _int.wipo.ipas.IpasServices.COptionField[] optionFieldList;

    private java.lang.String optionNbr;

    public COption() {
    }

    public COption(
           java.lang.Boolean indSelected,
           java.lang.String intermediateName,
           java.lang.String listCode,
           java.lang.String longName,
           java.lang.String name,
           _int.wipo.ipas.IpasServices.COptionField[] optionFieldList,
           java.lang.String optionNbr) {
           this.indSelected = indSelected;
           this.intermediateName = intermediateName;
           this.listCode = listCode;
           this.longName = longName;
           this.name = name;
           this.optionFieldList = optionFieldList;
           this.optionNbr = optionNbr;
    }


    /**
     * Gets the indSelected value for this COption.
     * 
     * @return indSelected
     */
    public java.lang.Boolean getIndSelected() {
        return indSelected;
    }


    /**
     * Sets the indSelected value for this COption.
     * 
     * @param indSelected
     */
    public void setIndSelected(java.lang.Boolean indSelected) {
        this.indSelected = indSelected;
    }


    /**
     * Gets the intermediateName value for this COption.
     * 
     * @return intermediateName
     */
    public java.lang.String getIntermediateName() {
        return intermediateName;
    }


    /**
     * Sets the intermediateName value for this COption.
     * 
     * @param intermediateName
     */
    public void setIntermediateName(java.lang.String intermediateName) {
        this.intermediateName = intermediateName;
    }


    /**
     * Gets the listCode value for this COption.
     * 
     * @return listCode
     */
    public java.lang.String getListCode() {
        return listCode;
    }


    /**
     * Sets the listCode value for this COption.
     * 
     * @param listCode
     */
    public void setListCode(java.lang.String listCode) {
        this.listCode = listCode;
    }


    /**
     * Gets the longName value for this COption.
     * 
     * @return longName
     */
    public java.lang.String getLongName() {
        return longName;
    }


    /**
     * Sets the longName value for this COption.
     * 
     * @param longName
     */
    public void setLongName(java.lang.String longName) {
        this.longName = longName;
    }


    /**
     * Gets the name value for this COption.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this COption.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the optionFieldList value for this COption.
     * 
     * @return optionFieldList
     */
    public _int.wipo.ipas.IpasServices.COptionField[] getOptionFieldList() {
        return optionFieldList;
    }


    /**
     * Sets the optionFieldList value for this COption.
     * 
     * @param optionFieldList
     */
    public void setOptionFieldList(_int.wipo.ipas.IpasServices.COptionField[] optionFieldList) {
        this.optionFieldList = optionFieldList;
    }

    public _int.wipo.ipas.IpasServices.COptionField getOptionFieldList(int i) {
        return this.optionFieldList[i];
    }

    public void setOptionFieldList(int i, _int.wipo.ipas.IpasServices.COptionField _value) {
        this.optionFieldList[i] = _value;
    }


    /**
     * Gets the optionNbr value for this COption.
     * 
     * @return optionNbr
     */
    public java.lang.String getOptionNbr() {
        return optionNbr;
    }


    /**
     * Sets the optionNbr value for this COption.
     * 
     * @param optionNbr
     */
    public void setOptionNbr(java.lang.String optionNbr) {
        this.optionNbr = optionNbr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof COption)) return false;
        COption other = (COption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.indSelected==null && other.getIndSelected()==null) || 
             (this.indSelected!=null &&
              this.indSelected.equals(other.getIndSelected()))) &&
            ((this.intermediateName==null && other.getIntermediateName()==null) || 
             (this.intermediateName!=null &&
              this.intermediateName.equals(other.getIntermediateName()))) &&
            ((this.listCode==null && other.getListCode()==null) || 
             (this.listCode!=null &&
              this.listCode.equals(other.getListCode()))) &&
            ((this.longName==null && other.getLongName()==null) || 
             (this.longName!=null &&
              this.longName.equals(other.getLongName()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.optionFieldList==null && other.getOptionFieldList()==null) || 
             (this.optionFieldList!=null &&
              java.util.Arrays.equals(this.optionFieldList, other.getOptionFieldList()))) &&
            ((this.optionNbr==null && other.getOptionNbr()==null) || 
             (this.optionNbr!=null &&
              this.optionNbr.equals(other.getOptionNbr())));
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
        if (getIndSelected() != null) {
            _hashCode += getIndSelected().hashCode();
        }
        if (getIntermediateName() != null) {
            _hashCode += getIntermediateName().hashCode();
        }
        if (getListCode() != null) {
            _hashCode += getListCode().hashCode();
        }
        if (getLongName() != null) {
            _hashCode += getLongName().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOptionFieldList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptionFieldList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptionFieldList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOptionNbr() != null) {
            _hashCode += getOptionNbr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(COption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indSelected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indSelected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intermediateName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intermediateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "longName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "optionFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOptionField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "optionNbr"));
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
