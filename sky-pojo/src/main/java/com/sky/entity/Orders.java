package com.sky.entity;
/**
 * @author Canyon
 */
public class Orders {

  private long id;
  private String number;
  private long status;
  private long userId;
  private long addressBookId;
  private java.sql.Timestamp orderTime;
  private java.sql.Timestamp checkoutTime;
  private long payMethod;
  private long payStatus;
  private double amount;
  private String remark;
  private String phone;
  private String address;
  private String userName;
  private String consignee;
  private String cancelReason;
  private String rejectionReason;
  private java.sql.Timestamp cancelTime;
  private java.sql.Timestamp estimatedDeliveryTime;
  private long deliveryStatus;
  private java.sql.Timestamp deliveryTime;
  private long packAmount;
  private long tablewareNumber;
  private long tablewareStatus;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getAddressBookId() {
    return addressBookId;
  }

  public void setAddressBookId(long addressBookId) {
    this.addressBookId = addressBookId;
  }


  public java.sql.Timestamp getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(java.sql.Timestamp orderTime) {
    this.orderTime = orderTime;
  }


  public java.sql.Timestamp getCheckoutTime() {
    return checkoutTime;
  }

  public void setCheckoutTime(java.sql.Timestamp checkoutTime) {
    this.checkoutTime = checkoutTime;
  }


  public long getPayMethod() {
    return payMethod;
  }

  public void setPayMethod(long payMethod) {
    this.payMethod = payMethod;
  }


  public long getPayStatus() {
    return payStatus;
  }

  public void setPayStatus(long payStatus) {
    this.payStatus = payStatus;
  }


  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getConsignee() {
    return consignee;
  }

  public void setConsignee(String consignee) {
    this.consignee = consignee;
  }


  public String getCancelReason() {
    return cancelReason;
  }

  public void setCancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
  }


  public String getRejectionReason() {
    return rejectionReason;
  }

  public void setRejectionReason(String rejectionReason) {
    this.rejectionReason = rejectionReason;
  }


  public java.sql.Timestamp getCancelTime() {
    return cancelTime;
  }

  public void setCancelTime(java.sql.Timestamp cancelTime) {
    this.cancelTime = cancelTime;
  }


  public java.sql.Timestamp getEstimatedDeliveryTime() {
    return estimatedDeliveryTime;
  }

  public void setEstimatedDeliveryTime(java.sql.Timestamp estimatedDeliveryTime) {
    this.estimatedDeliveryTime = estimatedDeliveryTime;
  }


  public long getDeliveryStatus() {
    return deliveryStatus;
  }

  public void setDeliveryStatus(long deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public java.sql.Timestamp getDeliveryTime() {
    return deliveryTime;
  }

  public void setDeliveryTime(java.sql.Timestamp deliveryTime) {
    this.deliveryTime = deliveryTime;
  }


  public long getPackAmount() {
    return packAmount;
  }

  public void setPackAmount(long packAmount) {
    this.packAmount = packAmount;
  }


  public long getTablewareNumber() {
    return tablewareNumber;
  }

  public void setTablewareNumber(long tablewareNumber) {
    this.tablewareNumber = tablewareNumber;
  }


  public long getTablewareStatus() {
    return tablewareStatus;
  }

  public void setTablewareStatus(long tablewareStatus) {
    this.tablewareStatus = tablewareStatus;
  }

}
