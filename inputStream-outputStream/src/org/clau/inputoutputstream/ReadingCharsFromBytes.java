package org.clau.inputoutputstream;

import java.io.*;
import java.nio.Buffer;

public class ReadingCharsFromBytes {
    public static void main(String... args) {
        String hello = "Hello world";

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(buffer)) {
                outputStreamWriter.write(hello);

        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] bytes = buffer.toByteArray();
        for (byte b: bytes) {
            System.out.printf("%x", b);
        }

        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
             InputStreamReader inputStreamReader = new InputStreamReader(byteArrayInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            System.out.println();
            bufferedReader.lines().forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
