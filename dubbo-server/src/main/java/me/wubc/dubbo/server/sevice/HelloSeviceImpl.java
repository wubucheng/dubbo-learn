package me.wubc.dubbo.server.sevice;

/**
 * @author wbc
 * @date 2020/8/10
 * @desc
 */
public class HelloSeviceImpl implements HelloService {

    public String sayHello() {
        System.out.println("hello dubbo");
        return "hello dubbo";
    }
}
