#include<stdio.h>
int mystrcmp(char s1[],char s2[])
{
	int i =0;
	while(s1[i]!='\0'&& s2[i]!='\0'){
		if(s1[i]!= s2[i])
		return s1[i]-s2[i];
		i++;
	}
	return s1[i]-s2[i];
}
void main()
{
	char str1[100],str2[100];
    printf("Enter first string :");
	scanf("%s",str1);
	printf("Enter a second string :");
	scanf("%s",str2);
	
	if(mystrcmp(str1,str2)==0)
	printf("string are equal\n");
	else
	printf("string are not equal\n");
}
