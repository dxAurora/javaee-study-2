package com.dexin.wangluo.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName: SocketTcpServer
 * @Description:
 * @Author: TangDx
 * @DATE: 2022/7/12 20:39
 */
public class SocketTcpServer02 {
    public static void main(String[] args) {
        try {
            // 1、在本机的 9999 端口监听，等待连接（要求端口没被占用）
            ServerSocket serverSocket = new ServerSocket(9999);
            System.out.println("服务端在9999端口监听，等待连接...");
            // 2、当没有客户端连接9999端口时，程序会阻塞，等待连接
            //    如果有客户端连接，则会返回socket对象 程序继续
            Socket socket = serverSocket.accept();
            System.out.println("服务端socket连接成功: " + socket.getClass());
            //3．通过socket.getInputStream()读取客户端写入到数据通道的数据，显示
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            char[] ch = new char[1024];
            int readLen = 0;
            while ((readLen = br.read(ch)) != -1) {
                System.out.println("字符输入流" + new String(ch, 0, readLen));
            }
            //4．通过socket.getOutputStream()写入到数据通道回传客户端
            OutputStream os = socket.getOutputStream();
            os.write("hello client".getBytes());
            socket.shutdownOutput();// 设置写入结束
            // 5、关闭流
            os.close();
            is.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
