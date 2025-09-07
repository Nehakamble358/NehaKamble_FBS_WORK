//2 Write a program to find power of any number eg.2^4=16.
#include<stdio.h>
void main()
{
	int base,exp,i;
	int result=1;
	
	printf("Enter base:");
	scanf("%d",&base);
	printf("Enter exponent::");
	scanf("%d",&exp);
	
	for(i=1;i<=exp;i++){
	result *= base;
    }
    printf("%d^%d = %d\n",base,exp,result);
}