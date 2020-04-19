package com.example.demo1.iotest;

import org.springframework.util.ResourceUtils;

import java.io.*;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public class Test1 {
    public static void main(String[] args) throws Exception{
//        File file = ResourceUtils.getFile("classpath:hello.txt");
//        System.out.println(file.length());
        File file = new File("D:\\workspaceidea\\demo1\\src\\main\\resources\\hello.txt");
        File file1 = new File("D:\\workspaceidea\\demo1\\src\\main\\resources\\hello.txt2");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        byte[] bytes = new byte[5];
        int length=0;

        while(( length = fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,length);
        }
        fileOutputStream.flush();
        fileInputStream.close();
        fileOutputStream.close();

    }
}
