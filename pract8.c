// 8. Merge two array.
#include<stdio.h>
void main()
{
	int arr[5]={10,20,30,40,50};
	int brr[5]={60,70,80,90,100};
	int crr[5+5],i;
	for(int i=0; i<5; i++)
	{
		crr[i]=arr[i];
	}
	for(int j=0; j<5; j++)
	{
		crr[i] = brr[j];
		i++;
	}
	for(int i=0; i<10; i++)
	{
		printf("%d ",crr[i]);
	}
		
}