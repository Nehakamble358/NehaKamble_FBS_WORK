#include<stdio.h>
#include<stdlib.h>
int mystrlen(char str[])
{
	int i=0;
	while(str[i]!='\0'){
		i++;
	}
	return i;
}
int main()
{

   char str[100];
   printf("Enter a string:");
   scanf("%s",str);

   printf("Length = %d\n",mystrlen(str));
   return 0;
}