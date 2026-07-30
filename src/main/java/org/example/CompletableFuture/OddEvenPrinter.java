package org.example.CompletableFuture;

public class OddEvenPrinter {
    private int number = 1;
    private final int limit = 10;

    public synchronized void printOdd() throws InterruptedException {
        while (number <= limit) {
            while (number % 2 == 0) {
                wait();
            }
            if (number <= limit) {
                System.out.println(Thread.currentThread().getName() + ":" + number++);
            }
            notifyAll();
        }
    }

    public synchronized void printEven() throws InterruptedException {
        while (number <= limit) {
            while (number % 2 != 0) {
                wait();
            }
            if (number <= limit) {
                System.out.println(Thread.currentThread().getName() + ":" + number++);
            }
            notifyAll();
        }
    }

    public static void main(String[] args) {
        OddEvenPrinter printer = new OddEvenPrinter();

        Thread odd = new Thread(() -> {
            try {
                printer.printOdd();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "odd");

        Thread even = new Thread(() -> {
            try {
                printer.printEven();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Even");

        odd.start();
        even.start();
    }
}
