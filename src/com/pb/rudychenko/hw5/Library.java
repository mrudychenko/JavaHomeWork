package com.pb.rudychenko.hw5;

import java.util.Arrays;

public class Library {


    public static void main(String[] args) {

        Book[] books=new Book[3];
        books[0]= new Book("Приклюения","Иванов И.И","2000г");
        books[1]= new Book("Словарь","Сидоров А.В","1980г");
        books[2]= new Book("Энциклопедия","Гусев К. В.","2010г");

        Reader[] readers= new Reader[3];
        readers[0]=new Reader("Петров C.А","12","Право","1994","819194");
        readers[1]=new Reader("Иванов И.П","15","Экономика","1995","0372721");
        readers[2]=new Reader("Васин Н.О","18","Кибернетика","1993","2874220");

        System.out.println("СПИСОК КНИГ:");
        for (int i =0;i<books.length ;i++)
        {
            System.out.print(books[i].getNameBook()+" ");
            System.out.println(books[i].getAuthorBook());
        }
        System.out.println("СПИСОК ЧИТАТЕЛЕЙ:");




        for (int i = 0, j = 0; i < readers.length||j<books.length; i++,j++)
        {System.out.println(readers[i].getFIO());

        }
        readers[1].takeBook(2);
        readers[2].takeBook(books[1].getNameBook(),books[2].getNameBook());
        readers[0].returnBook(books[1].getNameBook(),books[0].getNameBook(),books[2].getNameBook());

        readers[0].returnBook(2);
        readers[1].returnBook(books[1],books[0],books[2]);
        readers[2].takeBook(books[0],books[2]);
}
}
