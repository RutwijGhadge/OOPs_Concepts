package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        Adder a=new Adder(x,y);
        Thread t=new Thread(a);

        t.start();
    }
}