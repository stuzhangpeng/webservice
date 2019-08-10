package cn.zhangpeng.webservice.serviceimpl;

import cn.zhangpeng.webservice.service.WeatherService;

import javax.jws.WebService;

/**
 * @Auther:zhangpeng
 * @Date:2019/8/9
 * @Description:cn.zhangpeng.webservice.serviceimpl
 * @Version:1.0
 */
@WebService
public class WeatherServiceImpl implements WeatherService {
    @Override
    public String getWeatherByCityName(String cityName) {
        System.out.println("fromclient:"+cityName);
        String weather="raining";
        return weather;
    }
}
