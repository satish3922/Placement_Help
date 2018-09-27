import java.util.*;
class Pattern2{
public static void main(String[] args) {
  int k=1;
  System.out.println("Enter the number of your choice sir");
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  for(int i=1;i<=n;i++){

    for(int j=1;j<=i;j++){
      System.out.print(k+" ");
      if(j==i){
        k=k+2;
      }
    }
    System.out.println();
  }
}
}
