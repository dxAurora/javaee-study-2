package com.dexin.io.file;

import java.io.*;

/**
 * @ClassName: InputStreamReader_
 * @Description: 转换流，可以设置编码方式
 * @Author: TangDx
 * @DATE: 2022/7/4 16:38
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a4.txt"),"GBK");
            BufferedReader br = new BufferedReader(isr);
            String dataLine = "";
            while ((dataLine = br.readLine()) != null){
                System.out.println(dataLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
