package com.example.demo1.suanfa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        String s = " sdfgh ";
//        System.out.println(s+"%%");
//        System.out.println(s.trim()+"%%");
        String s1 = "中国";
        System.out.println(s1.charAt(0));
        System.out.println(s1.length());
        char[] chars = s1.toCharArray();
        System.out.println(chars.length);
        System.out.println();
        byte[] bytes = s1.getBytes();
        System.out.println(bytes.length);
        Cat cat = new Cat();
        new FileInputStream(new File("sdfgh"));
    }
}
class Cat{
    final Integer age = 0;
}
