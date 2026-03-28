package org.example.MultiThread.Producer_Consumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int val) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();
        }

        queue.add(val);
        System.out.println("Produced:" + val);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int value = queue.poll();
        System.out.println("Consumed:" + value);
        notifyAll();
        return value;
    }

}
