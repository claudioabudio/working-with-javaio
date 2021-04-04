package org.claudio.reader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PlayWithBufferedWriterModern {
    public static void main(String ... args) {
        Path path = Paths.get("files/words.txt");
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path);) {
            bufferedWriter.write("buffered writer the modern way !");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
