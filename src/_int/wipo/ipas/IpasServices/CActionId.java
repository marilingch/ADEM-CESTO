/**
 * CActionId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CActionId  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasInteger actionNbr;

    private _int.wipo.ipas.IpasServices.CProcessId processId;

    public CActionId() {
    }

    public CActionId(
           _int.wipo.ipas.IpasServices.IpasInteger actionNbr,
           _int.wipo.ipas.IpasServices.CProcessId processId) {
           this.actionNbr = actionNbr;
           this.processId = processId;
    }


    /**
     * Gets the actionNbr value for this CActionId.
     * 
     * @return actionNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getActionNbr() {
        return actionNbr;
    }


    /**
     * Sets the actionNbr value for this CActionId.
     * 
     * @param actionNbr
     */
    public void setActionNbr(_int.wipo.ipas.IpasServices.IpasInteger actionNbr) {
        this.actionNbr = actionNbr;
    }


    /**
     * Gets the processId value for this CActionId.
     * 
     * @return processId
     */
    public _int.wipo.ipas.IpasServices.CProcessId getProcessId() {
        return processId;
    }


    /**
     * Sets the processId value for this CActionId.
     * 
     * @param processId
     */
    public void setProcessId(_int.wipo.ipas.IpasServices.CProcessId processId) {
        this.processId = processId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CActionId)) return false;
        CActionId other = (CActionId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionNbr==null && other.getActionNbr()==null) || 
             (this.actionNbr!=null &&
              this.actionNbr.equals(other.getActionNbr()))) &&
            ((this.processId==null && other.getProcessId()==null) || 
             (this.processId!=null &&
              this.processId.equals(other.getProcessId())));
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
        if (getActionNbr() != null) {
            _hashCode += getActionNbr().hashCode();
        }
        if (getProcessId() != null) {
            _hashCode += getProcessId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CActionId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cActionId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cProcessId"));
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
