package org.example.SOLID_Principles.LSP;

public class Main {
    public static void main(String[] args) {
        Bird bird=new Peacock();
        bird.fly();

        Bird birds=new Penguine();
        birds.fly();
    }
}
//LSP : Definition:
//Objects of a superclass should be replaceable with objects of its subclasses without breaking the correctness of the program.
//Superclass : Bird
//Subclasses : Peacock, Penguin