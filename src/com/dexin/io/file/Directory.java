package com.dexin.io.file;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: Directory
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/27 22:25
 */
public class Directory {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a1.txt");
        File file2 = new File("E:\\aaa\\bbb");
        System.out.println(file.createNewFile());

        if (file.exists()){
            if (file.delete()){
                System.out.println(file.getName() + "删除成功");
            }else {
                System.out.println(file.getName() + "删除失败");
            }
        } else {
            System.out.println("文件不存在");
        }

        if (file2.exists()){
            System.out.println("文件目录已存在");
        } else {
            if (file2.mkdirs()){
                System.out.println("创建成功");
            } else {
                System.out.println("创建失败");
            }
        }
    }
}
