package com.dexin.io.file;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName: FileWirter
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/29 22:32
 */
public class FileWriter_ {
    public static void main(String[] args) {

    }

    @Test
    public void fileWriter01(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\io\\a2.txt");
            String str = "阳光总在风雨后";
            fileWriter.write(str.toCharArray());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
