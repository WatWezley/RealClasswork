package chapter15;


import utils.AppUtils;

import java.io.*;

public class BufferedReaderSample {

    public static void main(String[] args) {
        try (InputStreamReader reader = new InputStreamReader(System.in);
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter(AppUtils.App_Asset_Location+"\\test.txt") ){

            System.out.print("Enter the input: ");
            String input = bufferedReader.readLine();
            writer.write(input);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
