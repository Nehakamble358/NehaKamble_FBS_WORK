//6. Write  a program to check whether a given character is uppercase or lowercase.
#include<stdio.h>
void main()
{
	char c;
	printf("Enter a character number: ");
	scanf("%c",&c);
	
	if(c>='A' && c<='Z')
	{
		printf("it is uppercase character");
	}else
	{
		printf("it is lowercase character");
    }
}