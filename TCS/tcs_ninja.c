#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(void) {
  int i,j;
  char a[100];
  char b[100];
  char c[100];
  scanf("%s",a);
  scanf("%s",b);
  scanf("%s",c);
  char vowel[6] = "aeiou";
  for(i=0;i<strlen(a);i++){
    for(j=0;j<strlen(vowel);j++){
      if(a[i] == vowel[j]){
        a[i] = '$';
      }
    }
  }
  for(i=0;i<strlen(b);i++){
    for(j=0;j<strlen(vowel);j++){
      if(b[i] == vowel[j]){
        b[i] = '#';
      }
    }
  }
  for(i=0;i<strlen(c);i++){
    c[i] = c[i]-32;
  }
  strcat(a,b);
  strcat(a,c);
  puts(a);
  return 0;
}
