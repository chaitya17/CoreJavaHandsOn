package com.chaitanya.corejava.day1;
import java.io.*;
public class SerializationIntroduction implements Serializable{
    int i=10;
    int j=20;

    public static void main(String[] args) throws  FileNotFoundException,IOException,ClassNotFoundException{
        SerializationIntroduction serializationIntroduction=new SerializationIntroduction();
        System.out.println("Starting Serialization");
        FileOutputStream fileOutputStream=new FileOutputStream("serializable.ser");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(serializationIntroduction);
        System.out.println("Serialization Ends");

        System.out.println("Starting De-Serialization");
        FileInputStream fileInputStream=new FileInputStream("serializable.ser");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        SerializationIntroduction serializationIntroduction1=(SerializationIntroduction) objectInputStream.
                readObject();
        System.out.println("De-Serialization Ends");

        System.out.println("Data member of class "+serializationIntroduction1.i+" "+serializationIntroduction1.j);

    }
}
