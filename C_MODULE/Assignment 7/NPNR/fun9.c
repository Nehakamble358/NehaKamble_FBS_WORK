#include<stdio.h>
void baseheight();
void main()
{
	baseheight();
}
void baseheight()
{
	float base, height, area;
	printf("triangle %f %f %f",base,height,area);
	area = 0.5 * base * height;
	printf("printf area of the triangle is:%.2f\n",area);
}