package com.dexin.io.file;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @ClassName: PrintStream_
 * @Description: PrintStream (字节打印流)
 * @Author: TangDx
 * @DATE: 2022/7/5 14:06
 */
public class PrintStream_ {
    public static void main(String[] args) {
        try {
            PrintStream out = System.out;
            out.println("hello 唐德鑫");// 默认情况下，输出在控制台（即标准输出，显示器）
            out.write("hello 唐德鑫".getBytes());
            out.close();

            // 设置打印的位置
            System.setOut(new PrintStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a4.txt"));
            System.out.println("hello 唐德鑫");
            System.out.write("hello 唐德鑫2".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
