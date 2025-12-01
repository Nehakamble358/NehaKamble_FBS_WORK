#include<stdio.h>
void tempfahrenheit();
void main()
{
	tempfahrenheit();
}
void tempfahrenheit()
{
    double cel = 85;
	double fr;
	fr = cel*1.8+32;
	printf("Temprature in Fahrenheit is %lf",fr);
}