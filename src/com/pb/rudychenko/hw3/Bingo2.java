package com.pb.rudychenko.hw3;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Bingo2 {
    public static void main(String[] args) throws IOException {// не могу
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int x = random.nextInt(101);
        String operand1;
        int num;

        System.out.println("ЗАГАДЫВАЕТСЯ ЧИСЛО ОТ 1 ДО 100 :");
        System.out.println("ОТГАДАЙТЕ  ЗАГАДАННОЕ ЧИСЛО.");
        //System.out.println("ZAGADANO " +x);
        //num=Integer.parseInt(operand1);
        int count=1;
        String str;
        char ch;

do {

    ch=(char) System.in.read();


do {
    count++;

    System.out.println("УГАДАЙТЕ:");
    str=input.nextLine();
    num= parseInt(str);

    if (num > x)
        System.out.println("ВЫ ВВЕЛИ число БОЛЬШЕ ПОПРОБУЙТЕ ЕЩЕ ");

     else if (num < x)
        System.out.println("ВЫ ВВЕЛИ число МЕНЬШЕ ПОПРОБУЙТЕ ЕЩЕ");

    else
        System.out.println("ВЫ УГАДАЛИ С " + count + " ПОПЫТКИ!");
    /*char c=str.charAt('q') ;
    if (c == 'q')
        break;
        System.out.println("ВЫ ОСТАНОВИЛИ ПРОГРАММУ ");

    return;

    не реализовано

    */

} while (num !=x);
    }while ('q' != ch);
        System.out.println("www");
    }
}

