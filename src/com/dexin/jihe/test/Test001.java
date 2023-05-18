package com.dexin.jihe.test;

import java.util.*;

/**
 * @ClassName: Test001
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/7/27 14:07
 */

// List集合
public class Test001 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList(3);
        list.add("hello");
        list.add("hi");
        list.add("bye");
        list.add("hello");
        list.add("hello2");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);

        Vector vector = new Vector();
        vector.add("1");
        vector.add("a");
        vector.add("c");
        for (Object o : vector) {
            System.out.println((String) o);
        }
        System.out.println(vector);


        List linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("d");

        List linkedList2 = new LinkedList();
        Collections.copy(linkedList, linkedList2);
        System.out.println(linkedList2);

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println((String) value);
        }
        System.out.println(linkedList);
    }
}
