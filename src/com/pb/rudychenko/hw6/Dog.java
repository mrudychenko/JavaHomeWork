package com.pb.rudychenko.hw6;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return weight == dog.weight && Objects.equals(nameDog, dog.nameDog);
    }
}
