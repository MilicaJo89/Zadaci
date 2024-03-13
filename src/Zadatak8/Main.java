package Zadatak8;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReaderClass fileread = new FileReaderClass();
        fileread.ReadTheFile();
        try{
             FileWriter writer = new FileWriter("poem");
            writer.write("Stars are for dreamers \nSoup is so good \nFeyra is my mate \nTamlin is a tool");
            writer.append("\n\nPoem by Rhysand,the most handsome High Lord");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
