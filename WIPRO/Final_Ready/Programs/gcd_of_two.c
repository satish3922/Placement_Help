#include <stdio.h>
int gcd(int x, int y);
int main(){
  int n1, n2;
  printf("Enter 1st No. : ");
  scanf("%d",&n1);
  printf("Enter 2nd No. : ");
  scanf("%d",&n2);
  printf("Gcd is : %d\n",gcd(n1,n2));
  return 0;
}

// Gcd Function
int gcd(int x, int y){
  if(y!=0){
    return gcd(y, x%y);
  }
  else
    return x;
}
