package com.pb.rudychenko.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
       //String токо буква = str.replaceAll("[\\W]", "")
       // String str1="dok";
       // String str2="kod";
       // String str3="odk";

        System.out.println("ВВЕДИТЕ 1-Ю СТРОКУ:");
        String str1=scan.nextLine();//.replaceAll("[\\W]", "");
        System.out.println("ВВЕДИТЕ 2-Ю СТРОКУ:");
        String str2=scan.nextLine();//.replaceAll("[\\W]", "");

       isAnagram(str1,str2);
    }
    static void isAnagram(String s1, String s2){
        char[] c1 = s1.replaceAll("[\\p{Punct}]","").toLowerCase().toCharArray();
        char[] c2 = s2.replaceAll("\\p{Punct}","").toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1, c2))
            System.out.println("ЭТО АНАГРАМА");
        else
            System.out.println("ЭТО НЕ АНАГРАМА");
    }

}
