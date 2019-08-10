package cn.zhangpeng.webservice.client;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**ͨ��service���ʵ��webservice�ͻ���
 * @Auther:zhangpeng
 * @Date:2019/8/10
 * @Description:cn.zhangpeng.webservice.client
 * @Version:1.0
 */

public class WeatherServiceClient1 {
    public static void main(String[] args) throws MalformedURLException {
        //����wsdl��url��ַ
        URL url =new URL("http://192.168.2.105:8888/weather?wsdl");
        //������������ namespaceurl �����ռ��ַ��localpart ������ͼ��
        QName qName=new QName("http://serviceimpl.webservice.zhangpeng.cn/","WeatherServiceImplService");
        //��÷��������ͼ
        Service service = Service.create(url, qName);
        //���webservice����ӿ�ʵ����
        WeatherServiceImpl port = service.getPort(WeatherServiceImpl.class);
        String yichun = port.getWeatherByCityName("yichun");
        System.out.println(yichun);
    }
}
