//WAP to check if number is positive,negative or neutral(0).
#include<stdio.h>
void main()
{
	int num;
	
	printf("Enter a number:");
	scanf("%d",&num);
	
	if(num>0)
	printf("The number is positive:\n");
	else if(num<0)
	printf("The number is negative.\n");
	else
    printf("The number is natural(Zero).\n");
}