package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultiThreadedEchoClient {
    public static void main(String[] args){
        try(Socket socket = new Socket("localhost", 7000)){
            BufferedReader inputArgs = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String userInput;
            while ((userInput = inputArgs.readLine()) != null){
                printWriter.println(userInput);

                System.out.println("Reversed -> " + bufferedReader.readLine());
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

