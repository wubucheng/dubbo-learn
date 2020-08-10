package me.wubc.dubbo.client;


import me.wubc.dubbo.server.sevice.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author wbc
 * @date 2020/8/10
 * @desc
 */
public class DubboClientApp {


    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"dubbo-client.xml"});
        context.start();
        HelloService demoService = (HelloService) context.getBean("helloService");
        System.out.println(demoService.sayHello());
    }

}
