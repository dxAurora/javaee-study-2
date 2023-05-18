package com.dexin.io.file;

import java.io.*;

/**
 * @ClassName: OutputStreamWriter_
 * @Description: 转换流（写入内容）
 * @Author: TangDx
 * @DATE: 2022/7/4 16:57
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a4.txt",true),"GBK"));
            bw.write("hello 唐德鑫");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
