package com.pb.rudychenko.hw6;

public class VetСlinic {
    public static void main(String[] args) {
       Veterinarian veterinarian=new Veterinarian();


       Animal dog=new Dog("nameDog", 30);
       dog.setName("Пес");
       dog.setLocation("Город Д");
       dog.setFood("корм для собак ");

       Animal cat=new Cat("nameCat", 5);
        cat.setName("Мурзик");
        cat.setLocation("Город,А");
        cat.setFood("корм для котов");

        Animal hors=new Horse("nameHorse",100);
        hors.setName("Лошадка");
        hors.setLocation("Город,Б");
        hors.setFood("корм для лошадей");


        Animal[] animals=new Animal[]{dog,cat,hors};

        for (Animal animal:animals ) {
animal.makeNoise();
            System.out.println(animal.getName()+" "+animal.getLocation()+" ");
            veterinarian.treatAnimal(animals,animal);

        }



    }
}
