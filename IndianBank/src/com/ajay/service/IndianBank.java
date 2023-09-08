package com.ajay.service;
import com.ajay.serviceInterface.Banking;
import com.ajay.utils.Otp;

public class IndianBank implements Banking {
  private int balance = 5000;

  @Override
  public void cashWidrawl(int amout) {
    if( positiveAmount(amout) && validAmount(amout)){
      this.balance -= amout;
      System.out.println("You widraw the amount : "+ amout + " and your current balance is : " + this.balance);
      return ;
    } 
    System.out.println("Please enter the greater value from 0 Or You have insuffcient balace.");
    
  }

  @Override
  public void chackBalance() {
    System.out.println("Your current bank balance : " + this.balance);
  }

  @Override
  public void deposit(int amout) {
    if(positiveAmount(amout)){
      this.balance += amout;
      System.out.println("You have deposited " + amout + " successfully \nYour current balance  is " + this.balance);
      return;
    }
    System.out.println("OOps! Add positive money.");
    
  }

  @Override
  public void logout() {
    return;
  }

  @Override
  public void transfer(int amout, int account) {
    if(positiveAmount(amout) && validAmount(amout)){
      int otp = Otp.generateFourDigitPin();
      if(Otp.otpValidate(otp)){
        this.balance -= amout;
        System.out.println("You have successfully tansfer " + amout + " to account "+ account + ".\nYour current balance is " + this.balance);
      } else {
        System.out.println("Otp is invalid.");
        return;
      }
      

      return;
    }
    System.out.println("Please enter the greater value from 0 Or You have insuffcient balace.");    
  }

  private boolean validAmount(int amount){
    return (amount <= this.balance);
  }

  private boolean positiveAmount(int amount){
    return (amount > 0);
  }

  // 

  
}
