package org.xsj.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xsj.api.DemoService;
import org.xsj.api.DemoService2;

/**
 * describe:
 *
 * @author Shijin.Xie
 * @date 2018/12/25
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        DemoService demoService = (DemoService)context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.sayHello("world");
        // Display the call result
        System.out.println(hello);

        Thread.sleep(2000L);
    }
}
