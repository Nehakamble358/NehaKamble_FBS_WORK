//7. Write Calculating total salary based on basic on basic <=5000 da, ta and hra will be 10%,20% and 25% respectively 
//otherwisw da, ta, and hra will be 15%25% and 30% respectively,
#include<stdio.h>
void main()
{
	float basic_salary,da, ta, hra, total_salary;
	printf("Enter the basic salary:");
	scanf("%f",&basic_salary);
	
	if(basic_salary <= 5000){
		da = 0.10 * basic_salary;
		ta = 0.20 * basic_salary;
		hra = 0.25 * basic_salary;
	}else{
		da = 0.15 * basic_salary;
		ta = 0.25 * basic_salary;
		hra = 0.30 *basic_salary;
	}
	total_salary = basic_salary +da + ta + hra;
	
	printf("\nBasic salary : %2f\n",basic_salary);
	printf("DA: %.2f\n", da);
	printf("TA: %.2f\n", ta);
	printf("HRA: %.2f\n", hra);
	printf("Total salary: %.2f\n",total_salary);
	return 0;
	
	
}