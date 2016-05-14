package com.thoughtworks.movierental;

import java.util.ArrayList;
import java.util.List;

class Customer {
  private String name;
  private List<Rental> rentals = new ArrayList<>();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }

  public String statement() {
    return new TextStatement().print(name, rentals, totalAmount(), totalPoints());
  }

  private int totalPoints() {
    int total = 0;
    for (Rental rental : rentals) {
      total += rental.frequentRenterPoints();
    }
    return total;
  }

  private double totalAmount() {
    double total = 0;
    for (Rental rental : rentals) {
      total += rental.amount();
    }
    return total;
  }

  public String htmlStatement() {
    return new HTMLStatement().print(name, rentals, totalAmount(), totalPoints());
  }
}

