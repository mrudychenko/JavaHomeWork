package com.pb.rudychenko.hw7;

public class Atelier {
    public static void main(String[] args) {
        Tie tie=new Tie(2337,"XXL","black", "Галстук");
        Pants pants=new Pants(150,"M","white","Брюки");
        Pants pants2=new Pants(140,"L","blue","Джинсы");
        Tshirt tshirt=new Tshirt(1344,"XS","yellow","Футболка");
        Skirt skirt=new Skirt(300,"XL","red","Юбка") ;
Clothes[] clothes=new Clothes[]{tie,pants,pants2,tshirt,skirt};

//tie.dressMan();
//skirt.dressWomen();

//        dressMan(Clothes[] clothes)

       // Clothes[] clothes1 = clothes;
        dressWomen(clothes);
        dressMan(clothes);

    }
    static      void dressWomen(Clothes[] clothes){
        for(Clothes clothes1 :clothes)
            if (clothes1 instanceof WomenClothes){
                System.out.println(clothes1.toString(clothes1)+" Женская одежда");

            }
            else {
                System.out.println(clothes1.toString(clothes1)+" Мужская одежда");
            }
    }

    static      void dressMan(Clothes[] clothes){
        for(Clothes clothes1 :clothes)
            if (clothes1 instanceof ManClothes){
                System.out.println(clothes1.toString(clothes1)+" Мужская одежда");

            }
            else {
                System.out.println(clothes1.toString(clothes1)+" Женская одежда");
            }
    }
}
