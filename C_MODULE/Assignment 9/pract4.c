// 4. find odd and even among the numbers.
#include<stdio.h>
void main()
{
     int a[5],i,even=0,odd=0;
     printf("Enter number :");
     for(i=0; i<5; i++)
     {
     	scanf("%d",&a[i]);
	 }
	 for(i=0; i<5; i++)
	 {
	 	if(a[i]%2==0)
	 	even++;
	 	else
	 	odd++;
	 }
	 printf("\n total even=%d and odd=%d",even,odd);
	 
}