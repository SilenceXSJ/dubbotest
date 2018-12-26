package org.xsj.service;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * describe:
 *
 * @author Shijin.Xie
 * @date 2018/12/25
 */

public class Application {


    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.out.println("Provider started.");
        try {
            System.in.read(); // press any key to exit
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
