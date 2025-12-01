#include<stdio.h>
#include<string.h>
struct date
{
	int date;
	int month;
	int year;
};
int main()
{
	struct date d1,d2;
	d1.date=15;
	d1.month=10;
	d1.year=2004;
	
	printf("Entered a date 2 date:");
	scanf("%d",&d2.date);
	
	printf("Entered a date 2 month:");
	scanf("%d",&d2.month);
	
	printf("Entered a date 2 year:");
	scanf("%d",&d2.year);
	
	printf("\n date 1:date=%d, month=%d, year=%d",d1.date,d1.month,d1.year);
	printf("\n date 2:date=%d, month=%d, year=%d",d2.date,d2.month,d2.year);
}