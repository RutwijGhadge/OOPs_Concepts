package org.example.MultiThread.Producer_Consumer;

public class Consumer implements Runnable {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer sharedBuffer) {
        this.buffer = sharedBuffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
