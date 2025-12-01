//5 write a C program to input five numbres and find thier average.
#include<stdio.h>
void average();
void main(){
	
	int no1 =10, no2 = 20, no3 = 30, no4 = 40, no5 = 50;
	int sum = no1 + no2 + no3 + no4 + no5;
	float average = (float)sum/5;
	printf("The average is : %.2f",average);
}
