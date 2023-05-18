package com.dexin.io.file;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @ClassName: Properties_
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/7/5 14:33
 */
public class Properties_ {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\mysql.properties"));
            String lineDate = null;
            while ((lineDate = br.readLine()) != null) {
                String[] split = lineDate.split("=");
                System.out.println(split[0] + "值为：" + split[1]);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Properties01() {
        try {
            // 创建Properties对象
            Properties properties = new Properties();
            // 加载指定配置文件
            properties.load(new FileInputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\mysql.properties"));
            // 获取内容
            properties.list(System.out);
//            properties.list(new PrintStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a4.txt")); // 写入在这个文件中
            // 根据Key获取value
            System.out.println(properties.getProperty("user"));
            System.out.println(properties.getProperty("pwd"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Properties02() { // 保存 Properties 文件
        try {
            Properties properties = new Properties();
            properties.setProperty("user", "root");
            properties.setProperty("pwd", "123456");
            properties.setProperty("ip", "192.168.213.1");
            properties.store(new FileWriter("src\\com\\dexin\\io\\mysql2.properties"),null);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}