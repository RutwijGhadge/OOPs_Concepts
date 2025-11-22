package org.example.Concurrency.Mutex;

public class Main {
    public static void main(String[] args) {
        Count count=new Count(0);
        Adder adder=new Adder(count);
        Subtractor subtractor=new Subtractor(count);

        Thread t1=new Thread(adder);
        Thread t2=new Thread(subtractor);

        t1.start();
        t2.start();
        System.out.println("Count Main:"+count.getCount());//count in main thread
    }
}