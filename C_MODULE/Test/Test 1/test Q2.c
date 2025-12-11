//Que 3. Print last 2 digit of number.Eg. i/p: 223410 o/p: 10 please solve the test and i have c code
#include <stdio.h>

void main() {
    int num;

    printf("Enter number: ");
    scanf("%d", &num);

    printf("Last two digits = %d", num % 100);
}