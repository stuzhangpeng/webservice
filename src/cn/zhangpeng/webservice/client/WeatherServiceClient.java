package cn.zhangpeng.webservice.client;

/**ͨ��wsimport�������ɵĴ��빹���ͻ���
 * @Auther:zhangpeng
 * @Date:2019/8/10
 * @Description:cn.zhangpeng.webservice.client
 * @Version:1.0
 */

public class WeatherServiceClient {
    public static void main(String[] args) {
        //����������ͼ����
        WeatherServiceImplService weatherServiceImplService=new WeatherServiceImplService();
        //ͨ��������ͼ������webservice�����ʵ����
        WeatherServiceImpl port = weatherServiceImplService.getPort(WeatherServiceImpl.class);
        //ͨ��webservice����ʵ�����ѯ����
        System.out.println(port.getWeatherByCityName("yichun"));
    }

}
