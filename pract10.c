// 10 sprintf()
#include<stdio.h>
#include<string.h>
void main(){
	char s[40];
	int n = 20;
	
	sprintf(s,"The value is %d",n);
	printf("%s",s);
}