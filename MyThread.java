package com.example.mavendemo.ThreadTest;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MyThread" + i);
        }
    }
}
