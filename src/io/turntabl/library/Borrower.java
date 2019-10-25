package io.turntabl.library;

import io.turntabl.library.classifications.BorrowerState;


public class Borrower {
    private String name;
    private String books;
    private BorrowerState state;


    //CONSTRUCTOR FOR MY VARIABLES
    public Borrower(String name, String books, BorrowerState state) {
        this.name = name;
        this.books = books;
        this.state = state;

    }


    //GETTERS FOR VARIABLES
    public String getName() {
        return name;
    }

    public String getBooks() {
        return books;
    }

    public BorrowerState getState() {
        return state;
    }


    //PRINTING TO A NICE FORMAT
    @Override
    public String toString() {
        return "Borrower{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}


