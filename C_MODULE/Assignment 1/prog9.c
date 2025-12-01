//9 Write a C program to input the base and height of a triangle and calculate its area.
#include<stdio.h>
void main(){
	float base, height, area;
	printf("triangle %f %f %f",base,height,area);
	area = 0.5 * base * height;
	printf("printf area of the triangle is:%.2f\n",area);
}