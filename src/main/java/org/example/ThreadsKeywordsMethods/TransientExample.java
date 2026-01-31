package org.example.ThreadsKeywordsMethods;

import java.io.*;

public class TransientExample implements Serializable {
    String Username;
    transient String password;

    public TransientExample(String username, String password) {
        Username = username;
        this.password = password;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TransientExample transientExample=new TransientExample("John","abc123");
        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("Transient.ser"));
        out.writeObject(transientExample);
        out.close();

        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("Transient.ser"));
        TransientExample deserialized = (TransientExample) in.readObject();

        System.out.println(deserialized.Username);
        System.out.println(deserialized.password);

    }
}
/*
transient keyword in Java
    The transient keyword is used to exclude a field from serialization.
    When an object is serialized, transient variables are not saved.

Why transient is needed
    To avoid storing sensitive data (passwords, secrets)
    To skip derived or temporary fields
    To reduce serialization size

Basic Rule
    transient fields are ignored during serialization and get default values during deserialization.
 */