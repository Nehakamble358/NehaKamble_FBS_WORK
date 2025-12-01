#include<stdio.h>
struct Distance
{
	int feet;
	int inch;
};
void main()
{
	struct Distance d1,d2;
	d1.feet=5;
	d1.inch=10;
	
	printf("Enter distance 2 feet:");
	scanf("%d",&d2.feet);
	
	printf("Enter Distance 2 inch:");
	scanf("%d",&d2.inch);
	
	printf("\n Distance 1: feet=%d, inch=%d",d1.feet,d1.inch);
	printf("\n Distance 2: feet=%d, inch=%d",d2.feet,d2.inch);
}
