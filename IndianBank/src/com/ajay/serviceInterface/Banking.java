package com.ajay.serviceInterface;

public interface Banking {
  void chackBalance();
  void deposit(int amout);
  void cashWidrawl(int amout);
  void transfer(int amout, int account);
  void logout();
}
