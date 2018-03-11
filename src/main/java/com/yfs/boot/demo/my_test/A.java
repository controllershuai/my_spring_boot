package com.yfs.boot.demo.my_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author Administrator
 * @date 2017/7/17
 */
//@Component
public class A {
//    @Autowired
    A a;
    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("123");
        sb.append("fasdf");

        System.out.println(sb);

        System.gc();

    }
}
