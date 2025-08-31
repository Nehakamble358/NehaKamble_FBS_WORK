//7 Accept the ege and check if the person is:
#include<stdio.h>
void main()
{
	int age;
	printf("Enter your age : ");
	scanf("%d",&age);
	if(age<12){
	printf("The person is a child.\n");
    }else if(age>=12 && age <=19){
    	printf("The person is a teneger.\n");
	}else if(age>=20 && age<=59){
		printf("The person id adult.\n");
	}else {
		printf("The person is a Senoir.\n");
   }

}
