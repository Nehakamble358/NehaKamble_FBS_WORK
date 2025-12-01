// 10. Write a c program to input marks of five subjects, find total marks,and calculate the paracentage.
#include<stdio.h>
void main()
{
	int eng, phy, chem, math,comp;
	float per;
	printf("Enter five subject marks:");
	scanf("%d%d%d%d%d",&eng, &phy, &chem, &math, &comp);
	per = ( eng + phy + chem + math + comp) /5.0;
	
	printf("percentage = %.2f\n",per);
	if(per >= 90)
	{
		printf("Grade A");
	} 
	else if(per >= 80)
	{
		printf("Grade B");
	}
	else if(per >= 70)
	{
		printf("Grad C");
	}
	else if(per >= 60)
	{
		printf("Grade D");
	}
	else if(per >=40)
	{
		printf("Grade E");
	}
	else
	{
		printf("Grade F");
	}
	return 0;	
}