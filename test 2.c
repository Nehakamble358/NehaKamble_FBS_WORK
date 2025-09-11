//2 write a program to accept string from user and replace one character from special symbol.
#include<stdio.h>
#include<string.h>
void main()
{
	char str[200];
	char ch,symbol="*";
	int i;
	
	printf("Enter a string:");
	gets(str);
	
	printf("Enter a character to replace:");
	scanf("%c",&ch);
	
	for(i=0; str[i]!='\0';i++){
		if(str[i] == ch){
			str[i]= symbol;
		}
	}
	printf("Modifide string:%s\n",str);	
}
	
	
