package org.example.ThreadsKeywordsMethods;

public class VolatileExample {
    private volatile boolean flag = false;

    public void setFlagTrue(){
        System.out.println("Setting the Flag as True");
        flag=true;
    }

    public void printIfFlagIsTrue(){
        while(!flag){
            //to Do
        }
        System.out.println("Flag is True !!");
    }

    public static void main(String[] args) {
            VolatileExample volatileExample= new VolatileExample();
            Thread writerThread=new Thread(()->{
                try {
                    Thread.sleep(1000); //after 1 sec we are setting the flag as true
                    volatileExample.setFlagTrue();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            Thread readerThread=new Thread(volatileExample::printIfFlagIsTrue);

            writerThread.start();
            readerThread.start();
    }
}
/*
It tells thread to use the value from memory and not from local cache that every thread has.
Visibility – changes made by one thread are immediately visible to others
volatile is used to ensure visibility and ordering of shared variables across threads, but it does not provide atomicity.
 */