import java.lang.*;
import java.io.*;
class loop{
  public static void main(String[] args) {
    int i;
    int j;
    int k;
    int c = 1;
    for(i=1;i<=4;i++){
      int arr[] = new int[i];
      for(j=0;j<i;j++){
        arr[j] = c;
        c += 1;
      }
      if(i%2==0){
        for(k=i;k>0;k--){
          System.out.print(" "+arr[k-1]);
        }
      }
      else{
        for(k=0;k<i;k++){
          System.out.print(" "+arr[k]);
        }
      }
      System.out.println();
    }
  }
}
