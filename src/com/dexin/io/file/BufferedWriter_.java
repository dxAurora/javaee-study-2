package com.dexin.io.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName: BufferedWriter_
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/30 21:56
 */
public class BufferedWriter_ {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a3.txt"));
            bufferedWriter.write(97);
            bufferedWriter.newLine(); // 换行
            bufferedWriter.write("hello,java");
            bufferedWriter.newLine(); // 换行
            bufferedWriter.write(new char[]{'1', '2', '3', '4'});
            bufferedWriter.newLine(); // 换行
            bufferedWriter.write(new char[]{'1', '2', '3', '4'}, 1, 3);

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
