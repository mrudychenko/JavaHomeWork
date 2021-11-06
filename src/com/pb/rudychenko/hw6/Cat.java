package com.pb.rudychenko.hw6;

import java.util.Objects;

public class Cat extends Animal{
    private  String nameCat;
    private int weight;

    public Cat(String nameCat, int weight) {
        this.nameCat = nameCat;
        this.weight = weight;
    }


    public void makeNoise() {
        super.makeNoise();
        System.out.println(getName()+" мяукает");

    }

    @Override
    public String toString() {
        return "Cat{" +
                "nameCat='" + nameCat + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && Objects.equals(nameCat, cat.nameCat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCat, weight);
    }
}
