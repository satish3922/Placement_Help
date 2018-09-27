// Program 20th

/*
Write a program that displays a menu with options:
1. Add
2. Sub
Based on the options choosen, read 2 numbers and
perform the relevant operation.
After performing the operation,
the program should ask the user if he wants to continue.
If the user presses y or Y, then the program should continue displaying the menu
else the program should terminate.
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Program20{
  Scanner sc = new Scanner(System.in);
  String moods;
  int choice;
  int x;
  int y;

  // Menu method
  void menu(){
    System.out.println("Press 1: Add Two Numbers");
    System.out.println("Press 2: Sub Two Numbers");
    System.out.print("Enter choice: ");
    choice = sc.nextInt();
    if(choice==1 || choice==2){
      switch(choice){
        case 1: System.out.println(Add());
                int m = mood();
                if(m==1){
                  menu();
                }
                break;
        case 2: System.out.println(Sub());
                int n = mood();
                if(n==1){
                  menu();
                }
                break;
      }
    }
    else{
      System.out.println("Wrong Input");
    }
  }

  // Mood method
  int mood(){
    System.out.println("Want to try more Operations ?");
    System.out.print("Press 'y' or 'Y' to continue : ");
    moods = sc.next();
    if(moods.equals("y")){
      return(1);
    }
    else if(moods.equals("Y")){
      return(1);
    }
    else{
      System.out.println("Program Terminated");
      System.exit(0);
      return(0);
    }
  }

  // method to Add numbers
  int Add(){
    System.out.print("Enter first Number : ");
    x = sc.nextInt();
    System.out.print("Enter second Number : ");
    y = sc.nextInt();
    return (x+y);
  }

  // method to Subtract numbers
  int Sub(){
    System.out.print("Enter first Number : ");
    x = sc.nextInt();
    System.out.print("Enter second Number : ");
    y = sc.nextInt();
    if(x>y){
      return (x-y);
    }
    else{
      return (y-x);
    }
  }

  public static void main(String[] args) {
    Program20 o = new Program20();
    o.menu();
  }
}
