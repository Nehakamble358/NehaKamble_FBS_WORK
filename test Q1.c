// 1 WAP to calculate selling price of book based on cost price and discount.(using function and nested if-else)
#include<stdio.h>
void fun();
void main()
{
	int no=500;
	printf("Enter a selling price of book : ");
	scanf("%d",&no);
	if(no>=200){
		printf("it is a cost price",no);
	}else if(no%=2){
		printf("Discount",no);
	}
	
}