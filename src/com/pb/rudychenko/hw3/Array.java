package com.pb.rudychenko.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
      int a,b,t;
        int sum=0;
        int [] array  = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("ЗАПОЛНИТЕ МАССИВ ИЗ 10 ЭЛЕМЕНТОВ");
        array[0]=input.nextInt();
        array[1]=input.nextInt();
        array[2]=input.nextInt();
        array[3]=input.nextInt();
        array[4]=input.nextInt();
        array[5]=input.nextInt();
        array[6]=input.nextInt();
        array[7]=input.nextInt();
        array[8]=input.nextInt();
        array[9]=input.nextInt();

        System.out.print("НАШ МАССИВ:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " +array[i]);
        }

        for (int x : array) {
            sum +=x;
        }
        System.out.println();
        System.out.println("СУММА ЭЛЕМЕНТОВ МАССИВА:" +sum);

    for (a=1; a<array.length; a++)
        for (b=array.length-1; b>=a;b--){
            if (array[b-1]>array[b]) {
                t=array[b-1];
                array[b-1]=array[b];
                array[b]=t;
            }
        }
        System.out.print("ОТСОРТИРОВАННЫЙ МАССИВ:");
    for (int i=0; i<array.length;i++)
        System.out.print(" " +array[i]);
        System.out.println();

        int pos=0;
        for(int i=0; i<array.length; i++){
            if (array[i] >0)
                pos++;
            }
        System.out.print("ПОЛОЖИТЕЛЬНЫХ ЭЛЕМЕНТОВ : " + pos);
    }
}
