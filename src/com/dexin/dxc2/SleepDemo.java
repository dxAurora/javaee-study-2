package com.dexin.dxc2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        // 每秒输出时间
        new SleepDemo().printDate();
        // 倒计时
        new SleepDemo().daoJiShi();
    }

    public void printDate() throws InterruptedException {
        // 每秒输出时间
        Date date = new Date();
        while (true) {
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
            Thread.sleep(1000);
            date = new Date();
        }
    }

    public void daoJiShi() throws InterruptedException {
        int sum = 10;
        while (sum > 0) {
            System.out.println(sum--);
            Thread.sleep(1000);
        }
    }
}
