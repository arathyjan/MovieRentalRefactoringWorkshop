package com.thoughtworks.movierental;

public class HTMLStatement extends Statement{
  @Override
  protected String header(String name) {
    return "<h1>Rental Record for <b>" + name +"</b></h1></br>\n";
  }

  @Override
  protected String lineItem(Rental rental) {
    return null;
  }

  @Override
  protected String footer(double totalAmount, int totalPoints) {
    return null;
  }
}
