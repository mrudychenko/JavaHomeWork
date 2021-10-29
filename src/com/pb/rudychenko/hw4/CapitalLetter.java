package com.pb.rudychenko.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        print("ВВЕДИТЕ  СТРОКУ");
        String stroka1 = scan.nextLine();

        print("ВАША ИЗМЕНЕННАЯ СТРОКА");
        String stroka2=upper(stroka1);
        print(stroka2);

    }
    static void print(String name){
        System.out.println(name);
    }

    static String upper(String name){
        String upstr = null;
        for(int i=0; i< (name.length());i++){

            if(name.charAt(i)==' '){

                upstr= upstr.substring(0,i+1)+name.substring(i+1,i+2).toUpperCase()+name.substring(i+2);

            }else if(i==0){

                upstr=name.substring(0,1).toUpperCase()+name.substring(1);

            }
        }
        return upstr;
    }
}

    //String stroka2=stroka1.substring(0,1).toUpperCase();
//for ( int i=1; i< stroka1.length();i++){
//
//if (" ".equals(stroka1.substring(i-1, i)))
//    stroka2.substring(i,i+1).toUpperCase();
//else stroka2.substring(i,i+1);
//
    //
//}