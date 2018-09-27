import java.lang.System;
import java.io.*;
import java.util.Scanner;

// Question - 1
// ============
public class assignment1 {
  public static void main(String[] args) {
    System.out.println(args[0]+" Technologies "+args[1]);
  }
}

// Question - 2
// ============
public class assignment1 {
  public static void main(String[] args) {
    System.out.println("Welcome "+args[0]);
  }
}


// Question - 3
// ============
public class assignment1 {
  public static void main(String[] args) {
    int sum;
    sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
    System.out.println("The Sum of "+args[0]+" and "+args[1]+" is "+sum);
  }
}

// Question - 4
// ============
public class assignment1 {
  public static void main(String[] args) {
    System.out.println("Enter size of array : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double sum = 0;
    int arr [] = new int[n];
    for(int i=0;i<n;i++){
      System.out.print("Enter "+(i+1)+" element : ");
      arr[i] = sc.nextInt();
      sum = sum + arr[i];
    }
    sc.close();
    double avg = sum/arr.length;
    System.out.print  ("The sum is "+(int)sum+" and Average is "+avg);
  }
}

// Question - 5
// ============
public class assignment1 {
  public static void main(String[] args) {
    System.out.println("Enter size of array : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr [] = new int[n];
    int max = 0;
    for(int i=0;i<n;i++){
      System.out.print("Enter "+(i+1)+" element : ");
      arr[i] = sc.nextInt();
    }
    sc.close();
    for(int i=0;i<n;i++){
      if(arr[i]>max){
        max=arr[i];
      }
    }
    int min = max;
    for(int i=0;i<n;i++){
      if(arr[i]<min){
        min=arr[i];
      }
    }
    System.out.println("The max is : "+max+" and min is :"+min);
  }
}

// Question - 6
// ============
public class assignment1 {
  public static void main(String[] args) {
    System.out.println("Enter size of array : ");
    Scanner sc = new Scanner(System.in);
    int i;
    int n = sc.nextInt();
    int location = 0;
    int arr [] = new int[n];
    for(i=0;i<n;i++){
      System.out.print("Enter "+(i+1)+" element : ");
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter element to search : ");
    int search = sc.nextInt();
    sc.close();
    for(i=0;i<n;i++){
      if(arr[i]==search){
        System.out.println(i+1);
        break;
      }
    }
    if(i==n){
      System.out.println("-1");
    }
  }
}

// Question - 7
// ============
public class assignment1 {
	public static void main(String[] args) {
		int [] arr= {12,34,12,3,3,3,3,45,67,89};
		int n = arr.length;
    for (int i = 0; i < n; i++){
      for (int j = i+1; j < n; j++){
        if(arr[i] == arr[j]){
          for(int k=j;k<n-1;k++){
              arr[k]=arr[k+1];
          }
          n--;
          j--;
        }
      }
    }
    int [] unique=new int[n];
    for(int i=0;i<n;i++) {
  	unique[i]=arr[i];
    }
    for (int i = 0; i < unique.length; i++){
      System.out.print(unique[i]+" ");
    }
	}
}


// Question - 8
// ============

public class assignment1{
	public static void main(String[] args) {
		int [] arr= {1,2,2,2,3,3,3,4,4,4,4,4,4,4,5};
		int c,max=1;
		int i,ind=0;
		for( i=0;i<arr.length;i++) {
			c=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==12345) continue;
				if(arr[j]==arr[i]) {
					c+=1;
					arr[j]=12345;
				}
			}
      if(c>=max) {
				max=c;
				 ind=i;
			}
		}
		System.out.println(arr[ind]);
	}
}

// Question - 9
// ============
public class assignment1{
  public static void main(String[] args) {
		int [] arr= {1,6,4,7,9};
		int pos_six=0;
		int pos_sev=0;
		int sum=0,sum2=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			if(arr[i]==6) {
				pos_six=i;
			}
			if(arr[i]==7)
				pos_sev=i;
		}
		if(pos_six<pos_sev) {
			for(int j=pos_six;j<=pos_sev;j++) {
				sum2+=arr[j];
			}
			sum=sum-sum2;
		}
		System.out.println(sum);
	}
}


// Question - 10
// =============
public class assignment1{
  public static void main(String[] args) {
		if(args.length<4 || args.length>4) {
			System.out.println("Please enter 4 integer numbers");
			System.exit(0);
		}
		int n=args.length;
		n=n-1;
		int[][]arr=new int[2][2];
		for(int i=0,t=0;i<2;i++){
			for(int j=0;j<2;j++) {
				arr[i][j]=Integer.parseInt(args[t++]);
			}
		}
		System.out.println("The given array  is :");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The reverse of the array is :");
		for(int i=1;i>=0;i--) {
			for(int j=1;j>=0;j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}


// Question - 11
// =============
public class assignment1{
  public static void main(String[] args) {
		if(args.length<9 || args.length>9) {
			System.out.println("Please enter 4 integer numbers");
			System.exit(0);
		}
		int[][]arr = new int[3][3];
    int t = 0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr[i][j]=Integer.parseInt(args[t++]);
			}
		}
		System.out.println("The given array  is :");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<3;i++){
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]>max)
					max=arr[i][j];
			}
		}
		System.out.println("The biggest number in the given array is " +max);
	}
}
