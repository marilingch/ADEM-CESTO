/**
 * CDrawing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CDrawing  implements java.io.Serializable {
    private byte[] drawingData;

    private _int.wipo.ipas.IpasServices.IpasInteger drawingNbr;

    private java.lang.String drawingType;

    public CDrawing() {
    }

    public CDrawing(
           byte[] drawingData,
           _int.wipo.ipas.IpasServices.IpasInteger drawingNbr,
           java.lang.String drawingType) {
           this.drawingData = drawingData;
           this.drawingNbr = drawingNbr;
           this.drawingType = drawingType;
    }


    /**
     * Gets the drawingData value for this CDrawing.
     * 
     * @return drawingData
     */
    public byte[] getDrawingData() {
        return drawingData;
    }


    /**
     * Sets the drawingData value for this CDrawing.
     * 
     * @param drawingData
     */
    public void setDrawingData(byte[] drawingData) {
        this.drawingData = drawingData;
    }


    /**
     * Gets the drawingNbr value for this CDrawing.
     * 
     * @return drawingNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDrawingNbr() {
        return drawingNbr;
    }


    /**
     * Sets the drawingNbr value for this CDrawing.
     * 
     * @param drawingNbr
     */
    public void setDrawingNbr(_int.wipo.ipas.IpasServices.IpasInteger drawingNbr) {
        this.drawingNbr = drawingNbr;
    }


    /**
     * Gets the drawingType value for this CDrawing.
     * 
     * @return drawingType
     */
    public java.lang.String getDrawingType() {
        return drawingType;
    }


    /**
     * Sets the drawingType value for this CDrawing.
     * 
     * @param drawingType
     */
    public void setDrawingType(java.lang.String drawingType) {
        this.drawingType = drawingType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDrawing)) return false;
        CDrawing other = (CDrawing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.drawingData==null && other.getDrawingData()==null) || 
             (this.drawingData!=null &&
              java.util.Arrays.equals(this.drawingData, other.getDrawingData()))) &&
            ((this.drawingNbr==null && other.getDrawingNbr()==null) || 
             (this.drawingNbr!=null &&
              this.drawingNbr.equals(other.getDrawingNbr()))) &&
            ((this.drawingType==null && other.getDrawingType()==null) || 
             (this.drawingType!=null &&
              this.drawingType.equals(other.getDrawingType())));
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
        if (getDrawingData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDrawingData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDrawingData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDrawingNbr() != null) {
            _hashCode += getDrawingNbr().hashCode();
        }
        if (getDrawingType() != null) {
            _hashCode += getDrawingType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDrawing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDrawing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drawingData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "drawingData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drawingNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "drawingNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drawingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "drawingType"));
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
