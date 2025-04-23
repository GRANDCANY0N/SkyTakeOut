package com.sky.entity;

/**
 * @author Canyon
 */
public class SetmealDish {

  private long id;
  private long setmealId;
  private long dishId;
  private String name;
  private double price;
  private long copies;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getSetmealId() {
    return setmealId;
  }

  public void setSetmealId(long setmealId) {
    this.setmealId = setmealId;
  }


  public long getDishId() {
    return dishId;
  }

  public void setDishId(long dishId) {
    this.dishId = dishId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getCopies() {
    return copies;
  }

  public void setCopies(long copies) {
    this.copies = copies;
  }

}
