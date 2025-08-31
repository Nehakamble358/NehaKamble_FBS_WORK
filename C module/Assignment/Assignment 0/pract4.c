#include<stdio.h>
int main()
{
	int marks;
	printf("Enter the marks : ");
	scanf("%d",&marks);
	if(marks>75){
		printf("Distinction\n");
	}else if(marks>65){
		printf("Fist Class\n");
	}else if(marks>55){
		printf("Second Class\n");
	}else if(marks>=40){
		printf("Pass Class\n");
	}else{
		printf("Fail\n");
	}
}