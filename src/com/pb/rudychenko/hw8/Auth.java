package com.pb.rudychenko.hw8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auth {
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    private String login;
    private String password;
    private String confirmPassword;


    public Auth() {

    }

    public Auth(String login, String password,String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword=confirmPassword;
    }

    public void signUp(String login, String password,
                       String confirmPassword)
            throws WrongLoginException, WrongPasswordExeption
    {
        String pattern = "^[a-z 0-9_]{5,20}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(login);

        if (!m.find()) {
            throw new WrongLoginException(login + " Не верное имя!!!!");
        }
        if(password!=confirmPassword){
            throw new WrongPasswordExeption("Пароль: "+password+" не совпадает!!!!");
        }

    }

    
    public void    signIn(String login, String password) throws WrongPasswordExeption {
        //boolean b = password == confirmPassword;
        if (login!=getLogin()){throw new WrongPasswordExeption("Ввели неверное имя или Пароль: "+" !!!!");}
        if(password!=confirmPassword){
            throw new WrongPasswordExeption("Ввели неверное имя или Пароль: "+password+" !!!!");
        }




    }

public String info(){
        return "login: "+login+" password:"+password;
}

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }



}




