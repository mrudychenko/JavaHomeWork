package com.pb.rudychenko.hw7;

public class Tshirt extends Clothes implements ManClothes,WomenClothes{
    public String getName() {
        return name;
    }

    private String name;

    public Tshirt(double cost, String size, String color,String name) {
        super(cost, size, color);
        this.name = name;
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка");
    }
    @Override
    public void dressMan() {
        System.out.println("Мужская футболка");
    }

    @Override
    public String toString(Clothes clothes1) {
        return name +" "+super.toString();
    }
}
