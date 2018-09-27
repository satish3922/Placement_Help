/*
 Given a string of even length, return the first half.
 So the string "CatDog" yields "Cat". If the string length
 is odd number then return null.
 */

 import java.lang.*;
 import java.util.*;
 import java.io.*;

 class String4{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter String :");
     String s = sc.nextLine();
     int len = s.length();

     if(len%2==0){
       System.out.println(s.substring(0,len/2));
     }
     else{
       System.out.println("null"  );
     }
   }
 }
