#include <stdio.h>
#include <stdlib.h>
int main(void) {
  int n = 4;
  int i,j,k=65;
  int m = k+n+1;
  int l = n*2;
  for(i=1;i<=n;i++){
    for(j=1;j<=l;j++){
      if((j>=1 && j<=n+1-i) || (j>=n+i && j<=l)){
        if(j<=n){
          printf("%c",k);
          k++;
        }
        else{
          k--;
          printf("%c",k);
        }
      }
      else
        printf(" ");
    }
    printf("\n");
  }  
  return 0;
}
