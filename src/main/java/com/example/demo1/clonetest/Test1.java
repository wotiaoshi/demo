package com.example.demo1.clonetest;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
//序列化克隆包装类字符串默认看成实现了克隆接口和序列化接口
public class Test1 {
    public static void main(String[] args) {
        Cat cat = new Cat("huangse");
        User user = new User("wangpandong", 123456, cat);
        User user1 = user.clone();
        Cat cat1 = user.getCat();
        Cat cat2 = user1.getCat();
        user1.setPassword(234);
        cat2.setClolor("luse");
//        cat.setClolor("luse");
//        user.setCat(cat.setClolor("luse"));
        System.out.println(user1);
        System.out.println(user);
    }
}
