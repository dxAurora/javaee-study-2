package com.dexin.io.test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName: Example01
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/2 11:32
 */
public class Example01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\test\\test.txt");
        int by = 0;
        while ((by = fis.read()) != -1) {
            System.out.println(((char)by));
        }
        fis.close();
    }
}
