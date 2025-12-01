#include<stdio.h>
struct Complex
{
	int real;
	int imaginary;
};
void main()
{
	struct Complex c1,c2;
	c1.real=5;
	c1.imaginary=10;
	
	printf("Enter  complex 2 real:");
	scanf("%d",&c2.real);
	
	printf("Enter complex 2 imaginary:");
	scanf("%d",&c2.imaginary);
	
	printf("\n Complex 1: real=%d,imaginary=%d",c1.real,c1.imaginary);
	printf("\n Complex2: real=%d, imaginary=%d",c2.real,c2.imaginary);
}
