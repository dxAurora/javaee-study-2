package com.dexin.io.file;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: FileOutputStream_
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/29 9:36
 */
@SuppressWarnings("all")
public class FileOutputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void fileOutputStream01() {
        FileOutputStream os = null;
        try {
            os = new FileOutputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a1.txt");
            os.write('t');
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void fileOutputStream02() {
        FileOutputStream os = null;
        String str = "hello,tdx!";
        try {
            os = new FileOutputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a1.txt");
            os.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void fileOutputStream03() {
        FileOutputStream os = null;
        String str = "hello,tdx!";
        try { // FileOutputStream第二个参数，是否要在文本末尾追加，true则不会覆盖原有内容
            os = new FileOutputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a1.txt", true);
            os.write(str.getBytes(), 0, str.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
