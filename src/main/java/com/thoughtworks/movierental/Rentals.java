package com.thoughtworks.movierental;

import java.util.ArrayList;

public class Rentals extends ArrayList<Rental>{

    int totalPoints() {
      int total = 0;
      for (Rental rental : this) {
        total += rental.points();
      }
      return total;
    }

    double totalAmount() {
      double total = 0;
      for (Rental rental : this) {
        total += rental.amount();
      }
      return total;
    }
}
