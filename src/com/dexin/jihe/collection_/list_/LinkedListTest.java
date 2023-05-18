package com.dexin.jihe.collection_.list_;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @ClassName: LinkedListTest
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/5/29 21:52
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("刘备");
        linkedList.add("张飞");
        linkedList.add(1,"关羽");

        for (Object str: linkedList){
            System.out.println(str);
        }

        System.out.println("-----------------------------------");

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------------------------------");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("下标为1的元素：" + linkedList.get(1));
    }
}
