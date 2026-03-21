package org.example.Abstract_Class;

public class Crow extends Bird {
    @Override
    public void eat() {
        System.out.println("Crow is Eating..");
    }

    @Override
    public void walk() {
        System.out.println("Crow is Walking..");
    }

    public void fly() {
        System.out.println("Crow is Flying..");
    }
}
