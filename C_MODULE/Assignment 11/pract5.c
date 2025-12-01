//5. strncat()
#include<stdio.h>
#include<string.h>
void main()
{
	char s1[40] = "Hello, ";
	char s2[] = "world";
	
	strncat(s1,s2, 4);
	printf("%s",s1);
}