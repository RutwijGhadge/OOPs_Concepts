package org.example.MultiThread;

public interface PaymentService {
    void pay(double amount);

    default void payment(double amount) {
        System.out.println("Adding Default Method");
    }
}
