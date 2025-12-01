#include<stdio.h>
void palindrome( int);
void main()
{
	int n, reversed =0, remainder, original;
    printf("Enter an integer:");
    scanf("%d", &n);
    original = n;
    palindrom( n, reversed=0, remainder,original);
}
void palindrome(int n, remainder, original);
{

    while(n!=0)
    {
    remainder = n % 10;
    reversed = reversed * 10 + remainder;
    n/=10;
   }
   if(original == reversed)
   printf("%d is a palindrome.",original);
   else
   printf("%d is not pallindrom.",original);
   return 0;
}
