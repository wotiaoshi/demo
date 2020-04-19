package com.example.demo1.task;

import java.util.Date;
import java.util.Map;
import java.util.Random;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        String className = "";
        for(int i = 0;i<100;i++){
            int num = (int)(Math.random()*3);
//            System.out.println(num);
            //Entity.getInstance(className);
            switch (num){
                case 0:
                    className = "java.lang.Object";
                    break;
                case 1:
                    className = "java.util.Date";
                    break;
                case 2:
                    className = "com.example.demo1.task.Entity";
                    break;
            }
            Object instance = Entity.getInstance(className);
            System.out.println(instance);
        }
    }
}
class Entity{

    public static Object getInstance(String className) throws Exception {
        return Class.forName(className).newInstance();
    }
}
