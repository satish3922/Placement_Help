import java.util.*;
class Pattern1{
  public static void main(String[] args) {
    System.out.println("Enter the number");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=0;
    for(int i=1;i<=n*2-1;i++){
      if(i<=n){
        k+=1;
      }
      else{
        k=k-1;
      }
      for(int j=1;j<=k;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
