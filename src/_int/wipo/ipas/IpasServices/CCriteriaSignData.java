/**
 * CCriteriaSignData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.wipo.ipas.IpasServices;

public class CCriteriaSignData  implements java.io.Serializable {
    private _int.wipo.ipas.IpasServices.CCriteriaViennaClass[] criteriaViennaClassList;

    private java.lang.Boolean indMissingLogo;

    private java.lang.Boolean indViennaPending;

    private java.lang.String logoDescriptionContainsWords;

    private java.lang.String logoDescriptionInOtherLangContainsWords;

    private java.lang.String markNameContainsWords;

    private java.lang.String markNameEquals;

    private java.lang.String markNameInOtherLangContainsWords;

    private java.lang.String markNameSoundsLike;

    private java.lang.String markTranslationContainsWords;

    private java.lang.String markTranslationInOtherLangContainsWords;

    private java.lang.String markTransliterationContainsWords;

    private java.lang.String markTransliterationInOtherLangContainsWords;

    private _int.wipo.ipas.IpasServices.IpasInteger minSimilarityPercentage;

    private java.lang.String signType;

    public CCriteriaSignData() {
    }

    public CCriteriaSignData(
           _int.wipo.ipas.IpasServices.CCriteriaViennaClass[] criteriaViennaClassList,
           java.lang.Boolean indMissingLogo,
           java.lang.Boolean indViennaPending,
           java.lang.String logoDescriptionContainsWords,
           java.lang.String logoDescriptionInOtherLangContainsWords,
           java.lang.String markNameContainsWords,
           java.lang.String markNameEquals,
           java.lang.String markNameInOtherLangContainsWords,
           java.lang.String markNameSoundsLike,
           java.lang.String markTranslationContainsWords,
           java.lang.String markTranslationInOtherLangContainsWords,
           java.lang.String markTransliterationContainsWords,
           java.lang.String markTransliterationInOtherLangContainsWords,
           _int.wipo.ipas.IpasServices.IpasInteger minSimilarityPercentage,
           java.lang.String signType) {
           this.criteriaViennaClassList = criteriaViennaClassList;
           this.indMissingLogo = indMissingLogo;
           this.indViennaPending = indViennaPending;
           this.logoDescriptionContainsWords = logoDescriptionContainsWords;
           this.logoDescriptionInOtherLangContainsWords = logoDescriptionInOtherLangContainsWords;
           this.markNameContainsWords = markNameContainsWords;
           this.markNameEquals = markNameEquals;
           this.markNameInOtherLangContainsWords = markNameInOtherLangContainsWords;
           this.markNameSoundsLike = markNameSoundsLike;
           this.markTranslationContainsWords = markTranslationContainsWords;
           this.markTranslationInOtherLangContainsWords = markTranslationInOtherLangContainsWords;
           this.markTransliterationContainsWords = markTransliterationContainsWords;
           this.markTransliterationInOtherLangContainsWords = markTransliterationInOtherLangContainsWords;
           this.minSimilarityPercentage = minSimilarityPercentage;
           this.signType = signType;
    }


    /**
     * Gets the criteriaViennaClassList value for this CCriteriaSignData.
     * 
     * @return criteriaViennaClassList
     */
    public _int.wipo.ipas.IpasServices.CCriteriaViennaClass[] getCriteriaViennaClassList() {
        return criteriaViennaClassList;
    }


    /**
     * Sets the criteriaViennaClassList value for this CCriteriaSignData.
     * 
     * @param criteriaViennaClassList
     */
    public void setCriteriaViennaClassList(_int.wipo.ipas.IpasServices.CCriteriaViennaClass[] criteriaViennaClassList) {
        this.criteriaViennaClassList = criteriaViennaClassList;
    }

    public _int.wipo.ipas.IpasServices.CCriteriaViennaClass getCriteriaViennaClassList(int i) {
        return this.criteriaViennaClassList[i];
    }

    public void setCriteriaViennaClassList(int i, _int.wipo.ipas.IpasServices.CCriteriaViennaClass _value) {
        this.criteriaViennaClassList[i] = _value;
    }


    /**
     * Gets the indMissingLogo value for this CCriteriaSignData.
     * 
     * @return indMissingLogo
     */
    public java.lang.Boolean getIndMissingLogo() {
        return indMissingLogo;
    }


    /**
     * Sets the indMissingLogo value for this CCriteriaSignData.
     * 
     * @param indMissingLogo
     */
    public void setIndMissingLogo(java.lang.Boolean indMissingLogo) {
        this.indMissingLogo = indMissingLogo;
    }


    /**
     * Gets the indViennaPending value for this CCriteriaSignData.
     * 
     * @return indViennaPending
     */
    public java.lang.Boolean getIndViennaPending() {
        return indViennaPending;
    }


    /**
     * Sets the indViennaPending value for this CCriteriaSignData.
     * 
     * @param indViennaPending
     */
    public void setIndViennaPending(java.lang.Boolean indViennaPending) {
        this.indViennaPending = indViennaPending;
    }


    /**
     * Gets the logoDescriptionContainsWords value for this CCriteriaSignData.
     * 
     * @return logoDescriptionContainsWords
     */
    public java.lang.String getLogoDescriptionContainsWords() {
        return logoDescriptionContainsWords;
    }


    /**
     * Sets the logoDescriptionContainsWords value for this CCriteriaSignData.
     * 
     * @param logoDescriptionContainsWords
     */
    public void setLogoDescriptionContainsWords(java.lang.String logoDescriptionContainsWords) {
        this.logoDescriptionContainsWords = logoDescriptionContainsWords;
    }


    /**
     * Gets the logoDescriptionInOtherLangContainsWords value for this CCriteriaSignData.
     * 
     * @return logoDescriptionInOtherLangContainsWords
     */
    public java.lang.String getLogoDescriptionInOtherLangContainsWords() {
        return logoDescriptionInOtherLangContainsWords;
    }


    /**
     * Sets the logoDescriptionInOtherLangContainsWords value for this CCriteriaSignData.
     * 
     * @param logoDescriptionInOtherLangContainsWords
     */
    public void setLogoDescriptionInOtherLangContainsWords(java.lang.String logoDescriptionInOtherLangContainsWords) {
        this.logoDescriptionInOtherLangContainsWords = logoDescriptionInOtherLangContainsWords;
    }


    /**
     * Gets the markNameContainsWords value for this CCriteriaSignData.
     * 
     * @return markNameContainsWords
     */
    public java.lang.String getMarkNameContainsWords() {
        return markNameContainsWords;
    }


    /**
     * Sets the markNameContainsWords value for this CCriteriaSignData.
     * 
     * @param markNameContainsWords
     */
    public void setMarkNameContainsWords(java.lang.String markNameContainsWords) {
        this.markNameContainsWords = markNameContainsWords;
    }


    /**
     * Gets the markNameEquals value for this CCriteriaSignData.
     * 
     * @return markNameEquals
     */
    public java.lang.String getMarkNameEquals() {
        return markNameEquals;
    }


    /**
     * Sets the markNameEquals value for this CCriteriaSignData.
     * 
     * @param markNameEquals
     */
    public void setMarkNameEquals(java.lang.String markNameEquals) {
        this.markNameEquals = markNameEquals;
    }


    /**
     * Gets the markNameInOtherLangContainsWords value for this CCriteriaSignData.
     * 
     * @return markNameInOtherLangContainsWords
     */
    public java.lang.String getMarkNameInOtherLangContainsWords() {
        return markNameInOtherLangContainsWords;
    }


    /**
     * Sets the markNameInOtherLangContainsWords value for this CCriteriaSignData.
     * 
     * @param markNameInOtherLangContainsWords
     */
    public void setMarkNameInOtherLangContainsWords(java.lang.String markNameInOtherLangContainsWords) {
        this.markNameInOtherLangContainsWords = markNameInOtherLangContainsWords;
    }


    /**
     * Gets the markNameSoundsLike value for this CCriteriaSignData.
     * 
     * @return markNameSoundsLike
     */
    public java.lang.String getMarkNameSoundsLike() {
        return markNameSoundsLike;
    }


    /**
     * Sets the markNameSoundsLike value for this CCriteriaSignData.
     * 
     * @param markNameSoundsLike
     */
    public void setMarkNameSoundsLike(java.lang.String markNameSoundsLike) {
        this.markNameSoundsLike = markNameSoundsLike;
    }


    /**
     * Gets the markTranslationContainsWords value for this CCriteriaSignData.
     * 
     * @return markTranslationContainsWords
     */
    public java.lang.String getMarkTranslationContainsWords() {
        return markTranslationContainsWords;
    }


    /**
     * Sets the markTranslationContainsWords value for this CCriteriaSignData.
     * 
     * @param markTranslationContainsWords
     */
    public void setMarkTranslationContainsWords(java.lang.String markTranslationContainsWords) {
        this.markTranslationContainsWords = markTranslationContainsWords;
    }


    /**
     * Gets the markTranslationInOtherLangContainsWords value for this CCriteriaSignData.
     * 
     * @return markTranslationInOtherLangContainsWords
     */
    public java.lang.String getMarkTranslationInOtherLangContainsWords() {
        return markTranslationInOtherLangContainsWords;
    }


    /**
     * Sets the markTranslationInOtherLangContainsWords value for this CCriteriaSignData.
     * 
     * @param markTranslationInOtherLangContainsWords
     */
    public void setMarkTranslationInOtherLangContainsWords(java.lang.String markTranslationInOtherLangContainsWords) {
        this.markTranslationInOtherLangContainsWords = markTranslationInOtherLangContainsWords;
    }


    /**
     * Gets the markTransliterationContainsWords value for this CCriteriaSignData.
     * 
     * @return markTransliterationContainsWords
     */
    public java.lang.String getMarkTransliterationContainsWords() {
        return markTransliterationContainsWords;
    }


    /**
     * Sets the markTransliterationContainsWords value for this CCriteriaSignData.
     * 
     * @param markTransliterationContainsWords
     */
    public void setMarkTransliterationContainsWords(java.lang.String markTransliterationContainsWords) {
        this.markTransliterationContainsWords = markTransliterationContainsWords;
    }


    /**
     * Gets the markTransliterationInOtherLangContainsWords value for this CCriteriaSignData.
     * 
     * @return markTransliterationInOtherLangContainsWords
     */
    public java.lang.String getMarkTransliterationInOtherLangContainsWords() {
        return markTransliterationInOtherLangContainsWords;
    }


    /**
     * Sets the markTransliterationInOtherLangContainsWords value for this CCriteriaSignData.
     * 
     * @param markTransliterationInOtherLangContainsWords
     */
    public void setMarkTransliterationInOtherLangContainsWords(java.lang.String markTransliterationInOtherLangContainsWords) {
        this.markTransliterationInOtherLangContainsWords = markTransliterationInOtherLangContainsWords;
    }


    /**
     * Gets the minSimilarityPercentage value for this CCriteriaSignData.
     * 
     * @return minSimilarityPercentage
     */
    public _int.wipo.ipas.IpasServices.IpasInteger getMinSimilarityPercentage() {
        return minSimilarityPercentage;
    }


    /**
     * Sets the minSimilarityPercentage value for this CCriteriaSignData.
     * 
     * @param minSimilarityPercentage
     */
    public void setMinSimilarityPercentage(_int.wipo.ipas.IpasServices.IpasInteger minSimilarityPercentage) {
        this.minSimilarityPercentage = minSimilarityPercentage;
    }


    /**
     * Gets the signType value for this CCriteriaSignData.
     * 
     * @return signType
     */
    public java.lang.String getSignType() {
        return signType;
    }


    /**
     * Sets the signType value for this CCriteriaSignData.
     * 
     * @param signType
     */
    public void setSignType(java.lang.String signType) {
        this.signType = signType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCriteriaSignData)) return false;
        CCriteriaSignData other = (CCriteriaSignData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.criteriaViennaClassList==null && other.getCriteriaViennaClassList()==null) || 
             (this.criteriaViennaClassList!=null &&
              java.util.Arrays.equals(this.criteriaViennaClassList, other.getCriteriaViennaClassList()))) &&
            ((this.indMissingLogo==null && other.getIndMissingLogo()==null) || 
             (this.indMissingLogo!=null &&
              this.indMissingLogo.equals(other.getIndMissingLogo()))) &&
            ((this.indViennaPending==null && other.getIndViennaPending()==null) || 
             (this.indViennaPending!=null &&
              this.indViennaPending.equals(other.getIndViennaPending()))) &&
            ((this.logoDescriptionContainsWords==null && other.getLogoDescriptionContainsWords()==null) || 
             (this.logoDescriptionContainsWords!=null &&
              this.logoDescriptionContainsWords.equals(other.getLogoDescriptionContainsWords()))) &&
            ((this.logoDescriptionInOtherLangContainsWords==null && other.getLogoDescriptionInOtherLangContainsWords()==null) || 
             (this.logoDescriptionInOtherLangContainsWords!=null &&
              this.logoDescriptionInOtherLangContainsWords.equals(other.getLogoDescriptionInOtherLangContainsWords()))) &&
            ((this.markNameContainsWords==null && other.getMarkNameContainsWords()==null) || 
             (this.markNameContainsWords!=null &&
              this.markNameContainsWords.equals(other.getMarkNameContainsWords()))) &&
            ((this.markNameEquals==null && other.getMarkNameEquals()==null) || 
             (this.markNameEquals!=null &&
              this.markNameEquals.equals(other.getMarkNameEquals()))) &&
            ((this.markNameInOtherLangContainsWords==null && other.getMarkNameInOtherLangContainsWords()==null) || 
             (this.markNameInOtherLangContainsWords!=null &&
              this.markNameInOtherLangContainsWords.equals(other.getMarkNameInOtherLangContainsWords()))) &&
            ((this.markNameSoundsLike==null && other.getMarkNameSoundsLike()==null) || 
             (this.markNameSoundsLike!=null &&
              this.markNameSoundsLike.equals(other.getMarkNameSoundsLike()))) &&
            ((this.markTranslationContainsWords==null && other.getMarkTranslationContainsWords()==null) || 
             (this.markTranslationContainsWords!=null &&
              this.markTranslationContainsWords.equals(other.getMarkTranslationContainsWords()))) &&
            ((this.markTranslationInOtherLangContainsWords==null && other.getMarkTranslationInOtherLangContainsWords()==null) || 
             (this.markTranslationInOtherLangContainsWords!=null &&
              this.markTranslationInOtherLangContainsWords.equals(other.getMarkTranslationInOtherLangContainsWords()))) &&
            ((this.markTransliterationContainsWords==null && other.getMarkTransliterationContainsWords()==null) || 
             (this.markTransliterationContainsWords!=null &&
              this.markTransliterationContainsWords.equals(other.getMarkTransliterationContainsWords()))) &&
            ((this.markTransliterationInOtherLangContainsWords==null && other.getMarkTransliterationInOtherLangContainsWords()==null) || 
             (this.markTransliterationInOtherLangContainsWords!=null &&
              this.markTransliterationInOtherLangContainsWords.equals(other.getMarkTransliterationInOtherLangContainsWords()))) &&
            ((this.minSimilarityPercentage==null && other.getMinSimilarityPercentage()==null) || 
             (this.minSimilarityPercentage!=null &&
              this.minSimilarityPercentage.equals(other.getMinSimilarityPercentage()))) &&
            ((this.signType==null && other.getSignType()==null) || 
             (this.signType!=null &&
              this.signType.equals(other.getSignType())));
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
        if (getCriteriaViennaClassList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCriteriaViennaClassList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCriteriaViennaClassList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIndMissingLogo() != null) {
            _hashCode += getIndMissingLogo().hashCode();
        }
        if (getIndViennaPending() != null) {
            _hashCode += getIndViennaPending().hashCode();
        }
        if (getLogoDescriptionContainsWords() != null) {
            _hashCode += getLogoDescriptionContainsWords().hashCode();
        }
        if (getLogoDescriptionInOtherLangContainsWords() != null) {
            _hashCode += getLogoDescriptionInOtherLangContainsWords().hashCode();
        }
        if (getMarkNameContainsWords() != null) {
            _hashCode += getMarkNameContainsWords().hashCode();
        }
        if (getMarkNameEquals() != null) {
            _hashCode += getMarkNameEquals().hashCode();
        }
        if (getMarkNameInOtherLangContainsWords() != null) {
            _hashCode += getMarkNameInOtherLangContainsWords().hashCode();
        }
        if (getMarkNameSoundsLike() != null) {
            _hashCode += getMarkNameSoundsLike().hashCode();
        }
        if (getMarkTranslationContainsWords() != null) {
            _hashCode += getMarkTranslationContainsWords().hashCode();
        }
        if (getMarkTranslationInOtherLangContainsWords() != null) {
            _hashCode += getMarkTranslationInOtherLangContainsWords().hashCode();
        }
        if (getMarkTransliterationContainsWords() != null) {
            _hashCode += getMarkTransliterationContainsWords().hashCode();
        }
        if (getMarkTransliterationInOtherLangContainsWords() != null) {
            _hashCode += getMarkTransliterationInOtherLangContainsWords().hashCode();
        }
        if (getMinSimilarityPercentage() != null) {
            _hashCode += getMinSimilarityPercentage().hashCode();
        }
        if (getSignType() != null) {
            _hashCode += getSignType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCriteriaSignData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaSignData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaViennaClassList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criteriaViennaClassList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "cCriteriaViennaClass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indMissingLogo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indMissingLogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indViennaPending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indViennaPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoDescriptionContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logoDescriptionContainsWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoDescriptionInOtherLangContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logoDescriptionInOtherLangContainsWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markNameContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markNameContainsWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markNameEquals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markNameEquals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markNameInOtherLangContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markNameInOtherLangContainsWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markNameSoundsLike");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markNameSoundsLike"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markTranslationContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markTranslationContainsWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markTranslationInOtherLangContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markTranslationInOtherLangContainsWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markTransliterationContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markTransliterationContainsWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markTransliterationInOtherLangContainsWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markTransliterationInOtherLangContainsWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minSimilarityPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minSimilarityPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ipas.wipo.int/IpasServices", "ipasInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signType"));
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
