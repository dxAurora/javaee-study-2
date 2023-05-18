package com.dexin.jihe.collection_.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: ListTest
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/5/29 13:33
 */
public class ListTest {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("tdx");
        list.add(10);
        list.add(true);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
