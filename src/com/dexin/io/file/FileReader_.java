package com.dexin.io.file;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName: FileReader_
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/29 22:20
 */
public class FileReader_ {
    public static void main(String[] args) {

    }

    @Test
    public void FileReader01(){
        try {
            FileReader fileReader = new FileReader("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a1.txt");
            int dateLen = 0;
            while ((dateLen = fileReader.read()) != -1) {
                System.out.print((char)dateLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void FileReader02(){
        try {
            FileReader fileReader = new FileReader("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a1.txt");
            char[] chars = new char[1024];
            int dateLen = 0;
            while ((dateLen = fileReader.read(chars)) != -1) {
                System.out.println(new String(chars, 0, dateLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
