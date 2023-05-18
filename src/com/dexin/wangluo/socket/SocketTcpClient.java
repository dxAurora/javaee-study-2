package com.dexin.wangluo.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @ClassName: SocketTcpClient
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/7/12 20:45
 */
public class SocketTcpClient {
    public static void main(String[] args) {
        try {
            // 1、连接服务端（ip，端口）
            // 连接本机的 9999端口
            Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
            System.out.println("客户端 socket返回数据：" + socket.getClass());
            // 2、连接上后，生成socket
            OutputStream os = socket.getOutputStream();
            // 3、通过socket.getOutputStream() 写入数据到 数据通道
            os.write("hello server".getBytes());
            socket.shutdownOutput();// 设置写入结束
            // 4、通过socket.getInputStream() 读数据通道中内容，打印出来
            InputStream is = socket.getInputStream();
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = is.read(buf)) != -1) {
                System.out.println("服务器响应内容：" + new String(buf, 0 ,len));
            }
            // 5、关闭流和socket
            is.close();
            os.close();
            socket.close();
            System.out.println("======客户端退出======");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
