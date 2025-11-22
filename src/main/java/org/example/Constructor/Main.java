package org.example.Constructor;

public class Main {
    public static void main(String[] args) {

        Car C=new Car(900,5,10);
        Car p =new Car(C);        //Deep Copy
       // Car p =C;            //Shallow Copy

        /*When we do a copy of some entity to create two or more than two entities
        such that changes in one entity are reflected in the other entities as well,
        then we can say we have done a shallow copy

        Car p object holds the address of Car C object
        Changes done in attribute of object C will be reflected in attributes of P
        as they both are pointing to the same memory address
         */

        /*When we do a copy of some entity to create two or more than two entities
         such that changes in one entity are not reflected in the other entities,
         then we can say we have done a deep copy.

         deep copy -> two separate copies

         line no 7
         */

    }
}