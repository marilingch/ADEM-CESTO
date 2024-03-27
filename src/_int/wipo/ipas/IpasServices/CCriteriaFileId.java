/**
 * CCriteriaFileId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaFileId  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CFileId[] fileIdList;

    private _int.wipo.ipas.IpasServices.IpasInteger fileNbrFrom;

    private _int.wipo.ipas.IpasServices.IpasInteger fileNbrTo;

    private java.lang.String fileSeq;

    private _int.wipo.ipas.IpasServices.IpasInteger fileSeries;

    private java.lang.String fileType;

    private java.lang.String madridInternationalRegNo;

    private _int.wipo.ipas.IpasServices.IpasInteger officeDocumentNbr;

    private _int.wipo.ipas.IpasServices.IpasInteger publicationNbr;

    public CCriteriaFileId() {
    }

    public CCriteriaFileId(
           _int.wipo.ipas.IpasServices.CFileId[] fileIdList,
           _int.wipo.ipas.IpasServices.IpasInteger fileNbrFrom,
           _int.wipo.ipas.IpasServices.IpasInteger fileNbrTo,
           java.lang.String fileSeq,
           _int.wipo.ipas.IpasServices.IpasInteger fileSeries,
           java.lang.String fileType,
           java.lang.String madridInternationalRegNo,
           _int.wipo.ipas.IpasServices.IpasInteger officeDocumentNbr,
           _int.wipo.ipas.IpasServices.IpasInteger publicationNbr) {
           this.fileIdList = fileIdList;
           this.fileNbrFrom = fileNbrFrom;
           this.fileNbrTo = fileNbrTo;
           this.fileSeq = fileSeq;
           this.fileSeries = fileSeries;
           this.fileType = fileType;
           this.madridInternationalRegNo = madridInternationalRegNo;
           this.officeDocumentNbr = officeDocumentNbr;
           this.publicationNbr = publicationNbr;
    }


    /**
     * Gets the fileIdList value for this CCriteriaFileId.
     * 
     * @return fileIdList
     */
    public _int.wipo.ipas.IpasServices.CFileId[] getFileIdList() {
        return fileIdList;
    }


    /**
     * Sets the fileIdList value for this CCriteriaFileId.
     * 
     * @param fileIdList
     */
    public void setFileIdList(_int.wipo.ipas.IpasServices.CFileId[] fileIdList) {
        this.fileIdList = fileIdList;
    }

    public _int.wipo.ipas.IpasServices.CFileId getFileIdList(int i) {
        return this.fileIdList[i];
    }

    public void setFileIdList(int i, _int.wipo.ipas.IpasServices.CFileId _value) {
        this.fileIdList[i] = _value;
    }


    /**
     * Gets the fileNbrFrom value for this CCriteriaFileId.
     * 
     * @return fileNbrFrom
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getFileNbrFrom() {
        return fileNbrFrom;
    }


    /**
     * Sets the fileNbrFrom value for this CCriteriaFileId.
     * 
     * @param fileNbrFrom
     */
    public void setFileNbrFrom(_int.wipo.ipas.IpasServices.IpasInteger fileNbrFrom) {
        this.fileNbrFrom = fileNbrFrom;
    }


    /**
     * Gets the fileNbrTo value for this CCriteriaFileId.
     * 
     * @return fileNbrTo
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getFileNbrTo() {
        return fileNbrTo;
    }


    /**
     * Sets the fileNbrTo value for this CCriteriaFileId.
     * 
     * @param fileNbrTo
     */
    public void setFileNbrTo(_int.wipo.ipas.IpasServices.IpasInteger fileNbrTo) {
        this.fileNbrTo = fileNbrTo;
    }


    /**
     * Gets the fileSeq value for this CCriteriaFileId.
     * 
     * @return fileSeq
     */
    public java.lang.String getFileSeq() {
        return fileSeq;
    }


    /**
     * Sets the fileSeq value for this CCriteriaFileId.
     * 
     * @param fileSeq
     */
    public void setFileSeq(java.lang.String fileSeq) {
        this.fileSeq = fileSeq;
    }


    /**
     * Gets the fileSeries value for this CCriteriaFileId.
     * 
     * @return fileSeries
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getFileSeries() {
        return fileSeries;
    }


    /**
     * Sets the fileSeries value for this CCriteriaFileId.
     * 
     * @param fileSeries
     */
    public void setFileSeries(_int.wipo.ipas.IpasServices.IpasInteger fileSeries) {
        this.fileSeries = fileSeries;
    }


    /**
     * Gets the fileType value for this CCriteriaFileId.
     * 
     * @return fileType
     */
    public java.lang.String getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this CCriteriaFileId.
     * 
     * @param fileType
     */
    public void setFileType(java.lang.String fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the madridInternationalRegNo value for this CCriteriaFileId.
     * 
     * @return madridInternationalRegNo
     */
    public java.lang.String getMadridInternationalRegNo() {
        return madridInternationalRegNo;
    }


    /**
     * Sets the madridInternationalRegNo value for this CCriteriaFileId.
     * 
     * @param madridInternationalRegNo
     */
    public void setMadridInternationalRegNo(java.lang.String madridInternationalRegNo) {
        this.madridInternationalRegNo = madridInternationalRegNo;
    }


    /**
     * Gets the officeDocumentNbr value for this CCriteriaFileId.
     * 
     * @return officeDocumentNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getOfficeDocumentNbr() {
        return officeDocumentNbr;
    }


    /**
     * Sets the officeDocumentNbr value for this CCriteriaFileId.
     * 
     * @param officeDocumentNbr
     */
    public void setOfficeDocumentNbr(_int.wipo.ipas.IpasServices.IpasInteger officeDocumentNbr) {
        this.officeDocumentNbr = officeDocumentNbr;
    }


    /**
     * Gets the publicationNbr value for this CCriteriaFileId.
     * 
     * @return publicationNbr
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getPublicationNbr() {
        return publicationNbr;
    }


    /**
     * Sets the publicationNbr value for this CCriteriaFileId.
     * 
     * @param publicationNbr
     */
    public void setPublicationNbr(_int.wipo.ipas.IpasServices.IpasInteger publicationNbr) {
        this.publicationNbr = publicationNbr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaFileId)) return false;
        CCriteriaFileId other = (CCriteriaFileId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileIdList==null && other.getFileIdList()==null) || 
             (this.fileIdList!=null &&
              java.util.Arrays.equals(this.fileIdList, other.getFileIdList()))) &&
            ((this.fileNbrFrom==null && other.getFileNbrFrom()==null) || 
             (this.fileNbrFrom!=null &&
              this.fileNbrFrom.equals(other.getFileNbrFrom()))) &&
            ((this.fileNbrTo==null && other.getFileNbrTo()==null) || 
             (this.fileNbrTo!=null &&
              this.fileNbrTo.equals(other.getFileNbrTo()))) &&
            ((this.fileSeq==null && other.getFileSeq()==null) || 
             (this.fileSeq!=null &&
              this.fileSeq.equals(other.getFileSeq()))) &&
            ((this.fileSeries==null && other.getFileSeries()==null) || 
             (this.fileSeries!=null &&
              this.fileSeries.equals(other.getFileSeries()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            ((this.madridInternationalRegNo==null && other.getMadridInternationalRegNo()==null) || 
             (this.madridInternationalRegNo!=null &&
              this.madridInternationalRegNo.equals(other.getMadridInternationalRegNo()))) &&
            ((this.officeDocumentNbr==null && other.getOfficeDocumentNbr()==null) || 
             (this.officeDocumentNbr!=null &&
              this.officeDocumentNbr.equals(other.getOfficeDocumentNbr()))) &&
            ((this.publicationNbr==null && other.getPublicationNbr()==null) || 
             (this.publicationNbr!=null &&
              this.publicationNbr.equals(other.getPublicationNbr())));
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
        if (getFileIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFileNbrFrom() != null) {
            _hashCode += getFileNbrFrom().hashCode();
        }
        if (getFileNbrTo() != null) {
            _hashCode += getFileNbrTo().hashCode();
        }
        if (getFileSeq() != null) {
            _hashCode += getFileSeq().hashCode();
        }
        if (getFileSeries() != null) {
            _hashCode += getFileSeries().hashCode();
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        if (getMadridInternationalRegNo() != null) {
            _hashCode += getMadridInternationalRegNo().hashCode();
        }
        if (getOfficeDocumentNbr() != null) {
            _hashCode += getOfficeDocumentNbr().hashCode();
        }
        if (getPublicationNbr() != null) {
            _hashCode += getPublicationNbr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaFileId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaFileId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cFileId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileNbrFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileNbrFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileNbrTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileNbrTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("madridInternationalRegNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "madridInternationalRegNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeDocumentNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officeDocumentNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicationNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicationNbr"));
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
