//2 Write a program to check given 3 digit number is pallindrome or not. //1221
#include<stdio.h>
void main()
{
	int num, original,reversed =0,digit;
    printf("Enter a three-digit number :");
    scanf("%d", &num);
    original = num;
   
    while(num>0)
    {
    digit = num % 10;
    reversed = reversed * 10 + digit;
    num=num/10;
   }
   if(original == reversed)
   printf("%d is a palindrome.",original);
   else
   printf("%d is not pallindrom.",original);
   return 0;
}
