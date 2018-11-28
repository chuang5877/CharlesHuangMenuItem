package com.company;

public class Trio implements MenuItem{
    Sandwich sandwich;
    Salad salad;
    Drink drink;
    public Trio(Sandwich sandwich, Salad salad, Drink drink){
        this.sandwich=sandwich;
        this.salad=salad;
        this.drink=drink;
    }
    public String getName(){
        return sandwich.getName() +"/"+salad.getName()+"/"+drink.getName();
    }
    public double getPrice(){
        double s=sandwich.getPrice()+salad.getPrice()+drink.getPrice();
        double l=0;
        if(sandwich.getPrice()<=salad.getPrice()){
            if(sandwich.getPrice()<=drink.getPrice()){
                l=sandwich.getPrice();
            }else {
                l=drink.getPrice();
            }
        }else {
            if(salad.getPrice()<=drink.getPrice()){
                l=salad.getPrice();
            }else {
                l=drink.getPrice();
            }
        }
        return s-l;
    }
}
