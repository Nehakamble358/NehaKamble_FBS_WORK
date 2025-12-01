#include<stdio.h>
#include<string.h>
struct admin
{
	int id;
	char name[20];
	double salary;
	double allowance;
};
void main()
{
	struct admin a1,a2;
	a1.id =100;
	strcpy(a1.name,"Neha");
	a1.salary=80,000;
	a1.allowance = 50000;
	
	printf("Enter Employee 2 ID:");
	scanf("%d",&a2.id);
	
	printf("Enter Employee 2 name:");
	scanf("%s",&a2.name);
	
	printf("Enter Employee 2 salary:");
	scanf("%lf",&a2.salary);
	
	printf("Enter Employee 2 allowance:");
	scanf("%lf",&a2.allowance);
	
	printf("\nEmployee 1: ID=%d, neme=%s, salary=%lf allowance=%lf\n",a1.id,a1.name,a1.salary,a1.allowance);
	printf("\nEmployee 2: ID=%d, neme=%s, salary=%lf allowance=%lf\n",a2.id,a2.name,a2.salary,a1.allowance);

}
