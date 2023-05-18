package com.dexin.io.test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: Example02
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/2 11:18
 */
public class Example02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\test\\test.txt");
        String str = "helloJava";
        byte[] b = str.getBytes();
        fos.write(b);
        fos.close();
    }
}
