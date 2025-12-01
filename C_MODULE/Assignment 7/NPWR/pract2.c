//2 NPWR
#include<stdio.h>
int area();
void main()
{
	int area=getarea();
	int peri=getperi();
}
int getarea()
{
    int len,bre;
	printf("Enter lenght and breath : ");
	scanf("%d %d",&len,&bre);
	int area=len*bre;
	int peri =2*(len+bre);
	printf("Area of rectange id %d",area);
	printf("\n perimeter of rectangle is %d",peri);
	return getarea();
}
int getperi()
{
	int len,bre;
	printf("Enter lenght and breath : ");
	scanf("%d %d",&len,&bre);
	int area=len*bre;
	int peri =2*(len+bre);
	printf("Area of rectange id %d",area);
	printf("\n perimeter of rectangle is %d",peri);
	return getperi();
}
	