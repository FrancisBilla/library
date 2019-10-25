package io.turntabl.library;

import io.turntabl.library.classifications.BorrowerState;
import io.turntabl.library.classifications.Category;

public class Book {
    //VARIABLE FOR THE BOOK IN THE LIBRARY

    private String title;
    private String author;
    private int isbn;
    private int accountNumber;

    private Category category;


    //Constructor for variable in the class

    public Book(String title,String author, int isbn, int accountNumber, Category category) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.accountNumber = accountNumber;
        this.category = category;
    }



    //GETTERS TO SET INPUT FOR VARIABLES

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Category getCategory() {
        return category;
    }




    //PRINT VARIABLES IN A GOOD FORMAT

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", accountNumber=" + accountNumber +
                ", category=" + category +
                '}';
    }
}
