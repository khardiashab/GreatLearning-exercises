package com.ajay.model;
public class Customer {
  private String accountNo;
  private String password;
  public Customer(String accountNo, String password) {
    this.accountNo = accountNo;
    this.password = password;
  }
  public String getAccountNo() {
    return accountNo;
  }
  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

// create constructor with all properties 
//  create getter and setter function



}
