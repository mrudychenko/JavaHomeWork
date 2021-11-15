package com.pb.rudychenko.hw7;

public class Pants extends Clothes implements ManClothes,WomenClothes {
    private String name;

    public Pants(double cost, String size, String color, String name) {
        super(cost, size, color);
        this.name = name;
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны");
    }

    @Override
    public String toString(Clothes clothes1) {
        return name +" "+super.toString();
    }

}
