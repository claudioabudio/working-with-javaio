package org.claudio.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PlayWithBufferedReader {
    public static void main(String[] args) {
        Path path = Path.of("files/sonnet3.txt");
        try (BufferedReader bufferedReader = Files.newBufferedReader(path);) {
            bufferedReader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
