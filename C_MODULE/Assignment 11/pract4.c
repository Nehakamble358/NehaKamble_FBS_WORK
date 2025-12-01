//4 strcat()
#include<stdio.h>
#include<string.h>
void main()
{
	char s1[40] = "Hello,";
	char s2[] = "Neha!";
	
	strcat(s1,s2);
	printf("%s",s1);
}