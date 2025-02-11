package Networking;

import java.io.*;
import java.net.Socket;

public class SampleClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 4953);

        OutputStream output = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(output, true);
        writer.println("Hello from Client");

        InputStream input = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));

        String response = reader.readLine();
        System.out.println("Response from server: " + response);
    }
}
