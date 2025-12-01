// 4. Write a C program to swap two numbers using a temporary third variable.
#include<stdio.h>
void main()
{
	int a = 5 , b = 10, c;
	c = a;
	a = b;
	b = c;
	printf(" a = %d, b = %d\n", a,b);
	return 0;
}