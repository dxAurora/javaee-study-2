package com.dexin.dxc2;

import java.util.concurrent.*;

public class CallableDemo implements Callable {

    private int ticket = 10;

    @Override
    public Object call() throws Exception {
        while (ticket > 0){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第：" + ticket-- + "张票");
        }
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CallableDemo callableDemo = new CallableDemo();

        // 创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);

        // 提交执行
        Future<?> r1 = ser.submit(callableDemo);
        Future<?> r2 = ser.submit(callableDemo);
        Future<?> r3 = ser.submit(callableDemo);

        // 获取结果
        Object o1 = r1.get();
        Object o2 = r2.get();
        Object o3 = r3.get();

        // 输出结果
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        // 关闭服务
        ser.shutdownNow();
    }
}
