package com.dexin.dxc2;

public class ThreadDemo extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run方法执行---" + i);
        }
    }

    public static void main(String[] args) {

        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

        for (int i = 0; i < 2000; i++) {
            System.out.println("main方法执行---" + i);
        }
    }
}
