package com.thoughtworks.movierental;

class Customer {
  private String name;
  private Rentals rentals = new Rentals();
  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String statement() {
    return new TextStatement(name, rentals).print();
  }

  public String htmlStatement() {
    return new HTMLStatement(name, rentals).print();
  }
}

