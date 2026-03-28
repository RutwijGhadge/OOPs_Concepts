package org.example.MultiThread.Practise;

public class PractiseQuestions {
    static int count = 0;


    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            synchronized (Thread.class) {
                for (int i = 0; i < 20; i++) {
                    count++;
                }
                System.out.println("Current Count:" + Thread.currentThread().getName() + ":" + count);
            }
            ;
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        //join(): wait for the thread to finish
        System.out.println("Final Count:" + count);
    }
}
