import java.util.*;
class Pattern3{
  public static void main(String[] args) {
    System.out.println("Enter the number");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int f = 1;
    int k = 1;
    int fact(int x){
      f = f*fact(x-1);
      return f;
    }
    for(int i=1;i<=n;i++){

      for(int j=1;j<=n*2-1;j++){
        if(i%2==0){
          if(j>=n+1-i && j<=n-1+i && j%2!=0){
            System.out.print();
          }
          else{
            System.out.print(" ");
          }
        }
        else{
          if(j>=n+1-i && j<=n-1+i && j%2==0){
            System.out.print(k);
          }
          else{
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}
