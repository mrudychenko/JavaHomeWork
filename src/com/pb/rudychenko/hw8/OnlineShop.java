package com.pb.rudychenko.hw8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class OnlineShop {
    public static void main(String[] args)  {
       // Pattern pattern=Pattern.compile("/^[a-z 0-9_-]{5,20}$/") ;
        Scanner scan =new Scanner(System.in);
        Auth auth=new Auth("login1","password1","password1");
        Auth auth1=new Auth();
        //System.out.println("Пройдите регистрацию...");
//        System.out.println("Введите логин:");
//        String login=scan.next();
//        auth1.setLogin(login);
//        System.out.println("Введите пароль:");
//        String password=scan.next();
//        auth1.setPassword(password);
//        System.out.println("Подтвердите пароль:");
//        String confpassw=scan.next();
//        auth1.setConfirmPassword(confpassw);
//        System.out.println("Вы зарегестрированы!");
//        System.out.println("Для входа введите логин и пароль:...");
//        System.out.println("Введите логин:");
//
//        System.out.println("Введите пароль:");

        try {
            auth.signUp("login1","password1","password1");
            auth.signIn("login1","passwor1");
        } catch (WrongLoginException |WrongPasswordExeption e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }


//        try {
//          //  auth1.signIn(login, password);
//            auth.signIn("login","password1");
//        } catch (WrongPasswordExeption e) {
//           // e.printStackTrace();
//            System.out.println(e.getMessage());
//        }

    }
        //auth.signIn(scan.next(),scan.next());
       // System.out.println(auth.info());

    }

