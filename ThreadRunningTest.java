package com.example.mavendemo.ThreadTest;

import com.example.mavendemo.ThreadTest.ThreadPackage.MyRunningThread;

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
        /**
         * 如果创建的线程类已经有一个父类了，由于java只能够单继承，
         * 就不能够再集成Thread类了，因此需要实现Runnable接口
         */
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("这是Runnable接口");
            }
        });
        thread.start();
    }
}
