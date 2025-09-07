//2 WAP to add altemate numbers from given range.
#include<stdio.h>
void main()
{
	int start,end,i,sum=0;
	
	printf("Enter start :");
	scanf("%d",&start);
	
	printf("Enter end :");
	scanf("%d",&end);
	for(i=start; i<=end; i+=2){
		sum+=i;
	}
	printf("sum = %d\n",sum);
}