//12 strspn()
#include<stdio.h>
#include<string.h>
void main()
{
	char str1[] = "123Neha";
	char str2[] = " 123";
	size_t len= strspn(str1,str2);
	printf("Length of initial segment containing only '123':%lu\n",len);
}