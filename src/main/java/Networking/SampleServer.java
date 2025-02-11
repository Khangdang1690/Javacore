package Networking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SampleServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4953);
        System.out.println("Server is waiting to connect...");

        Socket socket = serverSocket.accept();
        System.out.println("Client is connected.");

        InputStream input = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String message = reader.readLine();
        System.out.println("Message from Client: " + message);

        OutputStream output = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(output, true);
        writer.println("Hello from server!");

        socket.close();
        serverSocket.close();
    }
}
