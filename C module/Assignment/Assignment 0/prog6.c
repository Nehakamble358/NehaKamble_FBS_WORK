// Write a C program to find the square and cube of a given number.
#include<stdio.h>
void main(){
	int number, square, cube;
	printf("%d",&number);
	square = number * number;
	cube = number * number * number;
	printf("square of %d is: %d\n", number,square);
	printf("cube of %d is: %d\n", number,cube); 
}