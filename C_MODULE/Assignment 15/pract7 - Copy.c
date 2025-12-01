#include<stdio.h>
struct time
{
	int hour;
	int min;
	int sec;
};
int main()
{
	struct time t1,t2;
	t1.hour = 3600;
	t1.min = 3600/60;
	t1.sec = 60;
	
	printf("Entered a time 2 hour:");
	scanf("%d",&t2.hour);
	
	printf("Entered a min 2 min:");
	scanf("%d",&t2.min);
	
	printf("Entered a sec 2 sec:");
	scanf("%d",&t2.sec);
	
	printf("\n time 1:hour=%d, min=%d, sec=%d",t1.hour,t1.min,t1.sec);
	printf("\n time 2:hour=%d, min=%d, sec=%d",t2.hour,t2.min,t2.sec);
}