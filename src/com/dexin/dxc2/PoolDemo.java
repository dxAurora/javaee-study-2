package com.dexin.dxc2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());

        executorService.shutdown();

        System.out.println(new PoolDemo().hashCode());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}


