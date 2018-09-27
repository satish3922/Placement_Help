// Program 3rd
/*
 Write a program to initialize an integer array with values and
 check if a given number is present in the array or not. If the number is not found,
 it will print '-1' else it will print the index value of the given number in the array.
*/

import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Array3{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {2,5,6,8,12,35,25};
    System.out.print("Enter the element to search :");
    int search = sc.nextInt();
    int count = 0;
    int i = 0;
    for(i=0;i<arr.length;i++){
      if(arr[i]==search) {
        count = count + 1;
        System.out.println(count);
        break;
      }
      else {
        count = count +1;
      }
    }
    if(i==arr.length){
      System.out.println("-1");
    }

  }
}
