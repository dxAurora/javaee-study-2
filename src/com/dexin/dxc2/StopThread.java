package com.dexin.dxc2;

public class StopThread extends Thread {

    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println("run方法执行---" + i++);
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // 停止线程方法
    public void stop2(){
        this.flag = false;
    }

    public static void main(String[] args) {

        StopThread threadDemo = new StopThread();
        threadDemo.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main-----------" + i);
            if (i == 200){
                // 停止线程
                threadDemo.stop2();
            }
        }
    }
}
