package com.chaitanya.corejava.day1;

import java.io.*;

public class InheritanceInSerialisation {
    int i/*=20*/;

    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {
        Child child=new Child();
        child.i=60;
        child.j=20;
        FileOutputStream fileOutputStream = new FileOutputStream("abcdefg.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(child);

        FileInputStream fileInputStream=new FileInputStream("abcdefg.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Child child1=(Child) objectInputStream.readObject();

        System.out.println("After De Serialisation "+child1);
    }
}
class Child extends InheritanceInSerialisation implements Serializable {
    int j=10;

    @Override
    public String toString() {
        return "Child{" +
                "j=" + j +
                ", i=" + i +
                '}';
    }
}

//Here even though child is not implementing the serializable i/f still it is serializable because inheritance
// and serialization goes hand in hand.
//In reverse case if parent does not implement the serializable then default value of parent variable is stored
// and default constructor is called at time of deserialisation so as to assign default values.

