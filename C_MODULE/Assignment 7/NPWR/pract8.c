#include<stdio.h>
int prime();
void main()
{
	prime();
}
int prime()
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
		return prime();
	}
}