package com.dexin.jihe.collection_.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ArrayListTest
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/5/29 13:56
 */
public class ArrayListTest {
    public static void main(String[] args) {

        List arrayList = new ArrayList();

        for (int i = 1; i <= 10 ; i++) {
            arrayList.add(i);
        }
        arrayList.add("Java");
        System.out.println(arrayList);
    }
}
