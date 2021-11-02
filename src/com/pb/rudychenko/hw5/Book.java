package com.pb.rudychenko.hw5;

public class Book {
    private static int bookCount = 0;
    private String nameBook;
    private String authorBook;
    private String yearBook;

    public Book(String nameBook, String authorBook,String yearBook) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.yearBook=yearBook;
        bookCount++;
    }

public static int getBookCount(){return bookCount;}
    public void setBookCount(){this.setBookCount();}

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public String getYearBook() {
        return yearBook;
    }

    public void setYearBook(String yearBook) {
        this.yearBook = yearBook;
    }

  public  String getSpisok2() {
        return this.nameBook +" ("+ this.authorBook+") "+this.yearBook;

    }

//public void knigaVzata(Book nameBook){
//}
}
