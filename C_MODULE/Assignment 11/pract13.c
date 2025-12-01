//13 strcspn()
#include<stdio.h>
#include<string.h>
void main()
{
	char str1[] = "Neha";
	char str2[] = "l";
	size_t len= strcspn(str1,str2);
	printf("Length of initial segment containing 'l':%lu\n",len);
}