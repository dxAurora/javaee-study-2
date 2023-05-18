package com.dexin.jihe.tree;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @ClassName: TreeMapTest
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/1 23:06
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o2).compareTo((String)o1);
            }
        });

        treeMap.put("aa", "唐德鑫");
        treeMap.put("bb", "18");
        treeMap.put("cc", "10000");
        treeMap.put("dd", 10000); // 添加不进去，因为Comparator比较器认为长度相同就是相同的元素

        System.out.println(treeMap);
    }
}
