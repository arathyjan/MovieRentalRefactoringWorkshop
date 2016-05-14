package com.thoughtworks.movierental;

class Rental {
  private Movie movie;
  private int daysRented;

  public Rental(Movie movie, int daysRented) {
    this.movie = movie;
    this.daysRented = daysRented;
  }

  public int getDaysRented() {
    return daysRented;
  }

  public Movie getMovie() {
    return movie;
  }

  public double amount() {
    double amount = 0;
    switch (movie.getPriceCode()) {
      case Movie.REGULAR:
        amount += 2;
        if (daysRented > 2)
          amount += (daysRented - 2) * 1.5;
        break;
      case Movie.NEW_RELEASE:
        amount += daysRented * 3;
        break;
      case Movie.CHILDRENS:
        amount += 1.5;
        if (daysRented > 3)
          amount += (daysRented - 3) * 1.5;
        break;
    }
    return amount;
  }

  public int frequentRenterPoints() {
    return isEligibleForBonus() ? 2 : 1;
  }

  private boolean isEligibleForBonus() {
    return isNewRelease() && daysRented > 1;
  }

  private boolean isNewRelease() {
    return movie.getPriceCode() == Movie.NEW_RELEASE;
  }
}