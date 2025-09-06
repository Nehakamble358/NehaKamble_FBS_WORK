//10.Sort the array.
#include<stdio.h>
void main()
{
	int a[5],temp;
	printf("Enetr a array element :");
	for(int i=0; i<5; i++)
	{
		scanf("%d",&a[i]);
	}
	for(int i=0; i<5; i++)
	{
		for(int j=i+1; j<5; j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]>a[j];
				a[j]=temp;
		    }
	    }
		
	}	
	printf("\nSort array element :");
	for(int i=0; i<5; i++)
	{
		printf("%d ",a[i]);
	}
}