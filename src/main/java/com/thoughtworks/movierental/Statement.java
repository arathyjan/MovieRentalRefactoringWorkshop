package com.thoughtworks.movierental;

public abstract class Statement {
    protected final String customerName;
    protected final Rentals rentals;

    public Statement(String name, Rentals rentals) {
        this.rentals = rentals;
        this.customerName = name;
    }

    public String print() {
        return header() + body() + footer();
    }

    private String body() {
        String result = "";
        for (Rental rental : rentals) {
            result += row(rental);
        }
        return result;
    }

    protected abstract String row(Rental rental);

    protected abstract String header();

    protected abstract String footer();
}
