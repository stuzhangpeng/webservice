package cn.zhangpeng.webservice.service;
/**获取天气服务的接口
 * @Auther:zhangpeng
 * @Date:2019/8/9
 * @Description:cn.zhangpeng.webservice.service
 * @Version:1.0
 */
public interface WeatherService {
    public abstract String  getWeatherByCityName(String cityName);
}
