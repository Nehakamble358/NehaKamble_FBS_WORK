#include<stdio.h>
void calculateAreaOfCircle(float radius){
	const float PI = 3.14159;
	float area;
	
	area = PI * radius * radius;
	printf("The area of the circle with radius %.2f is: %.2f\n",radius,area);
}
int main()
{
	float r;
	printf("Enter the redius of the circle:");
	scanf("%f",&r);
	calculateAreaOfCircle(r);
}
 