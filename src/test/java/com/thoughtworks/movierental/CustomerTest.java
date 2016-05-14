package com.thoughtworks.movierental;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    private Customer customer;

    @Before
    public void setup() {
        customer = new Customer("Chirag");
        Movie jungleBook = new Movie("Jungle Book", Movie.CHILDRENS);
        Movie inception = new Movie("Inception", Movie.REGULAR);
        Movie civilWar = new Movie("Civil War", Movie.NEW_RELEASE);
        customer.addRental(new Rental(jungleBook, 2));
        customer.addRental(new Rental(inception, 6));
        customer.addRental(new Rental(civilWar, 3));
    }

    @Test
    public void textStatement() {

        assertEquals("Rental Record for Chirag\n" +
            "\tJungle Book\t1.5\n" +
            "\tInception\t8.0\n" +
            "\tCivil War\t9.0\n" +
            "Amount owed is 18.5\n" +
            "You earned 4 frequent renter points", customer.statement());
    }

//    @Test
//    @Ignore
//    public void hTMLStatement() {
//
//        assertEquals("<h1>Rental Record for <b>Chirag</b></h1></br>\n" +
//        "Jungle Book 1.5</br>\n" +
//            "Inception 8.0</br>\n" +
//            "Civil War 9.0</br>\n" +
//            "Amount owed is <b>18.5</b></br>\n" +
//            "You earned <b>4</b> frequent renter points", customer.htmlStatement());
//    }
//
//    @Test
//    @Ignore
//    public void hTMLStatementForFourMovies() {
//        customer.addRental(new Rental(new Movie("ABCD2", Movie.REGULAR),1));
//
//        assertEquals("<h1>Rental Record for <b>Chirag</b></h1></br>\n" +
//        "Jungle Book 1.5</br>\n" +
//            "Inception 8.0</br>\n" +
//            "Civil War 9.0</br>\n" +
//            "ABCD2 2.0</br>\n" +
//            "Amount owed is <b>20.5</b></br>\n" +
//            "You earned <b>5</b> frequent renter points", customer.htmlStatement());
//    }




}