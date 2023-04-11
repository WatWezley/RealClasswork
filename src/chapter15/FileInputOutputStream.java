package chapter15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputOutputStream {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream =
                     new FileInputStream("C:\\Users\\USER\\IdeaProjects\\myClassWork\\src\\chapter15\\test.txt")) {
            byte[] bytes = fileInputStream.readAllBytes();
            //System.out.println(Arrays.toString(bytes));
            for (byte b : bytes) {
                System.out.print(Character.toString(b));
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }

        try (var fileOutputStream =
                     new FileOutputStream("C:\\Users\\USER\\IdeaProjects\\myClassWork\\src\\chapter15\\test.txt")) {
            byte[] bytes = {116, 104, 105, 115, 32, 105, 115, 32, 97, 110, 111, 116, 104, 101, 114, 32, 109, 111, 110, 100, 97, 121};
            fileOutputStream.write(bytes);

        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
