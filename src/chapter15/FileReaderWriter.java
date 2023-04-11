package chapter15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderWriter {
    public static void main(String[] args) {


    char [] chars = new char[24];

        try(FileReader fileReader = new FileReader("C:\\Users\\USER\\IdeaProjects\\myClassWork\\src\\chapter15\\output.txt")){
        var numberOfCharactersRead = fileReader.read(chars);
        System.out.println(numberOfCharactersRead);
        System.out.println();
        System.out.println(Arrays.toString(chars));

    } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try(FileWriter fileWriter = new FileWriter("C:\\Users\\USER\\IdeaProjects\\myClassWork\\src\\chapter15\\output.txt", true)){
        fileWriter.append(", I am going home.");
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
}
}

