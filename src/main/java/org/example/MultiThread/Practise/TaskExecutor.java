package org.example.MultiThread.Practise;

public class TaskExecutor {
    public static class Task implements Runnable {
        private String name;

        public Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Task("Thread-1"));
        Thread t2 = new Thread(new Task("Thread-2"));
        Thread t3 = new Thread(new Task("Thread-3"));

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
    /*
    run() Method
    run() contains the actual code executed by the thread.
    If you call run() directly, no new thread is created. It behaves like a normal method call.

    when the start() method is called : the thread start executing the work that is present in the run() method.
    Starting of the thread is async process.
    Threads run concurrently
    order of execution is not guaranteed

    Java Executor Framework uses Runnable.
     */

}
