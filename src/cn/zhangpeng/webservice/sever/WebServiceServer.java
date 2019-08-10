package cn.zhangpeng.webservice.sever;
import cn.zhangpeng.webservice.serviceimpl.AnnotationWeatherServiceImpl;
import cn.zhangpeng.webservice.serviceimpl.WeatherServiceImpl;
import javax.xml.ws.Endpoint;
/** 发布websercie服务
 * @Auther:zhangpeng
 * @Date:2019/8/9
 * @Description:cn.zhangpeng.webservice.sever
 * @Version:1.0
 */

public class WebServiceServer {
    public static void main(String[] args) {
        //使用EndPoint类发布webservice服务,address 为服务地址，后面为实现类
        Endpoint.publish("http://192.168.2.105:8888/weather", new AnnotationWeatherServiceImpl());
    }
}
