package com.dexin.dxc;

/**
 * @ClassName: Thread04
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/8 21:47
 */
public class Thread04 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread thread = new MyDaemonThread();
        thread.setDaemon(true);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("输出：" + i);
            Thread.sleep(1000);
        }
    }
}

class MyDaemonThread extends Thread {
    @Override
    public void run() {
        for (;;){
            System.out.println("hello java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
