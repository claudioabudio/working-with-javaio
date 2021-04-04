package org.clau.inputoutputstream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class PlayWithInputStream {
    public static void main(String... args) {
        byte[] bytes;
        Path path = Path.of("files/data.bin");
        try (InputStream inputStream = Files.newInputStream(path)) {
            bytes = inputStream.readAllBytes();
            for (byte b : bytes) {
                System.out.printf("0x%x", b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
