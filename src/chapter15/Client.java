package chapter15;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("172.20.10.3",1234);
            System.out.println("Connected");
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
}
