/**
 * COwner.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class COwner  implements java.io.Serializable {
    private java.lang.Boolean indService;

    private _int.wipo.ipas.IpasServices.IpasInteger orderNbr;

    private java.lang.String ownershipNotes;

    private _int.wipo.ipas.IpasServices.CPerson person;

    public COwner() {
    }

    public COwner(
           java.lang.Boolean indService,
           _int.wipo.ipas.IpasServices.IpasInteger orderNbr,
           java.lang.String ownershipNotes,
           _int.wipo.ipas.IpasServices.CPerson person) {
           this.indService = indService;
           this.orderNbr = orderNbr;
           this.ownershipNotes = ownershipNotes;
           this.person = person;
    }


    /**
     * Gets the indService value for this COwner.
     * 
     * @return indService
     */
    public java.lang.Boolean getIndService() {
        return indService;
    }


    /**
     * Sets the indService value for this COwner.
     * 
     * @param indService
     */
    public void setIndService(java.lang.Boolean indService) {
        this.indService = indService;
    }


    /**
     * Gets the orderNbr value for this COwner.
     * 
     * @return orderNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getOrderNbr() {
        return orderNbr;
    }


    /**
     * Sets the orderNbr value for this COwner.
     * 
     * @param orderNbr
     */
    public void setOrderNbr(_int.wipo.ipas.IpasServices.IpasInteger orderNbr) {
        this.orderNbr = orderNbr;
    }


    /**
     * Gets the ownershipNotes value for this COwner.
     * 
     * @return ownershipNotes
     */
    public java.lang.String getOwnershipNotes() {
        return ownershipNotes;
    }


    /**
     * Sets the ownershipNotes value for this COwner.
     * 
     * @param ownershipNotes
     */
    public void setOwnershipNotes(java.lang.String ownershipNotes) {
        this.ownershipNotes = ownershipNotes;
    }


    /**
     * Gets the person value for this COwner.
     * 
     * @return person
     */
    public _int.wipo.ipas.IpasServices.CPerson getPerson() {
        return person;
    }


    /**
     * Sets the person value for this COwner.
     * 
     * @param person
     */
    public void setPerson(_int.wipo.ipas.IpasServices.CPerson person) {
        this.person = person;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof COwner)) return false;
        COwner other = (COwner) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.indService==null && other.getIndService()==null) || 
             (this.indService!=null &&
              this.indService.equals(other.getIndService()))) &&
            ((this.orderNbr==null && other.getOrderNbr()==null) || 
             (this.orderNbr!=null &&
              this.orderNbr.equals(other.getOrderNbr()))) &&
            ((this.ownershipNotes==null && other.getOwnershipNotes()==null) || 
             (this.ownershipNotes!=null &&
              this.ownershipNotes.equals(other.getOwnershipNotes()))) &&
            ((this.person==null && other.getPerson()==null) || 
             (this.person!=null &&
              this.person.equals(other.getPerson())));
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
        if (getIndService() != null) {
            _hashCode += getIndService().hashCode();
        }
        if (getOrderNbr() != null) {
            _hashCode += getOrderNbr().hashCode();
        }
        if (getOwnershipNotes() != null) {
            _hashCode += getOwnershipNotes().hashCode();
        }
        if (getPerson() != null) {
            _hashCode += getPerson().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(COwner.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cOwner"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownershipNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownershipNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person");
        elemField.setXmlName(new javax.xml.namespace.QName("", "person"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cPerson"));
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
