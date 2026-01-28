package org.example.ThreadsKeywordsMethods;

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

    public static void main(String[] args) throws InterruptedException {
        JoinExample joinExample=new JoinExample();

        joinExample.start();
        joinExample.join(); // main thread waits for t to finish

        System.out.println("Current Thread:" + Thread.currentThread().getName());

    }
}
/*
What happens internally
    The calling thread (here, main) goes into WAITING state
    It resumes only after the target thread (t) completes
 */