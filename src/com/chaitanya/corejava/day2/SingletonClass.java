package com.chaitanya.corejava.day2;

//Eager Singleton
public class SingletonClass {
    private static SingletonClass singletonClass=new SingletonClass();

    private SingletonClass(){

    }
    public  static SingletonClass getInstance(){
        return singletonClass;
    }

    public static void main(String[] args) {
        System.out.println("Obj1 hashcode"+SingletonClass.getInstance().hashCode());
        System.out.println("Obj2 hashcode"+SingletonClass.getInstance().hashCode());
        System.out.println("Obj3 hashcode"+SingletonClass.getInstance().hashCode());
        System.out.println("Obj4 hashcode"+SingletonClass.getInstance().hashCode());

        System.out.println("Obj1 hashcode"+LazySingleton.getInstance().hashCode());
        System.out.println("Obj2 hashcode"+LazySingleton.getInstance().hashCode());
        System.out.println("Obj3 hashcode"+LazySingleton.getInstance().hashCode());
        System.out.println("Obj4 hashcode"+LazySingleton.getInstance().hashCode());

    }
}


//Lazy Initialisation
class LazySingleton{
    private static LazySingleton lazySingleton=null;
     private LazySingleton(){

     }
     public static LazySingleton getInstance(){
         if (lazySingleton==null)
             lazySingleton=new LazySingleton();
         return lazySingleton;
     }

}
