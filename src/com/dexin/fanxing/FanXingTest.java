package com.dexin.fanxing;

/**
 * @ClassName: FanXingTest
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/5 22:42
 */
public class FanXingTest {
    public static void main(String[] args) {
        Person<String> objectPerson = new Person<>("唐德鑫");
    }
}

class Person<E> {

    private E name;

    public Person(E name) {
        this.name = name;
    }

    public E getName() {
        return name;
    }
}
