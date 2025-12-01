// 7. Take two array and add sum in third array.
#include<stdio.h>
void main()
{
	
	int arr[5]={1,2,3,4,5};
	int brr[5]={10,20,30,40,50};
	int crr[5];
	for(int i=0; i<5; i++)
	{
       crr[i]= arr[i]+brr[i];
	}
	printf("Element of the third array(crr) are:");
	for(int i=0; i<5; i++)
	{
	   printf("%d ",crr[i]);
    }
    printf("\n");
}