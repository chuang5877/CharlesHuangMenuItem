package com.company;

public class Salad implements MenuItem {
    private String name;
    private double price;
    public Salad(String name, double price){
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
