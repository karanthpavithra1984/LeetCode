package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler extends Thread{
    private Socket socket;
    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run(){
        try (BufferedReader bufferedReader = new
                BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true)) {

            String inputLine = bufferedReader.readLine();
            if (inputLine != null) {
                System.out.println(new StringBuilder(inputLine).reverse());
                printWriter.println(new StringBuilder(inputLine).reverse());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
