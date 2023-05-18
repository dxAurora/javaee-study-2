package com.dexin.dxc2;

public class TestPc {
    public static void main(String[] args) {
        SynContainer synContainer = new SynContainer();
        new Productor(synContainer).start();
        new Consumer(synContainer).start();
    }
}

// 生产者
class Productor extends Thread {
    SynContainer container;

    public Productor(SynContainer container){
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            container.push(new Chicken(i));
            System.out.println("生产了" + i+ "只鸡");
        }
    }
}

// 消费者
class Consumer extends Thread {
    SynContainer container;

    public Consumer(SynContainer container){
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("消费了" + container.pop().id + "只鸡");
        }
    }
}

// 产品
class Chicken {
    int id;

    public Chicken(int id) {
        this.id = id;
    }
}

// 缓冲区
class SynContainer {

    // 容器大小
    Chicken[] chickens = new Chicken[10];

    // 容器计数器
    int count = 0;

    // 生产者放入产品
    public synchronized void push(Chicken chicken) {

        // 如果容器满了，就需要等待消费者消费
        if (count == chickens.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // 如果没有满，我们就需要放入产品
        chickens[count] = chicken;
        count++;

        // 可以通知消费者消费了
        this.notifyAll();
    }

    // 消费者消费产品
    public synchronized Chicken pop() {
        // 判断能否消费
        if (count == 0) {
            // 等待生产者生产
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // 如果可以消费
        count--;
        Chicken chicken = chickens[count];

        // 通知生产者生产
        this.notifyAll();
        return chicken;
    }
}