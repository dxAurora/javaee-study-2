package com.dexin.io.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName: PrintWriter_
 * @Description: PrintWriter：字符打印流
 * @Author: TangDx
 * @DATE: 2022/7/5 14:19
 */
public class PrintWriter_ {
    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter(System.out);
            printWriter.print("hello 唐德鑫"); // 标准输出流，输出在控制台
            printWriter.close();
            PrintWriter pw = new PrintWriter(new FileWriter("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a4.txt"));
            pw.print("hello 唐德鑫");
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
