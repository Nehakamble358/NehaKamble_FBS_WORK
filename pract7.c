//7 find factorial of given number. input:n=5 outpt:120
#include<stdio.h>
void main(){
	int num,i;
	long long factorial=1;
	
	printf("Enter a number:");
	scanf("%d",&num);
	
	if(num<0){
	printf(" Factorial is not defined for negative numbers.\n");
    }else{
    	for(i=1; i<num;i++){
    		factorial = factorial*i;
		}
		printf("Factorial of %d = %lld\n",num, factorial);
	}
}