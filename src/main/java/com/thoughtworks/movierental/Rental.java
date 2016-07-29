package com.thoughtworks.movierental;

class Rental {
  public static final int BONUS_POINTS = 2;
  public static final int BASIC_POINTS = 1;
  private Movie movie;
  private int daysRented;

  public Rental(Movie movie, int daysRented) {
    this.movie = movie;
    this.daysRented = daysRented;
  }

  public String title(){
    return movie.getTitle();
  }

  double amount() {
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

  int points() {
    return isBonusApplicable() ? BONUS_POINTS : BASIC_POINTS;
  }

  private boolean isBonusApplicable() {
    return isNewRelease() && daysRented >  1;
  }

  private boolean isNewRelease() {
    return movie.getPriceCode() == Movie.NEW_RELEASE;
  }
}