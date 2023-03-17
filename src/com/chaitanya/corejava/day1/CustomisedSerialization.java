package com.chaitanya.corejava.day1;

import java.io.*;

public class CustomisedSerialization implements Serializable {
    String userName="Chaitanya";
    transient String pwd="Idate";
    @Serial
    private void writeObject(ObjectOutputStream os)throws Exception
    {
        os.defaultWriteObject();
        String epwd="1717"+pwd;
        os.writeObject(epwd);
    }
    @Serial
    private void readObject(ObjectInputStream is)throws Exception{
        is.defaultReadObject();
        String epwd=(String)is.readObject();
        pwd=epwd.substring(4);
    }

    @Override
    public String toString() {
        return "CustomisedSerialization{" +
                "userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {
        CustomisedSerialization customisedSerialization=new CustomisedSerialization();
        FileOutputStream fileOutputStream = new FileOutputStream("abcdef.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(customisedSerialization);

        FileInputStream fileInputStream=new FileInputStream("abcdef.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        CustomisedSerialization customisedSerialization1=(CustomisedSerialization) objectInputStream.readObject();

        System.out.println("After De Serialisation "+customisedSerialization1);

        //as we have marked pass as transient default value of it will be stored during serialisation
        //so while deserialization we will receive default value which is wrong and data loss
        //so we implement the custom serialisation and avoid data loss by performing extra operation.
    }
}
