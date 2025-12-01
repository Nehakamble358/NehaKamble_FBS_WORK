//14 strpbrk()
#include<stdio.h>
#include<string.h>
void main()
{
	char str1[] = "hello";
	char str2[] = "aeiou";
	char*ptr = strpbrk(str1,str2);
	if(ptr!=NULL)
	printf("Fisr vowel in '%s': %s\n",str1,ptr);
	else
	printf("No vowel found\n");

}