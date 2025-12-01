//NPWR
#include<stdio.h>
int evenodd();
void main()
{
	evenodd();
}
int evenodd()
{
	int num;
	printf("Enter an integer:");
	scanf("%d",&num);
	 
	 if(num % 2 ==0)
	 printf("%d is even.",num);
	 else
	 printf("%d is odd.",num);
	 return evenodd();
}