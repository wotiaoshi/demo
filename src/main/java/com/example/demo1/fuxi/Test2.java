package com.example.demo1.fuxi;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<Object, Object> map = new ConcurrentHashMap<>(10);
        map.put("fgh","ghj");
        Class<ConcurrentHashMap> map1 = ConcurrentHashMap.class;
        ConcurrentHashMap map2 = map1.newInstance();
        map2.put("dfg","ghj");
        Method method = map1.getDeclaredMethod("isEmpty");
        Object invoke = method.invoke(map2);
        System.out.println(invoke);
    }
}
