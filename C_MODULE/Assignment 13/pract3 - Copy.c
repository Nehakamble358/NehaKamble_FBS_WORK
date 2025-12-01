//3. WPA to Remove the nth Index character from a Non-empty string.
#include<stdio.h>
#include<string.h>
void main()
{
	char str[100];
	int n,i;
	printf("Enter a string:");
	scanf("%s",&str);
	
	printf("Enter index to remove(starting from 0):");
	scanf("%d",&n);
	
	for(i=0; str[i]!='\0'; i++){
	str[i]= str[i+1];
}
printf("String after removal:%s",str);
}