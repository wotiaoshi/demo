package com.example.demo1.test;

import java.util.Scanner;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public class ExcutorTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        System.out.println("主线程开始。。。");
        CompletableFuture<String> s1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("执行从线程..");
            String s = null;
            try {
                Thread.sleep(3000);
                System.out.println("从线程结束");
                s = UUID.randomUUID().toString().replace("-", "");
               // int i = 10/0;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return s;
        },executorService).whenComplete((r,e)->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(r);
            System.out.println(e);
        });
        System.out.println("主线程结束"+ s1.get());
    }
}
class Thread1 extends Thread{
    public void run(){
        try {
            Thread.sleep(5000);

            System.out.println("ertyui"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

