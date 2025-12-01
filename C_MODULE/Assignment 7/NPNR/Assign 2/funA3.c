# include<stdio.h>
void age();
int main()
{
	void age() ;
}
void age()
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