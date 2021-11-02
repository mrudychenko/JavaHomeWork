package com.pb.rudychenko.hw5;

public class Reader {
    private String FIO;
    private String numBilet;
    private String faculty;
    private String dateBirth;
    private String numberPhone;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getNumBilet() {
        return numBilet;
    }

    public void setNumBilet(String numBilet) {
        this.numBilet = numBilet;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }


    public Reader(String FIO, String numBilet, String faculty, String dateBirth, String numberPhone) {
        this.FIO = FIO;
        this.numBilet = numBilet;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.numberPhone = numberPhone;
    }


    String getSpisok() {
        return FIO + faculty + " num" + numberPhone;
    }

    public void takeBook(int bookCount) {
        System.out.println(FIO + " взял " + bookCount + " книги");

    }

    public void takeBook(String... nameBook) {

        System.out.print(FIO + " взял книги: ");
        for (String arg : nameBook) {
            System.out.println(" " + arg);
        }
    }
    public void takeBook(Book...book){
        System.out.print(FIO + " взял книги: ");
        for(Book book1 :book){
            System.out.println(" "+book1.getSpisok2());
        }
    }

    public void returnBook(int bookCount) {
        System.out.println(FIO + " вернул " + bookCount + " книги");

    }

    public void returnBook(String... nameBook) {
        System.out.print(FIO + " вернул книги: ");
        for (String arg : nameBook) {
            System.out.println(" " + arg);
        }
    }
    public void returnBook(Book... book){
        System.out.println(FIO + " вернул книги: ");
        for(Book book1 :book){
            System.out.println(" "+book1.getSpisok2());
        }
    }
}



