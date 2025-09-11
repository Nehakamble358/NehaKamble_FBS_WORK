//1.Write a program to print sum of prime numbers in a given range.
#include<stdio.h>
void main() {
	int start,end,i,j,isPrime,sum=0;
	printf("Enter start of range:");
	scanf("%d",&start);
	printf("Enter end of rangr:");
	scanf("%d",&end);

	for(i=start; i<=end; i++)
		if(i>=2) {
			isPrime=1;
			for(j=2; j<=i/2; j++) {
				if(i%j==0) {
					isPrime=0;
					break;
				}
			}
			if(isPrime) {
				sum+=i;
			}
		}
printf("sum of prime numbers from %d to %d =%d\n",start,end,sum);
}

