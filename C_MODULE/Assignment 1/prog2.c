// Write a C program to find the area of circle.
#include<stdio.h>
void main()
{
	float radius, area;
    const float PI = 3.14159;
    printf("Enter the radius of the circle:");
    scanf("%f",&radius);
    area = PI*radius*radius;
    printf(" The area of the circle is:%.2\n", area);
    return 0;
    
}
