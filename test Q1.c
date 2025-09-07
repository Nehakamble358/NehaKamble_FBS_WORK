//convert the time enterd in hh,min and sec into total seconds.
#include<stdio.h>
void main()
{
	int hh,min,sec,total;
	printf("Enter a hours:");
	scanf("%d",&hh);
	
	printf("Enter a minutes:");
	scanf("%d",&min);
	
	printf("Enter a second:");
	scanf("%d",&sec);
	
	total = (hh*3600)+(min*60)+sec;
	printf("Total second = %d\n",total);
}