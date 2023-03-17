package com.chaitanya.corejava.day1;

import java.io.*;

class  ABC implements Serializable{
    DEF def=new DEF();
}
class  DEF implements Serializable{
    GHI ghi=new GHI();
}
class  GHI implements Serializable{
    int i=10;
    int j=10;
}
public class ObjectGraphSerialisation {
    public static void main(String[] args)throws FileNotFoundException, IOException,ClassNotFoundException  {
        ABC abc=new ABC();
        FileOutputStream fileOutputStream = new FileOutputStream("abcde.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(abc);

        FileInputStream fileInputStream=new FileInputStream("abcde.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        ABC abc1=(ABC)objectInputStream.readObject();

        System.out.println("After De Serialisation "+abc1.def.ghi.i);
    }
    //if any class in object graph has not implemented serializable i/f then
    //we will get NotSerializableException and we have to implement serializable i/f to satisfy the condition
    //of object graph.
}
