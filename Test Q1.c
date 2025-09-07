// 1 WAP print even and odd number in a givenm range.

#include<stdio.h>
void main()
{
	int start,end,i;
	printf("Enter start:");
	scanf("%d",&start);
	
	printf("Enter end:");
	scanf("%d",&end);
	
	printf("Odd numbers:");
	for(i=start;i<=end; i++){
	if(i%2!=0)
	printf("%d",i);
}
	printf("\nEven numbers:");
	for(i=start;i<=end; i++){
	if(i%2 == 0)
	printf("%d",i);
}
}