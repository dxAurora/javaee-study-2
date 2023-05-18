package com.dexin.designpatterns.strategy;

/**
 * @ClassName BehaviorContext
 * @Description
 * @Author TangDx
 * @Date 2023/5/16 10:31
 * @Version 1.0
 */
public class BehaviorContext {

    private AbstractPenguin penguin;

    public void setPenguin(AbstractPenguin penguin) {
        this.penguin = penguin;
    }

    public BehaviorContext(AbstractPenguin penguin) {
        this.penguin = penguin;
    }

    public void everyDay() {
        penguin.eating();
        penguin.sleeping();
        penguin.beating();
    }
}
