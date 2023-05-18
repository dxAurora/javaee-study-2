package com.dexin.io.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @ClassName: ObjectInpuStream_
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/30 23:01
 */
public class ObjectInputStream_ {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\data.dat"));
            System.out.println(ois.readInt());
            System.out.println(ois.readBoolean());
            System.out.println(ois.readChar());
            System.out.println(ois.readDouble());
            System.out.println(ois.readUTF());
            Object obj = ois.readObject();
            System.out.println("运行类型" + obj.getClass());
            System.out.println(obj);
            Dog dog = (Dog) obj;
            System.out.println(dog.name);
            ois.close();


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
