//strncpy()
#include<stdio.h>
#include<string.h>
void main()
{
	char src[] = "fistbit";
	char dest[20];
	
	strncpy(dest,src,4);
	printf("%s",dest);
}