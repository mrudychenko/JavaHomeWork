package com.pb.rudychenko.hw8;

public class WrongPasswordExeption extends  Exception{
    public WrongPasswordExeption() {
    }

    public WrongPasswordExeption(String message) {
        super(message);
    }
}
