package com.dexin.jihe.collection_.list_;

import java.util.Vector;

/**
 * @ClassName: VectorTest
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/5/29 17:08
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("hello");

        for (int i = 1; i <= 9 ; i++) {
            vector.add(i);
        }

        vector.add("java");
    }
}
