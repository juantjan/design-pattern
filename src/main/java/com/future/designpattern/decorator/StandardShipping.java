package com.future.designpattern.decorator;

/**
 * @author juan.tjandra
 */
public class StandardShipping implements Shipping{
  private int shippingCost;
  private String destination;
  private double weight;

  @Override
  public void sendShipping() {
    System.out.println("to " + destination + " with detail: " + weight + " kg, cost: " + shippingCost);
  }

  @Override
  public void setShippingCost(int shippingCost) {
    this.shippingCost = shippingCost;
  }

  @Override
  public void setDestination(String address) {
    this.destination = destination;

  }

  @Override
  public void setWeight(double weight) {
    this.weight = weight;
  }
}
