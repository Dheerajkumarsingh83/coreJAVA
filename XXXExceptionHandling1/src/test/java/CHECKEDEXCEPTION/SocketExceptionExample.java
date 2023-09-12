package CHECKEDEXCEPTION;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

public class SocketExceptionExample {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("example.com", 8080);
            // Perform socket operations
            socket.close();
        } catch (SocketException e) {
            System.out.println("SocketException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}