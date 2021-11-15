package com.pb.rudychenko.hw7;

abstract class  Clothes   {
private double cost;
    private String Size;

    @Override
    public String toString() {
        return "Clothes{" +
                "cost=" + cost +
                ", Size='" + Size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    private String color;
    public Clothes(double cost, String size, String color) {
        this.cost = cost;
        Size = size;
        this.color = color;
    }



    public abstract String toString(Clothes clothes1);
}
