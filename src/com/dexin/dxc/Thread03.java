package com.dexin.dxc;

/**
 * @ClassName: Thread03
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/7 21:21
 */
public class Thread03 {
    public static void main(String[] args) {
        Girl girl = new Girl();
        Boy boy = new Boy();
        Thread thread1 = new Thread(girl);
        Thread thread2 = new Thread(boy);
        thread1.start();
        thread2.start();
    }
}

class Girl implements Runnable {
    int num = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("女孩" + " " + (++num));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (num == 10){
                break;
            }
        }
    }
}

class Boy implements Runnable {
    int num = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("男孩" + " " + (++num));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (num == 10) {
                break;
            }
        }

    }
}