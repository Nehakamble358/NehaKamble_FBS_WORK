

#include<stdio.h>
void hours();
void main()
{
	hours();
}
void hours()
{
	int totalMinutes;
	int hours;
	int remainingMinutes;
	
	printf("Enter the total number of minutes:");
	scanf("%d",&totalMinutes);
	hours = totalMinutes/60;
	remainingMinutes = totalMinutes% 60;
	printf("%d minutes is equal to %d hours and %d minutes.\n",totalMinutes,hours,remainingMinutes);
	return 0;
}