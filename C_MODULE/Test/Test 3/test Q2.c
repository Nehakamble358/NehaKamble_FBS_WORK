//Que 2: Write a program to find power of any number.
//Eg. 2^4 = 16. 
#include <stdio.h>

int main() {
    int base = 2;     
    int power = 4;    
    int result = 1;

    for (int i = 1; i <= power; i++) {
        result = result * base;
    }

    printf("%d ^ %d = %d", base, power, result);

    return 0;
}