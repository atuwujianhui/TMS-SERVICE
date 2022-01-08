package com.fjzcit.tms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@MapperScan(basePackages = "com.fjzcit.tms.mapper")
public class TmsApplication {

    public static void main(String[] args) throws UnknownHostException {
        // SpringApplication.run(ZcatpApplication.class, args);
        SpringApplication app = new SpringApplication(Application.class);
        Environment env = app.run(args).getEnvironment();
        System.out.println("启动成功！！");
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("接口服务地址: \thttp://" + addr.getHostAddress() + ":" + env.getProperty("server.port"));
        System.out.println("测试地址: \t\thttp://" + addr.getHostAddress() + ":" + env.getProperty("server.port") + "/test");
        System.out.println("Swagger UI：\thttp://" + addr.getHostAddress() + ":" + env.getProperty("server.port") + "/swagger-ui.html#/");
    }

}
