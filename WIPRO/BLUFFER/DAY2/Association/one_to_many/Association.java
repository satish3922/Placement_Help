// Java program to illustrate
// concept of Association

import java.io.*;

// Class Bank
class Bank{
  private String name;
  Bank(String name){
    this.name = name;
  }
  public String getBankName(){
    return this.name;
  }
}

// Class Employee
class Employee{
  private String name;
  Employee(String name){
    this.name = name;
  }
  public String getEmployeeName(){
    return this.name;
  }
}

// Association between both class in main method
class Association{
  public static void main(String[] args) {
    Bank bank = new Bank("AXIS");
    Employee emp = new Employee("Satish");
    
    System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
  }
}
