//Que 3. Print last 2 digit of number. 
//Eg. i/p: 223410 o/p: 10
#include <stdio.h>

void main() {
    int num, lastTwo;

    printf("Enter a number: ");
    scanf("%d", &num);

    lastTwo = num % 100;

    printf("Last two digits = %d", lastTwo);

}