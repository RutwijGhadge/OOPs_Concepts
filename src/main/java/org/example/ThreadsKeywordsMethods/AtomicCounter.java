package org.example.ThreadsKeywordsMethods;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    AtomicInteger counter=new AtomicInteger(0);

    public void increment(){
        counter.incrementAndGet();
    }

    public int getCounter(){
       return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicCounter vc= new AtomicCounter();
        Thread t1= new Thread(()->{
            for(int i=0;i<1000;i++){
               vc.increment();
            }
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++){
                vc.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        System.out.println(vc.getCounter());
    }
    /*
    Use volatile when:
        Only read/write operations
        Flags, status variables
        One thread writes, others read

    Use AtomicInteger when:
        Increment / decrement
        Counters, metrics
        High concurrency without locks
     */

}
