package com.future.designpattern.decorator;

/**
 * @author juan.tjandra
 */
public class SlotShipping extends ShippingDecorator{
  protected String slotTime;
  protected int extraCost = 5000;

  public SlotShipping (Shipping shipping, String slotTime) {
    super(shipping);
    this.slotTime = slotTime;
  }

  @Override
  public void sendShipping() {
    decoratedShipping.sendShipping();
    System.out.println(" with additional time delivery " + slotTime );
  }

  @Override
  public void setShippingCost(int shippingCost) {
    decoratedShipping.setShippingCost(shippingCost + extraCost);
  }

  @Override
  public void setDestination(String address) {
    decoratedShipping.setDestination(address);
  }

  @Override
  public void setWeight(double weight) {
    decoratedShipping.setWeight(weight);
  }
}
