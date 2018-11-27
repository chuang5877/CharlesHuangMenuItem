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
        return Sandwich.getName()+"/"+Salad.getName()+"/"+Drink.getName();
    }
    public double getPrice(){
        double s=Sandwich.getPrice()+Salad.getPrice()+Drink.getPrice();
        double l=0;
        if(Sandwich.getPrice()<=Salad.getPrice()){
            if(Sandwich.getPrice()<=Drink.getPrice()){
                l=Sandwich.getPrice();
            }else {
                l=Drink.getPrice();
            }
        }else {
            if(Salad.getPrice()<=Drink.getPrice()){
                l=Salad.getPrice();
            }else {
                l=Drink.getPrice();
            }
        }
        return s-l;
    }
}
