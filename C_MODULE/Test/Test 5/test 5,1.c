//1. WAP to calculate selling price of book based on cost price and discount. 
//( using function and nested if- else )
#include <stdio.h>

// Function to calculate selling price
float sellingPrice(float cp, float discount) {
    float sp;

    if (discount >= 0) {                   // 1st level if
        if (discount <= 100) {            // nested if
            sp = cp - (cp * discount / 100);
        } else {
            printf("Invalid discount!\n");
            return -1;
        }
    } else {
        printf("Invalid discount!\n");
        return -1;
    }

    return sp;
}

int main() {
    float cost, disc, result;

    cost = 500;        
    disc = 10;         

    result = sellingPrice(cost, disc);

    if (result != -1)
        printf("Selling Price = %.2f", result);

    return 0;
}