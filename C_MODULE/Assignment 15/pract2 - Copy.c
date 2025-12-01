#include<stdio.h>
#include<string.h>
struct Employee
{
	int id;
	char name[20];
	double salary;

};
	
{
	struct Employee e1,e2;
	e1.id =101;
	strcpy(e1.name,"Neha");
	e1.salary=10,000;
	
	printf("Enter Employee 2 ID:");
	scanf("%d",&e2.id);
	
	printf("Enter Employee 2 name:");
	scanf("%s",&e2.name);
	
	printf("Enter Employee 2 salary:");
	scanf("%lf",&e2.salary);
	
	printf("\nEmployee 1: ID=%d, neme=%s, salary=%lf\n",e1.id,e1.name,e1.salary);
	printf("\nEmployee 2: ID=%d, neme=%s, salary=%lf\n",e2.id,e2.name,e2.salary);

}
