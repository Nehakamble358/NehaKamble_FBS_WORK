//8. print a pattern of stars in diamond slape input: n=4
#include<stdio.h>
void main()
{
	int n,i,j;
	
	printf("Enter number of rows:");
	scanf("%d",&n);
	
	for(i=1; i<=n; i++){
		for(j=1; j<=i; j++)
		printf("*");
		printf("\n");
	}
	for(i=n-1; i>=1; i--){
		for(j=1; j<=i; j++)
		printf("*");
		printf("\n");
	}
}
	