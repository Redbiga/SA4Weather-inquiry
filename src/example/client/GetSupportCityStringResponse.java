/**
 * GetSupportCityStringResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package example.client;

/**
 * @author redA
 */
public class GetSupportCityStringResponse  implements java.io.Serializable {
    private java.lang.String[] getSupportCityStringResult;

    public GetSupportCityStringResponse() {
    }

    public GetSupportCityStringResponse(
           java.lang.String[] getSupportCityStringResult) {
           this.getSupportCityStringResult = getSupportCityStringResult;
    }


    /**
     * Gets the getSupportCityStringResult value for this GetSupportCityStringResponse.
     * 
     * @return getSupportCityStringResult
     */
    public java.lang.String[] getGetSupportCityStringResult() {
        return getSupportCityStringResult;
    }


    /**
     * Sets the getSupportCityStringResult value for this GetSupportCityStringResponse.
     * 
     * @param getSupportCityStringResult
     */
    public void setGetSupportCityStringResult(java.lang.String[] getSupportCityStringResult) {
        this.getSupportCityStringResult = getSupportCityStringResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSupportCityStringResponse)) return false;
        GetSupportCityStringResponse other = (GetSupportCityStringResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSupportCityStringResult==null && other.getGetSupportCityStringResult()==null) || 
             (this.getSupportCityStringResult!=null &&
              java.util.Arrays.equals(this.getSupportCityStringResult, other.getGetSupportCityStringResult())));
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
        if (getGetSupportCityStringResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetSupportCityStringResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetSupportCityStringResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetSupportCityStringResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">getSupportCityStringResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSupportCityStringResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "getSupportCityStringResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "string"));
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
