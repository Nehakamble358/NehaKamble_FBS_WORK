#include<stdio.h>
void squarecube();
void main()
{
	squarecube();
}
void squarecube()
{
	int number, square, cube;
	printf("%d",&number);
	square = number * number;
	cube = number * number * number;
	printf("square of %d is: %d\n", number,square);
	printf("cube of %d is:%d\n", number,cube); 
}

