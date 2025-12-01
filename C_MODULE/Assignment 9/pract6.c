//6.Accept array and print only prime numbers of arrya
#include<stdio.h>
void main()
{
	int arr[5],flag ;
	printf("Enter a prime number : ");
	for(int i=0; i<5; i++)
	{
		scanf("%d",&arr[i]);
	}
	 printf("is a prime number");
     for(int i=0; i<5; i++)
	 {
	     if(flag == 0)
		 printf("%d",arr[i]);
     }	
}