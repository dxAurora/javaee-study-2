package com.dexin.fanshe;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @ClassName Demo02
 * @Description TODO
 * @Author TangDx
 * @Date 2023/5/10 9:55
 * @Version 1.0
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\rc.properties"));
        String classPath = properties.get("classPath").toString();
        String method = properties.getProperty("method");
        System.out.println(classPath);
        System.out.println(method);


        Class<?> aClass = Class.forName(classPath);
        Student student = (Student) aClass.newInstance();
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method1 : declaredMethods) {
            if (method1.getName().equals(method)) {
                method1.invoke(student);
            }
        }
    }
}
