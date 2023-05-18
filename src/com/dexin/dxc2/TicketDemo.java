package com.dexin.dxc2;

public class TicketDemo implements Runnable {

    private int ticket = 50;

    private boolean flag = true;

    public static void main(String[] args) {
        TicketDemo ticketDemo = new TicketDemo();

        new Thread(ticketDemo, "小一").start();
        new Thread(ticketDemo, "小二").start();
        new Thread(ticketDemo, "小三").start();
        new Thread(ticketDemo, "小四").start();
    }

    @Override
    public void run() {
        while (flag) {
            try {
                buy();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void buy() throws InterruptedException {
        if (ticket <= 0) {
            flag = false;
            return;
        }

        Thread.sleep(100);

        System.out.println(Thread.currentThread().getName() + "抢到了" + ticket--);
    }
}
