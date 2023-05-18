package com.dexin.jihe.collection_;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName: CollectionTest
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/5/29 14:31
 */
public class CollectionTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("22");
        arrayList.add("333333");
        arrayList.add("4444");
        arrayList.add("55555");

        for (int i = 0; i < 5 ; i++) {
            arrayList.add(i);
        }

        arrayList.add("55555");

        System.out.println(arrayList);

//        Collections.reverse(arrayList); // 数组反转

//        Collections.shuffle(arrayList); // 随机排序

//        Collections.sort(arrayList); // 排序，升序

//        Collections.swap(arrayList,0,1); // 数组指定元素交换位置

//        System.out.println(Collections.max(arrayList));// 找出数组中最大的元素

//        System.out.println(Collections.max(arrayList, new Comparator() { // 找出数组中最大的元素，传入比较器
//            @Override
//            public int compare(Object o1, Object o2) {
//                return ((String)o1).length() - ((String)o2).length();
//            }
//        }));

//        System.out.println(Collections.min(arrayList)); // 出数组中最小的元素

//        Collections.frequency(arrayList, arrayList.get(1)); // 查询集合中某个元素出现的次数

        ArrayList list = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            list.add("");
        }

        Collections.copy(list,arrayList); // 数组拷贝

        System.out.println(arrayList);
    }
}
