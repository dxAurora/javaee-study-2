package com.dexin.io.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName: BufferedReader_
 * @Description: 处理流
 * @Author: TangDx
 * @DATE: 2022/6/30 21:48
 */
public class BufferedReader_ {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a1.txt"));
            String dataLen;
            while ((dataLen = bufferedReader.readLine()) != null) {
                System.out.println(dataLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
