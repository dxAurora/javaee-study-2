package com.dexin.wangluo.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @ClassName: SocketTcpClient
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/7/12 20:45
 */
public class SocketTcpClient03 {
    public static void main(String[] args) {
        try {
            // 1、连接服务端（ip，端口）
            // 连接本机的 8888端口
            Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
            System.out.println("客户端 socket返回数据：" + socket.getClass());
            // 2、连接上后，生成socket
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\wangluo\\socket\\kaola0.jpg"));
            BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

            byte[] by = new byte[1024];
            int len = 0;
            while ((len = bis.read(by)) != -1) {
                bos.write(by, 0, len);
            }
            // 3、通过socket.getOutputStream() 写入数据到 数据通道
            socket.shutdownOutput();// 设置写入结束
            bis.close();

            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            char[] ch = new char[1024];
            int len1 = 0;
            while ((len1 = isr.read(ch)) != -1) {
                System.out.println(new String(ch, 0, len1));
            }
            // 5、关闭流和socket
            isr.close();
            socket.close();
            System.out.println("======客户端退出======");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
