// 8 check the given number is strong number or not input:145 output: Strong
#include<stdio.h>
void main(){
	int no,fact,sum,i;
	printf("Enter a number : ");
	scanf("%d",&no);
	int temp = no;
	while(no>0)
	{
		int rem=no%10;
		sum=sum+fact;
	}
	while(no>0)
	{
		int rem=no%10;
		int fact=1;
		for(i=1; i<=rem; i++)
		fact = fact*i;
		sum = sum+fact;
		no=no%10;
	}
	if(sum == temp)
	printf("%d is strong",temp);
	else
	printf("%d is not strong",temp);
	return 0;
}