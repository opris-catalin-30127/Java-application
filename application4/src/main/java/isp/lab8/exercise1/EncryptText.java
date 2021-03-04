package isp.lab8.exercise1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EncryptText {
    public EncryptText() {
    }

    static void encrypt() {

        try (final FileReader fileReader = new FileReader("text.txt")) {
            try (final FileWriter fileWriter = new FileWriter("text.txt.enc")) {
                int c;
                while ((c = fileReader.read()) != -1) {
                    c--;
                    fileWriter.write(c);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
