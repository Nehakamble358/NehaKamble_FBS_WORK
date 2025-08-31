//5.write a proram to check whether a person is eligible to vote (age>18).
#include<stdio.h> 
int main()
{
	int age;
	printf("Enter are:");
	scanf("%d",&age);
	
	if(age >= 18)
	printf("You can Vote!");
	else
	printf("You cant Vote!");
	return 0;
}