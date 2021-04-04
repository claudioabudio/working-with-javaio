package org.clau.console;

import java.io.Console;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PlayWithConsole {
    public static void main(String... args) {
        Console console = System.console();
        PrintWriter printWriter = console.writer();
        printWriter.println("Please enter your name >");
        String name = console.readLine();
        printWriter.printf("Hello %s \n", name);
        printWriter.println("Please enter your password >");
        char[] password = console.readPassword();
        printWriter.printf("Your password was: %s \n", new String(password));
        printWriter.printf("What are your favorite colors %s \n?", name);
        String colors = console.readLine();
        List<String> colorList = new Scanner(colors)
                .useDelimiter(" ")
                .tokens()
                .collect(Collectors.toList());
        printWriter.println(colorList);
    }


}
