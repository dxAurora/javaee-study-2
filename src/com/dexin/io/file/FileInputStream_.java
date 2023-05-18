package com.dexin.io.file;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName: FileInputStream_
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/29 9:20
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void fileInputStream01() {
        FileInputStream is = null;
        try {
            is = new FileInputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a2.txt");
            int data = 0;
            while ((data = is.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void fileInputStream02() {
        FileInputStream is = null;
        try {
            is = new FileInputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a2.txt");
            int readLen = 0;
            byte[] by = new byte[8];
            while ((readLen = is.read(by)) != -1) {
                System.out.println(new String(by, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
