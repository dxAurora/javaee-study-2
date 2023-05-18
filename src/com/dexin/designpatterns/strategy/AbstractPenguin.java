package com.dexin.designpatterns.strategy;

/**
 * @ClassName penguin
 * @Description
 * @Author TangDx
 * @Date 2023/5/16 10:21
 * @Version 1.0
 */
public abstract class AbstractPenguin {
    public void eating() {
        System.out.println("吃饭");
    }

    public void sleeping() {
        System.out.println("睡觉");
    }

    public abstract void beating();

}
