//Que 2. WAP to check if number is positive, negative or neutral (0).
#include <stdio.h>

void  main() {
    int num;

    printf("Enter number: ");
    scanf("%d", &num);

    if (num > 0)
        printf("Positive");
    else if (num < 0)
        printf("Negative");
    else
        printf("Neutral (Zero)");

}