package com.pb.rudychenko.hw3;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Bingo {
    public static void main(String[] args) throws IOException {// не понял как оно
        // работает и нужно ли использовать в данной программе
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int x = random.nextInt(101);
        int num;
        char ch;

        System.out.println("ЗАГАДЫВАЕТСЯ ЧИСЛО ОТ 1 ДО 100 :");
        System.out.println("ОТГАДАЙТЕ  ЗАГАДАННОЕ ЧИСЛО.");
        System.out.println("ZAGADANO " +x);

        int count=0;
        String str;

        do {
            count++;

            System.out.println("ВАШЕ ЧИСЛО:");
            str=input.nextLine();
            num= parseInt(str);

            if (num > x)
                System.out.println("ВЫ ВВЕЛИ число БОЛЬШЕ ПОПРОБУЙТЕ ЕЩЕ ");

            else if (num < x)
                System.out.println("ВЫ ВВЕЛИ число МЕНЬШЕ ПОПРОБУЙТЕ ЕЩЕ");

            else
                System.out.println("ВЫ УГАДАЛИ С " + count + " ПОПЫТКИ!");
    /*char c=str.charAt('0') ;
    if (c == 'q')
        break;
        System.out.println("ВЫ ОСТАНОВИЛИ ПРОГРАММУ ");
ВЫХОД ИЗ ПРОГРАММЫ ДОСРОЧНО, НЕ РЕАЛИЗОВАН
    return;*/




        } while (num !=x);
    }
}
