// Q3.print last 2 digit of number. Eg. i/p:223410 o/p:10
#include<stdio.h>
void main()
{
	int num;
	printf("Enter a number : ");
	scanf("%d",&num);
	
	int lastTwo = num%100;
	printf("Last two digits :%d\n",lastTwo);
}