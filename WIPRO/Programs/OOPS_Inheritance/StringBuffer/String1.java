/*
 Write a Program that will check whether
 a given String is Palindrome or not.
*/

import java.lang.*;
import java.util.*;
import java.io.*;

class String1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String : ");
    String original_str = sc.nextLine();
    String reverse_str = "";

    for(int i=original_str.length()-1;i>=0;i--){
      reverse_str = reverse_str + original_str.charAt(i);
    }
    if(original_str.equalsIgnoreCase(reverse_str)){
      System.out.println(original_str + " is Palindrome");
    }
    else{
      System.out.println(original_str + " is not Palindrome");
    }
  }
}
