// 1. WAP to calculate electricity bill.
//for 1-50 units-30rs/unit,for 51-150 unit-40rs/unit, for 151 and above unit 50 rs/unit.
#include<stdio.h>
int main()
{
	int units;
	float bill_amount;
	printf("Enter the total units consumed :");
	scanf("%d",&units);
	
	if(units >= 1 && units <= 50){
		bill_amount = units * 30;
	}else if(units >= 51 && units <= 150){
		bill_amount = (50*30) + ((units -50) * 40);
	}else if(units >= 151){
		bill_amount = (50 * 30) + (100 + 40) + ((units - 150) * 50);
	}else{
		printf("Invalid units entered.\n");
		return 1;
	}
	printf("Electricity Bill: RS. %.2f\n",bill_amount);
	return 0;
}