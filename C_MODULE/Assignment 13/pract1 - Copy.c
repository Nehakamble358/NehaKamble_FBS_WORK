//1. Write a program to scan string from user then scan a single character and search it in a accepted string.
#include<stdio.h>
#include<string.h>
void main() {
	char str[100];
	char ch;
	int i,found=0;

	printf("Entre s string :");
	scanf("%s",str);

	printf("Enter a character to serach:");
	scanf("%c",&ch);

	for(i=0; str[i]!='\0'; i++){
		if(str[i]==ch){
			found = 1;
			break;
		}
}
	if(found) {
		printf("character'%c'found in the accepted string.\n",ch);
	} else {
		printf("character'%c' not found in the accepted string.\n",ch);
	}
}
