package com.ajay.model;

public class Employee {
  private final String company = "techHub";
  private final String[] department = {"tech", "admin", "hr", "legal"};
  // we don't need to  create this beacuse this is taking palace we can do this withou department.
  private String firstName;  
  private String lastName;
  private String email;
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  private String password;

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public Employee(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public String getCompany() {
    return company;
  }
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  // creæ
  // get department
  public String getDepartmant(int i){
    return  department[i];
  }

  // createing æææ
  
}
