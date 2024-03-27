/**
 * CDailyLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CDailyLog  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.IpasDateTime affectedFilesReadyDate;

    private _int.wipo.ipas.IpasServices.IpasDateTime certificationReadyDate;

    private _int.wipo.ipas.IpasServices.CDailyLogId dailyLogId;

    private _int.wipo.ipas.IpasServices.IpasDateTime digitalizationReadyDate;

    private _int.wipo.ipas.IpasServices.IpasDateTime fileCaptureReadyDate;

    private _int.wipo.ipas.IpasServices.IpasInteger firstDocNbr;

    private java.lang.Boolean indClosed;

    private java.lang.Boolean indOpen;

    private _int.wipo.ipas.IpasServices.IpasInteger lastDocNbr;

    private _int.wipo.ipas.IpasServices.IpasDateTime logoCaptureReadyDate;

    private _int.wipo.ipas.IpasServices.IpasDateTime searchCodesReadyDate;

    private _int.wipo.ipas.IpasServices.IpasDateTime userdocCaptureReadyDate;

    public CDailyLog() {
    }

    public CDailyLog(
           _int.wipo.ipas.IpasServices.IpasDateTime affectedFilesReadyDate,
           _int.wipo.ipas.IpasServices.IpasDateTime certificationReadyDate,
           _int.wipo.ipas.IpasServices.CDailyLogId dailyLogId,
           _int.wipo.ipas.IpasServices.IpasDateTime digitalizationReadyDate,
           _int.wipo.ipas.IpasServices.IpasDateTime fileCaptureReadyDate,
           _int.wipo.ipas.IpasServices.IpasInteger firstDocNbr,
           java.lang.Boolean indClosed,
           java.lang.Boolean indOpen,
           _int.wipo.ipas.IpasServices.IpasInteger lastDocNbr,
           _int.wipo.ipas.IpasServices.IpasDateTime logoCaptureReadyDate,
           _int.wipo.ipas.IpasServices.IpasDateTime searchCodesReadyDate,
           _int.wipo.ipas.IpasServices.IpasDateTime userdocCaptureReadyDate) {
           this.affectedFilesReadyDate = affectedFilesReadyDate;
           this.certificationReadyDate = certificationReadyDate;
           this.dailyLogId = dailyLogId;
           this.digitalizationReadyDate = digitalizationReadyDate;
           this.fileCaptureReadyDate = fileCaptureReadyDate;
           this.firstDocNbr = firstDocNbr;
           this.indClosed = indClosed;
           this.indOpen = indOpen;
           this.lastDocNbr = lastDocNbr;
           this.logoCaptureReadyDate = logoCaptureReadyDate;
           this.searchCodesReadyDate = searchCodesReadyDate;
           this.userdocCaptureReadyDate = userdocCaptureReadyDate;
    }


    /**
     * Gets the affectedFilesReadyDate value for this CDailyLog.
     * 
     * @return affectedFilesReadyDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getAffectedFilesReadyDate() {
        return affectedFilesReadyDate;
    }


    /**
     * Sets the affectedFilesReadyDate value for this CDailyLog.
     * 
     * @param affectedFilesReadyDate
     */
    public void setAffectedFilesReadyDate(_int.wipo.ipas.IpasServices.IpasDateTime affectedFilesReadyDate) {
        this.affectedFilesReadyDate = affectedFilesReadyDate;
    }


    /**
     * Gets the certificationReadyDate value for this CDailyLog.
     * 
     * @return certificationReadyDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getCertificationReadyDate() {
        return certificationReadyDate;
    }


    /**
     * Sets the certificationReadyDate value for this CDailyLog.
     * 
     * @param certificationReadyDate
     */
    public void setCertificationReadyDate(_int.wipo.ipas.IpasServices.IpasDateTime certificationReadyDate) {
        this.certificationReadyDate = certificationReadyDate;
    }


    /**
     * Gets the dailyLogId value for this CDailyLog.
     * 
     * @return dailyLogId
     */
    public _int.wipo.ipas.IpasServices.CDailyLogId getDailyLogId() {
        return dailyLogId;
    }


    /**
     * Sets the dailyLogId value for this CDailyLog.
     * 
     * @param dailyLogId
     */
    public void setDailyLogId(_int.wipo.ipas.IpasServices.CDailyLogId dailyLogId) {
        this.dailyLogId = dailyLogId;
    }


    /**
     * Gets the digitalizationReadyDate value for this CDailyLog.
     * 
     * @return digitalizationReadyDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getDigitalizationReadyDate() {
        return digitalizationReadyDate;
    }


    /**
     * Sets the digitalizationReadyDate value for this CDailyLog.
     * 
     * @param digitalizationReadyDate
     */
    public void setDigitalizationReadyDate(_int.wipo.ipas.IpasServices.IpasDateTime digitalizationReadyDate) {
        this.digitalizationReadyDate = digitalizationReadyDate;
    }


    /**
     * Gets the fileCaptureReadyDate value for this CDailyLog.
     * 
     * @return fileCaptureReadyDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getFileCaptureReadyDate() {
        return fileCaptureReadyDate;
    }


    /**
     * Sets the fileCaptureReadyDate value for this CDailyLog.
     * 
     * @param fileCaptureReadyDate
     */
    public void setFileCaptureReadyDate(_int.wipo.ipas.IpasServices.IpasDateTime fileCaptureReadyDate) {
        this.fileCaptureReadyDate = fileCaptureReadyDate;
    }


    /**
     * Gets the firstDocNbr value for this CDailyLog.
     * 
     * @return firstDocNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getFirstDocNbr() {
        return firstDocNbr;
    }


    /**
     * Sets the firstDocNbr value for this CDailyLog.
     * 
     * @param firstDocNbr
     */
    public void setFirstDocNbr(_int.wipo.ipas.IpasServices.IpasInteger firstDocNbr) {
        this.firstDocNbr = firstDocNbr;
    }


    /**
     * Gets the indClosed value for this CDailyLog.
     * 
     * @return indClosed
     */
    public java.lang.Boolean getIndClosed() {
        return indClosed;
    }


    /**
     * Sets the indClosed value for this CDailyLog.
     * 
     * @param indClosed
     */
    public void setIndClosed(java.lang.Boolean indClosed) {
        this.indClosed = indClosed;
    }


    /**
     * Gets the indOpen value for this CDailyLog.
     * 
     * @return indOpen
     */
    public java.lang.Boolean getIndOpen() {
        return indOpen;
    }


    /**
     * Sets the indOpen value for this CDailyLog.
     * 
     * @param indOpen
     */
    public void setIndOpen(java.lang.Boolean indOpen) {
        this.indOpen = indOpen;
    }


    /**
     * Gets the lastDocNbr value for this CDailyLog.
     * 
     * @return lastDocNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getLastDocNbr() {
        return lastDocNbr;
    }


    /**
     * Sets the lastDocNbr value for this CDailyLog.
     * 
     * @param lastDocNbr
     */
    public void setLastDocNbr(_int.wipo.ipas.IpasServices.IpasInteger lastDocNbr) {
        this.lastDocNbr = lastDocNbr;
    }


    /**
     * Gets the logoCaptureReadyDate value for this CDailyLog.
     * 
     * @return logoCaptureReadyDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getLogoCaptureReadyDate() {
        return logoCaptureReadyDate;
    }


    /**
     * Sets the logoCaptureReadyDate value for this CDailyLog.
     * 
     * @param logoCaptureReadyDate
     */
    public void setLogoCaptureReadyDate(_int.wipo.ipas.IpasServices.IpasDateTime logoCaptureReadyDate) {
        this.logoCaptureReadyDate = logoCaptureReadyDate;
    }


    /**
     * Gets the searchCodesReadyDate value for this CDailyLog.
     * 
     * @return searchCodesReadyDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getSearchCodesReadyDate() {
        return searchCodesReadyDate;
    }


    /**
     * Sets the searchCodesReadyDate value for this CDailyLog.
     * 
     * @param searchCodesReadyDate
     */
    public void setSearchCodesReadyDate(_int.wipo.ipas.IpasServices.IpasDateTime searchCodesReadyDate) {
        this.searchCodesReadyDate = searchCodesReadyDate;
    }


    /**
     * Gets the userdocCaptureReadyDate value for this CDailyLog.
     * 
     * @return userdocCaptureReadyDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getUserdocCaptureReadyDate() {
        return userdocCaptureReadyDate;
    }


    /**
     * Sets the userdocCaptureReadyDate value for this CDailyLog.
     * 
     * @param userdocCaptureReadyDate
     */
    public void setUserdocCaptureReadyDate(_int.wipo.ipas.IpasServices.IpasDateTime userdocCaptureReadyDate) {
        this.userdocCaptureReadyDate = userdocCaptureReadyDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDailyLog)) return false;
        CDailyLog other = (CDailyLog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.affectedFilesReadyDate==null && other.getAffectedFilesReadyDate()==null) || 
             (this.affectedFilesReadyDate!=null &&
              this.affectedFilesReadyDate.equals(other.getAffectedFilesReadyDate()))) &&
            ((this.certificationReadyDate==null && other.getCertificationReadyDate()==null) || 
             (this.certificationReadyDate!=null &&
              this.certificationReadyDate.equals(other.getCertificationReadyDate()))) &&
            ((this.dailyLogId==null && other.getDailyLogId()==null) || 
             (this.dailyLogId!=null &&
              this.dailyLogId.equals(other.getDailyLogId()))) &&
            ((this.digitalizationReadyDate==null && other.getDigitalizationReadyDate()==null) || 
             (this.digitalizationReadyDate!=null &&
              this.digitalizationReadyDate.equals(other.getDigitalizationReadyDate()))) &&
            ((this.fileCaptureReadyDate==null && other.getFileCaptureReadyDate()==null) || 
             (this.fileCaptureReadyDate!=null &&
              this.fileCaptureReadyDate.equals(other.getFileCaptureReadyDate()))) &&
            ((this.firstDocNbr==null && other.getFirstDocNbr()==null) || 
             (this.firstDocNbr!=null &&
              this.firstDocNbr.equals(other.getFirstDocNbr()))) &&
            ((this.indClosed==null && other.getIndClosed()==null) || 
             (this.indClosed!=null &&
              this.indClosed.equals(other.getIndClosed()))) &&
            ((this.indOpen==null && other.getIndOpen()==null) || 
             (this.indOpen!=null &&
              this.indOpen.equals(other.getIndOpen()))) &&
            ((this.lastDocNbr==null && other.getLastDocNbr()==null) || 
             (this.lastDocNbr!=null &&
              this.lastDocNbr.equals(other.getLastDocNbr()))) &&
            ((this.logoCaptureReadyDate==null && other.getLogoCaptureReadyDate()==null) || 
             (this.logoCaptureReadyDate!=null &&
              this.logoCaptureReadyDate.equals(other.getLogoCaptureReadyDate()))) &&
            ((this.searchCodesReadyDate==null && other.getSearchCodesReadyDate()==null) || 
             (this.searchCodesReadyDate!=null &&
              this.searchCodesReadyDate.equals(other.getSearchCodesReadyDate()))) &&
            ((this.userdocCaptureReadyDate==null && other.getUserdocCaptureReadyDate()==null) || 
             (this.userdocCaptureReadyDate!=null &&
              this.userdocCaptureReadyDate.equals(other.getUserdocCaptureReadyDate())));
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
        if (getAffectedFilesReadyDate() != null) {
            _hashCode += getAffectedFilesReadyDate().hashCode();
        }
        if (getCertificationReadyDate() != null) {
            _hashCode += getCertificationReadyDate().hashCode();
        }
        if (getDailyLogId() != null) {
            _hashCode += getDailyLogId().hashCode();
        }
        if (getDigitalizationReadyDate() != null) {
            _hashCode += getDigitalizationReadyDate().hashCode();
        }
        if (getFileCaptureReadyDate() != null) {
            _hashCode += getFileCaptureReadyDate().hashCode();
        }
        if (getFirstDocNbr() != null) {
            _hashCode += getFirstDocNbr().hashCode();
        }
        if (getIndClosed() != null) {
            _hashCode += getIndClosed().hashCode();
        }
        if (getIndOpen() != null) {
            _hashCode += getIndOpen().hashCode();
        }
        if (getLastDocNbr() != null) {
            _hashCode += getLastDocNbr().hashCode();
        }
        if (getLogoCaptureReadyDate() != null) {
            _hashCode += getLogoCaptureReadyDate().hashCode();
        }
        if (getSearchCodesReadyDate() != null) {
            _hashCode += getSearchCodesReadyDate().hashCode();
        }
        if (getUserdocCaptureReadyDate() != null) {
            _hashCode += getUserdocCaptureReadyDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDailyLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affectedFilesReadyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "affectedFilesReadyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificationReadyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificationReadyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyLogId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dailyLogId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDailyLogId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitalizationReadyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "digitalizationReadyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileCaptureReadyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileCaptureReadyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstDocNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstDocNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
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
        elemField.setFieldName("indOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastDocNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastDocNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoCaptureReadyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logoCaptureReadyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchCodesReadyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searchCodesReadyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdocCaptureReadyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdocCaptureReadyDate"));
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
