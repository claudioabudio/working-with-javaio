package org.claudio.reader;

import java.io.*;

public class PlayWithReader {
    public static void main(String... args) {
        File file = new File("files/sonnet3.txt");

        try (Reader reader = new FileReader(file);) {
            System.out.println("Mark supported: " + reader.markSupported());
            StringBuffer stringBuffer = new StringBuffer();
            char[] buf = new char[16];
            int nchars = reader.read(buf);

            while (nchars >= 0) {
                stringBuffer.append(buf, 0, nchars);
                nchars = reader.read(buf);
            }
            System.out.println(stringBuffer.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
