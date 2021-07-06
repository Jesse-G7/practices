package com.company;

import jdk.internal.util.xml.impl.Input;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {

        InetAddress inet1 = null;
        InetAddress inet2 = null;

        try {
            inet1 = InetAddress.getByName("192.168.10.14");
            inet2 = InetAddress.getByName("www.baidu.com");

            System.out.println(inet1);
            System.out.println(inet2);
            System.out.println(InetAddress.getLocalHost());
            System.out.println(inet2.getHostName());
            System.out.println(inet2.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


        InetAddress inet = null;
        try {
            inet = InetAddress.getByName("10.117.22.58");
            Socket socket = new Socket(inet,8899);

            OutputStream os = socket.getOutputStream();
            os.write("sadasffk".getBytes());
            if(os!=null) {
                os.close();
            }
            if(socket!=null){
                socket.close();
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    ////

    public void server()throws IOException{
        ServerSocket ss = new ServerSocket(8899);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();

//        byte[] buffer = new byte[20];
//        int len;
//        while((len = is.read(buffer)) != -1){
//            String str = new String(buffer,0,len);
//            System.out.println(str);
//        }


    }
}