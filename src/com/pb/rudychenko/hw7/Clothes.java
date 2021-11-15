package com.pb.rudychenko.hw7;

abstract class  Clothes   {
private double cost;
    private String Size;
private String color;
    public Clothes(double cost, String size, String color) {
        this.cost = cost;
        Size = size;
        this.color = color;
    }
public void dressMan(Clothes[] clothes){

}
     void dressWoman(Clothes[] clothes){
for(Clothes clothes1:clothes)
    if (clothes1 instanceof WomenClothes){
        System.out.println(clothes1+" Женская одежда");
    }
else {
        System.out.println(clothes1+"Мужская одежда");
    }
    }

    public abstract String toString(Clothes clothes1);
}
