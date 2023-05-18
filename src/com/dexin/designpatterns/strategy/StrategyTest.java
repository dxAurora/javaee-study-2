package com.dexin.designpatterns.strategy;

/**
 * @ClassName TemplateTest
 * @Description
 * @Author TangDx
 * @Date 2023/5/16 10:26
 * @Version 1.0
 */
public class StrategyTest {
    public static void main(String[] args) {
        System.out.println("==========bigPenguin========");
        BehaviorContext behaviorContext = new BehaviorContext(new BigPenguin());
        behaviorContext.everyDay();

        System.out.println("==========LittlePenguin========");
        behaviorContext.setPenguin(new LittlePenguin());
        behaviorContext.everyDay();

        System.out.println("==========MiddlePenguin========");
        behaviorContext.setPenguin(new MiddlePenguin());
        behaviorContext.everyDay();


    }
}
