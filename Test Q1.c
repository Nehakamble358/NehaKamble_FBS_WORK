//1.Write a program in c for, to find common elements in two arrays.
#include<stdio.h>
void main()
{
   int arr[]={1,2,3,4,5};
   int brr[]={1,6,7,3,2};
   int nl = 5,n2=5;
   int i,j;
   
   printf("Common elements :");
   for(i=0; i<nl; i++)
   for(j=0; j<n2; j++)
   {
   	if(arr[i]==brr[j])
   	{
   		printf("%d",arr[i]);
   	}
   }
}