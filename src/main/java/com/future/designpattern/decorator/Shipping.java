package com.future.designpattern.decorator;

/**
 * @author juan.tjandra
 */
public interface Shipping {
  void sendShipping();
  void setShippingCost(int shippingCost);
  void setDestination(String address);
  void setWeight(double weight);
}
