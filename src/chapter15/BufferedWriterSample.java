package chapter15;

import utils.AppUtils;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterSample {

    public static void main(String[] args) {

        String[] words = {"FAVOUR", "MIRACLE", "BARACHAEL", "JETHRO"};

        OutputStreamWriter writer;
        BufferedWriter bufferedWriter = null;


        try {
            writer = new OutputStreamWriter(new FileOutputStream(AppUtils.App_Asset_Location + "\\output.txt"));
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(words[0] + " " + words[1]);
            bufferedWriter.flush();
            bufferedWriter.write(" " + words[2]);


        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }
}