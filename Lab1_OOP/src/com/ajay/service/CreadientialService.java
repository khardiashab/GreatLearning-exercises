package com.ajay.service;

import com.ajay.model.Employee;
import com.ajay.serviceInterfaces.CredientialServiceInterface;

public class CreadientialService implements CredientialServiceInterface {

  @Override
  public void createEmailString(Employee employee, int departmentOption) {
      employee.setEmail(employee.getFirstName() + employee.getLastName() + "@" + employee.getDepartmant(departmentOption) + "." + employee.getCompany() + ".com");
      return ;
  }

  @Override
  public void displayCredentials(Employee employee) {
    // TODO Auto-generated method stub
    System.out.println("Dear "+ employee.getFirstName()+ " your generated credentials are as follows");
    System.out.println("Email ---> " + employee.getEmail());
    System.out.println("Password ---> " + employee.getPassword());
  }

  @Override
  public void genrateRandomPassword(Employee employee) {
    employee.setPassword("Ajay");
    return ;
  }
  
}
