package com.example.demo1.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public class Test1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("hello","0221");
        Object hello = map.get("hello");
        if(hello instanceof String){
            String hello1 = (String)hello;//泛型有继承可类型擦除
            System.out.println(hello1.length());//用了泛型将运行时可以确定的类型转换为编译期间就可以确定
        }else {
            throw new RuntimeException("类型转换异常");
        }
    }
}
