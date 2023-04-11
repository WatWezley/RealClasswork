package chapter15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example3 {

    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\USER\\IdeaProjects\\myClassWork\\src\\chapter15\\file1Created.java");
        Path path1 = Path.of("C:\\Users\\USER\\IdeaProjects\\myClassWork\\src\\chapter15\\file2Created.java");

        try {
           Path filePath = Files.createFile(path);
            Path filePath1 = Files.createFile(path1);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }


}
