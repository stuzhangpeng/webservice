package cn.zhangpeng.webservice.client;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**通过service编程实现webservice客户端
 * @Auther:zhangpeng
 * @Date:2019/8/10
 * @Description:cn.zhangpeng.webservice.client
 * @Version:1.0
 */

public class WeatherServiceClient1 {
    public static void main(String[] args) throws MalformedURLException {
        //创建wsdl的url地址
        URL url =new URL("http://192.168.2.105:8888/weather?wsdl");
        //创建服务名称 namespaceurl 命名空间地址，localpart 服务视图名
        QName qName=new QName("http://serviceimpl.webservice.zhangpeng.cn/","WeatherServiceImplService");
        //获得服务服务视图
        Service service = Service.create(url, qName);
        //获得webservice服务接口实现类
        WeatherServiceImpl port = service.getPort(WeatherServiceImpl.class);
        String yichun = port.getWeatherByCityName("yichun");
        System.out.println(yichun);
    }
}
