//1. Write a program to print factors of in given range.
#include<stdio.h>
void main()
{
	int start,end,i,j;
	printf("Enetr start and end range:");
	scanf("%d %d",&start,&end);
	
	for(i=start; i<=end; i++){
	printf("%d =",i);
	for(j=1; j<=i; j++)
	if(i%j==0){
     printf("%d",j);
 }
 printf("\n"); 
}
	
	

}