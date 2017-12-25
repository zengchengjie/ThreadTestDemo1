# ThreadTestDemo1
学习线程的知识Demo1
- 使用runnable 的意义：
	在线程中，如果创建的线程类已经有一个父类了，由于java只能够单继承，就不能够再集成Thread类了，因此需要实现Runnable接口``` Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("这是Runnable接口");
            }
        });
        thread.start();```

- 在多个线程运行的情况下，线程是随机执行的，和在代码中的书写顺序没有关系```
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
```
