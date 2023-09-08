
// create Main class with main class

import java.util.Scanner;

import com.ajay.model.Customer;
import com.ajay.service.IndianBank;

public class Main {
  public static void showMenu() {
    System.out.println();
    System.out.println("---------------------------------------------------------------");
    System.out.println("Welcome to banking services. Choose your task to banking: ");
    System.out.println("1) CheckBalance");
    System.out.println("2) deposit");
    System.out.println("3) Widrawal");
    System.out.println("4) Transfer");
    System.out.println("5) Logout");
    System.out.println("---------------------------------------------------------------");
  }

  public static void main(String[] args) {
    int amount;
    Customer customer1 = new Customer("12345678", "password");
    IndianBank bank = new IndianBank();

    Scanner sc = new Scanner(System.in);
    String accountNoString;
    String password;
    int option;

    System.out.println("Enter your account: ");
    accountNoString = sc.next();
    System.out.println("Enter your password: ");
    password = sc.next();

    // If customer details are worng.
    if (!(accountNoString.equals(customer1.getAccountNo()) && password.equals(customer1.getPassword()))) {
      System.out.println("Your details is invaild.");
      sc.close();
      return;
    }

    // else we use do while loop
    do {
      showMenu();
      option = sc.nextInt();

      switch (option) {
        case 1:
          // check balance
          bank.chackBalance();

          break;
        case 2:
          // deposit balance
          System.out.println("Enter the amount : ");
          amount = sc.nextInt();
          bank.deposit(amount);

          break;
        case 3:
          // cash widrawal
          System.out.println("Enter the amount : ");
          amount = sc.nextInt();
          bank.cashWidrawl(amount);
          break;
        case 4:
          // transfer
          System.out.println("Enter the amount : ");
          amount = sc.nextInt();
          System.out.println("Enter the account No. :");
          int accountNo = sc.nextInt();
          bank.transfer(amount, accountNo);
          break;
        case 5:
          // logout
          bank.logout();
          break;

        default:
          break;
      }

    } while (option != 5);
    sc.close();
    System.out.println("Exit successfully.");
  }
}
