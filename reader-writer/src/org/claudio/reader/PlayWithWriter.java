package org.claudio.reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class PlayWithWriter {
    public static void main(String... args) {
        try (Writer writer = new FileWriter("files/words.txt")) {
            writer.write("first line !");
            writer.write("second line !");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
