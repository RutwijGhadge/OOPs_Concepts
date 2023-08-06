package org.example;

public class Subtractor implements Runnable{
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++) {//will give random count
            count.setCount(count.getCount() - 1);//decrementing the count
        }
        System.out.println("Count Subtractor :"+ count.getCount());
    }//both adder and subtractor threads are going parallel so there is confusion
}
