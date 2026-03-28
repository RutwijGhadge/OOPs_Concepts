package org.example.MultiThread.Practise;

public class OddEven {
    /*
    Thread-1 prints odd numbers
    Thread-2 prints even numbers
     */
    public int i = 0;
    public final int MAXs = 10;

    public synchronized void printEven() {
        while (i <= MAXs) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " Even Number:" + i);
                i++;
                notify();
            } else {
                try {
                    wait(); //even waits
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    public synchronized void printOdd() {
        while (i <= MAXs) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " Odd Number:" + i);
                i++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Runnable taskEven = () -> {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + " : Even : " + i);
                }
            }
        };
        Runnable taskOdd = () -> {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + " : Odd : " + i);
                }
            }
        };


//        Thread t1=new Thread(taskEven);
//        Thread t2=new Thread(taskOdd);
//
//        t1.start();
//        t1.join();
//        t2.start();
//        t2.join();

        OddEven oddEven = new OddEven();
        Thread even = new Thread(oddEven::printEven);
        Thread odd = new Thread(oddEven::printOdd);

        even.start();
        odd.start();
    }
}

/*
| Step | i value | Running Thread | Action                                | Waiting Thread      | Notification          |
| ---- | ------- | -------------- | ------------------------------------- | ------------------- | --------------------- |
| 1    | 0       | Even           | Prints `Even 0`, increments `i → 1`   | Odd not started yet | `notify()` called     |
| 2    | 1       | Even           | Condition fails (`1%2!=0`) → `wait()` | Even waits          | —                     |
| 3    | 1       | Odd            | Prints `Odd 1`, increments `i → 2`    | Even waiting        | `notify()` wakes Even |
| 4    | 2       | Even           | Prints `Even 2`, increments `i → 3`   | Odd active          | `notify()`            |
| 5    | 3       | Even           | Condition fails → `wait()`            | Even waiting        | —                     |
| 6    | 3       | Odd            | Prints `Odd 3`, increments `i → 4`    | Even waiting        | `notify()` wakes Even |
| 7    | 4       | Even           | Prints `Even 4`, increments `i → 5`   | Odd active          | `notify()`            |
| 8    | 5       | Even           | Condition fails → `wait()`            | Even waiting        | —                     |
| 9    | 5       | Odd            | Prints `Odd 5`, increments `i → 6`    | Even waiting        | `notify()` wakes Even |
| 10   | 6       | Even           | Prints `Even 6`, increments `i → 7`   | Odd active          | `notify()`            |
| 11   | 7       | Even           | Condition fails → `wait()`            | Even waiting        | —                     |
| 12   | 7       | Odd            | Prints `Odd 7`, increments `i → 8`    | Even waiting        | `notify()` wakes Even |
| 13   | 8       | Even           | Prints `Even 8`, increments `i → 9`   | Odd active          | `notify()`            |
| 14   | 9       | Even           | Condition fails → `wait()`            | Even waiting        | —                     |
| 15   | 9       | Odd            | Prints `Odd 9`, increments `i → 10`   | Even waiting        | `notify()` wakes Even |
| 16   | 10      | Even           | Prints `Even 10`, increments `i → 11` | Odd active          | `notify()`            |
| 17   | 11      | Both           | `while(i<=10)` becomes false          | None                | Threads exit          |

 */