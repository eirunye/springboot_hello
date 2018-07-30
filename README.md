# springboot_hello
## 如何创建Spring Boot 项目？
接下来我们将学习如何创建第一个Spring Boot项目 ***hello Spring Boot!*** 呢？

<div align="center">
    <img src="https://upload-images.jianshu.io/upload_images/3012005-ab363c756e658c99.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/650">
</div>


> **一、我们将以 IntelliJ IDEA 开发工具为例创建Spring Boot项目**

1. 如果还没下载过[IntelliJ IDEA](https://www.jetbrains.com/idea/),那么打开下载即可。
2. [IntelliJ IDEA 破解码](http://idea.lanyus.com/)，这个之前是可以用的，谢谢作者分享，不知道还能不能用。
3. 一切准备完成后，开始使用开发之旅吧。

>**二、IDEA创建Spring Boot项目流程**

**如图所示**

    1. File -----> New ------> Project...
<div align="center">
    <img src="https://upload-images.jianshu.io/upload_images/3012005-7742be37106c16f9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/650">
</div>


    2. 选择 Spring Initializr 
<div align="center">
    <img src="https://upload-images.jianshu.io/upload_images/3012005-a8d88cb7188bd499.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/650">
</div>   

 
    3. Project Matedata
<div align="center">
    <img src="https://upload-images.jianshu.io/upload_images/3012005-6887d50074b04b23.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/650">
</div>   


    4. 选择Web -----> Web -----> Spring Boot版本(默认即可)
<div align="center">
    <img src="https://upload-images.jianshu.io/upload_images/3012005-50a5a2138872929b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/700">
</div>   


    5. 选择项目保存的文件夹
<div align="center">
    <img src="https://upload-images.jianshu.io/upload_images/3012005-0cd4e1e9cb939640.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/650">
</div>   


    6. 创建完成 查看项目目录
        |--src:源代码文件 
           |--main
              |--java:项目的代码Java代码编写在这里
              |--resources:一般是配置文件等
                 |--static:静态资源文件(js、css、img)
                 |--template:模板(.html等)
                 |--application.properties: 配置文件
           |--test:主要是用于测试
           |--pom.xml:是添加依赖文件、版本号、打包设置为Jar或者War等 (如下图:pom.xml.png)
       |--target:是项目打包生成的.jar文件在这里   
![项目目录结构6.png](https://upload-images.jianshu.io/upload_images/3012005-eeecc6cb6fc171dc.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/650)

    7. 查看 pom.xml
![pom.xml.png](https://upload-images.jianshu.io/upload_images/3012005-f339f5fbed904ad7.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/650)
     
    8. 编辑配置application.properties 文件 一般需要配置一些端口，数据库连接、编码方式等，如下图
![application.properties.png](https://upload-images.jianshu.io/upload_images/3012005-041e35ae669efa54.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/650)
  
    9. 程序的入口文件
![程序入口Application.png](https://upload-images.jianshu.io/upload_images/3012005-15e6598f02ab7c2b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/650)


    10. 编写简单的例子 如下图所示:
      创建一个controller 包，在包下创建 HelloController.class
      添加注解:
          @RestController ---->默认Json格式数据
          @GetMapping(value = "/hello") 'hello':表示访问路径
          解下来的文章会讲述到更多的注解......
![controller.class.png](https://upload-images.jianshu.io/upload_images/3012005-0f3f42f1454efee5.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/650)
    
> **二、运行项目**
    
    1. 运行是否正常
    2. 结果
![运行项目1.png](https://upload-images.jianshu.io/upload_images/3012005-9bf6556f71b9fad4.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/650)
![运行项目2.png](https://upload-images.jianshu.io/upload_images/3012005-5614d3b09ec72898.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/650)

    3. 访问测试:

    (1). 浏览器访问
![访问结果1.png](https://upload-images.jianshu.io/upload_images/3012005-0a1c0d33cc3d922c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/650)
   
    (2). IDEA 自带的访问(推荐)
![访问结果2.png](https://upload-images.jianshu.io/upload_images/3012005-9e8238ce358139eb.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/650)

    (3). Postman 访问(推荐)
![Postman访问3.png](https://upload-images.jianshu.io/upload_images/3012005-a5d90d90d61382ff.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/650)

***下载 [Postman](https://www.getpostman.com/) 安装***

>**三、[下载demo](https://github.com/iconye/springboot_hello)**

>**四、总结**

    1. Spring Boot在开发中常用的配置
    2. 在开发中所需学习的系列教程

