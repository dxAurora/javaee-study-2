package com.dexin.io.file;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: FileDemo01
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/27 22:01
 */
public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        // 创建文件
        File file = new File("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a1.txt");
        System.out.println(file.createNewFile());

        File file2 = new File("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\", "a2.txt");
        System.out.println(file2.createNewFile());

        // 获取文件名
        System.out.println("文件名: " + file2.getName());
        // 获取文件绝对路径
        System.out.println("文件绝对路径: " + file2.getAbsolutePath());
        // 获取文件父级目录
        System.out.println("文件父级目录 " + file2.getParent());
        // 获取文件大小（单位是字节）
        System.out.println("文件大小: " + file2.length());
        // 判断文件是否存在
        System.out.println("文件是否存在: " + file2.exists());
        // 判断是否是文件
        System.out.println("是否是文件: " + file2.isFile());
        // 判断是否是目录
        System.out.println("是否是目录: " + file2.isDirectory());

    }
}
