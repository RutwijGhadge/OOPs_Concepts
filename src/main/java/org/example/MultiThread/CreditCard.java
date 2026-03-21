package org.example.MultiThread;

public class CreditCard implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Payment with CreditCard");
    }
}
