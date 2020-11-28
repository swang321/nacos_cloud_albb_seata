# nocas + springcloud alibaba +seata

##### 参考  `https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E`

### 下载安装 nocas 

##### 1  nocas环境搭建  启动 访问主页  http://localhost:8848/nacos/  用户名 密码 默认  nacos nacos
    nocas 环境需要  java ， maven 环境  
        
    -m standalone  单节点启动
    Linux----     sh startup.sh -m standalone
    windows----   cmd startup.cmd -m standalone
    
##### 2 新建父模块
    
推荐依赖 版本

        <spring.boot.version>2.3.2.RELEASE</spring.boot.version>
        <spring.cloud.version>Hoxton.SR8</spring.cloud.version>
        <spring.cloud.alibaba.version>2.2.2.RELEASE</spring.cloud.alibaba.version> 
        
        <!--nacos注册中心-->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
        </dependency>   

##### 3 新建 nacos-provider 模块

 * 启动类添加 服务与注册 注解 @EnableDiscoveryClient	
 

 ##### 4 新建 nacos-consumer 模块
 
* 启动类添加 服务与注册 注解 @EnableDiscoveryClient	

##### 5 消费方式 （三种方式）

    RestTemplate
    WebClient  spring5 新特性
    Feign 

##### 6 nacos作为配置管理

    分离的多环境配置，可以更灵活的管理权限，安全性更高

##### 7 先在 nacos 添加配置 

    Data ID
    Group
    配置内容 （title=hello nacos） 选择 Properties 方式
    新建配置中心模块 添加依赖
    <dependency>
        <groupId>com.alibaba.cloud</groupId>
        <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
    </dependency>
    获取配置类 需要添加 @RefreshScope 注解
    主要用来让这个类下的配置内容支持动态刷新，也就是当我们的应用启动之后，修改了Nacos中的配置内容之后，这里也会马上生效。

    指定配置文件
    spring.cloud.nacos.config.prefix=example
    指定配置文件格式
    spring.cloud.nacos.config.file-extension=yaml
    指定分组
    spring.cloud.nacos.config.group=DEV_GROUP

##### 8 nacos 多环境 配置方法

* 第一种：通过Data ID与profile实现

* 第二种：通过Group实现

* 通过Namespace实现  （官方建议的方式）

##### 9 下载 sentinel jar包 启动  访问主页 http://localhost:8080/

##### 添加 maven 依赖

      <!-- SpringCloud ailibaba sentinel-->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-sentinel</artifactId>
        </dependency>

##### 添加配置
  
  
    spring:
      application:
        name: albb-sentinel
        sentinel:
          transport:
            #配置Sentin dashboard地址
            dashboard: localhost:8080
            # 默认8719端口，假如被占用了会自动从8719端口+1进行扫描，直到找到未被占用的 端口
            port: 8719



















