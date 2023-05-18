package com.dexin.dxc;

/**
 * @ClassName: CpuNum
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/6/7 20:23
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int i = runtime.availableProcessors();
        System.out.println(i);
    }
}
