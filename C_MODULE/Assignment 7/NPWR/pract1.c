//NPWR
#include<stdio.h>
float rediusArea();
void main()
{
	rediusArea();
}
float rediusArea()
{
    float radius, area,PI;
    printf("Enter the radius of the circle:");
    scanf("%f",&radius);
    area = PI*radius*radius;
    printf(" The area of the circle is:%.2\n", area);
    return rediusArea();
}
