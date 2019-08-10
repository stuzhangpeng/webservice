package cn.zhangpeng.webservice.client;

/**通过wsimport命令生成的代码构建客户端
 * @Auther:zhangpeng
 * @Date:2019/8/10
 * @Description:cn.zhangpeng.webservice.client
 * @Version:1.0
 */

public class WeatherServiceClient {
    public static void main(String[] args) {
        //创建服务视图对象
        WeatherServiceImplService weatherServiceImplService=new WeatherServiceImplService();
        //通过服务视图对象获得webservice服务的实现类
        WeatherServiceImpl port = weatherServiceImplService.getPort(WeatherServiceImpl.class);
        //通过webservice服务实现类查询数据
        System.out.println(port.getWeatherByCityName("yichun"));
    }

}
