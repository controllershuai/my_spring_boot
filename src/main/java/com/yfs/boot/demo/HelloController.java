package com.yfs.boot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/7/1.
 */
@RestController
public class HelloController {
    @RequestMapping("/index")
    public String index(){
        System.out.println("执行了index函数！");
        return "hehe";
    }
}
