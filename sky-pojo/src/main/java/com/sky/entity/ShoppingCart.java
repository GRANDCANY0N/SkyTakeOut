package com.sky.entity;

/**
 * @author Canyon
 */
public class ShoppingCart {

  private long id;
  private String name;
  private String image;
  private long userId;
  private long dishId;
  private long setmealId;
  private String dishFlavor;
  private long number;
  private double amount;
  private java.sql.Timestamp createTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getDishId() {
    return dishId;
  }

  public void setDishId(long dishId) {
    this.dishId = dishId;
  }


  public long getSetmealId() {
    return setmealId;
  }

  public void setSetmealId(long setmealId) {
    this.setmealId = setmealId;
  }


  public String getDishFlavor() {
    return dishFlavor;
  }

  public void setDishFlavor(String dishFlavor) {
    this.dishFlavor = dishFlavor;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }

}
