//5 Write a menue driven in the given range 1 to n
#include <stdio.h>
#include <stdlib.h>

// Function to check if a number is even or odd
void checkEvenOdd(int num) {
    if (num % 2 == 0) {
        printf("%d is an even number.\n", num);
    } else {
        printf("%d is an odd number.\n", num);
    }
}

// Function to check if a number is prime
void checkPrime(int num) {
    if (num <= 1) {
        printf("%d is neither prime nor composite.\n", num);
        return;
    }
    int isPrime = 1;
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
            isPrime = 0;
            break;
        }
    }
    if (isPrime) {
        printf("%d is a prime number.\n", num);
    } else {
        printf("%d is not a prime number.\n", num);
    }
}

// Function to check if a number is a palindrome
void checkPalindrome(int num) {
    int originalNum = num;
    int reversedNum = 0;
    while (num > 0) {
        int remainder = num % 10;
        reversedNum = reversedNum * 10 + remainder;
        num /= 10;
    }
    if (originalNum == reversedNum) {
        printf("%d is a palindrome number.\n", originalNum);
    } else {
        printf("%d is not a palindrome number.\n", originalNum);
    }
}

// Function to check if a number is positive, negative, or zero
void checkPositiveNegativeZero(int num) {
    if (num > 0) {
        printf("%d is a positive number.\n", num);
    } else if (num < 0) {
        printf("%d is a negative number.\n", num);
    } else {
        printf("%d is zero.\n", num);
    }
}

// Function to reverse a number
void reverseNumber(int num) {
    int reversedNum = 0;
    int originalNum = num;
    while (num != 0) {
        int remainder = num % 10;
        reversedNum = reversedNum * 10 + remainder;
        num /= 10;
    }
    printf("The reverse of %d is %d.\n", originalNum, reversedNum);
}

// Function to find the sum of digits
void findSumOfDigits(int num) {
    int sum = 0;
    int originalNum = num;
    // Handle negative numbers by taking absolute value for sum of digits
    if (num < 0) {
        num = -num;
    }
    while (num > 0) {
        sum += num % 10;
        num /= 10;
    }
    printf("The sum of digits of %d is %d.\n", originalNum, sum);
}

int main() {
    int choice, num;

    do {
        printf("\n--- Menu ---\n");
        printf("1. Check if number is even or odd.\n");
        printf("2. Check if number is prime or not.\n");
        printf("3. Check if number is palindrome or not.\n");
        printf("4. Check if number is positive, negative or zero.\n");
        printf("5. Reverse a number.\n");
        printf("6. Find sum of digits.\n");
        printf("0. Exit.\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice >= 1 && choice <= 6) {
            printf("Enter a number: ");
            scanf("%d", &num);
        }

        switch (choice) {
            case 1:
                checkEvenOdd(num);
                break;
            case 2:
                checkPrime(num);
                break;
            case 3:
                checkPalindrome(num);
                break;
            case 4:
                checkPositiveNegativeZero(num);
                break;
            case 5:
                reverseNumber(num);
                break;
            case 6:
                findSumOfDigits(num);
                break;
            case 0:
                printf("Exiting program. Goodbye!\n");
                exit(0);
            default:
                printf("Invalid choice. Please try again.\n");
        }
    } while (choice != 0);

    return 0;
}
	
