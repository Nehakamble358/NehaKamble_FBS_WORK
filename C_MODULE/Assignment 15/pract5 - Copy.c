#include<stdio.h>
#include<string.h>
struct SelasManager
{
	int id;
	char name[20];
	double salary;
	double incentive;
	int target;
	
};
void main()
{
	struct SalesManager s1,s2;
	s1.id = 49;
	strcpy(s1.name,"shweta");
	s1.salary=80000;
	s1.incentive = 50000;
	s1.target = 10;
	
	printf("sales manager detail 2 ID :");
	scanf("%d\n",&s2.id);
	
	printf("sales manager detail 2 neme :");
    scanf("%s\n",&s2.name);
    
    printf("sales manager detail 2 salary :");
	scanf("%lf\n",&s2.salary);
	
	printf("sales manager detail 2 incentive :");
	scanf("%lf\n",&s2.incentive);
	
	printf("sales manager detail 2 target :");
	scanf("%d\n",&s2.target);
	
	printf("\n SalesManager 1: ID=%d, neme=%s, salary=%lf incentive=%lf target=%d\n",s1.id,s1.name,s1.salary,s1.incentive,s1.target);
	printf("\n SalesManager 2: ID=%d, neme=%s, salary=%lf incentive=%lf target=%d\n",s2.id,s2.name,s2.salary,s2.incentive,s2.target);

	
}