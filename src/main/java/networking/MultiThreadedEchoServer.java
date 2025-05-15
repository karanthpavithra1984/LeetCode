package networking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedEchoServer {
    public static void main(String[] args){
        final int PORT = 7000;

        try(ServerSocket serverSocket = new ServerSocket(PORT)){
            while (true){
                //Start accepting
                Socket socket = serverSocket.accept();

                new ClientHandler(socket).start();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

