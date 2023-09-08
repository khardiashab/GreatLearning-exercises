package com.ajay.serviceInterfaces;

import com.ajay.model.Employee;

public interface CredientialServiceInterface {

  void genrateRandomPassword(Employee employee);
  void createEmailString(Employee employee, int departmentOption);
  public void displayCredentials(Employee employee);

  // 
}
