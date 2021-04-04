package org.claudio.reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class PlayWithBufferedWriter {
    public static void main(String... args) {
        try (Writer writer = new FileWriter("files/words.txt")) {

            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Hello ladies !");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
