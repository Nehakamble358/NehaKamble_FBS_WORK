//Que 1: Write a program to print factors of number in given range.
#include <stdio.h>

int main() {
    int start = 10, end = 15;   // HARD-CODED RANGE

    for (int num = start; num <= end; num++) {
        printf("%d = ", num);

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                printf("%d ", i);
            }
        }
        printf("\n");
    }

    return 0;
}