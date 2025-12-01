#include<stdio.h>
#include<string.h>
struct HR
{
	int id;
	char name[20];
	double salary;
	double commission;
};
void main()
{
	struct HR h1,h2;
	h1.id =100;
	strcpy(h1.name,"Neha");
	h1.salary=80,000;
	h1.commission =20,000;
	
	printf("Enter Employee 2 ID:");
	scanf("%d",&h2.id);
	
	printf("Enter Employee 2 name:");
	scanf("%s",&h2.name);
	
	printf("Enter Employee 2 salary:");
	scanf("%lf",&h2.salary);
	
	printf("Enter Employee 2  commission:");
	scanf("%lf",&h2.commission);
	
	printf("\nEmployee 1: ID=%d, neme=%s, salary=%lf commission=%lf\n",h1.id,h1.name,h1.salary,h1.commission);
	printf("\nEmployee 2: ID=%d, neme=%s, salary=%lf commission=%lf\n",h2.id,h2.name,h2.salary,h2.commission);

}
