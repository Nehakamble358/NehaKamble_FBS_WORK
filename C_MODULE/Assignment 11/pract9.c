//9 strstr()
#include<stdio.h>
#include<string.h>
void main()
{
	char s[] = "Neha, kamble!";
	char *pos = strstr(s,"kamble");
	
	if(pos != NULL)
	printf("Found");
	else
	printf("Not Found");
}