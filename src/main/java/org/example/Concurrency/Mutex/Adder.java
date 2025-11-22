package org.example.Concurrency.Mutex;

public class Adder implements Runnable{
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++){//will give random count
            count.setCount(count.getCount()+1);
        }
        System.out.println("Count Adder :"+ count.getCount());//incrementing the count
    }//both adder and subtractor threads are going parallel so there is confusion
}
