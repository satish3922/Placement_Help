#include <math.h>

int main(int argc, char *argv[]){
	if(argc<1){
		printf("No Arguments Given\n");
		return 0;
	}
	else{
		isprime(atoi(argv[1]));
	}
}
void isprime(int n){
	int i,flag=0;
	printf("%d\n",n);

	for(i=2;i<=n/2;i++){
		if(n%i==0){
			flag++;
			break;
		}
	}
	if(flag==1){
		printf("Not prime");
	}
	else{
		printf("prime");
	}
}
