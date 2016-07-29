package com.thoughtworks.movierental;

public class HTMLStatement extends Statement{

    public HTMLStatement(String name, Rentals rentals) {
        super(name, rentals);
    }

    @Override
    protected String row(Rental rental) {
        return  "\t" + rental.title() + "\t" + rental.amount() + "<BR/>\n";
    }

    @Override
    protected String header() {
        return "<H1>Rental Record for <B>" + customerName + "</B></H1><BR/>"+ "\n";
    }

    @Override
    protected String footer() {
        String result = "";
        result += "Amount owed is <B>" + rentals.totalAmount() + "</B><BR/>\n";
        result += "You earned <B>" + rentals.totalPoints() + "</B> frequent renter points";
        return result;
    }
}
