package com.hello.world.controller;


import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA
 *
 * @auther youxiang
 * @date 2019/6/25 11:26
 * Description:
 */
@Log
@Controller
@RequestMapping("/e")
public class TestController {
    @RequestMapping("/test")
    public String test(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        HttpSession session = httpServletRequest.getSession();

       /* while (true){
            log.info("测试测试");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                log.info(e.getMessage());
            }
        }*/
       return "0";
    }
}
