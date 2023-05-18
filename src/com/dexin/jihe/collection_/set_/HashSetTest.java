package com.dexin.jihe.collection_.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: HashSetTest
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/5/30 21:11
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set hashSet = new HashSet();

        hashSet.add("tdx"); // ok
        hashSet.add("tdx"); // no
        for (int i = 0; i < 63; i++) {
            hashSet.add(i); // no
        }
        hashSet.add(new Book("西游记")); // ok
        hashSet.add(new Book("西游记")); // ok
        hashSet.add(new String("str")); //ok
        hashSet.add(new String("str")); // no

        System.out.println(hashSet);
    }
}
class Book{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
