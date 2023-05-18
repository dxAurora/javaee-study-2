package com.dexin.wangluo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ClassName: API_
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/7/7 11:53
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress localHost = InetAddress.getLocalHost();
        InetAddress address = InetAddress.getLoopbackAddress();
        System.out.println(localHost); // DESKTOP-D6PCG06/192.168.213.1
        System.out.println(address); // localhost/127.0.0.1


        InetAddress name = InetAddress.getByName("DESKTOP-D6PCG06");
        System.out.println(name);

    }
}
