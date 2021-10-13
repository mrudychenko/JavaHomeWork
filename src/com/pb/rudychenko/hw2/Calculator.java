package com.pb.rudychenko.hw2;


import java.util.Scanner;

public class Calculator {
    private static double oper1;

    public static void main(String[] args) {
int operand1, operand2;
//double  oper1;
//double oper2;

String sign;
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть перше число :");
        operand1= input.nextInt();
        System.out.print("Введіть друге число :");
        operand2=input.nextInt();
if (operand2==0){System.out.println("Не можна ділити на нуль, введіть інше число");
    return;
};
        System.out.println("Виберіть арифмитичну дію: + - * :");
sign=input.next();

switch (sign){
    case "+":
        System.out.println("Дорівнює " + (operand1+operand2));
break;
    case "-":
        System.out.println("Дорівнює " + (operand1 - operand2));
        break;
    case "*":
        System.out.println("Дорівнює " + (operand1*operand2));
        break;
    case ":":
        System.out.println("Дорівнює " + (operand1/operand2));
        break;
    case "/":
        System.out.println("Дорівнює " + (operand1/operand2));
        break;


}
    }
}