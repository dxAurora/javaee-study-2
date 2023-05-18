package com.dexin.dxc2;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        LockTest lockTest = new LockTest();

        new Thread(lockTest,"小一").start();
        new Thread(lockTest,"小二").start();
        new Thread(lockTest,"小三").start();
    }

}

class LockTest implements Runnable{
    int ticket = 20;

    // 定义lock锁
    private final ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(200);
                        System.out.println(Thread.currentThread().getName() + "拿到了" + ticket--);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }

        }
    }
}
