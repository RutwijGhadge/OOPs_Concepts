package org.example.Constructor;

public class Car {
    int price;      //default access modifier
    public int seats;
    int avg;

    //1. Default constructor is called automatically when no other constructor is used

    public Car(){       // 2. no argument constructor
        price=100;
        seats=5;
        avg=10;
    }

    public Car(int price,int seats,int avg){     // 3.parameterized constructor
        this.price=price;
        this.seats=seats;
        this.avg=avg;
    }

    public Car(Car x){  // 4.copy constructor
        this.price=x.price;
        this.seats=x.seats;
        this.avg= x.avg;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }
}

