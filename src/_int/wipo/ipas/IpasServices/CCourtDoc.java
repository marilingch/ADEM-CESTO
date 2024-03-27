/**
 * CCourtDoc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCourtDoc  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime courtDocDate;

    private _int.wipo.ipas.IpasServices.IpasInteger courtDocNbr;

    private java.lang.String courtDocSeq;

    private _int.wipo.ipas.IpasServices.IpasInteger courtDocSeries;

    private _int.wipo.ipas.IpasServices.CCourtFile courtFile;

    private _int.wipo.ipas.IpasServices.IpasDateTime decreeDate;

    private _int.wipo.ipas.IpasServices.IpasInteger decreeNbr;

    private _int.wipo.ipas.IpasServices.IpasInteger decreeSeries;

    public CCourtDoc() {
    }

    public CCourtDoc(
           _int.wipo.ipas.IpasServices.IpasDateTime courtDocDate,
           _int.wipo.ipas.IpasServices.IpasInteger courtDocNbr,
           java.lang.String courtDocSeq,
           _int.wipo.ipas.IpasServices.IpasInteger courtDocSeries,
           _int.wipo.ipas.IpasServices.CCourtFile courtFile,
           _int.wipo.ipas.IpasServices.IpasDateTime decreeDate,
           _int.wipo.ipas.IpasServices.IpasInteger decreeNbr,
           _int.wipo.ipas.IpasServices.IpasInteger decreeSeries) {
           this.courtDocDate = courtDocDate;
           this.courtDocNbr = courtDocNbr;
           this.courtDocSeq = courtDocSeq;
           this.courtDocSeries = courtDocSeries;
           this.courtFile = courtFile;
           this.decreeDate = decreeDate;
           this.decreeNbr = decreeNbr;
           this.decreeSeries = decreeSeries;
    }


    /**
     * Gets the courtDocDate value for this CCourtDoc.
     * 
     * @return courtDocDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getCourtDocDate() {
        return courtDocDate;
    }


    /**
     * Sets the courtDocDate value for this CCourtDoc.
     * 
     * @param courtDocDate
     */
    public void setCourtDocDate(_int.wipo.ipas.IpasServices.IpasDateTime courtDocDate) {
        this.courtDocDate = courtDocDate;
    }


    /**
     * Gets the courtDocNbr value for this CCourtDoc.
     * 
     * @return courtDocNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getCourtDocNbr() {
        return courtDocNbr;
    }


    /**
     * Sets the courtDocNbr value for this CCourtDoc.
     * 
     * @param courtDocNbr
     */
    public void setCourtDocNbr(_int.wipo.ipas.IpasServices.IpasInteger courtDocNbr) {
        this.courtDocNbr = courtDocNbr;
    }


    /**
     * Gets the courtDocSeq value for this CCourtDoc.
     * 
     * @return courtDocSeq
     */
    public java.lang.String getCourtDocSeq() {
        return courtDocSeq;
    }


    /**
     * Sets the courtDocSeq value for this CCourtDoc.
     * 
     * @param courtDocSeq
     */
    public void setCourtDocSeq(java.lang.String courtDocSeq) {
        this.courtDocSeq = courtDocSeq;
    }


    /**
     * Gets the courtDocSeries value for this CCourtDoc.
     * 
     * @return courtDocSeries
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getCourtDocSeries() {
        return courtDocSeries;
    }


    /**
     * Sets the courtDocSeries value for this CCourtDoc.
     * 
     * @param courtDocSeries
     */
    public void setCourtDocSeries(_int.wipo.ipas.IpasServices.IpasInteger courtDocSeries) {
        this.courtDocSeries = courtDocSeries;
    }


    /**
     * Gets the courtFile value for this CCourtDoc.
     * 
     * @return courtFile
     */
    public _int.wipo.ipas.IpasServices.CCourtFile getCourtFile() {
        return courtFile;
    }


    /**
     * Sets the courtFile value for this CCourtDoc.
     * 
     * @param courtFile
     */
    public void setCourtFile(_int.wipo.ipas.IpasServices.CCourtFile courtFile) {
        this.courtFile = courtFile;
    }


    /**
     * Gets the decreeDate value for this CCourtDoc.
     * 
     * @return decreeDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getDecreeDate() {
        return decreeDate;
    }


    /**
     * Sets the decreeDate value for this CCourtDoc.
     * 
     * @param decreeDate
     */
    public void setDecreeDate(_int.wipo.ipas.IpasServices.IpasDateTime decreeDate) {
        this.decreeDate = decreeDate;
    }


    /**
     * Gets the decreeNbr value for this CCourtDoc.
     * 
     * @return decreeNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDecreeNbr() {
        return decreeNbr;
    }


    /**
     * Sets the decreeNbr value for this CCourtDoc.
     * 
     * @param decreeNbr
     */
    public void setDecreeNbr(_int.wipo.ipas.IpasServices.IpasInteger decreeNbr) {
        this.decreeNbr = decreeNbr;
    }


    /**
     * Gets the decreeSeries value for this CCourtDoc.
     * 
     * @return decreeSeries
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getDecreeSeries() {
        return decreeSeries;
    }


    /**
     * Sets the decreeSeries value for this CCourtDoc.
     * 
     * @param decreeSeries
     */
    public void setDecreeSeries(_int.wipo.ipas.IpasServices.IpasInteger decreeSeries) {
        this.decreeSeries = decreeSeries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCourtDoc)) return false;
        CCourtDoc other = (CCourtDoc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.courtDocDate==null && other.getCourtDocDate()==null) || 
             (this.courtDocDate!=null &&
              this.courtDocDate.equals(other.getCourtDocDate()))) &&
            ((this.courtDocNbr==null && other.getCourtDocNbr()==null) || 
             (this.courtDocNbr!=null &&
              this.courtDocNbr.equals(other.getCourtDocNbr()))) &&
            ((this.courtDocSeq==null && other.getCourtDocSeq()==null) || 
             (this.courtDocSeq!=null &&
              this.courtDocSeq.equals(other.getCourtDocSeq()))) &&
            ((this.courtDocSeries==null && other.getCourtDocSeries()==null) || 
             (this.courtDocSeries!=null &&
              this.courtDocSeries.equals(other.getCourtDocSeries()))) &&
            ((this.courtFile==null && other.getCourtFile()==null) || 
             (this.courtFile!=null &&
              this.courtFile.equals(other.getCourtFile()))) &&
            ((this.decreeDate==null && other.getDecreeDate()==null) || 
             (this.decreeDate!=null &&
              this.decreeDate.equals(other.getDecreeDate()))) &&
            ((this.decreeNbr==null && other.getDecreeNbr()==null) || 
             (this.decreeNbr!=null &&
              this.decreeNbr.equals(other.getDecreeNbr()))) &&
            ((this.decreeSeries==null && other.getDecreeSeries()==null) || 
             (this.decreeSeries!=null &&
              this.decreeSeries.equals(other.getDecreeSeries())));
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
        if (getCourtDocDate() != null) {
            _hashCode += getCourtDocDate().hashCode();
        }
        if (getCourtDocNbr() != null) {
            _hashCode += getCourtDocNbr().hashCode();
        }
        if (getCourtDocSeq() != null) {
            _hashCode += getCourtDocSeq().hashCode();
        }
        if (getCourtDocSeries() != null) {
            _hashCode += getCourtDocSeries().hashCode();
        }
        if (getCourtFile() != null) {
            _hashCode += getCourtFile().hashCode();
        }
        if (getDecreeDate() != null) {
            _hashCode += getDecreeDate().hashCode();
        }
        if (getDecreeNbr() != null) {
            _hashCode += getDecreeNbr().hashCode();
        }
        if (getDecreeSeries() != null) {
            _hashCode += getDecreeSeries().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCourtDoc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCourtDoc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courtDocDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courtDocDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courtDocNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courtDocNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courtDocSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courtDocSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courtDocSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courtDocSeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courtFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courtFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCourtFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decreeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "decreeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decreeNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "decreeNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decreeSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "decreeSeries"));
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
