#include<stdio.h>
void perimeter();
void main()
{
	perimeter();
}
void perimeter()
{
	float length,width,perimeter;
	printf("Enter the length of the rectangle : ");
	scanf("%f",&length);
	
	printf("Enter the width of the rectangle : ");
	scanf("%f",&width);
	 
	perimeter = 2* (length+width);
	printf("The perimeter of the rectagle is %.2f\n",perimeter);
}