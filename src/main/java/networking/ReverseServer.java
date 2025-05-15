package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseServer {
    private static final int PORT = 6000;

    public static void main(String[] args) {
        try (ServerSocket socketServer = new ServerSocket(PORT)) {

            //Add while(true) , if you want server to continously listen
            while(true) {
                Socket clientSocket = socketServer.accept();
                System.out.println("Connected");
                try (BufferedReader bufferedReader = new
                        BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream(), true)) {

                    String inputLine = bufferedReader.readLine();
                    if (inputLine != null) {
                        System.out.println(new StringBuilder(inputLine).reverse());
                        printWriter.println(new StringBuilder(inputLine).reverse());
                    }

                    clientSocket.close();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
