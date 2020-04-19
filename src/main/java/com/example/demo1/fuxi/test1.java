package com.example.demo1.fuxi;

import java.io.Serializable;
import java.util.*;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public class test1 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("hello","Mrs wang");
        System.out.println("strt".hashCode());
        new Integer(1).hashCode();
        TreeMap<Object, Object> treeMap = new TreeMap<>();
        //treeMap.put(2, 12);
        treeMap.put(2, 78);
        treeMap.put(6,56);

        Set<Map.Entry<Object, Object>> entries = treeMap.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry);
        }
    }
}
