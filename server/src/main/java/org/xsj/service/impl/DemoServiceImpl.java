package org.xsj.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.xsj.api.DemoService;
import org.xsj.api.DemoService2;

/**
 * describe:
 *
 * @author Shijin.Xie
 * @date 2018/12/25
 */
@Slf4j
public class DemoServiceImpl implements DemoService {

    private DemoService2 demoService2s;

    @Override
    public String sayHello(String name) {
        log.info("request name:{} " , name);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return demoService2s.sayHello2(name);
    }

    public DemoService2 getDemoService2s() {
        return demoService2s;
    }

    public DemoServiceImpl setDemoService2s(DemoService2 demoService2s) {
        this.demoService2s = demoService2s;
        return this;
    }

    public static Logger getLog() {
        return log;
    }
}
