package com.example.demo1;

import com.alibaba.fastjson.JSON;
import com.example.demo1.bean.User;
import com.example.demo1.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class Demo1ApplicationTests {
    @Test
    public void test11(){
//        int min = Math.min(2, 4);
//        System.out.println(min);
        String[] s = {"df","gh","bn"};
//        String[] s1 = new String[5];
//        System.arraycopy(s,0,s1,0,3);
//        for (String s2 : s1) {
//            System.out.println(s2);
//        }
//        Object o = Array.get(s, 1);
//        System.out.println(o);
//        Object o = Array.newInstance(int.class, 5);
//        o.getClass();
//        Class<Void> aClass = void.class;
//        System.out.println(aClass);
//        Void s = new Void();
        Class<Void> type = Void.TYPE;
        System.out.println(type);
//        Class<User> userClass = User.class;
//        User user = new User();
//        Class<? extends User> aClass = user.getClass();
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(3);
//        list1.add(2);
//        List<? extends Number> list2 = list1;
//        Object o = list2.get(0);
//        list2.set(0,null);

//        Object e = "fgh";可以设置为null
//        list1.set(0,);/
//        System.out.println("dfghj");
//        for (Object o1 : list2) {
//            System.out.println(o1);
//        }
//        System.out.println(o);
       // Cat<Integer> cat = new Cat<>();
      //  cat.show("dfgh");
//        ChildCat<Integer, String> sd = new ChildCat<>();

//    }
//    class Cat<T>{
//         T age;
////        private K age;
//        public T getAge() {
//            return age;
//        }
//
//        public void setAge(T age) {
//            this.age = age;
//        }
//        public <K>K show(K k){
//            return k;
//        }
//    }
//    class ChildCat<E> extends Cat<E>{
//        E password;
//        K name;
//        Season.AUTMN=new Season();
//        Season autmn = Season.AUTMN;
//        System.out.println(autmn);
       // int random =(int) Math.random();
//        switch (Season.AUTMN){
//            case AUTMN:
//
//        }

//        switch (dd){
//            case Season.AUTMN:
//                System.out.println("川田");
//        }
//    }
//enum Season {


//         public static final Season SPRING = new Season(),
//         public static final Season SUMMER = new Season(),
//         public static final Season AUTMN = new Season(),
//         public static final Season WINTER = new Season();
//        SUMMER,
//    AUTMN,
//    WINTER
//}
//interface La{
//           String MAX = "ghjk";
}


















    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    public void test1(){
        User user = new User();
        user.setPassword("wang0221");
        user.setUserName("wangpandong");
        String s = UUID.randomUUID().toString().replace("-","");

//        String s1 = JSON.toJSONString(user);
        redisTemplate.opsForValue().set(s,user);
    }
    @Test
    public void test2(){
        Object wang = redisTemplate.opsForValue().get("wang");

        System.out.println(wang);
//        JSON.pa
    }
    @Test
    public void test3(){
        for (int i=0;i<5;i++){
        String s = UUID.randomUUID().toString();
        System.out.println(s);
        }
    }
    @Test
    public void test4() throws Exception{
        Class<User> userClass = User.class;
        User user = userClass.newInstance();
        Method method = userClass.getDeclaredMethod("setPassword", String.class);
        Object invoke = method.invoke(user, "wang0221");
        System.out.println(invoke);
        System.out.println(user.getPassword());
    }
    @Test
    public void test5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int i = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int j = scanner.nextInt();



    }





















    @Test
    public void contextLoads() {
//        jdbcTemplate.execute("update emp set salary=10000 where id =2");
        List<Emp> query = jdbcTemplate.query("select*from emp", new BeanPropertyRowMapper<>(Emp.class));
        for (Emp emp : query) {
            System.out.println(emp);
        }
        System.out.println("asdfgh");
        System.out.println("asdfgh");
        System.out.println("asdfgh");
        System.out.println("asdfgh");
        System.out.println("asdfgh");
    }

}
