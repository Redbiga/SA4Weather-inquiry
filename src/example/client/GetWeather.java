/**
 * GetWeather.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package example.client;

/**
 * @author redA
 */
public class GetWeather  implements java.io.Serializable {
    private java.lang.String theCityCode;

    private java.lang.String theUserID;

    public GetWeather() {
    }

    public GetWeather(
           java.lang.String theCityCode,
           java.lang.String theUserID) {
           this.theCityCode = theCityCode;
           this.theUserID = theUserID;
    }


    /**
     * Gets the theCityCode value for this GetWeather.
     * 
     * @return theCityCode
     */
    public java.lang.String getTheCityCode() {
        return theCityCode;
    }


    /**
     * Sets the theCityCode value for this GetWeather.
     * 
     * @param theCityCode
     */
    public void setTheCityCode(java.lang.String theCityCode) {
        this.theCityCode = theCityCode;
    }


    /**
     * Gets the theUserID value for this GetWeather.
     * 
     * @return theUserID
     */
    public java.lang.String getTheUserID() {
        return theUserID;
    }


    /**
     * Sets the theUserID value for this GetWeather.
     * 
     * @param theUserID
     */
    public void setTheUserID(java.lang.String theUserID) {
        this.theUserID = theUserID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWeather)) return false;
        GetWeather other = (GetWeather) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.theCityCode==null && other.getTheCityCode()==null) || 
             (this.theCityCode!=null &&
              this.theCityCode.equals(other.getTheCityCode()))) &&
            ((this.theUserID==null && other.getTheUserID()==null) || 
             (this.theUserID!=null &&
              this.theUserID.equals(other.getTheUserID())));
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
        if (getTheCityCode() != null) {
            _hashCode += getTheCityCode().hashCode();
        }
        if (getTheUserID() != null) {
            _hashCode += getTheUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWeather.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">getWeather"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("theCityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "theCityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("theUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "theUserID"));
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
