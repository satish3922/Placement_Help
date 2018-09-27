import java.util.*;
public class Pattern{
  public static void main(String[] args) {
    int k=1;
    for(int i=1;i<=5;i++){
      int arr[]=new int[i];
      for(int j=0;j<i;j++){
        arr[j]=k;
        k=k+1;
      }
      if(i%2==0){
        for(int p=i-1;p>=0;p--){
          System.out.print(arr[p]+" ");
        }
      }
      else{
          for(int p=0;p<i;p++){
            System.out.print(arr[p]+" ");
          }
    }
    System.out.println();
  }
 }
}
