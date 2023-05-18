package com.dexin.dxc;

/**
 * @ClassName: ThreadState
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/8 22:05
 */
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        TestState state = new TestState();
        System.out.println(state.getName() + "状态" + state.getState());

        state.start();

        while (Thread.State.TERMINATED != state.getState()){
            System.out.println(state.getName() + "状态" + state.getState());
            Thread.sleep(500);
        }

        System.out.println(state.getName() + "状态" + state.getState());
    }
}
class TestState extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi" + i + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}