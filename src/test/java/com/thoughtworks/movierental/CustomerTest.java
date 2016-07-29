package com.thoughtworks.movierental;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    private Customer chirag;
    private Movie sholay;
    private Movie jungleBook;
    private Movie madari;

    @Before
    public void setup(){
        chirag = new Customer("Chirag");
        sholay = new Movie("Sholay", Movie.REGULAR);
        jungleBook = new Movie("Jungle book", Movie.CHILDRENS);
        madari = new Movie("Madari", Movie.NEW_RELEASE);

    }

    @Test
    public void testTextStatementForMultipleRentals() {
        chirag.addRental(new Rental(jungleBook, 7));
        chirag.addRental(new Rental(madari, 3));
        chirag.addRental(new Rental(sholay, 15));

        assertEquals("Rental Record for Chirag\n" +
                "\tJungle book\t7.5\n" +
                "\tMadari\t9.0\n" +
                "\tSholay\t21.5\n" +
                "Amount owed is 38.0\n" +
                "You earned 4 frequent renter points", chirag.statement());
    }

    @Test
    public void testTextStatementForRegularMovieForJustADay() {
        chirag.addRental(new Rental(sholay, 1));

        assertEquals("Rental Record for Chirag\n" +
                "\tSholay\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", chirag.statement());
    }


    @Test
    public void testHTMLStatementForMultipleRentals() {
        chirag.addRental(new Rental(jungleBook, 7));
        chirag.addRental(new Rental(madari, 3));
        chirag.addRental(new Rental(sholay, 15));

        assertEquals("<H1>Rental Record for <B>Chirag</B></H1><BR/>\n" +
                "\tJungle book\t7.5<BR/>\n" +
                "\tMadari\t9.0<BR/>\n" +
                "\tSholay\t21.5<BR/>\n" +
                "Amount owed is <B>38.0</B><BR/>\n" +
                "You earned <B>4</B> frequent renter points", chirag.htmlStatement());
    }

}