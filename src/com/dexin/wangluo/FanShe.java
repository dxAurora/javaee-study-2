package com.dexin.wangluo;

public interface FanShe {

    /**
     * 统一下单
     *
     * @param user
     * @return
     */
    void create(User user);

    /**
     * 申请退款
     *
     * @param user
     * @return
     */
    void refund(User user);
}
