package com.dexin.jihe.tree;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @ClassName: TreeSetTest
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/1 22:58
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o2).length() - ((String)o1).length();
            }
        });

        treeSet.add("唐德鑫");
        treeSet.add("18");
        treeSet.add("10000");
        treeSet.add("10000"); // 添加不进去，因为Comparator比较器认为长度相同就是相同的元素

        System.out.println(treeSet);
    }
}
