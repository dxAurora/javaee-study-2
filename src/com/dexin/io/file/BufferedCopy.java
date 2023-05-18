package com.dexin.io.file;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @ClassName: BufferedCopy
 * @Description: 符缓冲流(处理流)cope文档、字节缓冲流(处理流)cope文件（音乐，视频等）
 * @Author: TangDx
 * @DATE: 2022/6/30 22:02
 */
public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\t1.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\t2.txt"));
        byte[] by = new byte[1024];
        int len = 0;
        while ((len = bis.read(by)) != -1){
            bos.write(by, 0, len);
        }
        bos.close();
        bis.close();
    }

    @Test
    public void BufferedCopy01() { // 字符缓冲流(处理流)cope文档  注意不要使用字符缓冲流复制二进制（视频，音乐）文件
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a1.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a3.txt"));
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void BufferedCopy02() {    // 字节缓冲流(处理流)cope文件（音乐，视频等）
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\kaola.jpg"));
            bos = new BufferedOutputStream(new FileOutputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\kaola2.jpg"));
            int dataLen = 0;
            byte[] by = new byte[1024];
            while ((dataLen = bis.read(by)) != -1) {
                bos.write(by, 0, dataLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
