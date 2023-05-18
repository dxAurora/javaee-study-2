package com.dexin.wangluo;

/**
 * @ClassName: User
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/7/27 17:57
 */
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
