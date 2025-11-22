package org.example.Concurrency.Synchronization.ClassLevel_Block;

public class Singleton {
    private static Singleton instance=null;

    private Singleton(){//Constructor

    }

    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
     Singleton x= getInstance();
     Singleton y= getInstance();
     System.out.println(x.hashCode());
     System.out.println(y.hashCode());
    }
}
