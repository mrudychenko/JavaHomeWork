package com.pb.rudychenko.hw7;

public class Tie extends Clothes implements ManClothes{
private String name;
    public Tie(double cost, String size, String color, String name) {
        super(cost, size, color);
        this.name = name;
    }

    @Override
    public void dressMan() {
        System.out.println(this.name+" одежда мужская");
    }

    @Override
    public String toString(Clothes clothes1) {
        return this.name;
    }
}
