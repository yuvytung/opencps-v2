/**
 * ReportDailyBO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.bulkSms.impl;

public class ReportDailyBO  implements java.io.Serializable {
    private java.lang.String cpAlias;

    private java.lang.String cpCode;

    private java.lang.Long cpId;

    private java.lang.String message;

    private java.lang.Long mtError;

    private java.lang.Long mtErrorAlias;

    private java.lang.Long mtFailure;

    private java.lang.Long mtSent;

    private java.lang.Long mtSentOut;

    private java.lang.Long mtSentVt;

    private java.lang.Long reportDailyId;

    private java.lang.String reportDate;

    private java.lang.Long result;

    private java.lang.Long smsSent;

    private java.lang.Long smsSentOut;

    private java.lang.Long smsSentVt;

    private java.lang.Long sumMT;

    public ReportDailyBO() {
    }

    public ReportDailyBO(
           java.lang.String cpAlias,
           java.lang.String cpCode,
           java.lang.Long cpId,
           java.lang.String message,
           java.lang.Long mtError,
           java.lang.Long mtErrorAlias,
           java.lang.Long mtFailure,
           java.lang.Long mtSent,
           java.lang.Long mtSentOut,
           java.lang.Long mtSentVt,
           java.lang.Long reportDailyId,
           java.lang.String reportDate,
           java.lang.Long result,
           java.lang.Long smsSent,
           java.lang.Long smsSentOut,
           java.lang.Long smsSentVt,
           java.lang.Long sumMT) {
           this.cpAlias = cpAlias;
           this.cpCode = cpCode;
           this.cpId = cpId;
           this.message = message;
           this.mtError = mtError;
           this.mtErrorAlias = mtErrorAlias;
           this.mtFailure = mtFailure;
           this.mtSent = mtSent;
           this.mtSentOut = mtSentOut;
           this.mtSentVt = mtSentVt;
           this.reportDailyId = reportDailyId;
           this.reportDate = reportDate;
           this.result = result;
           this.smsSent = smsSent;
           this.smsSentOut = smsSentOut;
           this.smsSentVt = smsSentVt;
           this.sumMT = sumMT;
    }


    /**
     * Gets the cpAlias value for this ReportDailyBO.
     * 
     * @return cpAlias
     */
    public java.lang.String getCpAlias() {
        return cpAlias;
    }


    /**
     * Sets the cpAlias value for this ReportDailyBO.
     * 
     * @param cpAlias
     */
    public void setCpAlias(java.lang.String cpAlias) {
        this.cpAlias = cpAlias;
    }


    /**
     * Gets the cpCode value for this ReportDailyBO.
     * 
     * @return cpCode
     */
    public java.lang.String getCpCode() {
        return cpCode;
    }


    /**
     * Sets the cpCode value for this ReportDailyBO.
     * 
     * @param cpCode
     */
    public void setCpCode(java.lang.String cpCode) {
        this.cpCode = cpCode;
    }


    /**
     * Gets the cpId value for this ReportDailyBO.
     * 
     * @return cpId
     */
    public java.lang.Long getCpId() {
        return cpId;
    }


    /**
     * Sets the cpId value for this ReportDailyBO.
     * 
     * @param cpId
     */
    public void setCpId(java.lang.Long cpId) {
        this.cpId = cpId;
    }


    /**
     * Gets the message value for this ReportDailyBO.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ReportDailyBO.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the mtError value for this ReportDailyBO.
     * 
     * @return mtError
     */
    public java.lang.Long getMtError() {
        return mtError;
    }


    /**
     * Sets the mtError value for this ReportDailyBO.
     * 
     * @param mtError
     */
    public void setMtError(java.lang.Long mtError) {
        this.mtError = mtError;
    }


    /**
     * Gets the mtErrorAlias value for this ReportDailyBO.
     * 
     * @return mtErrorAlias
     */
    public java.lang.Long getMtErrorAlias() {
        return mtErrorAlias;
    }


    /**
     * Sets the mtErrorAlias value for this ReportDailyBO.
     * 
     * @param mtErrorAlias
     */
    public void setMtErrorAlias(java.lang.Long mtErrorAlias) {
        this.mtErrorAlias = mtErrorAlias;
    }


    /**
     * Gets the mtFailure value for this ReportDailyBO.
     * 
     * @return mtFailure
     */
    public java.lang.Long getMtFailure() {
        return mtFailure;
    }


    /**
     * Sets the mtFailure value for this ReportDailyBO.
     * 
     * @param mtFailure
     */
    public void setMtFailure(java.lang.Long mtFailure) {
        this.mtFailure = mtFailure;
    }


    /**
     * Gets the mtSent value for this ReportDailyBO.
     * 
     * @return mtSent
     */
    public java.lang.Long getMtSent() {
        return mtSent;
    }


    /**
     * Sets the mtSent value for this ReportDailyBO.
     * 
     * @param mtSent
     */
    public void setMtSent(java.lang.Long mtSent) {
        this.mtSent = mtSent;
    }


    /**
     * Gets the mtSentOut value for this ReportDailyBO.
     * 
     * @return mtSentOut
     */
    public java.lang.Long getMtSentOut() {
        return mtSentOut;
    }


    /**
     * Sets the mtSentOut value for this ReportDailyBO.
     * 
     * @param mtSentOut
     */
    public void setMtSentOut(java.lang.Long mtSentOut) {
        this.mtSentOut = mtSentOut;
    }


    /**
     * Gets the mtSentVt value for this ReportDailyBO.
     * 
     * @return mtSentVt
     */
    public java.lang.Long getMtSentVt() {
        return mtSentVt;
    }


    /**
     * Sets the mtSentVt value for this ReportDailyBO.
     * 
     * @param mtSentVt
     */
    public void setMtSentVt(java.lang.Long mtSentVt) {
        this.mtSentVt = mtSentVt;
    }


    /**
     * Gets the reportDailyId value for this ReportDailyBO.
     * 
     * @return reportDailyId
     */
    public java.lang.Long getReportDailyId() {
        return reportDailyId;
    }


    /**
     * Sets the reportDailyId value for this ReportDailyBO.
     * 
     * @param reportDailyId
     */
    public void setReportDailyId(java.lang.Long reportDailyId) {
        this.reportDailyId = reportDailyId;
    }


    /**
     * Gets the reportDate value for this ReportDailyBO.
     * 
     * @return reportDate
     */
    public java.lang.String getReportDate() {
        return reportDate;
    }


    /**
     * Sets the reportDate value for this ReportDailyBO.
     * 
     * @param reportDate
     */
    public void setReportDate(java.lang.String reportDate) {
        this.reportDate = reportDate;
    }


    /**
     * Gets the result value for this ReportDailyBO.
     * 
     * @return result
     */
    public java.lang.Long getResult() {
        return result;
    }


    /**
     * Sets the result value for this ReportDailyBO.
     * 
     * @param result
     */
    public void setResult(java.lang.Long result) {
        this.result = result;
    }


    /**
     * Gets the smsSent value for this ReportDailyBO.
     * 
     * @return smsSent
     */
    public java.lang.Long getSmsSent() {
        return smsSent;
    }


    /**
     * Sets the smsSent value for this ReportDailyBO.
     * 
     * @param smsSent
     */
    public void setSmsSent(java.lang.Long smsSent) {
        this.smsSent = smsSent;
    }


    /**
     * Gets the smsSentOut value for this ReportDailyBO.
     * 
     * @return smsSentOut
     */
    public java.lang.Long getSmsSentOut() {
        return smsSentOut;
    }


    /**
     * Sets the smsSentOut value for this ReportDailyBO.
     * 
     * @param smsSentOut
     */
    public void setSmsSentOut(java.lang.Long smsSentOut) {
        this.smsSentOut = smsSentOut;
    }


    /**
     * Gets the smsSentVt value for this ReportDailyBO.
     * 
     * @return smsSentVt
     */
    public java.lang.Long getSmsSentVt() {
        return smsSentVt;
    }


    /**
     * Sets the smsSentVt value for this ReportDailyBO.
     * 
     * @param smsSentVt
     */
    public void setSmsSentVt(java.lang.Long smsSentVt) {
        this.smsSentVt = smsSentVt;
    }


    /**
     * Gets the sumMT value for this ReportDailyBO.
     * 
     * @return sumMT
     */
    public java.lang.Long getSumMT() {
        return sumMT;
    }


    /**
     * Sets the sumMT value for this ReportDailyBO.
     * 
     * @param sumMT
     */
    public void setSumMT(java.lang.Long sumMT) {
        this.sumMT = sumMT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportDailyBO)) return false;
        ReportDailyBO other = (ReportDailyBO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cpAlias==null && other.getCpAlias()==null) || 
             (this.cpAlias!=null &&
              this.cpAlias.equals(other.getCpAlias()))) &&
            ((this.cpCode==null && other.getCpCode()==null) || 
             (this.cpCode!=null &&
              this.cpCode.equals(other.getCpCode()))) &&
            ((this.cpId==null && other.getCpId()==null) || 
             (this.cpId!=null &&
              this.cpId.equals(other.getCpId()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.mtError==null && other.getMtError()==null) || 
             (this.mtError!=null &&
              this.mtError.equals(other.getMtError()))) &&
            ((this.mtErrorAlias==null && other.getMtErrorAlias()==null) || 
             (this.mtErrorAlias!=null &&
              this.mtErrorAlias.equals(other.getMtErrorAlias()))) &&
            ((this.mtFailure==null && other.getMtFailure()==null) || 
             (this.mtFailure!=null &&
              this.mtFailure.equals(other.getMtFailure()))) &&
            ((this.mtSent==null && other.getMtSent()==null) || 
             (this.mtSent!=null &&
              this.mtSent.equals(other.getMtSent()))) &&
            ((this.mtSentOut==null && other.getMtSentOut()==null) || 
             (this.mtSentOut!=null &&
              this.mtSentOut.equals(other.getMtSentOut()))) &&
            ((this.mtSentVt==null && other.getMtSentVt()==null) || 
             (this.mtSentVt!=null &&
              this.mtSentVt.equals(other.getMtSentVt()))) &&
            ((this.reportDailyId==null && other.getReportDailyId()==null) || 
             (this.reportDailyId!=null &&
              this.reportDailyId.equals(other.getReportDailyId()))) &&
            ((this.reportDate==null && other.getReportDate()==null) || 
             (this.reportDate!=null &&
              this.reportDate.equals(other.getReportDate()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.smsSent==null && other.getSmsSent()==null) || 
             (this.smsSent!=null &&
              this.smsSent.equals(other.getSmsSent()))) &&
            ((this.smsSentOut==null && other.getSmsSentOut()==null) || 
             (this.smsSentOut!=null &&
              this.smsSentOut.equals(other.getSmsSentOut()))) &&
            ((this.smsSentVt==null && other.getSmsSentVt()==null) || 
             (this.smsSentVt!=null &&
              this.smsSentVt.equals(other.getSmsSentVt()))) &&
            ((this.sumMT==null && other.getSumMT()==null) || 
             (this.sumMT!=null &&
              this.sumMT.equals(other.getSumMT())));
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
        if (getCpAlias() != null) {
            _hashCode += getCpAlias().hashCode();
        }
        if (getCpCode() != null) {
            _hashCode += getCpCode().hashCode();
        }
        if (getCpId() != null) {
            _hashCode += getCpId().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getMtError() != null) {
            _hashCode += getMtError().hashCode();
        }
        if (getMtErrorAlias() != null) {
            _hashCode += getMtErrorAlias().hashCode();
        }
        if (getMtFailure() != null) {
            _hashCode += getMtFailure().hashCode();
        }
        if (getMtSent() != null) {
            _hashCode += getMtSent().hashCode();
        }
        if (getMtSentOut() != null) {
            _hashCode += getMtSentOut().hashCode();
        }
        if (getMtSentVt() != null) {
            _hashCode += getMtSentVt().hashCode();
        }
        if (getReportDailyId() != null) {
            _hashCode += getReportDailyId().hashCode();
        }
        if (getReportDate() != null) {
            _hashCode += getReportDate().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getSmsSent() != null) {
            _hashCode += getSmsSent().hashCode();
        }
        if (getSmsSentOut() != null) {
            _hashCode += getSmsSentOut().hashCode();
        }
        if (getSmsSentVt() != null) {
            _hashCode += getSmsSentVt().hashCode();
        }
        if (getSumMT() != null) {
            _hashCode += getSumMT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportDailyBO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://impl.bulkSms.ws/", "reportDailyBO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtErrorAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtErrorAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtFailure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtFailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtSent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtSentOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtSentOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtSentVt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtSentVt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportDailyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportDailyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsSent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smsSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsSentOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smsSentOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsSentVt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smsSentVt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumMT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sumMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
