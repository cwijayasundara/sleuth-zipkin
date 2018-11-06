
Click edit ..

Sleuth producers:

You need to include the below dependencies in your .pom

<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-sleuth</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-sleuth-zipkin</artifactId>
</dependency>
<dependency>
    <groupId>io.micrometer</groupId>
    <artifactId>micrometer-registry-prometheus</artifactId>
    <scope>runtime</scope>
</dependency>

In application.yml

spring:
  application:
    name: tradeservice
  zipkin:
    base-url: http://zipkin/
    
    
Zipkin server

You need to add the below dependencies in the .pom.

<dependency>
    <groupId>io.zipkin.java</groupId>
	<artifactId>zipkin-server</artifactId>
	<version>2.11.8</version>
</dependency>
<dependency>
    <groupId>io.zipkin.java</groupId>
    <artifactId>zipkin-autoconfigure-ui</artifactId>
    <version>2.11.6</version>
    <scope>runtime</scope>
</dependency>

In application.yml of the Zipkin server

spring:
  application:
    name: zipkin

management:
  metrics:
    web:
      server:
        auto-time-requests: false




