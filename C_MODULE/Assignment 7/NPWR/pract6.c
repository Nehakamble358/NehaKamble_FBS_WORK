#include<stdio.h>
char upperlower();
void main()
{
	upperlower();
}
char upperlower()
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
	return upperlower();
}