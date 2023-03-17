package com.chaitanya.corejava.day1;

import java.io.*;

public class StaticAndFinal_Serialisation implements Serializable {

    transient  int i=10;
    static  transient int j=20;
    final  transient int k=30;
    int l=40;

    @Override
    public String toString() {
        return "StaticAndFinal_Serialisation{" +
                "i=" + i +
                ", k=" + k +
                ", l=" + l +
                '}';
    }
    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {
        StaticAndFinal_Serialisation staticAndFinalSerialisation=new StaticAndFinal_Serialisation();

        FileOutputStream fileOutputStream = new FileOutputStream("abcd.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(staticAndFinalSerialisation);

        FileInputStream fileInputStream=new FileInputStream("abcd.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        StaticAndFinal_Serialisation staticAndFinalSerialisation1=(StaticAndFinal_Serialisation)objectInputStream.readObject();

        System.out.println("After De Serialisation "+staticAndFinalSerialisation1);
    }

    //Static & Final do not participate in serialisation as the value of static is at class level and that of
    //final is constant and state of final variable is stored as it is.
}
