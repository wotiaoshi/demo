package com.example.demo1.iotest;

import java.io.*;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public class Test2 {
    public static void main(String[] args) throws Exception{
        User user = new User("wangpandong","16943",677,new User1("wangmingzhu"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("D:\\workspaceidea\\demo1\\src\\main\\resources\\hello.txt")));
        objectOutputStream.writeObject(user);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("D:\\workspaceidea\\demo1\\src\\main\\resources\\hello.txt")));
        Object o = objectInputStream.readObject();
        if(o instanceof User){
            User user1 = (User)o;

        System.out.println(user1+user1.notes);
        }
        objectOutputStream.flush();
        objectInputStream.close();
        objectOutputStream.close();
    }
}
