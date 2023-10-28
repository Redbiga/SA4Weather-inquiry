/**
 * WeatherWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package example.client;

/**
 * @author redA
 */
public interface WeatherWS extends javax.xml.rpc.Service {

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
    public java.lang.String getWeatherWSSoap12Address();

    public example.client.WeatherWSSoap_PortType getWeatherWSSoap12() throws javax.xml.rpc.ServiceException;

    public example.client.WeatherWSSoap_PortType getWeatherWSSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getWeatherWSSoapAddress();

    public example.client.WeatherWSSoap_PortType getWeatherWSSoap() throws javax.xml.rpc.ServiceException;

    public example.client.WeatherWSSoap_PortType getWeatherWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
