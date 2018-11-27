package com.company;

public class Drink implements MenuItem {
    private String name;
    private double price;
    public Drink(String name, double price){
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
