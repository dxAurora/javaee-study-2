package com.dexin.dxc2;

public class YieldDemo {
    public static void main(String[] args) {
        YieldTest yieldTest = new YieldTest();
        new Thread(yieldTest).start();
        new Thread(yieldTest).start();
    }
}

class YieldTest implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始执行");
        // 线程礼让，礼让不一定成功，调用此方法运行状态的线程将变为就绪状态
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + "结束执行");
    }
}
