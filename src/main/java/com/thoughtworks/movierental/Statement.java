package com.thoughtworks.movierental;

import java.util.List;

public abstract class Statement {
  public String print(String name, List<Rental> rentals, double totalAmount, int totalPoints) {
    return header(name) + body(rentals) + footer(totalAmount, totalPoints);
  }

  protected abstract String header(String name);

  private String body(List<Rental> rentals) {
    String result = "";
    for (Rental rental : rentals) {
      result += lineItem(rental);
    }
    return result;
  }

  protected abstract String lineItem(Rental rental);

  protected abstract String footer(double totalAmount, int totalPoints);
}
