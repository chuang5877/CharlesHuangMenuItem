package com.company;

public class Sandwich implements MenuItem{
    private String name;
    private double price;
    public Sandwich(String name, double price){
        this.name=name;
        this.price=price;
    }
    public static String getName(){
        return name;
    }
    public static double getPrice(){
        return price;
    }
}
