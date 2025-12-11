#include <stdio.h>

int main() {
    int units;
    float bill = 0;

    printf("Enter units consumed: ");
    scanf("%d", &units);

    if (units >= 1 && units <= 50) {
        bill = units * 30;
    }
    else if (units >= 51 && units <= 150) {
        bill = units * 40;
    }
    else if (units >= 151) {
        bill = units * 50;
    }
    else {
        printf("Invalid units!");
        return 0;
    }

    printf("Electricity Bill = %.2f Rs", bill);

    return 0;
}