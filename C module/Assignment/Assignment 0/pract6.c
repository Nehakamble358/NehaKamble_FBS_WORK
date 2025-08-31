// 6 accept a number and check if it is divisible by 3,5,or both.
#include<stdio.h>
void main()
{
	int num;
	printf("Enter an integer : ");
	scanf("%d",&num);
	
	if(num % 3 == 0 && num % 5 == 0)
	{
		printf("Divisible by both\n");
	}else if(num % 5 == 0)
	{
		printf("Divisible by 3 but not by 5\n");
	}else if(num % 5 == 0)
	{
		printf("Divisible by 5 but not by 3\n");
	}else
	{
		printf("Divisible by None\n");
	}
	return 0;
}