package io.turntabl;

import io.turntabl.library.Book;
import io.turntabl.library.Borrower;
import io.turntabl.library.classifications.BorrowerState;
import io.turntabl.library.classifications.Category;

import javax.xml.namespace.QName;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    //LIST OF BOOKS ARRAY
    List<Book> books = Arrays.asList(
        new Book("kill them", "Amanda Griham", 452, 1154, Category.Hurrifying),
        new Book("Things fall apart", "Chiwua Akyibi", 102, 5545, Category.Historic),
        new Book("In love of a Stranger", "Hans Koman", 214, 8574, Category.Romantic),
        new Book("Speaking the Spirt", "Dr. Kassy", 134, 4514, Category.Religous),
        new Book("Think the positive way", "Akwaboah Bill", 454, 6542, Category.Religous),
        new Book("Laugh a minute", "Morris Brown", 323, 2424, Category.Commic),
        new Book("Life is a Lie", "Billy Cee", 710, 1222, Category.Fiction),
        new Book("Step Up", "Koffi Alolo", 232, 1465, Category.Romantic),
        new Book("Angel in Love", "Frances Kojo", 441, 1478, Category.Romantic),
        new Book("Koko the Beast", "Amanda Griham", 453, 1100, Category.Fiction),
        new Book("The Rabbit and the Lion", "Vivian Boaakye", 327, 1584, Category.Fiction),
        new Book("Check check", "Akua Adoma", 548, 2044, Category.Hurrifying),
        new Book("Sse ssr", "Alex Owuse", 411, 1007, Category.Hurrifying),
        new Book("Buddy", "Bille Bille", 204, 8740, Category.Hurrifying),
        new Book("Let the light", "Amanda Griham", 452, 1154, Category.Religous),
        new Book("kill them", "Amanda Griham", 452, 1154, Category.Hurrifying)

    );


    //LIST OF BORROWERS

        List<Borrower> borrowers = Arrays.asList(

                new Borrower("Pat Cee","Angel in Love", BorrowerState.Regular),
                new Borrower("Emma Billy","Check check", BorrowerState.Gold),
                new Borrower("McBac Kay","Angel in Love", BorrowerState.Primer),
                new Borrower("Sam Moorhouse","The Rabbit and the Lion", BorrowerState.Gold),
                new Borrower("Isaac Kiki","Life is a Lie", BorrowerState.Children),
                new Borrower("Shadrack Owusu","Angel in Love", BorrowerState.Gold),
                new Borrower("John Boakye","Laugh a minute", BorrowerState.Primer),
                new Borrower("Gloria Ansah","The Rabbit and the Lion", BorrowerState.Children),
                new Borrower("Blessing Billa","Step Up",BorrowerState.Primer),
                new Borrower("Francis Billa","Life is a Lie", BorrowerState.Gold),
                new Borrower("Nana Yaa","Sse ssr", BorrowerState.Regular),
                new Borrower("Samuel Kwame","Angel in Love", BorrowerState.Children),
                new Borrower("Nancy Annan","Angel in Love", BorrowerState.Primer),
                new Borrower("Emmanuel Billa","Check check", BorrowerState.Regular),
                new Borrower("Cheales Mic","Angel in Love", BorrowerState.Gold),
                new Borrower("Alex Nini","Laugh a minute", BorrowerState.Primer),
                new Borrower("Doreen Inusa","Sse ssr", BorrowerState.Regular),
                new Borrower("Samuel Billa","Angel in Love", BorrowerState.Gold)

        );




    //PRINT NAMES OF GOLD BORROWERS

        //printBooks(books);

        List<Borrower> goldStateAccount = new ArrayList<>();
        for (Borrower eachBorrower: borrowers){
            if (eachBorrower.getState() == BorrowerState.Gold){
                goldStateAccount.add(eachBorrower);
            }
        }

        for (Borrower eachBorrower: goldStateAccount) {
            System.out.println(eachBorrower);
        }

        System.out.println("    \n");

        //Length to Borrower Name
        for (Borrower eachBorrower: borrowers){
            if (eachBorrower.getState() == BorrowerState.Gold){
                System.out.println("The length of the "+ eachBorrower.getName() + " is: " + eachBorrower.getName().length());
                //goldStateAccount.add(eachBorrower);
            }
        }

        //PRINT LARGEST NAME

        for (Borrower eachBorrower: borrowers){
            if (eachBorrower.getState() == BorrowerState.Gold){
                if (eachBorrower.getName().length() <= eachBorrower.getName().length())
                System.out.println("The Maximum length is "+ eachBorrower.getName().length());
               }
        }





       // List<Book> fictionBooks = //
    }
}
