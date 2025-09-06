//4.print strong number in the given range 1 to n.
#include<stdio.h>
void main()
{
	int no;
	printf("Enter a number : ");
	scanf("%d",&no);
	
	int temp =no, sum=0;
	while(no>0)
	{
		int rem = no%10;
		int fact =1;
		
		for(int i =1; i<=rem; i++){
		fact *=i;
	}
		sum =+ fact;
	    no = no/10;
	}
	if (sum == temp)
	printf("%d is strong\n",temp);
	else
	{
		printf("%d is not strong\n",temp);
	}
	
}