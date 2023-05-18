package com.dexin.io.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @ClassName: ObjectOutStream_
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/30 22:49
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\data.dat"));
            // 序列化数据到文件中
            oos.writeInt(100); // int -> Integer（实现了Serializable）
            oos.writeBoolean(true);
            oos.writeChar('A');
            oos.writeDouble(100.01);
            oos.writeUTF("唐德鑫");
            // 保存对象
            oos.writeObject(new Dog("旺财"));
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Dog implements Serializable {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}