// 9.Reverse the given array.
#include<stdio.h>
void main()
{
     int a[5];
     printf("Enter a array element :");
     for( int i=0; i<5; i++)
     {
     	scanf("%d",&a[i]);
	 }
	 printf("Revers array element :");
     for(int i=4; i>=0; i--)
     {
     	printf("%d ",a[i]);
	 }
}
 