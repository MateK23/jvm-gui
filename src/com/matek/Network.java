package com.matek;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;


public class Network {
    public Network() throws Exception {
        // TCP Server creation

        ServerSocket ss = new ServerSocket(9010); // server creation

        Socket s = ss.accept();

        ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
        String str = (String) ois.readObject();

        ois.close();
        ss.close();

        // TCP Client creation

        Socket s2 = new Socket("localhost", 9010);
        ObjectOutputStream oos = new ObjectOutputStream(s2.getOutputStream());
        oos.writeObject("Hello World");

        oos.close();
        s2.close();

        // File Sending
        // ...

        // DatagramSocket Server (UDP)

        DatagramSocket ds = new DatagramSocket(3000);

        byte[] buffer = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buffer, 1024);
        ds.receive(dp);

        String str2 = new String(dp.getData());
        System.out.println(str2);
        ds.close();

        // DatagramSocket Clieent (UDP)
        // ...
    }
}
