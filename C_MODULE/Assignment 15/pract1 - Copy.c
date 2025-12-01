#include<stdio.h>
#include<string.h>
struct student
{
	int rollno;
	char name[20];
	int marks;
};
void main()
{
	struct student s1,s2;
	s1.rollno = 49;
	strcpy(s1.name,"Neha");
	s1.marks = 85;
	
	printf("Entered a student 2 rollno:");
	scanf("%d",&s2.rollno);
	
	printf("Entered a student 2 name:");
	scanf("%s",&s2.name); 
	
	printf("Entered a student 2 marks:");
	scanf("%d",&s2.marks);

	printf("\n student 1:rollno=%d, name=%s, marks=%d\n",s1.rollno,s1.name,s1.marks);
	printf("\n student 2:rollno=%d, name=%s, marks=%d\n",s2.rollno,s2.name,s2.marks);

	
}
