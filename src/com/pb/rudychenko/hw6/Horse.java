package com.pb.rudychenko.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private  String nameHorse;
    private int weight;

    public Horse(String nameHorse, int weight) {
        this.nameHorse = nameHorse;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "nameDog='" + nameHorse + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return weight == horse.weight && Objects.equals(nameHorse, horse.nameHorse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameHorse, weight);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println(getName()+" иго-го");

    }
}
