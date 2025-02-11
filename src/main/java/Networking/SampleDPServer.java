package Networking;

import java.io.IOException;
import java.net.*;

public class SampleDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(7749);
        byte[] receiveData = new byte[1024];
        System.out.println("Server UDP is waiting for data...");

        DatagramPacket receivePacket =new DatagramPacket(receiveData, receiveData.length);
        socket.receive(receivePacket);
        String message = new String(receivePacket.getData());
        System.out.println("Receive from client: " + message.trim());
    }
}
