package com.example.demo1;

import lombok.SneakyThrows;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */

public class ThreadTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        System.out.println("主线程开始");
//        FutureTask<String> task = new FutureTask<>(new Thread01());
//        Thread thread = new Thread(task);
//        thread.start();
//        String s = task.get();//这个方法是阻塞的
//        System.out.println(s);
//        System.out.println("主线程结束");

//        Thread02 t = new Thread02();
//        System.out.println("主线程开始");
//        Thread t1 = new Thread(t);
//        Thread t2 = new Thread(t);
//        Thread t3 = new Thread(t);
//        t1.start();
//        t2.start();
//        t2.join(2000);
//        t3.start();


        System.out.println("主线程开始");
        Thread02 t = new Thread02();
        Thread t1 = new Thread(t);
        t1.start();

        t1.join();//插入一个准备就绪的线程的线程调用wait方法没有人唤醒所以设置超时时间
        System.out.println("主线程结束");










//        String s = "";
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                synchronized (s){
//                    try {
//                      //Thread.sleep(1000);
//                        s.wait();
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//
//
//
//                    System.out.println("lalala");
//                }
//
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                synchronized (s){
//                    s.notify();
//                    System.out.println("dfghjk");
//                }
//            }
//        }).start();

    }
}
class Thread01 implements Callable<String>{

    @Override
    public String call() throws Exception {
        System.out.println("异步方法开始执行");
        Thread.sleep(3000);
        System.out.println("异步方法执行结束");
        return "ok";
    }
}
class Thread02 implements Runnable{
    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();
    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            lock.lock();
                if(ticket>0) {
                   // wait(2000);
                    //Thread.sleep(1000);
                    ticket--;
                    System.out.println(Thread.currentThread() + ":" + "剩余票数" + ticket);
                }
            lock.unlock();
                //Thread.sleep(1000);
        }
    }
}
