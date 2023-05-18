package com.dexin.jihe.test;

/**
 * @ClassName: Strtest
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/5/29 15:08
 */
public class StrTest {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5){
                break;
            }
            System.out.println(i);
        }

        // 数组反转
        System.out.println(rep("abcxdef", 1, 5));
    }

    public static String rep(String str, int start, int end) {
        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[j];
            chars[j] = chars[i];
            chars[i] = temp;
        }
        return new String(chars);
    }


}
