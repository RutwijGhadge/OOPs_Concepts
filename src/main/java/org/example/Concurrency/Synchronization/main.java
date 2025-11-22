package org.example.Concurrency.Synchronization;
import org.example.Concurrency.Synchronization.Method.Counter;

import java.time.LocalDateTime;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();

        Runnable task1=()->{
            for(int i=0;i<1000;i++){
                counter.increment();
            }
        };

//        Runnable task2=()->{
//            for(int i=0;i<100;i++){
//                counter.increment();
//            }
//        };


        System.out.println("Started thread T1:"+LocalDateTime.now());
        Thread t1=new Thread(task1);
        System.out.println("Finished T1 & Started thread T2:"+LocalDateTime.now());

        Thread t2=new Thread(task1);
        System.out.println("Finished thread T2:"+LocalDateTime.now());



        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCount());
    }
}
