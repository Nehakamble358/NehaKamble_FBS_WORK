// 2 print table for given number. Input = 5
#include<stdio.h>
void main()
{
   int i=1;
   int number = 5;
   while(i<=10)
   {
   	printf("%d x %d = %d\n",number, i, number*number);
   	i++;
   }
}