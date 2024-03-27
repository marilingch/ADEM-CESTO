/**
 * CCourtFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCourtFile  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CCourt court;

    private java.lang.String courtFileName;

    private _int.wipo.ipas.IpasServices.IpasInteger courtFileNbr;

    private java.lang.String courtFileSeq;

    private _int.wipo.ipas.IpasServices.IpasInteger courtFileSeries;

    public CCourtFile() {
    }

    public CCourtFile(
           _int.wipo.ipas.IpasServices.CCourt court,
           java.lang.String courtFileName,
           _int.wipo.ipas.IpasServices.IpasInteger courtFileNbr,
           java.lang.String courtFileSeq,
           _int.wipo.ipas.IpasServices.IpasInteger courtFileSeries) {
           this.court = court;
           this.courtFileName = courtFileName;
           this.courtFileNbr = courtFileNbr;
           this.courtFileSeq = courtFileSeq;
           this.courtFileSeries = courtFileSeries;
    }


    /**
     * Gets the court value for this CCourtFile.
     * 
     * @return court
     */
    public _int.wipo.ipas.IpasServices.CCourt getCourt() {
        return court;
    }


    /**
     * Sets the court value for this CCourtFile.
     * 
     * @param court
     */
    public void setCourt(_int.wipo.ipas.IpasServices.CCourt court) {
        this.court = court;
    }


    /**
     * Gets the courtFileName value for this CCourtFile.
     * 
     * @return courtFileName
     */
    public java.lang.String getCourtFileName() {
        return courtFileName;
    }


    /**
     * Sets the courtFileName value for this CCourtFile.
     * 
     * @param courtFileName
     */
    public void setCourtFileName(java.lang.String courtFileName) {
        this.courtFileName = courtFileName;
    }


    /**
     * Gets the courtFileNbr value for this CCourtFile.
     * 
     * @return courtFileNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getCourtFileNbr() {
        return courtFileNbr;
    }


    /**
     * Sets the courtFileNbr value for this CCourtFile.
     * 
     * @param courtFileNbr
     */
    public void setCourtFileNbr(_int.wipo.ipas.IpasServices.IpasInteger courtFileNbr) {
        this.courtFileNbr = courtFileNbr;
    }


    /**
     * Gets the courtFileSeq value for this CCourtFile.
     * 
     * @return courtFileSeq
     */
    public java.lang.String getCourtFileSeq() {
        return courtFileSeq;
    }


    /**
     * Sets the courtFileSeq value for this CCourtFile.
     * 
     * @param courtFileSeq
     */
    public void setCourtFileSeq(java.lang.String courtFileSeq) {
        this.courtFileSeq = courtFileSeq;
    }


    /**
     * Gets the courtFileSeries value for this CCourtFile.
     * 
     * @return courtFileSeries
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getCourtFileSeries() {
        return courtFileSeries;
    }


    /**
     * Sets the courtFileSeries value for this CCourtFile.
     * 
     * @param courtFileSeries
     */
    public void setCourtFileSeries(_int.wipo.ipas.IpasServices.IpasInteger courtFileSeries) {
        this.courtFileSeries = courtFileSeries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCourtFile)) return false;
        CCourtFile other = (CCourtFile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.court==null && other.getCourt()==null) || 
             (this.court!=null &&
              this.court.equals(other.getCourt()))) &&
            ((this.courtFileName==null && other.getCourtFileName()==null) || 
             (this.courtFileName!=null &&
              this.courtFileName.equals(other.getCourtFileName()))) &&
            ((this.courtFileNbr==null && other.getCourtFileNbr()==null) || 
             (this.courtFileNbr!=null &&
              this.courtFileNbr.equals(other.getCourtFileNbr()))) &&
            ((this.courtFileSeq==null && other.getCourtFileSeq()==null) || 
             (this.courtFileSeq!=null &&
              this.courtFileSeq.equals(other.getCourtFileSeq()))) &&
            ((this.courtFileSeries==null && other.getCourtFileSeries()==null) || 
             (this.courtFileSeries!=null &&
              this.courtFileSeries.equals(other.getCourtFileSeries())));
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
        if (getCourt() != null) {
            _hashCode += getCourt().hashCode();
        }
        if (getCourtFileName() != null) {
            _hashCode += getCourtFileName().hashCode();
        }
        if (getCourtFileNbr() != null) {
            _hashCode += getCourtFileNbr().hashCode();
        }
        if (getCourtFileSeq() != null) {
            _hashCode += getCourtFileSeq().hashCode();
        }
        if (getCourtFileSeries() != null) {
            _hashCode += getCourtFileSeries().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCourtFile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCourtFile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("court");
        elemField.setXmlName(new javax.xml.namespace.QName("", "court"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCourt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courtFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courtFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courtFileNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courtFileNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courtFileSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courtFileSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courtFileSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courtFileSeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
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
