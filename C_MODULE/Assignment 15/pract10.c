#include<stdio.h>
#include<string.h>
struct Product
{
	int id;
	char name[20];
	int  quantity;
	double price;
};
void main()
{
	struct Product p1,p2;
	p1.id = 201;
	strcpy(p1.name,"Neha");
	p1.quantity=20;
	p1.price = 3000;
	
	printf("Enter product detail 2 id:");
	scanf("%d",&p2.id);
	
	printf("Enter product detail 2 name:");
	scanf("%s",&p2.name);
	
	printf("Enter product detail 2 quantity:");
	scanf("%d",&p2.quantity);

	printf("Enter product detail 2 price:");
	scanf("%lf",&p2.price);
	
	printf("\n Product 1: id=%d, name=%s, quantity=%d, price=%lf",p1.id,p1.name,p1.quantity,p1.price);
	printf("\n procuct 2: id=%d, name=%s, quantity=%d, price=%lf",p2.id,p2.name,p2.quantity,p2.price);
}
