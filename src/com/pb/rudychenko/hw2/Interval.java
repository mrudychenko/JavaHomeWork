package com.pb.rudychenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {


        int l = -1;
        int d1 = 14;
        int d2 = 35;
        int d3 = 50;
        int d4 = 100;

        Scanner input = new Scanner(System.in);
        System.out.print("Введіть число :");
        int num = input.nextInt();
        if (num <= l) {
            System.out.print("Число НЕ потрапляє в інтервал [1-100]");
        } else if (num <= d1) {
            System.out.print("Число потрапляє в інтервал[0-14]");
        } else if (num <= d2) {
            System.out.print("Число потрапляє в інтервал[15-35]");
        } else if (num <= d3) {
            System.out.print("Число потрапляє в інтервал[36-50]");
        } else if (num > d3 & num < d4) {
            System.out.print("Число потрапляє в інтервал[51-100]");
        } else if (num > d4) {
            System.out.print("Число НЕ потрапляє в інтервал [1-100]");
        }
    }
}

