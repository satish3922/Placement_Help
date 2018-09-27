main(){
	int i,j,k=0;
	int n = 8;
	for(i=1;i<=n*2-1;i++){
		i<n ? k++ : k--;
		for(j=1;j<=n*2-1;j++){
			if(j>=4-k && j<=2+k)
				printf("%d ",j);
			else
				printf(" ");
		}
		printf("\n");
	}
}
