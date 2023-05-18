package com.dexin.dxc;

/**
 * @ClassName: Thread01
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/7 20:26
 * 类说明：通过继承Thread 类创建线程
 */
public class Thread01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();
    }
}

class Cat extends Thread {
    int times = 0;

    @Override
    public void run() {
        while (true) {
            // 每隔一秒输出一次
            System.out.println((++times) + "hello java Thread!!!" + Thread.currentThread().getName());
            // 让该线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 10) {
                break;
            }
        }
    }
}
