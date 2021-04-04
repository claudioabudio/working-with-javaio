package org.claudio.files;

import java.io.File;
import java.io.IOException;

public class PlayWithFiles {

        public static void main(String... args) throws IOException {
            File file = new File("files/sonnet2.txt");
            System.out.println("File exists: "+ file.exists());
            System.out.println("File is a file: " + file.isFile());
            System.out.println("File is a directory: " + file.isDirectory());

            File file2 = new File("files/sonnet3.txt");
            file2.createNewFile();
            System.out.println("File2 is file: "+file2.isFile());
            System.out.println("File2 exists: "+ file2.exists());
            System.out.println("File2 is a directory: "+ file2.isDirectory());

            // mkdirs() creates any necessary parent dirs if needed !
            File dir = new File("files/data2/more-data");
            boolean success = dir.mkdirs();
            System.out.println("Successfully created directory: "+ success);

            boolean deleted = dir.delete();
            System.out.println("dir successfully removed: "+ deleted);
            System.out.println(dir.getName());
            System.out.println(dir.getAbsolutePath());
            System.out.println(dir.getCanonicalPath());
            System.out.println(dir.getPath());
            System.out.println(dir.getParent());


            File dir2 = new File("images/.././././images/dir2");
            System.out.println(dir2.getAbsolutePath());
            System.out.println(dir2.getCanonicalPath());
        }
}
