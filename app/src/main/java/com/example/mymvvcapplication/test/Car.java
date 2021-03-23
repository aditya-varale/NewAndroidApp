package com.example.mymvvcapplication.test;

public abstract class Car {
    public abstract void Drive();
    public abstract void Engine();
    public abstract void Design();

    public String GetPrice(){
        return "in Car Abstract Class";
    }
}
