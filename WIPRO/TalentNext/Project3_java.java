/*
    Name - Satish Kumar
    Roll No - 15/CS/77
*/

// Importing Packages
import java.lang.*;
import java.io.*;
import java.util.*;

// Defining Public | Global Variables


// Defining SBAccount Class
class SBAccount{

  double interestRate;
  double amount;
  SBAccount(){
    System.out.println("Enter the Average amount in your account : ");
    Scanner sc = new Scanner(System.in);
    amount = sc.nextDouble();
    interestRate = 4;
    System.out.println("dasda "+calculateInterest());
  }
  double calculateInterest(){
    interestRate = interestRate;
    amount = amount;
    return amount;
  }
}
// Defining main class
public class Project3_java{
  public static void main(String[] args) {
    SBAccount sb = new SBAccount();
    // sb.getData();
    // sb.calculateInterest();
  }
}
