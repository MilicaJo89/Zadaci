package Zadatak8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass extends Main {
    public void ReadTheFile() {
        try {
            FileReader reader = new FileReader("src/Zadatak8/hellodarling.txt");
            int letter = reader.read();
            while (letter != -1) {
                System.out.print((char) letter);
                letter = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
