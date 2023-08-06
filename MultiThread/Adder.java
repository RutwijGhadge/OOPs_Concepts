package org.example;

public class Adder implements Runnable{
    public int x;
    public int y;

    public Adder(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public void run(){
        System.out.println("thread executing : "+ Thread.currentThread().getName());
        System.out.println("Sum is : "+ (this.x +this.y));
    }
}
