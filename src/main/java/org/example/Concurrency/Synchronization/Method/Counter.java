package org.example.Concurrency.Synchronization.Method;

public class Counter {
    private int count=0;

    //Synchronized method for Critical Section of the Code
    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }

}
