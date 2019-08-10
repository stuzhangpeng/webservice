package cn.zhangpeng.webservice.serviceimpl;
import cn.zhangpeng.webservice.service.WeatherService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
/**ʹ��ע������wsdl���ݷ���webservice
 * @Auther:zhangpeng
 * @Date:2019/8/10
 * @Description:targetNamespace ָ�������ռ�,name ָ��porttype��name,portName ָ��port��name,serviceName  ָ����������
 * @Version:1.0
 */
@WebService(targetNamespace ="http://webservice.zhangpeng.it",name = "WeatherSoap",portName = "WeatherSoapPort",serviceName = "WeatherWS")
public class AnnotationWeatherServiceImpl implements WeatherService {
    /**
    *����������ʹ��webmethodע���޸�webservice��publish����
    *@param:operationName �޸ķ����� exclude �Ƿ��ų�����
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
