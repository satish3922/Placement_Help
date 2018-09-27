// Program 8th

/*
Write a program to print the color name, based on color code.
If color code in not valid then print "Invalid Code".
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
*/

import java.lang.*;
import java.io.*;

class Program8{
  public static void main(String[] args) {
    String s = args[0];
    if(s.equals("R")){
      System.out.println("Red");
    }
    else if(s.equals("O")){
      System.out.println("Orange");
    }
    else if(s.equals("Y")){
      System.out.println("Yellow");
    }
    else if(s.equals("G")){
      System.out.println("Green");
    }
    else if(s.equals("B")){
      System.out.println("Blue");
    }
    else if(s.equals("W")){
      System.out.println("White");
    }
    else{
      System.out.println("Invalid Code");
    }
  }
}
