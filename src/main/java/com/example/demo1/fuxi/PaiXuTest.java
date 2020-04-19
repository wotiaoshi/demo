package com.example.demo1.fuxi;

import java.util.*;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public class PaiXuTest {
    public static void main(String[] args) {
//        Hashtable<Object, Object> t = new Hashtable<>();
//        Object put = t.put(null, null);
        HashMap<Object, Object> map1 = new HashMap<>();
        map1.put(null,null);
        System.out.println(map1);

        TreeMap<Object, Object> map = new TreeMap<>();
        map.put(new User1("wang",23),"dfg");
        map.put(new User1("pan",22),"df");
        map.put(new User1("dong",24),"d");
        map.put(new User1("fd",24),"dfg");
        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry);
        }

    }
}
class User1 implements Comparable{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof User1){
            User1 o1 = (User1)o;
            return getAge()==o1.getAge()?o1.getName().compareTo(getName()):Integer.compare(this.getAge(),o1.getAge());
        }
        throw new RuntimeException("dfgh");
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }

//    @Override
//    public int compareTo(Object o) {
//        return name.com
//    }
}
