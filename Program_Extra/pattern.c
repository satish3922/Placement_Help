int main(){
	int i,j,n = 5;
	int k = 1;
	for(i = 1; i <= n; i++){	
		for(j = 1; j <= n*2 - 1; j++){
			if(j%2 == 0){
				printf("*");
				k++;
			}
			else{
				printf("%d",k);
				k = k;
			}
		
		}
		printf("\n");
	}
}
