package org.xsj.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.xsj.api.DemoService2;

/**
 * describe:
 *
 * @author Shijin.Xie
 * @date 2018/12/25
 */
@Slf4j
public class DemoServiceImpl2 implements DemoService2 {
    @Override
    public String sayHello2(String name) {
        log.info("request name 2:{} " , name);
        return "this name is 2 " + name;
    }
}
