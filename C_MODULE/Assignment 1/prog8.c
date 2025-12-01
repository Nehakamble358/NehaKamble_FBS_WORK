//8 Write a C program to input the lenght and width of a rectangle and find its perimeter
#include<stdio.h>
void main()
{

	float length,width,perimeter;
	printf("Enter the length of the rectangle : ");
	scanf("%f",&length);
	
	printf("Enter the width of the rectangle : ");
	scanf("%f",&width);
	 
	perimeter = 2* (length+width);
	printf("The perimeter of the rectagle is %.2f\n",perimeter);
	
}