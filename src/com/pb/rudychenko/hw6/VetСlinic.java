package com.pb.rudychenko.hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class VetСlinic {


    public static void main(String[] args) throws Exception {
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

//        for (Animal animal:animals ) {
//
//            veterinarian.treatAnimal(animals,animal);
//
//        }

//        Class vetClazz =  Class.forName("com.pb.rudychenko.hw6.Veterinarian");
//
//        Constructor constr = vetClazz.getConstructor(String.class);
//        Object vet = constr.newInstance("Animal DOK");
//        Method treatAnimal=vetClazz.getMethod("treatAnimal",Animal.class);
//        }
//        for (Animal animal:animals ) {
//
//        treatAnimal.invoke(vet, animal);
//
//    }

    }}

