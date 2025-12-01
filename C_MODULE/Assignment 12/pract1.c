#include<stdio.h>
void mystrcpy(char dest[],char src[])
{
	int i=0,src1, dest2;
	while(src[i]!='\0'){
	dest[i]=src[i];
		i++;
	}
	dest[i]='\0';
}
void main()
{

   char str1[100],str2[100];
   printf("Enter a string:");
   scanf("%s",str1);
   
   mystrcpy(str1,str2);

   printf("copied string = %d\n",str2);

}