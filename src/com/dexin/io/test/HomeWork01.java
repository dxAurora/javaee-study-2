package com.dexin.io.test;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @ClassName: HomeWork01
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/7/5 15:13
 */
public class HomeWork01 {
    public static void main(String[] args) {
        String filePath = "src/com/dexin/io/test";
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file1 = new File(filePath, "hello.txt");
        if (file1.exists()) {
            System.out.println(file1.getName() + " 已存在");
        } else {
            try {
                file1.createNewFile();
                FileOutputStream fos = new FileOutputStream(file1);
                fos.write("hello word".getBytes());
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test02() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/com/dexin/io/test/test.txt"));
            String lineDate = null;
            int row = 1;
            while ((lineDate = br.readLine()) != null) {
                System.out.println((row++) + "\t" + lineDate);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void dog() {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/com/dexin/io/test/dog.properties"));
            String name = properties.getProperty("name");
            String age1 = properties.getProperty("age");
            int age = Integer.parseInt(age1);
            String color = properties.getProperty("color");
            Dog dog = new Dog(name, age, color);
            System.out.println(dog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
