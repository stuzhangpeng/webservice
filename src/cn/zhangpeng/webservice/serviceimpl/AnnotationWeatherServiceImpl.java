package cn.zhangpeng.webservice.serviceimpl;
import cn.zhangpeng.webservice.service.WeatherService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
/**使用注解设置wsdl内容发布webservice
 * @Auther:zhangpeng
 * @Date:2019/8/10
 * @Description:targetNamespace 指定命名空间,name 指定porttype的name,portName 指定port的name,serviceName  指定服务名称
 * @Version:1.0
 */
@WebService(targetNamespace ="http://webservice.zhangpeng.it",name = "WeatherSoap",portName = "WeatherSoapPort",serviceName = "WeatherWS")
public class AnnotationWeatherServiceImpl implements WeatherService {
    /**
    *功能描述：使用webmethod注解修改webservice的publish方法
    *@param:operationName 修改方法名 exclude 是否排除发布
    *@return:
    *@author:
    */
    @WebMethod(operationName = "getWeather",exclude = false)
    @Override
    public @WebResult(name ="result") String getWeatherByCityName(@WebParam(name = "cityName") String cityName) {
        System.out.println(cityName);
        return "raining";
    }
}
