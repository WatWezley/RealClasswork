package chapter15;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;

public class Example4 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\USER\\IdeaProjects\\myClassWork\\src\\chapter15");
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            for (Path path1 : directoryStream) {
                System.out.println(path1.getFileName());


            }
            }

         catch (IOException e) {
             System.out.println(e.getMessage());;
        }
        }
    }

