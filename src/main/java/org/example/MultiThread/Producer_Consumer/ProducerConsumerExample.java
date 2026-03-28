package org.example.MultiThread.Producer_Consumer;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer(10);

        Thread consumer = new Thread(new Consumer(sharedBuffer));
        Thread producer = new Thread(new Producer(sharedBuffer));

        consumer.start();
        producer.start();
    }
}
