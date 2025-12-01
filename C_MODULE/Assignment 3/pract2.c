//2. Accept three sides of a triangle from the user and detemine whether the triangle is equilateral, isosceles, or scalene.
#include<stdio.h>
void main()
{
	int side1, side2, side3;
	printf("Enter sides of triangle:");
	
	scanf("%d%d%d",&side1, &side2, &side3);
	if("side1 == side2 && side == side3")
	
	printf("The Given Triangle is equilateral");
	else if(side1 == side2 || side1 == side3 || side3 == side1)
	
	printf("The given Triangle is isoscales");
	else
	printf("The given Triangle is scalene");
	return 0;

	
	
}