package chapter15;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CreateFileInAnotherServer {
    public static void main(String[] args)throws IOException {
        try {
            ServerSocket myServer = new ServerSocket(6868);
            System.out.println("6868 is listening");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
