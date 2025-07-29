// Write a C program to convert temperature from Celsius to Fahrenheit using the formula : F = (C*9/5)+32
#include<stdio.h>
void main(){
	float celsius,fahrenheit;
	printf("Enter temperature and celsius:");
	scanf("%f",&celsius);
	fahrenheit=(celsius*9/5)+32;
	printf("\n Temperature in Fahrenheit: %.2f",fahrenheit);
	return 0;
}