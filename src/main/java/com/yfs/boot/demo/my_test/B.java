package com.yfs.boot.demo.my_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author Administrator
 * @date 2017/7/17
 */
//@Component
public class B {
//    @Autowired
    private A age;

    public B() {
        System.out.println(">>>>>>>>>>>fasdfasd>>>>>实例化B");
    }

    public B(A age) {
        System.out.println(">>>>>>>>>>>>>>>>实例化B");
        this.age = age;
    }
}
