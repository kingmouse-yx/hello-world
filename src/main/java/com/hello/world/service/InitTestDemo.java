package com.hello.world.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

/**
 * Created with IntelliJ IDEA
 *
 * @auther KingMouse
 * @date 2019/9/16 17:06
 * Description: @PostConstruct使用测试
 */
@Component
public class InitTestDemo {
    private  static final Logger logger = LoggerFactory.getLogger(InitTestDemo.class);
    @PostConstruct
    public void initPost(){
        //do something
        logger.info("测试PostConstruct,当前时间为：{}",LocalDate.now());
    }
}
