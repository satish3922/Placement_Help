/*
    Name - Satish Kumar
    Roll No - 15/CS/77
*/



import java.lang.*;
import java.io.*;
import java.util.*;

public class Project1_java{
  public static void main(String[] args) {
    String[][] employee = new String[][] {
      {"1001","Ashish","01/04/2009","e","R&D          ","20000","8000","3000"},
      {"1002","Sushma","11/08/2012","c","PM           ","30000","12000","9000"},
      {"1003","Rahul ","23/11/2008","k","Acct         ","10000","8000","1000"},
      {"1004","Chahat","12/01/2013","r","Front Desk   ","6000","8000","2000"},
      {"1005","Ranjan","29/07/2005","m","Engg         ","50000","20000","2000"},
      {"1006","Tanmay","16/01/2000","e","Manufacturing","23000","9000","4400"},
      {"1007","Suman ","01/06/2006","c","PM           ","29000","12000","10000"},
    };
    String[][] design = new String[][] {
      {"e","Engineer    ","20000"},
      {"c","Consultant  ","32000"},
      {"k","Clerk       ","12000"},
      {"r","Receptionist","15000"},
      {"m","Manager     ","40000"},
    };
    String code;
    int sum = 0;
    int flag = 0;
    int loc = 0;
    for(int i=0;i<employee.length;i++){
      if(Integer.parseInt(employee[i][0])==Integer.parseInt(args[0])){
          flag = 1;
          loc = i;
          break;
      }
      else{
        flag = 0;
      }
    }
    if(flag==1){
      sum = sum+Integer.parseInt(employee[loc][5])+Integer.parseInt(employee[loc][6])-Integer.parseInt(employee[loc][7]);
      String post = "engg";
      switch(employee[loc][3]){
        case "e":
          sum = sum + Integer.parseInt(design[0][2]);
          post = design[0][1];
          break;
        case "c":
          sum = sum + Integer.parseInt(design[1][2]);
          post = design[1][1];
          break;
        case "k":
          sum = sum + Integer.parseInt(design[2][2]);
          post = design[2][1];
          break;
        case "r":
          sum = sum + Integer.parseInt(design[3][2]);
          post = design[3][1];
          break;
        case "m":
          sum = sum + Integer.parseInt(design[4][2]);
          post = design[4][1];
          break;
      }
      String salary = String.valueOf(sum);
      System.out.println(" Emp No."+"    Emp Name"+"    Department"+"    Designation"+"    Salary");
      System.out.println(" "+args[0]+"\t    "+employee[loc][1]+"\t"+employee[loc][4]+"\t      "+post+"   "+salary);
    }
    else{
      System.out.println("There is no employee with empid : "+args[0]);
    }
  }
}
