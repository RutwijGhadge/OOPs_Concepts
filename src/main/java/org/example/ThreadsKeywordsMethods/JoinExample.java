package org.example.ThreadsKeywordsMethods;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class JoinExample extends Thread{
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("From "+ Thread.currentThread().getName()+" Thread: "+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        JoinExample joinExample=new JoinExample();

        joinExample.start();
        joinExample.join(); // main thread waits for t to finish

        System.out.println("Current Thread:" + Thread.currentThread().getName());

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Integer> future = executorService.submit(() -> 10 + 30);
        System.out.println(future.get());

        Thread t = new Thread(() ->
                System.out.println("Thread Name :" + Thread.currentThread().getName())
        );
        t.start();
    }
}
/*
What happens internally
    The calling thread (here, main) goes into WAITING state
    It resumes only after the target thread (t) completes
 */