package chapter15.serialize;

import java.io.*;

public class MainDog {

    public static void main(String[] args) {
        try(ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("Dog"))) {
            Dog aja = new Dog("lucky", 45);
            objectOutputStream.writeObject(aja);
        }
        catch (IOException | SecurityException exception){
            exception.printStackTrace();


        try(ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("C:\\Users\\USER\\IdeaProjects\\myClassWork\\src\\chapter15\\serialize\\Dog.java"))){
            Dog newDog = (Dog) objectInputStream.readObject();
            System.out.println(newDog.toString());
        } catch (IOException | SecurityException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
}
