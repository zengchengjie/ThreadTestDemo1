package com.example.mavendemo.ThreadTest;

/**
 * 此例证明线程是随机执行的
 */
public class ThreadRunningTest {
    public static void main(String[] args) {
        new MyRunningThread(1).start();
        new MyRunningThread(2).start();
        new MyRunningThread(3).start();
        new MyRunningThread(4).start();
        new MyRunningThread(5).start();
        new MyRunningThread(6).start();
        new MyRunningThread(7).start();
        new MyRunningThread(8).start();
    }
}
