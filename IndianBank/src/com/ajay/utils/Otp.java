package com.ajay.utils;

import java.util.Scanner;

public class Otp {
  public static int  generateFourDigitPin(){
      int otp;
      otp = (int) (Math.random()* 9000 + 1000);
      System.out.println();
      return otp;
  }
  public static boolean otpValidate( int otp){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the sent otp : ");
    System.out.println(otp);
    System.out.println("--------------------");
    int userOtp = sc.nextInt();
    // sc.close();
    return otp == userOtp;

  }
  
}
