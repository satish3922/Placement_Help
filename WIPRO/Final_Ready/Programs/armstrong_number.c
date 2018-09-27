#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
  int n = atoi(argv[1]);
  int m = n;
  int result = 0;
  int a;
  while(n!=0){
    a = n%10;
    n = n/10;
    result = result + (a*a*a);
  }
  // printf("%d number %d result\n",m,result);
  if(result == m){
    printf("Armstrong Number\n");
  }
  else{
    printf("Not Armstrong\n");
  }
  return 0;
}
