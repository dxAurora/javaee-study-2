package com.dexin.jihe.map_;

import java.util.Properties;

/**
 * @ClassName: PropertiesTest
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/1 22:26
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("name", "唐德鑫");
        properties.put("age", "18");
        properties.put("salary", "10000");

        System.out.println("properties:" + properties);
    }
}
