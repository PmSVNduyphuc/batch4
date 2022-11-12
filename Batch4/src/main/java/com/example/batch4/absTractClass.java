package com.example.batch4;

abstract class Plane{
    abstract void fly();
}
class Boeing extends Plane{

    void fly() {
        System.out.println("Do dai duong bay cat canh toi thieu la 3374");
    }
    public static void main(String[] args) {
        Plane p = new Boeing();
        p.fly();

    }
}

