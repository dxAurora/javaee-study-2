package com.dexin.wangluo;

/**
 * @ClassName: FanSheImpl
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/7/27 17:56
 */
public class FanSheImpl implements FanShe {

    @Override
    public void create(User user) {
        System.out.println(user.getName() + user.getAge());
        System.out.println("create实现");
    }

    @Override
    public void refund(User user) {
        System.out.println("refund实现");
    }

}
