#include <stdio.h>
int gcdArray(int [], int n);
int gcd(int x, int y);
int main(){
  int n;
  printf("Enter size of array : ");
  scanf("%d",&n);
  int arr[n], i;
  for(i=0;i<n;i++){
    printf("Enter element : ");
    scanf("%d",&arr[i]);
  }
  printf("Gcd of array is : %d\n",gcdArray(arr,n));
  return 0;
}

int gcd(int x, int y){
  if (x==y){
    return x;
  }
  while(x!=y){
    if(x>y)
      return gcd(x-y,y);
    else
      return gcd(x,y-x);
  }
}

int gcdArray(int arr[], int n){
  int result = arr[0];
  int i;
  for(i = 1; i<n; i++){
    result = gcd(arr[i], result);
  }
  return result;
}
