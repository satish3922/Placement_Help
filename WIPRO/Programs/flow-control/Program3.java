// Program 3rd

/*
Write a program to check if the program has received command line arguments or not. If the program has not received the values then print "No Values", else print all the values in a single line separated by ,(comma).
*/

import java.lang.*;
import java.io.*;
class Program3{
  public static void main(String[] args) {
    int len = args.length;
    if (len == 0){
      System.out.println("No Values");
    }
    else{
      for (int i=0; i<len-1; i++){
        System.out.print(args[i]);
        System.out.print(",");
      }
      System.out.println(args[len-1]);
    }
  }
}
