// 5. print alternate element in array.
#include<stdio.h>
void main()
{
	int a[10],i;
	printf("Enetr elements :");
	for(i=0; i<10; i++)
	{
		scanf("%d",&a[i]);
	}
	printf("\n alternate number");
	for(i=0; i<10; i=i+1){
		printf("%d ",a[i]);
	}
}