package com.dexin.fanshe;

public class LoaderClass {
    public static void main(String[] args) throws ClassNotFoundException {

        // 获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader); // sun.misc.Launcher$AppClassLoader@18b4aac2

        // 获取系统加载器的父类加载器 --> 扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent); // sun.misc.Launcher$ExtClassLoader@5cad8086

        // 获取扩展类加载器的父类 --> 根加载器
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1); // null  跟加载器 c++编写的 不能直接获取

        // 获取当前类的类加载器
        ClassLoader classLoader = Class.forName("com.dexin.fanshe.LoaderClass").getClassLoader();
        System.out.println(classLoader); // sun.misc.Launcher$AppClassLoader@18b4aac2

        // 获取JDK内置的类的类加载器
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1); // null jdk自带的类库都是有跟加载器加载
    }
}
