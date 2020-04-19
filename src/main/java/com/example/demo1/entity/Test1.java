package com.example.demo1.entity;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public class Test1 extends ClassLoader{
    public static void main(String[] args) {
        System.out.println(Test1.class.getClassLoader());
    }
}
