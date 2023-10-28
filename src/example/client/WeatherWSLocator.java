/**
 * WeatherWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package example.client;

public class WeatherWSLocator extends org.apache.axis.client.Service implements example.client.WeatherWS {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>2400多个城市天气预报Web服务</strong>，包含2300个以上中国城市和100个以上国外城市天气预报数据。数据每2.5小时左右自动更新一次，准确可靠。<br
 * />使用本站 WEB 服务请注明或链接本站：<a href="http://www.webxml.com.cn/" target="_blank">http://www.webxml.com.cn/</a>
 * 感谢大家的支持！<br /><br /><img alt="PDF" title="PDF file" src="http://www.webxml.com.cn/images/icon/pdf.gif"
 * style="vertical-align: middle;" /> <a href="http://www.webxml.com.cn/files/WeatherWsHelp.pdf"
 * target="_blank">接口帮助文档</a> &nbsp;&nbsp;&nbsp; <img alt="ZIP" title="ZIP
 * file" src="http://www.webxml.com.cn/images/icon/zip.gif" style="vertical-align:
 * middle;" /> <a href="http://www.webxml.com.cn/files/about_city.zip">部分城市介绍和气候背景</a>
 * &nbsp;&nbsp;&nbsp; <img alt="ZIP" title="ZIP file" src="http://www.webxml.com.cn/images/icon/zip.gif"
 * style="vertical-align: middle;" /> <a href="http://www.webxml.com.cn/files/city_photo.zip">部分城市图片</a>
 * &nbsp;&nbsp;&nbsp; <img alt="HTML" title="HTML file" src="http://www.webxml.com.cn/images/icon/html.gif"
 * style="vertical-align: middle;" /> <a href="http://www.webxml.com.cn/zh_cn/weather_icon.aspx"
 * target="_blank">天气现象和图例</a><br />&nbsp;
 */

    public WeatherWSLocator() {
    }


    public WeatherWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WeatherWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WeatherWSSoap12；
    private java.lang.String WeatherWSSoap12_address = "http://ws.webxml.com.cn/WebServices/WeatherWS.asmx";

    @Override
    public java.lang.String getWeatherWSSoap12Address() {
        return WeatherWSSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WeatherWSSoap12WSDDServiceName = "WeatherWSSoap12";

    public java.lang.String getWeatherWSSoap12WSDDServiceName() {
        return WeatherWSSoap12WSDDServiceName;
    }

    public void setWeatherWSSoap12WSDDServiceName(java.lang.String name) {
        WeatherWSSoap12WSDDServiceName = name;
    }

    @Override
    public example.client.WeatherWSSoap_PortType getWeatherWSSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WeatherWSSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWeatherWSSoap12(endpoint);
    }

    public example.client.WeatherWSSoap_PortType getWeatherWSSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            example.client.WeatherWSSoap12Stub _stub = new example.client.WeatherWSSoap12Stub(portAddress, this);
            _stub.setPortName(getWeatherWSSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWeatherWSSoap12EndpointAddress(java.lang.String address) {
        WeatherWSSoap12_address = address;
    }


    // Use to get a proxy class for WeatherWSSoap
    private java.lang.String WeatherWSSoap_address = "http://ws.webxml.com.cn/WebServices/WeatherWS.asmx";

    public java.lang.String getWeatherWSSoapAddress() {
        return WeatherWSSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WeatherWSSoapWSDDServiceName = "WeatherWSSoap";

    public java.lang.String getWeatherWSSoapWSDDServiceName() {
        return WeatherWSSoapWSDDServiceName;
    }

    public void setWeatherWSSoapWSDDServiceName(java.lang.String name) {
        WeatherWSSoapWSDDServiceName = name;
    }

    public example.client.WeatherWSSoap_PortType getWeatherWSSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WeatherWSSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWeatherWSSoap(endpoint);
    }

    public example.client.WeatherWSSoap_PortType getWeatherWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            example.client.WeatherWSSoap_BindingStub _stub = new example.client.WeatherWSSoap_BindingStub(portAddress, this);
            _stub.setPortName(getWeatherWSSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWeatherWSSoapEndpointAddress(java.lang.String address) {
        WeatherWSSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (example.client.WeatherWSSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                example.client.WeatherWSSoap12Stub _stub = new example.client.WeatherWSSoap12Stub(new java.net.URL(WeatherWSSoap12_address), this);
                _stub.setPortName(getWeatherWSSoap12WSDDServiceName());
                return _stub;
            }
            if (example.client.WeatherWSSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                example.client.WeatherWSSoap_BindingStub _stub = new example.client.WeatherWSSoap_BindingStub(new java.net.URL(WeatherWSSoap_address), this);
                _stub.setPortName(getWeatherWSSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WeatherWSSoap12".equals(inputPortName)) {
            return getWeatherWSSoap12();
        }
        else if ("WeatherWSSoap".equals(inputPortName)) {
            return getWeatherWSSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://WebXml.com.cn/", "WeatherWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "WeatherWSSoap12"));
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "WeatherWSSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WeatherWSSoap12".equals(portName)) {
            setWeatherWSSoap12EndpointAddress(address);
        }
        else 
if ("WeatherWSSoap".equals(portName)) {
            setWeatherWSSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
