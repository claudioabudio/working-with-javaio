package org.claudio.files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PlayWithPath {
    public static void main(String... args) {
        Path path1 = Paths.get("files/images/dir1");
        Path path2 = Path.of("//files/images/dir2");
        Path path3 = Path.of("/files/images/dir2");
        Path path4 = Path.of("c:/files/images/dir");

        System.out.println(path1);
        System.out.println(path2);
        System.out.println(path1.getClass());
        System.out.println(path1.isAbsolute());
        System.out.println(path2.isAbsolute());
        System.out.println(path1.getRoot());
        System.out.println(path2.getRoot());
        System.out.println(path3.getRoot());
        System.out.println(path4.getRoot());

        // resolve is a sort of concatenation ...
        Path p1 = Paths.get("images/dir1");
        Path p2 = Paths.get("dir2/dir3");

        System.out.println(p1.resolve(p2));

        // unless the second path is absolute...then
        // the result is the second path
        Path p3 = Path.of("/root/beer");
        System.out.println(p1.resolve(p3));

        System.out.println(p1.resolveSibling(p2));

        // how we get from one dir to another
        System.out.println(p1.relativize(p2));

        // normalize() simplifies the path !
        Path p4 = Paths.get("videos/../videos/../videos");
        System.out.println(p4.normalize());

        // Path is linked to the file system !
        System.out.println(p4.getFileSystem());

    }
}
