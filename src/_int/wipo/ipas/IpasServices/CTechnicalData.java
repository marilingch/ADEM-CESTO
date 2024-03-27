/**
 * CTechnicalData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CTechnicalData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CClaim[] claimList;

    private _int.wipo.ipas.IpasServices.CDrawing[] drawingList;

    private java.lang.String englishAbstract;

    private java.lang.String englishTitle;

    private java.lang.Boolean hasCpc;

    private java.lang.Boolean hasIpc;

    private _int.wipo.ipas.IpasServices.CIpcClass[] ipcClassList;

    private java.lang.String lastClaimsPageRef;

    private java.lang.String lastDescriptionPageRef;

    private _int.wipo.ipas.IpasServices.CLocarnoClass[] locarnoClassList;

    private java.lang.String mainAbstract;

    private _int.wipo.ipas.IpasServices.IpasDateTime noveltyDate;

    private java.lang.String title;

    private byte[] wordfileTitle;

    public CTechnicalData() {
    }

    public CTechnicalData(
           _int.wipo.ipas.IpasServices.CClaim[] claimList,
           _int.wipo.ipas.IpasServices.CDrawing[] drawingList,
           java.lang.String englishAbstract,
           java.lang.String englishTitle,
           java.lang.Boolean hasCpc,
           java.lang.Boolean hasIpc,
           _int.wipo.ipas.IpasServices.CIpcClass[] ipcClassList,
           java.lang.String lastClaimsPageRef,
           java.lang.String lastDescriptionPageRef,
           _int.wipo.ipas.IpasServices.CLocarnoClass[] locarnoClassList,
           java.lang.String mainAbstract,
           _int.wipo.ipas.IpasServices.IpasDateTime noveltyDate,
           java.lang.String title,
           byte[] wordfileTitle) {
           this.claimList = claimList;
           this.drawingList = drawingList;
           this.englishAbstract = englishAbstract;
           this.englishTitle = englishTitle;
           this.hasCpc = hasCpc;
           this.hasIpc = hasIpc;
           this.ipcClassList = ipcClassList;
           this.lastClaimsPageRef = lastClaimsPageRef;
           this.lastDescriptionPageRef = lastDescriptionPageRef;
           this.locarnoClassList = locarnoClassList;
           this.mainAbstract = mainAbstract;
           this.noveltyDate = noveltyDate;
           this.title = title;
           this.wordfileTitle = wordfileTitle;
    }


    /**
     * Gets the claimList value for this CTechnicalData.
     * 
     * @return claimList
     */
    public _int.wipo.ipas.IpasServices.CClaim[] getClaimList() {
        return claimList;
    }


    /**
     * Sets the claimList value for this CTechnicalData.
     * 
     * @param claimList
     */
    public void setClaimList(_int.wipo.ipas.IpasServices.CClaim[] claimList) {
        this.claimList = claimList;
    }

    public _int.wipo.ipas.IpasServices.CClaim getClaimList(int i) {
        return this.claimList[i];
    }

    public void setClaimList(int i, _int.wipo.ipas.IpasServices.CClaim _value) {
        this.claimList[i] = _value;
    }


    /**
     * Gets the drawingList value for this CTechnicalData.
     * 
     * @return drawingList
     */
    public _int.wipo.ipas.IpasServices.CDrawing[] getDrawingList() {
        return drawingList;
    }


    /**
     * Sets the drawingList value for this CTechnicalData.
     * 
     * @param drawingList
     */
    public void setDrawingList(_int.wipo.ipas.IpasServices.CDrawing[] drawingList) {
        this.drawingList = drawingList;
    }

    public _int.wipo.ipas.IpasServices.CDrawing getDrawingList(int i) {
        return this.drawingList[i];
    }

    public void setDrawingList(int i, _int.wipo.ipas.IpasServices.CDrawing _value) {
        this.drawingList[i] = _value;
    }


    /**
     * Gets the englishAbstract value for this CTechnicalData.
     * 
     * @return englishAbstract
     */
    public java.lang.String getEnglishAbstract() {
        return englishAbstract;
    }


    /**
     * Sets the englishAbstract value for this CTechnicalData.
     * 
     * @param englishAbstract
     */
    public void setEnglishAbstract(java.lang.String englishAbstract) {
        this.englishAbstract = englishAbstract;
    }


    /**
     * Gets the englishTitle value for this CTechnicalData.
     * 
     * @return englishTitle
     */
    public java.lang.String getEnglishTitle() {
        return englishTitle;
    }


    /**
     * Sets the englishTitle value for this CTechnicalData.
     * 
     * @param englishTitle
     */
    public void setEnglishTitle(java.lang.String englishTitle) {
        this.englishTitle = englishTitle;
    }


    /**
     * Gets the hasCpc value for this CTechnicalData.
     * 
     * @return hasCpc
     */
    public java.lang.Boolean getHasCpc() {
        return hasCpc;
    }


    /**
     * Sets the hasCpc value for this CTechnicalData.
     * 
     * @param hasCpc
     */
    public void setHasCpc(java.lang.Boolean hasCpc) {
        this.hasCpc = hasCpc;
    }


    /**
     * Gets the hasIpc value for this CTechnicalData.
     * 
     * @return hasIpc
     */
    public java.lang.Boolean getHasIpc() {
        return hasIpc;
    }


    /**
     * Sets the hasIpc value for this CTechnicalData.
     * 
     * @param hasIpc
     */
    public void setHasIpc(java.lang.Boolean hasIpc) {
        this.hasIpc = hasIpc;
    }


    /**
     * Gets the ipcClassList value for this CTechnicalData.
     * 
     * @return ipcClassList
     */
    public _int.wipo.ipas.IpasServices.CIpcClass[] getIpcClassList() {
        return ipcClassList;
    }


    /**
     * Sets the ipcClassList value for this CTechnicalData.
     * 
     * @param ipcClassList
     */
    public void setIpcClassList(_int.wipo.ipas.IpasServices.CIpcClass[] ipcClassList) {
        this.ipcClassList = ipcClassList;
    }

    public _int.wipo.ipas.IpasServices.CIpcClass getIpcClassList(int i) {
        return this.ipcClassList[i];
    }

    public void setIpcClassList(int i, _int.wipo.ipas.IpasServices.CIpcClass _value) {
        this.ipcClassList[i] = _value;
    }


    /**
     * Gets the lastClaimsPageRef value for this CTechnicalData.
     * 
     * @return lastClaimsPageRef
     */
    public java.lang.String getLastClaimsPageRef() {
        return lastClaimsPageRef;
    }


    /**
     * Sets the lastClaimsPageRef value for this CTechnicalData.
     * 
     * @param lastClaimsPageRef
     */
    public void setLastClaimsPageRef(java.lang.String lastClaimsPageRef) {
        this.lastClaimsPageRef = lastClaimsPageRef;
    }


    /**
     * Gets the lastDescriptionPageRef value for this CTechnicalData.
     * 
     * @return lastDescriptionPageRef
     */
    public java.lang.String getLastDescriptionPageRef() {
        return lastDescriptionPageRef;
    }


    /**
     * Sets the lastDescriptionPageRef value for this CTechnicalData.
     * 
     * @param lastDescriptionPageRef
     */
    public void setLastDescriptionPageRef(java.lang.String lastDescriptionPageRef) {
        this.lastDescriptionPageRef = lastDescriptionPageRef;
    }


    /**
     * Gets the locarnoClassList value for this CTechnicalData.
     * 
     * @return locarnoClassList
     */
    public _int.wipo.ipas.IpasServices.CLocarnoClass[] getLocarnoClassList() {
        return locarnoClassList;
    }


    /**
     * Sets the locarnoClassList value for this CTechnicalData.
     * 
     * @param locarnoClassList
     */
    public void setLocarnoClassList(_int.wipo.ipas.IpasServices.CLocarnoClass[] locarnoClassList) {
        this.locarnoClassList = locarnoClassList;
    }

    public _int.wipo.ipas.IpasServices.CLocarnoClass getLocarnoClassList(int i) {
        return this.locarnoClassList[i];
    }

    public void setLocarnoClassList(int i, _int.wipo.ipas.IpasServices.CLocarnoClass _value) {
        this.locarnoClassList[i] = _value;
    }


    /**
     * Gets the mainAbstract value for this CTechnicalData.
     * 
     * @return mainAbstract
     */
    public java.lang.String getMainAbstract() {
        return mainAbstract;
    }


    /**
     * Sets the mainAbstract value for this CTechnicalData.
     * 
     * @param mainAbstract
     */
    public void setMainAbstract(java.lang.String mainAbstract) {
        this.mainAbstract = mainAbstract;
    }


    /**
     * Gets the noveltyDate value for this CTechnicalData.
     * 
     * @return noveltyDate
     */
    public _int.wipo.ipas.IpasServices.IpasDateTime getNoveltyDate() {
        return noveltyDate;
    }


    /**
     * Sets the noveltyDate value for this CTechnicalData.
     * 
     * @param noveltyDate
     */
    public void setNoveltyDate(_int.wipo.ipas.IpasServices.IpasDateTime noveltyDate) {
        this.noveltyDate = noveltyDate;
    }


    /**
     * Gets the title value for this CTechnicalData.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CTechnicalData.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the wordfileTitle value for this CTechnicalData.
     * 
     * @return wordfileTitle
     */
    public byte[] getWordfileTitle() {
        return wordfileTitle;
    }


    /**
     * Sets the wordfileTitle value for this CTechnicalData.
     * 
     * @param wordfileTitle
     */
    public void setWordfileTitle(byte[] wordfileTitle) {
        this.wordfileTitle = wordfileTitle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CTechnicalData)) return false;
        CTechnicalData other = (CTechnicalData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claimList==null && other.getClaimList()==null) || 
             (this.claimList!=null &&
              java.util.Arrays.equals(this.claimList, other.getClaimList()))) &&
            ((this.drawingList==null && other.getDrawingList()==null) || 
             (this.drawingList!=null &&
              java.util.Arrays.equals(this.drawingList, other.getDrawingList()))) &&
            ((this.englishAbstract==null && other.getEnglishAbstract()==null) || 
             (this.englishAbstract!=null &&
              this.englishAbstract.equals(other.getEnglishAbstract()))) &&
            ((this.englishTitle==null && other.getEnglishTitle()==null) || 
             (this.englishTitle!=null &&
              this.englishTitle.equals(other.getEnglishTitle()))) &&
            ((this.hasCpc==null && other.getHasCpc()==null) || 
             (this.hasCpc!=null &&
              this.hasCpc.equals(other.getHasCpc()))) &&
            ((this.hasIpc==null && other.getHasIpc()==null) || 
             (this.hasIpc!=null &&
              this.hasIpc.equals(other.getHasIpc()))) &&
            ((this.ipcClassList==null && other.getIpcClassList()==null) || 
             (this.ipcClassList!=null &&
              java.util.Arrays.equals(this.ipcClassList, other.getIpcClassList()))) &&
            ((this.lastClaimsPageRef==null && other.getLastClaimsPageRef()==null) || 
             (this.lastClaimsPageRef!=null &&
              this.lastClaimsPageRef.equals(other.getLastClaimsPageRef()))) &&
            ((this.lastDescriptionPageRef==null && other.getLastDescriptionPageRef()==null) || 
             (this.lastDescriptionPageRef!=null &&
              this.lastDescriptionPageRef.equals(other.getLastDescriptionPageRef()))) &&
            ((this.locarnoClassList==null && other.getLocarnoClassList()==null) || 
             (this.locarnoClassList!=null &&
              java.util.Arrays.equals(this.locarnoClassList, other.getLocarnoClassList()))) &&
            ((this.mainAbstract==null && other.getMainAbstract()==null) || 
             (this.mainAbstract!=null &&
              this.mainAbstract.equals(other.getMainAbstract()))) &&
            ((this.noveltyDate==null && other.getNoveltyDate()==null) || 
             (this.noveltyDate!=null &&
              this.noveltyDate.equals(other.getNoveltyDate()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.wordfileTitle==null && other.getWordfileTitle()==null) || 
             (this.wordfileTitle!=null &&
              java.util.Arrays.equals(this.wordfileTitle, other.getWordfileTitle())));
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
        if (getClaimList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClaimList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClaimList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDrawingList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDrawingList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDrawingList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnglishAbstract() != null) {
            _hashCode += getEnglishAbstract().hashCode();
        }
        if (getEnglishTitle() != null) {
            _hashCode += getEnglishTitle().hashCode();
        }
        if (getHasCpc() != null) {
            _hashCode += getHasCpc().hashCode();
        }
        if (getHasIpc() != null) {
            _hashCode += getHasIpc().hashCode();
        }
        if (getIpcClassList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpcClassList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpcClassList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastClaimsPageRef() != null) {
            _hashCode += getLastClaimsPageRef().hashCode();
        }
        if (getLastDescriptionPageRef() != null) {
            _hashCode += getLastDescriptionPageRef().hashCode();
        }
        if (getLocarnoClassList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocarnoClassList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocarnoClassList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMainAbstract() != null) {
            _hashCode += getMainAbstract().hashCode();
        }
        if (getNoveltyDate() != null) {
            _hashCode += getNoveltyDate().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getWordfileTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWordfileTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWordfileTitle(), i);
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
        new org.apache.axis.description.TypeDesc(CTechnicalData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cTechnicalData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "claimList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cClaim"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drawingList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "drawingList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cDrawing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("englishAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("", "englishAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("englishTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "englishTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasCpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasIpc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasIpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipcClassList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipcClassList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cIpcClass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastClaimsPageRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastClaimsPageRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastDescriptionPageRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastDescriptionPageRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locarnoClassList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locarnoClassList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cLocarnoClass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noveltyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noveltyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wordfileTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wordfileTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
