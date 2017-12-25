package com.example.mavendemo.ThreadTest;

import com.example.mavendemo.ThreadTest.ThreadPackage.MyShareSourceThread;

public class ThreadShareSourceTest {
    public static void main(String[] args){
    MyShareSourceThread myShareSourceThread = new MyShareSourceThread();
    Thread a = new Thread(myShareSourceThread,"A");
    Thread b = new Thread(myShareSourceThread,"B");
    Thread c = new Thread(myShareSourceThread,"C");
    Thread d = new Thread(myShareSourceThread,"D");
    Thread e = new Thread(myShareSourceThread,"E");
    a.start();
    b.start();
    c.start();
    d.start();
    e.start();
    }
}
