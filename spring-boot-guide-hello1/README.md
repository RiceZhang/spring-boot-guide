第一课 Hello World
==================

# 主要知识
要学习新知识，我们当然需要拿到第一手的资料。
请戳spring boot的官方主页 http://projects.spring.io/spring-boot/#quick-start

# 典型的继承 spring-boot-starter-parent 来实现Hello World
如官方网站的例子

# 采用非直接继承的方式，一般用来解决旧项目的问题
参考： http://www.cnblogs.com/larryzeal/p/5799195.html



# 课外知识
- apidDoc : 本例子采用了apiDoc, 一个基于nodeJs 的 自动构建RESTful API 的工具，生成漂亮的API接口
- Maven 的 mvnw, 在没有安装Maven的情况下，也可以使用Maven 下载东东，只要执行命令 ./mvnw clean install
  如何生成mvnw命令：mvn -N io.takari:maven:wrapper -Dmaven=3.3.3
  参考文章：http://www.javacoder.cn/?p=759
- gradle , 一个堪比Maven的包管理工具，当下在国外非常的流行，提供了wrapper, 可以在不需要 安装gradle 的过程中，可以直接下载jar包。
- logger, 如今更多的应用开始抛弃log4j , 更多的是使用log4j2 或者 logback , 这里我也是开始接触这些东东，但是你的应用日活量没百万，就没什么好担心的。


