package com.pb.rudychenko.hw6;

public class Dog extends Animal{
    private  String nameDog;
    private int weight;

    public Dog(String nameDog, int weight) {
        this.nameDog = nameDog;
        this.weight = weight;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println(getName()+"  лает");

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
