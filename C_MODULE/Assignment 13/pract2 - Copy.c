//2. WPA Replace all Occurrences of 'a' with $ in s sting.
#include<stdio.h>
#include<string.h>
void main()
{
	char str[100];
	int i;
	
	printf("Enter a string :");
	scanf("%s",str);
	
	for(i=0; str[i]!='\0'; i++){
	if(str[i]=='a'){
		str[i]='$';
	}
}
  printf("Modified string :%s",str);
}
