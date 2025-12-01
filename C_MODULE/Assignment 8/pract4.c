#include<stdio.h>
void evenodd(int*);
void main()
{
	int num;
	printf("Enter a number :");
	scanf("%d",&num);
	evenodd(num);
}
void evenodd(int* num)
{
     if(num % 2 ==0)
	 printf("%d is even.",num);
	 else
	 printf("%d is odd.",num);

}