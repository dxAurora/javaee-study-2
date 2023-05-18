package com.dexin.dxc2;

import java.util.concurrent.Semaphore;

public class ThreeThread {
    public static void main(String[] args) {
        // 初始化三把锁，只有A锁是可用的
        Semaphore A = new Semaphore(1);
        Semaphore B = new Semaphore(0);
        Semaphore C = new Semaphore(0);

        // 创建并启动三个线程，线程1获取A锁，释放B锁
        new ThreadDemo2(A, B).start();
        // 线程2获取B锁，释放C锁
        new ThreadDemo2(B, C).start();
        // 线程3获取C锁，释放A锁
        new ThreadDemo2(C, A).start();
    }

}

class ThreadDemo2 extends Thread {

    private Semaphore current;
    private Semaphore next;

    /**
     * 构造方法
     *
     * @param current 要获取的当前锁
     * @param next    要释放的下一把锁
     */
    public ThreadDemo2(Semaphore current, Semaphore next) {
        this.current = current;
        this.next = next;
    }

    static int num = 1;

    @Override
    public void run() {
        while (num <= 100) {
            try {
                // 获取当前锁，然后打印
                current.acquire();
                System.out.println(Thread.currentThread().getName() + "----" + num++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 释放下一把锁
            next.release();
        }
    }
}
