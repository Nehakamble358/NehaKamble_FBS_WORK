#include<stdio.h>
void area();
void main()
{
	area();
}
void area()
{
	float radius, area;
    const float PI = 3.14159;
    printf("Enter the radius of the circle:");
    scanf("%f",&radius);
    area = PI*(radius,2);
    printf(" The area of the circle is:%.2\n", area);
}