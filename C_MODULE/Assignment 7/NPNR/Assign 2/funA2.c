#include<stdio.h>
void vowel();
void main() 
{
  vowel();
}
void vowel(){

	char ch;
	printf("Enter a character:");
	scanf("%c",&ch);

	if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == '0' || ch == 'U'){
	printf("%c is a vowel.",ch);
    }else {
	printf("%c is a consonant.",ch);
	return 0;

    }
}