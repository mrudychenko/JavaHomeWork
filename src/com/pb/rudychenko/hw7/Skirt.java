package com.pb.rudychenko.hw7;

public class Skirt extends Clothes implements WomenClothes{
private String name;
    public Skirt(double cost, String size, String color, String name ) {
        super(cost, size, color);
        this.name = name;
    }

    @Override
    public void dressWomen() {
        System.out.println(this.name+" одежда женская");

    }

    @Override
    public String toString(Clothes clothes1) {
        return name +" "+super.toString();
    }
}
