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
public class SocketTcpServer03 {
    public static void main(String[] args) {
        try {
            // 1、在本机的 9999 端口监听，等待连接（要求端口没被占用）
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("服务端在8888端口监听，等待连接...");
            // 2、当没有客户端连接8888端口时，程序会阻塞，等待连接
            //    如果有客户端连接，则会返回socket对象 程序继续
            Socket socket = serverSocket.accept();
            System.out.println("服务端socket连接成功: " + socket.getClass());
            //3．通过socket.getInputStream()读取客户端写入到数据通道的数据，显示
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\ideaProject\\JavaStudy\\src\\com\\dexin\\wangluo\\socket\\kaola.jpg"));
            byte[] by = new byte[1024];
            int len = 0;
            while ((len = bis.read(by)) != -1) {
                bos.write(by, 0, len);
            }
            bos.close();

            // 响应客户端
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("服务器接收图片成功");
            bw.flush();
            socket.shutdownOutput();

            bw.close();
            bis.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
