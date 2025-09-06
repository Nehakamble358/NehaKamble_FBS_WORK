//2 strcpy()
#include<stdio.h>
#include<string.h>
void main()
{
	char src[] = "Neha";
	char dest[20];
	
	strcpy(dest,src);
	printf("%s",dest);
}