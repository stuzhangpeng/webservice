webservice:三大要素
1.soap(1.1/1.2):简单对象访问协议——使用http协议的post方式 发送soap协议数据（xml格式 含有body标签和envelope标签）
soap1.1和1.2区别
namespace url不一样 ，soap的content-type为text/xml,soap1.2content-type为application/soap+xml
2.wsdl：webservice description language web服务描述语言  访问地址为：服务地址?wsdl
wsdl描述了websercice 为xml文档格式 里面描述了服务视图 服务名称 服务的方法及参数格式
3.uddi  webservice的目录服务，提供webservice服务的发布和查询
webservice特性：
优点：跨平台 跨语言 跨防火墙
缺点：性能较低(发送xml数据含有大量标签)
使用场景：
服务的集成和复用
同构程序不推荐使用
客户端的创建方式：
1.wsimport生成客户端代码
2.service编程
3.ajax调用(使用post方式发送soap的xml数据）
4.httpclient或httpurlconnection使用post方式发送soap的xml数据
可以使用注解修改wsdl内容