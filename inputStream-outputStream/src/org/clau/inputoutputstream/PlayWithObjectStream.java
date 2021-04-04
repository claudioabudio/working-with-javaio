package org.clau.inputoutputstream;

import org.clau.inputoutputstream.model.User;

import java.io.*;

public class PlayWithObjectStream {
    public static void main(String ... args) {
        User paul = new User("Paul", 24);
        User mary = new User("Mary", 25);

        try (OutputStream outputStream = new FileOutputStream("files/users.bin");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {

            objectOutputStream.writeObject(paul);
            objectOutputStream.writeObject(mary);

        } catch (IOException e) {
            e.printStackTrace();
        }


        try (InputStream inputStream = new FileInputStream("files/users.bin");
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {

            Object obj1 = objectInputStream.readObject();
            Object obj2 = objectInputStream.readObject();
            System.out.println(obj1);
            System.out.println(obj2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



}
