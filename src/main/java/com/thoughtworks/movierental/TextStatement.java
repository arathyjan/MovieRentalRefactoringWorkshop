package com.thoughtworks.movierental;

import java.util.List;

public class TextStatement extends Statement {

  @Override
  protected String header(String name) {
    return "Rental Record for " + name + "\n";
  }

  @Override
  protected String lineItem(Rental rental) {
    return "\t" + rental.getMovie().getTitle() + "\t" +
        rental.amount() + "\n";
  }

  @Override
  protected String footer(double totalAmount, int totalPoints) {
    return  "Amount owed is " + totalAmount + "\n"
        + "You earned " + totalPoints
        + " frequent renter points";
  }

}
