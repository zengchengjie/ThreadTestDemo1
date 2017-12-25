package com.example.mavendemo.ThreadTest.ThreadPackage;

public class MyRunningThread extends Thread{
    private int i;
    public MyRunningThread(int i) {
        this.i= i;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(i);
    }
}
