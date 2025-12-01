//11 strtok
#include<stdio.h>
#include<string.h>
void main()
{
	char s[] = "Nikita,kamble,C!";
	char *t=strtok(s,", ");
	while(t != NULL)
	{
		printf("%s\n",t);
		t = strtok(NULL, ", ");
	}
}