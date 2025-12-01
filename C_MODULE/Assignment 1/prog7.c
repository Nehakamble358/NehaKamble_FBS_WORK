// Write a C program to convers given minutes into hours and remaining minutes.
# include<stdio.h>
void main()
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