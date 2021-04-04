package org.clau.inputoutputstream;

import java.io.*;
import java.util.Arrays;

public class PlayWithDataStream {

    public static void main(String... args) throws IOException {
        int[] ints = {1, 2, 3, 4, 5};

        byte[] bytes = {};
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream)) {
            for (int i: ints) {
                dataOutputStream.writeInt(i);
            }
            bytes = byteArrayOutputStream.toByteArray();
            System.out.println("size of byte array: "+bytes.length);
            for (byte b: bytes
                 ) {
                System.out.printf("%x", b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
             DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream)) {
            System.out.println();
            for (int i=0; i<ints.length;i++)
                System.out.println(dataInputStream.readInt());

        }


    }
}
