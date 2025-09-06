//3.print an inverted right-angled triangle pattern Input =5
#include<stdio.h>
void main()
{
	int i,j;
	for(i=1; i<=5; i++)    //row
	{
		for(j=5;j>i; j--)    //column
		{
			printf("*");
		}
	   printf("\n");
    }  
}