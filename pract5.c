//5. check the given number is Armstrong number or not. Input:n=153 output: Armstrong
#include<stdio.h>
void main() {
	int no;
	printf("Enter a number : ");
	scanf("%d",&no);
	int temp=no;
	int count=0;

     while(no>0){
	count++;
	no=no/10;
    }
	no=temp;
	int sum=0,rem;
	int res=1;
	while(no>0) {
		
		rem=no%10;
		int res=1;
		for(int i=1; i<=count; i++)
			res=res*rem;

		sum=sum+res;
		no=no/10;
	}
         if(sum ==temp)
			printf("%d is a armstrong",temp);
		else
			printf("%d is not a armstrong",temp);
}
