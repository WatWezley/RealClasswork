package chapter15;

import java.nio.file.Path;
import java.nio.file.Paths;

public class example1 {

    public static void main(String[] args) {

        Path path = Paths.get("a/b/c/../../");

        System.out.println("fleName: "+ path.getFileName());
        System.out.println("fileSystem:: "+ path.getFileSystem());
        System.out.println("Path ends with .java:: "+path.endsWith(Path.of("c.java")));
        System.out.println("Path:: "+path);
        //System.out.println("fileSystem:: "+ );


    }
}
