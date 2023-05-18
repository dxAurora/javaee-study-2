package com.dexin.dxc;

import java.util.Scanner;

/**
 * @ClassName: Thread05
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/8 23:07
 */
public class Thread05 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}

class A extends Thread {
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            System.out.println((int) (Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    private A a;

    public B(A a){
        this.a = a;
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void run() {
        while (true) {
            System.out.println("请输入指令（Q代表退出）：");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q'){
                a.setLoop(false);
                System.out.println("A线程退出");
                break;
            }
        }
    }
}
