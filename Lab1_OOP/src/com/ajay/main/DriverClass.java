package com.ajay.main;

import java.util.Scanner;

import com.ajay.model.Employee;
import com.ajay.service.CreadientialService;

public class DriverClass {
  public static void showDepartment() {
    System.out.println("-----------------------------------");
    System.out.println("Please Enter the department: ");
    System.out.println("1) Technical");
    System.out.println("2) Admin");
    System.out.println("3) Human Resource");
    System.out.println("4) Legal");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int departmentOption;
    Employee employee = new Employee("Ajay", "Khardia");
    CreadientialService service = new CreadientialService();

    showDepartment();
    departmentOption = sc.nextInt();
    if (!(departmentOption > 0 && departmentOption < 5)) {
      System.out.println("Invaild Department.");
      sc.close();
      return;
    }

    service.createEmailString(employee, departmentOption);
    service.genrateRandomPassword(employee);
    service.displayCredentials(employee);
    sc.close();

  }
}
