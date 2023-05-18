package com.dexin.dxc;

/**
 * @ClassName: MaiPiao02
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/8 22:22
 */
public class MaiPiao02 {
    public static void main(String[] args) {
        SellTicket03 sellTicket01 = new SellTicket03();
        new Thread(sellTicket01).start();
        new Thread(sellTicket01).start();
        new Thread(sellTicket01).start();

    }
}

class SellTicket03 implements Runnable {
    private static int ticketNum = 100;
    private boolean loop = true;

    public void sell() {
        synchronized (this){
            if (ticketNum <= 0) {
                System.out.println("卖完了");
                loop = false;
                return;
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票" + "剩余" + (--ticketNum));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}