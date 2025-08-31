//1 Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the desired operations
#include<stdio.h>
void main()
{
	int a = 5, b = 5, c;
	c = a+b;
	printf("a+b = %d \n",c);
	c = a-b;
	printf("a-b = %d \n",c);
	c= a/b;
	printf("a/b = %d \n",c);
	c= a*b;
	printf("a*b = %d \n",c);
	c= a%b;
	printf("Remainder when a divided by b = %d \n",c);
	return 0;
	
}