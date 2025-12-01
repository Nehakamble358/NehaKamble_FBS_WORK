// 5. print alternate element in array.
#include<stdio.h>
void main()
{
	int a[5],i;
	printf("Enetr elements :");
	for(i=0; i<5; i++)
	{
		scanf("%d",&a[i]);
	}
	printf("\n alternate number");
	for(i=0; i<5; i=i+1){
		printf("%d ",a[i]);
	}
}
