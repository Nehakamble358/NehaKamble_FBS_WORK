//1 Array  Find minimum and maximum number an array.
#include<stdio.h>
void main()
{
	int i,max,min,a[5];
	printf("Enter array element :");
	for( int i=0; i<5; i++)
	{
		scanf("%d",&a[i]);
	}
	max=min = a[0];
	for(i=1; i<5; i++)
	{
		if(a[i]>max)
		max=a[i];
		if(a[i]<min)
		min=a[i];
	}
	printf("Maximum Number is : %d\n",max);
	printf("Minimum Number is : %d\n",min);
}