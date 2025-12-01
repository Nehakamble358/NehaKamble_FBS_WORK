#include<stdio.h>
void mystrcat(char s1[],char s2[])
{
	int i=0,j=0;
	while(s1[i]!='\0')i++;
	while(s2[j]!'\0'){
		s1[i]=s2[j];
		i++;
		j++;
	}
	s1[i]='\0';
}
int main()
{
	char str1[300],str2[200];
	printf("Enter first string :");
	scanf("%s",str1);
	printf("Enter a second string :");
	scanf("%s",str2);
	
	mystrcmp(str1,str2);
	printf("concatenated string =%s\n",str1);
	
}