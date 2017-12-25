package com.example.mavendemo.ThreadTest;

/**
 * 1-执行线程的顺序不代表线程的执行顺序 执行顺序是随机的
 * 2-多次start后会抛出IllegalThreadStateException异常
 */
public class ThreadTest {
    public static void main(String[] args){
        System.out.println("Hello World!"+Thread.currentThread().getName());
        MyThread myThread = new MyThread("我的Thread");
        myThread.start();
//        myThread.start();//多次调用则会报该异常 IllegalThreadStateException
        System.out.println("运行结束！");
    }
}
