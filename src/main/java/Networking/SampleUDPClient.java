package Networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SampleUDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        byte[] sendData = "Hello from Khang".getBytes();

        InetAddress IPAddress = InetAddress.getByName("localhost");
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 7749);
        socket.send(sendPacket);

        socket.close();
    }
}
