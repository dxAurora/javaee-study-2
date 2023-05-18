package com.dexin.dxc;

/**
 * @ClassName: Thread02
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/7 21:02
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Dog implements Runnable {
    int times = 0;
    @Override
    public void run() {
        while (true){
            System.out.println(++times + "hello  Dog implements Runnable");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 10){
                break;
            }
        }
    }
}
