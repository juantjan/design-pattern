package com.future.designpattern.decorator;

/**
 * @author juan.tjandra
 */
public abstract class ShippingDecorator implements Shipping {
  protected Shipping decoratedShipping;

  public ShippingDecorator (Shipping shipping) {
    this.decoratedShipping = shipping;
  }
}
