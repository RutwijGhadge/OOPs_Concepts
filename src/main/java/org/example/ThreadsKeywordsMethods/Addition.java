package org.example.ThreadsKeywordsMethods;

public class Addition extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Current value of " + i + " with Thread " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Addition addition = new Addition();
        addition.start();
        System.out.println("Current thread in execution before join is " + Thread.currentThread().getName());
        addition.join();

        System.out.println("Waiting completed");
        System.out.println("Current thread in execution after join is " + Thread.currentThread().getName());
    }
}
