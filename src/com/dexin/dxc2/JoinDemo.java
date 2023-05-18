package com.dexin.dxc2;

public class JoinDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("vip-run方法执行---"+ i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinDemo joinDemo = new JoinDemo();
        Thread thread = new Thread(joinDemo);
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main线程执行---" + i);
            if (i == 10) {
                thread.join();
            }
        }

    }
}
