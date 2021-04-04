package org.clau.inputoutputstream;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PlayWithOutputStream {
    public static void main(String... args) {
        byte[] bytes = {0xC, 0xA, 0xF, 0xE, 0xB, 0xA, 0xB, 0xE };
        Path path = Path.of("files/data.bin");
        try (OutputStream outputStream = Files.newOutputStream(path)) {
            outputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
