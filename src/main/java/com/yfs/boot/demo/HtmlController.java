package com.yfs.boot.demo;

import com.yfs.boot.demo.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Administrator
 * @date 2017/7/1
 */
@Controller
@RequestMapping("/htmlcontroller")
public class HtmlController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/world")
    public String world(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }

    @RequestMapping("/hehe")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "hello";
    }

    @RequestMapping("/velocity")
    public String velocity(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "hello";
    }

    //没使用成功
    @RequestMapping("/swagger")
    public String swagger(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "swagger";
    }

    @RequestMapping("/error1")
    public String error1() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping("/error2")
    public String error2() throws MyException {
        throw new MyException("发生错误2");
    }
}
