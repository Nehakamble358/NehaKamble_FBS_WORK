// 8 strchr()
#include<stdio.h>
#include<string.h>
void main()
{
	char s[] = "Hello, Neha!";
	char *res = strchr(s,'o');
	if(res !=NULL)
	printf("Character found at : %d index", res - s);
	else
	printf("Character not found");
}