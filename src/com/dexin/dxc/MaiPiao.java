package com.dexin.dxc;

/**
 * @ClassName: MaiPiao
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/7 21:37
 */
public class MaiPiao {
    public static void main(String[] args) {
        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();

        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();
    }
}

class SellTicket01 extends Thread{
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true){
            if (ticketNum <= 0){
                System.out.println("卖完了");
                break;
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票" + "剩余" + (--ticketNum));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
