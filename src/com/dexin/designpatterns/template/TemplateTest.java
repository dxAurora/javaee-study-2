package com.dexin.designpatterns.template;

/**
 * @ClassName TemplateTest
 * @Description
 * @Author TangDx
 * @Date 2023/5/16 10:26
 * @Version 1.0
 */
public class TemplateTest {
    public static void main(String[] args) {
        System.out.println("==========bigPenguin========");
        BigPenguin bigPenguin = new BigPenguin();
        bigPenguin.everyDay();

        System.out.println("==========littlePenguin========");
        LittlePenguin littlePenguin = new LittlePenguin();
        littlePenguin.everyDay();

        System.out.println("==========middlePenguin========");
        MiddlePenguin middlePenguin = new MiddlePenguin();
        middlePenguin.everyDay();

    }
}
