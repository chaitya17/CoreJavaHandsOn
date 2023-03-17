package com.chaitanya.corejava.day1;


import java.io.*;
import java.sql.SQLOutput;

class  One implements Serializable {
    int i=10;
    int j=20;
}
class  Two implements Serializable{
    int k=30;
    int l=40;
}
public class OrderOfSerialization {
    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {
        One one = new One();
        Two two = new Two();
        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(two);
        objectOutputStream.writeObject(one);

        FileInputStream fileInputStream=new FileInputStream("abc.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Two two1=(Two)objectInputStream.readObject();
        One one1=(One)objectInputStream.readObject();


        System.out.println("Op of One After de serialization "+one1.i +" "+one1.j);
        System.out.println("Op of two After de serialization "+two1.k +" "+two1.l);
    }
}
