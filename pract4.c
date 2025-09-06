//4 check the given number is prime or not Input: n=7 output: prime
#include<stdio.h>
void main()
{
	int no;
	printf("Enter a number : ");
	scanf("%d",&no);
	if(no%2==0)
	{
		printf("is a prime number");
	}else
	{
		printf("is not a prime number");
	}
}