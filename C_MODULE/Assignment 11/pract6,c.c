// strcmp()
#include<stdio.h>
#include<string.h>
void main()
{
	char s1[] = "Fistbit";
	char s2[] = "Fistbits";
	
	int res=strcmp(s1,s2);
	if(res==0)
	printf("s1 and s2 are same");
	else if(res<0)
	printf("s1 is lexicographically smaller than s2");
	else
    printf("s1 is lexicographically greater than s2");
}