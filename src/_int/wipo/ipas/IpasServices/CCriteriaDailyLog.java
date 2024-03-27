/**
 * CCriteriaDailyLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaDailyLog  implements java.io.Serializable {
    private java.lang.String docLog;

    private java.lang.String docOrigin;

    private java.lang.Boolean indAffectedFilesReady;

    private java.lang.Boolean indCaptureReady;

    private java.lang.Boolean indClosed;

    private java.lang.Boolean indDigitalizationReady;

    private java.lang.Boolean indFileCaptureReady;

    private java.lang.Boolean indMadridDailyLog;

    private java.lang.Boolean indOpen;

    private java.lang.Boolean indSearchCodesReady;

    private java.lang.Boolean indUserdocCaptureReady;

    private _int.wipo.ipas.IpasServices.IpasDateTime maxDailyLogDate;

    private _int.wipo.ipas.IpasServices.IpasDateTime minDailyLogDate;

    public CCriteriaDailyLog() {
    }

    public CCriteriaDailyLog(
           java.lang.String docLog,
           java.lang.String docOrigin,
           java.lang.Boolean indAffectedFilesReady,
           java.lang.Boolean indCaptureReady,
           java.lang.Boolean indClosed,
           java.lang.Boolean indDigitalizationReady,
           java.lang.Boolean indFileCaptureReady,
           java.lang.Boolean indMadridDailyLog,
           java.lang.Boolean indOpen,
           java.lang.Boolean indSearchCodesReady,
           java.lang.Boolean indUserdocCaptureReady,
           _int.wipo.ipas.IpasServices.IpasDateTime maxDailyLogDate,
           _int.wipo.ipas.IpasServices.IpasDateTime minDailyLogDate) {
           this.docLog = docLog;
           this.docOrigin = docOrigin;
           this.indAffectedFilesReady = indAffectedFilesReady;
           this.indCaptureReady = indCaptureReady;
           this.indClosed = indClosed;
           this.indDigitalizationReady = indDigitalizationReady;
           this.indFileCaptureReady = indFileCaptureReady;
           this.indMadridDailyLog = indMadridDailyLog;
           this.indOpen = indOpen;
           this.indSearchCodesReady = indSearchCodesReady;
           this.indUserdocCaptureReady = indUserdocCaptureReady;
           this.maxDailyLogDate = maxDailyLogDate;
           this.minDailyLogDate = minDailyLogDate;
    }


    /**
     * Gets the docLog value for this CCriteriaDailyLog.
     * 
     * @return docLog
     */
    public java.lang.String getDocLog() {
        return docLog;
    }


    /**
     * Sets the docLog value for this CCriteriaDailyLog.
     * 
     * @param docLog
     */
    public void setDocLog(java.lang.String docLog) {
        this.docLog = docLog;
    }


    /**
     * Gets the docOrigin value for this CCriteriaDailyLog.
     * 
     * @return docOrigin
     */
    public java.lang.String getDocOrigin() {
        return docOrigin;
    }


    /**
     * Sets the docOrigin value for this CCriteriaDailyLog.
     * 
     * @param docOrigin
     */
    public void setDocOrigin(java.lang.String docOrigin) {
        this.docOrigin = docOrigin;
    }


    /**
     * Gets the indAffectedFilesReady value for this CCriteriaDailyLog.
     * 
     * @return indAffectedFilesReady
     */
    public java.lang.Boolean getIndAffectedFilesReady() {
        return indAffectedFilesReady;
    }


    /**
     * Sets the indAffectedFilesReady value for this CCriteriaDailyLog.
     * 
     * @param indAffectedFilesReady
     */
    public void setIndAffectedFilesReady(java.lang.Boolean indAffectedFilesReady) {
        this.indAffectedFilesReady = indAffectedFilesReady;
    }


    /**
     * Gets the indCaptureReady value for this CCriteriaDailyLog.
     * 
     * @return indCaptureReady
     */
    public java.lang.Boolean getIndCaptureReady() {
        return indCaptureReady;
    }


    /**
     * Sets the indCaptureReady value for this CCriteriaDailyLog.
     * 
     * @param indCaptureReady
     */
    public void setIndCaptureReady(java.lang.Boolean indCaptureReady) {
        this.indCaptureReady = indCaptureReady;
    }


    /**
     * Gets the indClosed value for this CCriteriaDailyLog.
     * 
     * @return indClosed
     */
    public java.lang.Boolean getIndClosed() {
        return indClosed;
    }


    /**
     * Sets the indClosed value for this CCriteriaDailyLog.
     * 
     * @param indClosed
     */
    public void setIndClosed(java.lang.Boolean indClosed) {
        this.indClosed = indClosed;
    }


    /**
     * Gets the indDigitalizationReady value for this CCriteriaDailyLog.
     * 
     * @return indDigitalizationReady
     */
    public java.lang.Boolean getIndDigitalizationReady() {
        return indDigitalizationReady;
    }


    /**
     * Sets the indDigitalizationReady value for this CCriteriaDailyLog.
     * 
     * @param indDigitalizationReady
     */
    public void setIndDigitalizationReady(java.lang.Boolean indDigitalizationReady) {
        this.indDigitalizationReady = indDigitalizationReady;
    }


    /**
     * Gets the indFileCaptureReady value for this CCriteriaDailyLog.
     * 
     * @return indFileCaptureReady
     */
    public java.lang.Boolean getIndFileCaptureReady() {
        return indFileCaptureReady;
    }


    /**
     * Sets the indFileCaptureReady value for this CCriteriaDailyLog.
     * 
     * @param indFileCaptureReady
     */
    public void setIndFileCaptureReady(java.lang.Boolean indFileCaptureReady) {
        this.indFileCaptureReady = indFileCaptureReady;
    }


    /**
     * Gets the indMadridDailyLog value for this CCriteriaDailyLog.
     * 
     * @return indMadridDailyLog
     */
    public java.lang.Boolean getIndMadridDailyLog() {
        return indMadridDailyLog;
    }


    /**
     * Sets the indMadridDailyLog value for this CCriteriaDailyLog.
     * 
     * @param indMadridDailyLog
     */
    public void setIndMadridDailyLog(java.lang.Boolean indMadridDailyLog) {
        this.indMadridDailyLog = indMadridDailyLog;
    }


    /**
     * Gets the indOpen value for this CCriteriaDailyLog.
     * 
     * @return indOpen
     */
    public java.lang.Boolean getIndOpen() {
        return indOpen;
    }


    /**
     * Sets the indOpen value for this CCriteriaDailyLog.
     * 
     * @param indOpen
     */
    public void setIndOpen(java.lang.Boolean indOpen) {
        this.indOpen = indOpen;
    }


    /**
     * Gets the indSearchCodesReady value for this CCriteriaDailyLog.
     * 
     * @return indSearchCodesReady
     */
    public java.lang.Boolean getIndSearchCodesReady() {
        return indSearchCodesReady;
    }


    /**
     * Sets the indSearchCodesReady value for this CCriteriaDailyLog.
     * 
     * @param indSearchCodesReady
     */
    public void setIndSearchCodesReady(java.lang.Boolean indSearchCodesReady) {
        this.indSearchCodesReady = indSearchCodesReady;
    }


    /**
     * Gets the indUserdocCaptureReady value for this CCriteriaDailyLog.
     * 
     * @return indUserdocCaptureReady
     */
    public java.lang.Boolean getIndUserdocCaptureReady() {
        return indUserdocCaptureReady;
    }


    /**
     * Sets the indUserdocCaptureReady value for this CCriteriaDailyLog.
     * 
     * @param indUserdocCaptureReady
     */
    public void setIndUserdocCaptureReady(java.lang.Boolean indUserdocCaptureReady) {
        this.indUserdocCaptureReady = indUserdocCaptureReady;
    }


    /**
     * Gets the maxDailyLogDate value for this CCriteriaDailyLog.
     * 
     * @return maxDailyLogDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getMaxDailyLogDate() {
        return maxDailyLogDate;
    }


    /**
     * Sets the maxDailyLogDate value for this CCriteriaDailyLog.
     * 
     * @param maxDailyLogDate
     */
    public void setMaxDailyLogDate(_int.wipo.ipas.IpasServices.IpasDateTime maxDailyLogDate) {
        this.maxDailyLogDate = maxDailyLogDate;
    }


    /**
     * Gets the minDailyLogDate value for this CCriteriaDailyLog.
     * 
     * @return minDailyLogDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getMinDailyLogDate() {
        return minDailyLogDate;
    }


    /**
     * Sets the minDailyLogDate value for this CCriteriaDailyLog.
     * 
     * @param minDailyLogDate
     */
    public void setMinDailyLogDate(_int.wipo.ipas.IpasServices.IpasDateTime minDailyLogDate) {
        this.minDailyLogDate = minDailyLogDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaDailyLog)) return false;
        CCriteriaDailyLog other = (CCriteriaDailyLog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docLog==null && other.getDocLog()==null) || 
             (this.docLog!=null &&
              this.docLog.equals(other.getDocLog()))) &&
            ((this.docOrigin==null && other.getDocOrigin()==null) || 
             (this.docOrigin!=null &&
              this.docOrigin.equals(other.getDocOrigin()))) &&
            ((this.indAffectedFilesReady==null && other.getIndAffectedFilesReady()==null) || 
             (this.indAffectedFilesReady!=null &&
              this.indAffectedFilesReady.equals(other.getIndAffectedFilesReady()))) &&
            ((this.indCaptureReady==null && other.getIndCaptureReady()==null) || 
             (this.indCaptureReady!=null &&
              this.indCaptureReady.equals(other.getIndCaptureReady()))) &&
            ((this.indClosed==null && other.getIndClosed()==null) || 
             (this.indClosed!=null &&
              this.indClosed.equals(other.getIndClosed()))) &&
            ((this.indDigitalizationReady==null && other.getIndDigitalizationReady()==null) || 
             (this.indDigitalizationReady!=null &&
              this.indDigitalizationReady.equals(other.getIndDigitalizationReady()))) &&
            ((this.indFileCaptureReady==null && other.getIndFileCaptureReady()==null) || 
             (this.indFileCaptureReady!=null &&
              this.indFileCaptureReady.equals(other.getIndFileCaptureReady()))) &&
            ((this.indMadridDailyLog==null && other.getIndMadridDailyLog()==null) || 
             (this.indMadridDailyLog!=null &&
              this.indMadridDailyLog.equals(other.getIndMadridDailyLog()))) &&
            ((this.indOpen==null && other.getIndOpen()==null) || 
             (this.indOpen!=null &&
              this.indOpen.equals(other.getIndOpen()))) &&
            ((this.indSearchCodesReady==null && other.getIndSearchCodesReady()==null) || 
             (this.indSearchCodesReady!=null &&
              this.indSearchCodesReady.equals(other.getIndSearchCodesReady()))) &&
            ((this.indUserdocCaptureReady==null && other.getIndUserdocCaptureReady()==null) || 
             (this.indUserdocCaptureReady!=null &&
              this.indUserdocCaptureReady.equals(other.getIndUserdocCaptureReady()))) &&
            ((this.maxDailyLogDate==null && other.getMaxDailyLogDate()==null) || 
             (this.maxDailyLogDate!=null &&
              this.maxDailyLogDate.equals(other.getMaxDailyLogDate()))) &&
            ((this.minDailyLogDate==null && other.getMinDailyLogDate()==null) || 
             (this.minDailyLogDate!=null &&
              this.minDailyLogDate.equals(other.getMinDailyLogDate())));
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
        if (getDocLog() != null) {
            _hashCode += getDocLog().hashCode();
        }
        if (getDocOrigin() != null) {
            _hashCode += getDocOrigin().hashCode();
        }
        if (getIndAffectedFilesReady() != null) {
            _hashCode += getIndAffectedFilesReady().hashCode();
        }
        if (getIndCaptureReady() != null) {
            _hashCode += getIndCaptureReady().hashCode();
        }
        if (getIndClosed() != null) {
            _hashCode += getIndClosed().hashCode();
        }
        if (getIndDigitalizationReady() != null) {
            _hashCode += getIndDigitalizationReady().hashCode();
        }
        if (getIndFileCaptureReady() != null) {
            _hashCode += getIndFileCaptureReady().hashCode();
        }
        if (getIndMadridDailyLog() != null) {
            _hashCode += getIndMadridDailyLog().hashCode();
        }
        if (getIndOpen() != null) {
            _hashCode += getIndOpen().hashCode();
        }
        if (getIndSearchCodesReady() != null) {
            _hashCode += getIndSearchCodesReady().hashCode();
        }
        if (getIndUserdocCaptureReady() != null) {
            _hashCode += getIndUserdocCaptureReady().hashCode();
        }
        if (getMaxDailyLogDate() != null) {
            _hashCode += getMaxDailyLogDate().hashCode();
        }
        if (getMinDailyLogDate() != null) {
            _hashCode += getMinDailyLogDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaDailyLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaDailyLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docLog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indAffectedFilesReady");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indAffectedFilesReady"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indCaptureReady");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indCaptureReady"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indDigitalizationReady");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indDigitalizationReady"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indFileCaptureReady");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indFileCaptureReady"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indMadridDailyLog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indMadridDailyLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indSearchCodesReady");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indSearchCodesReady"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indUserdocCaptureReady");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indUserdocCaptureReady"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDailyLogDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxDailyLogDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minDailyLogDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minDailyLogDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
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
