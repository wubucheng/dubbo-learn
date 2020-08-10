package me.wubc.dubbo.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author wbc
 * @date 2020/8/10
 * @desc
 */
public class DubboServerApp {


    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(new String[]{"dubbo-sever.xml"});
        classPathXmlApplicationContext.start();
        System.in.read();
    }
}
