package com.thoughtworks.movierental;

public class TextStatement extends Statement {

    public TextStatement(String name, Rentals rentals) {
        super(name, rentals);
    }

    @Override
    protected String row(Rental rental) {
        return  "\t" + rental.title() + "\t" + rental.amount() + "\n";
    }

    @Override
    protected String header() {
        return "Rental Record for " + customerName + "\n";
    }

    @Override
    protected String footer() {
        String result = "";
        result += "Amount owed is " + rentals.totalAmount() + "\n";
        result += "You earned " + rentals.totalPoints()
                + " frequent renter points";
        return result;
    }


}
